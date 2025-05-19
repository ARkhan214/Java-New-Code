
package pos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;


public class POS {

   
    public static void main(String[] args) {
        
        
        
        DBUtil db = new DBUtil();
        String sql = "insert into category(id, name)values(?,?)";
        try {
            PreparedStatement ps = db.getconn().prepareStatement(sql);
            ps.setInt(1, 1287420);
            ps.setString(2, "Abdur Rahim");
            ps.executeUpdate();
            ps.close();
            db.getconn().close();
        } catch (SQLException ex) {
            Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     
    }
    
}
