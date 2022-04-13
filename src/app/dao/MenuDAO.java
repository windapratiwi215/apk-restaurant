package app.dao;

import app.db.OracleConnection;
import app.model.Menu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MenuDAO {
    //method tambah data
    public int input(Menu menu) {
        OracleConnection ora = new OracleConnection();
        Connection conn = ora.getConnection();
        PreparedStatement ps = null;
        int result = 0;

        try {
            ps = conn.prepareStatement("insert into menu values(?,?,?,?)");
            ps.setString(1, menu.getId());
            ps.setString(2, menu.getNama());
            ps.setInt(3, menu.getHarga());
            ps.setInt(4, menu.getJenis());
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
    //method hapus data
    public int delete(Menu menu) {
        OracleConnection ora = new OracleConnection();
        Connection conn = ora.getConnection();
        PreparedStatement ps = null;
        int result = 0;

        try {
            ps = conn.prepareStatement("delete from menu where id_menu= ?");
            ps.setString(1, menu.getId());
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
        return result;
    }
    //method edit data
    public int update(Menu menu) {
        OracleConnection ora = new OracleConnection();
        Connection conn = ora.getConnection();
        PreparedStatement ps = null;
        int result= 0;
        
        try{
            ps= conn.prepareStatement("update menu set nama = ?, harga= ? where id_menu= ?");
            ps.setString(1, menu.getNama());
            ps.setDouble(2, menu.getHarga());
            ps.setString(3, menu.getId());
            result=ps.executeUpdate();
            conn.commit();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                conn.close();
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
        return result;
    }
}
