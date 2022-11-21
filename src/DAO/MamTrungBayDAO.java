/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.MamTrungBay;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MamTrungBayDAO extends TGSTeamDAO<MamTrungBay, Integer> {

    String INSERT_SQL = "INSERT INTO MamTrungBay(SoKe,SoMam,Barcode,ViTri,TrungBay) VALUES(?,?,?,?,?)";
    //String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?,HoTen = ?, VaiTro = ? WHERE MaNV = ?";
    //String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM MamTrungBay";
    String SELECT_BY_ID_SQL = "SELECT * FROM MamTrungBay WHERE SoMam = ?";

    @Override
    public void insert(MamTrungBay entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void update(MamTrungBay entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<MamTrungBay> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    @Override
    public MamTrungBay selectById(Integer key) {
        List<MamTrungBay> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            
            return null;
        }
        
        return list.get(0);
    }
    
    @Override
    protected List<MamTrungBay> selectBySql(String sql, Object... args) {
        List<MamTrungBay> list = new ArrayList<MamTrungBay>();
        try {
            
            ResultSet rs = jdbcHepler.query(sql, args);
            
            while (rs.next()) {
                
                MamTrungBay entity = new MamTrungBay();
                entity.setSoKe(rs.getInt(1));
                entity.setSoMam(rs.getInt(2));
                entity.setBarcode(rs.getString(3));
                entity.setViTri(rs.getInt(4));
                entity.setTrungBay(rs.getInt(5));
                list.add(entity);
                
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public MamTrungBay selectByBarcode(String barcode) {
         String sQL = "SELECT * FROM MamTrungBay WHERE Barcode = ?";
        List<MamTrungBay> list = this.selectBySql(sQL, barcode);
        if (list.isEmpty()) {
            
            return null;
        }
        
        return list.get(0);
    }
    public List<MamTrungBay> getMamTB(Integer soKe, Integer soMam) {
         String sQL = "SELECT * FROM MamTrungBay WHERE SoKe = ? and SoMam = ?";
        List<MamTrungBay> list = this.selectBySql(sQL, soKe,soMam);
        if (list.isEmpty()) {
            
            return null;
        }
        
        return list;
    }
    
}
