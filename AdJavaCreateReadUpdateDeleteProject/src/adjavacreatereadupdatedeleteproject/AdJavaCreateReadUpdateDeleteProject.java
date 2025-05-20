
package adjavacreatereadupdatedeleteproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;


public class AdJavaCreateReadUpdateDeleteProject {

    static DBUtil du = new DBUtil();
    static PreparedStatement ps;
    static String sql = "";
    
    public static void main(String[] args) {
//             DBUtil du = new DBUtil();
//             PreparedStatement ps;
//             String sql = "";


        saveEmp("Reja", "reja@gmail.com", 50000f);
        System.out.println("After Save");
        showAllEmp();
        System.out.println("-----------------------------------");
        
        
        updateEmp("C M Reja", "reja@gmail.com", 100000f, 1);
        System.out.println("After Update");
        showAllEmp();
        System.out.println("-------------------------");
        
        
         deleteEmp(2);
        System.out.println("After Delete");
        showAllEmp();
        
        System.out.println("-------------------------");
        
    }
    
    //Sob Data Save Korar Method.
    public static void saveEmp(String name,String email,Float salary){
    sql = "insert into emp(name,email,salary)value(?,?,?)";
        try {
            ps = du.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);
            
            ps.executeUpdate();
            
            ps.close();
            du.getCon().close();
            System.out.println("Data Save");
            System.out.println("--------------------------");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaCreateReadUpdateDeleteProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    //Sob Data Dekhar Method.
    public static void showAllEmp(){
    sql = "Select * from emp";
        try {
            ps = du.getCon().prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) { 
                
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    float salary = rs.getFloat("salary");
                    
                    System.out.println("ID "+id+" Name "+name+" Email "+email+" Salary "+salary);
                }
            
            ps.close();
            rs.close();
            du.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaCreateReadUpdateDeleteProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Sob Data delet korar Method.
    public static void deleteEmp(int id){
    sql = "delete from emp where id=?";
    
        try {
            ps = du.getCon().prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            ps.close();
            du.getCon().close();
                       
                      
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaCreateReadUpdateDeleteProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    //Sob Data update Method.
    public static void updateEmp(String name,String email,float salary,int id){
    sql="update emp set name=?,email=?,salary=? where id=?";
        try {
            ps = du.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setFloat(3, salary);
            ps.setInt(4, id);
            
            ps.executeUpdate();
            
            ps.close();
            du.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdJavaCreateReadUpdateDeleteProject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
// last bracket
    }
