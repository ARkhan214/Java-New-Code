
package posproject.dao;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import posproject.DataBaseUtil;


public class StudentDao {
    PreparedStatement ps;
    DataBaseUtil du=new DataBaseUtil();
     public void saveCustomer(String name,String cell, String email,JTable jt){
    
        String sql="insert into customer(name,cell,email,address) values(?,?,?,?)";
        
        try {
            ps=du.getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            
            ps.executeUpdate();
            ps.close();
            du.getCon().close();
            
            JOptionPane.showInputDialog(null, "Data input Successfull");
            
            
            
            
            
        } catch (SQLException ex) {
                        JOptionPane.showInputDialog(null, "Data input Unsuccessfull");

            java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
