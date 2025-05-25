package adjavapractice1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;

public class AdjavaPractice1 {

    static DBUtil du = new DBUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {
//        saveStudents("Md.Rana Sardar", "rana@gmail.com", "mu", "01985746213");
//        showAllStudents();
//        System.out.println("-------------------------------------------------------------------");
//        
        deleteStudents(2);
        showAllStudents();
        System.out.println("-------------------------------------------------------------------");

        updateStudents("Fariha", "farihamariam1290@gmail.com", "Khilgaon", "01777051706",1);
        showAllStudents();
        System.out.println("-------------------------------------------------------------------");
        
        
       
        
    }

    public static void saveStudents(String name, String email, String address, String cell) {
        sql = "insert into students(name,email,address,cell)value(?,?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();
            System.out.println("Data Save");
            System.out.println("--------------------------");
        } catch (SQLException ex) {
            Logger.getLogger(AdjavaPractice1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showAllStudents() {
        sql = "select * from students";

        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int roll = rs.getInt("roll");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");
                String address = rs.getString("address");

                System.out.println("Roll " + roll + " Name " + name + " Email " + email + " cell " + cell + " Address " + address);
            }
            ps.close();
            rs.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdjavaPractice1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteStudents(int roll) {
        sql = "delete from students where roll=?";
        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setInt(1, roll);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdjavaPractice1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void updateStudents(String name, String email, String address, String cell, int roll) {
        sql = "update students set name=?,email=?,address=?,cell=? where roll=?";
        try {
            ps = du.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell);
            ps.setInt(5, roll);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(AdjavaPractice1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //last   
}
