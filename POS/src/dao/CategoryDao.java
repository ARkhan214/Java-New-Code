
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.DBUtil;


public class CategoryDao {
    DBUtil du=new DBUtil();
    PreparedStatement ps;
    
    
   public void saveCategory(String name,JTable jt) {
        String sql = "insert into category(name) value(?)";
        try {
            ps = du.getconn().prepareStatement(sql);
            ps.setString(1, name);
            

            ps.executeUpdate();
            ps.close();
            du.getconn().close();
            JOptionPane.showMessageDialog(null, "Category data Save successful");
            
            showAllCategory(jt);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Category data Save not successful");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    } 
    
    
    public void showAllCategory(JTable jt) {

        String[] columName = {"ID", "Name"};
        DefaultTableModel tableMode = new DefaultTableModel(columName, 0);
        jt.setModel(tableMode);
        
        String sql = "select*from category";

        try {
            PreparedStatement ps = du.getconn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                Object[] rowData = {id, name};
                tableMode.addRow(rowData);
  
               
            }
                rs.close();
                ps.close();
                du.getconn().close();
                rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   
   
   
    
}
