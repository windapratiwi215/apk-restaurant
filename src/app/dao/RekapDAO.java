package app.dao;

import app.db.OracleConnection;
import app.model.Rekap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class RekapDAO {
    //method tambah data
    public int input(Rekap rekap) {
        OracleConnection ora = new OracleConnection();
        Connection conn = ora.getConnection();
        PreparedStatement ps = null;
        int result = 0;
        
        try {
            ps = conn.prepareStatement("insert into rekap values(?,?,?)");
            ps.setString(1, rekap.getId());
            ps.setInt(2, rekap.getJumlah());
            ps.setString(3, rekap.getTanggal());
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
        return result;
    }
}
