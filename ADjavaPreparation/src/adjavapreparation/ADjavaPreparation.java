
package adjavapreparation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;


public class ADjavaPreparation {
    static DBUtil du=new DBUtil();
    static PreparedStatement ps;
    static String sql="";
    
    public static void main(String[] args) {
        saveStu("Rakib", "rakib@gmail.com", "Muhammudpur", "01976437634");
        
        System.out.println("After Save data");
        showAllStu();
        System.out.println("----------------");
        
               
        
    }
    
    public static void saveStu(String name,String email,String address,String cell){
    sql="insert into students(name,email,address,cell) values(?,?,?,?)";
        try {
            ps=du.getCon().prepareStatement(sql);
            
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
            Logger.getLogger(ADjavaPreparation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   
    
    public static void showAllStu(){
    sql="select * from students";
        try {
            ps=du.getCon().prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()) {                
                int roll=rs.getInt("roll");
                String name=rs.getString("name");
                String email=rs.getString("email");
                String address=rs.getString("address");
                String cell=rs.getString("cell");
                
                System.out.println("Roll: "+roll+" Name: "+name+" Email: "+email+" Address: "+address+" Cell: "+cell);
                
            }
            
           ps.close();
           rs.close();
           du.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ADjavaPreparation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    public static void deleteStu(int roll){
    sql="delete from students where id=?";
        try {
            ps=du.getCon().prepareStatement(sql);
            ps.setInt(1, roll);
            
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ADjavaPreparation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void UpdateStu(String name,String email,String address,String cell,int roll){
    sql="update students set name=?,email=?,address=?,cell=? where roll=?";
        try {
            ps=du.getCon().prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell);
            ps.setInt(5, roll);
            
            
            ps.executeUpdate();
            
            ps.close();
            du.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ADjavaPreparation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    //last Brakrt
}
