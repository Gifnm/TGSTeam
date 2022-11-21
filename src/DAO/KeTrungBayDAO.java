/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.KeTrungBay;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class KeTrungBayDAO extends TGSTeamDAO<KeTrungBay, Integer>{
 String INSERT_SQL = "INSERT INTO KeTrungBay(SoKe,MaCH) VALUES(?,?)";
    //String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?,HoTen = ?, VaiTro = ? WHERE MaNV = ?";
    //String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM KeTrungBay";
    String SELECT_BY_ID_SQL = "SELECT * FROM KeTrungBay WHERE SoKe = ?";
    @Override
    public void insert(KeTrungBay entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(KeTrungBay entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KeTrungBay> selectAll() {
 return this.selectBySql(SELECT_ALL_SQL);    }

    @Override
    public KeTrungBay selectById(Integer key) {
        List<KeTrungBay> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);
    }

    @Override
    protected List<KeTrungBay> selectBySql(String sql, Object... args) {
       List<KeTrungBay> list = new ArrayList<KeTrungBay>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

                KeTrungBay entity = new KeTrungBay();
                entity.setSoKe(rs.getInt(1));
                entity.setMaCH(rs.getInt(2));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
}
