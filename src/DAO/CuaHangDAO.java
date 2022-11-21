/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.CuaHang;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CuaHangDAO extends TGSTeamDAO<CuaHang, Integer> {    

    String INSERT_SQL = "INSERT INTO CuaHang(MaCH,DiaChi) VALUES(?,?,?)";
    //String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?,HoTen = ?, VaiTro = ? WHERE MaNV = ?";
    //String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CuaHang";
    String SELECT_BY_ID_SQL = "SELECT * FROM CuaHang WHERE MaCH = ?";

    @Override
    public void insert(CuaHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void update(CuaHang entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<CuaHang> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    @Override
    public CuaHang selectById(Integer key) {
        List<CuaHang> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            
            return null;
        }
        
        return list.get(0);
    }
    
    @Override
    protected List<CuaHang> selectBySql(String sql, Object... args) {
        List<CuaHang> list = new ArrayList<CuaHang>();
        try {
            
            ResultSet rs = jdbcHepler.query(sql, args);
            
            while (rs.next()) {
                
                CuaHang entity = new CuaHang();
                entity.setMaCH(rs.getInt(1));
                entity.setTenCH(rs.getString(2));
                entity.setDiaChi(rs.getString(3));
                list.add(entity);
                
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
