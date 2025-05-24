package crudproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;

public class CrudProject {

    static DBUtil du = new DBUtil();
    static PreparedStatement ps;
    static String sql = "";

    public static void main(String[] args) {

        saveSecurityGuard("Reja", "01325645897", "Potuakhali", 20000);
        showAllSecurityGuard();
        saveSecurityGuard("Rahmat", "01525648975", "Muhammadpur", 21000);
        showAllSecurityGuard();
        updateSecurityGuard("Habib", "016245781", "Dhaka", 250000, 3);
        showAllSecurityGuard();
        deletSecurityGuard(2);
        
    }

    public static void saveSecurityGuard(String name, String cell, String address, float salary) {
        sql = "insert into securityguards(name,cell,address,salary) value(?,?,?,?)";

        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, address);
            ps.setFloat(4, salary);

            ps.executeUpdate();

            ps.close();
            du.getCon().close();
            System.out.println("Data Save");
            System.out.println("--------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(CrudProject.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public static void showAllSecurityGuard() {
        sql = "Select * from securityguards";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String cell = rs.getString("cell");
                String address = rs.getString("address");
                float salary = rs.getFloat("salary");

                System.out.println("ID " + id + " Name-- " + name + "-- Cell-- " + cell+"--Address--"+address+"--Salary--"+salary);
            }

            ps.close();
            rs.close();
            du.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(CrudProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deletSecurityGuard(int id){
    sql="delete from securityguards where id=?";
    
        try {
            ps=du.getCon().prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CrudProject.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public static void updateSecurityGuard(String name,String cell,String address,float salary,int id){
        sql="update securityguards set name=?,cell=?,address=?,salary=? where id=?";
        try {
            ps=du.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, address);
            ps.setFloat(4, salary);
            ps.setInt(5, id);
            
            
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CrudProject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
//last braket
}
