package app.dao;

import app.db.OracleConnection;
import app.model.Pesan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PesanDAO {
    public void input(Pesan pesan) {
        OracleConnection ora = new OracleConnection();
        Connection conn = ora.getConnection();
        PreparedStatement ps = null;
        int result = 0;
        
        try {
            ps = conn.prepareStatement("insert into pesan values(?,?,?,?,?)");
            ps.setString(1, pesan.getId());
            ps.setString(2, pesan.getNama());
            ps.setInt(3, pesan.getHarga());
            ps.setInt(4, pesan.getJumlah());
            ps.setInt(5, pesan.getSubtotal());
            result = ps.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                "Pesan error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public void delete() {
        OracleConnection ora = new OracleConnection();
        Connection conn = ora.getConnection();
        PreparedStatement ps = null;
        int result = 0;

        try {
            ps = conn.prepareStatement("delete from pesan");
            result = ps.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
