package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import util.DBUtil;

public class CustomerDao {

    DBUtil util = new DBUtil();
    PreparedStatement ps;

    public void saveCustomer(String name, String email, String cell, String address) {
        String sql = "insert into customer(name,cell,email,address) value(?,?,?,?)";
        try {
            ps = util.getconn().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, cell);
            ps.setString(3, email);
            ps.setString(4, address);

            ps.executeUpdate();
            ps.close();
            util.getconn().close();
            JOptionPane.showMessageDialog(null, "Customer data Save successful");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Customer data Save not successful");
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void showAllCustomer(JTable jt) {

        String[] columName = {"ID", "Name", "Cell", "Email", "Address"};
        DefaultTableModel tableMode = new DefaultTableModel(columName, 0);
        jt.setModel(tableMode);
        String sql = "select*from customer";

        try {
            PreparedStatement ps = util.getconn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String cell = rs.getString("cell");
                String address = rs.getString("address");
                Object[] rowData = {id, name, email, cell, address};
                tableMode.addRow(rowData);

                rs.close();
                ps.close();
                util.getconn().close();

            }

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
