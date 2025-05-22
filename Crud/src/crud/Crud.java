package crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;

public class Crud {

    static DBUtil du = new DBUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {
        saveStudents("Md.Rahim khan", "msrahim@gmail.com");
        System.out.println("After save");
        showAllStudents();
        System.out.println("----------");

        updateStudents("AR.Khan", "ar@gmail.com", 4);
        System.out.println("After update");
        showAllStudents();
        System.out.println("--------------------");

        deleteStudents(1);
        System.out.println("After Delete");
        showAllStudents();
        System.out.println("-------------------");

    }

    public static void saveStudents(String name, String email) {
        sql = "insert into students(name,email)value(?,?)";
        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();
            System.out.println("Data Save");
            System.out.println("--------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllStudents() {
        sql = "Select * from students";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                System.out.println("ID " + id + " Name-- " + name + "-- Email-- " + email);
            }

            ps.close();
            rs.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteStudents(int id) {
        sql = "delete from students where id=?";

        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateStudents(String name, String email, int id) {
        sql = "update students set name=?,email=? where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, id);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //last braket   
}
