/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.HoaDonCT;
import Model.PhieuMuonCT;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PhieuMuonCTDAO extends TGSTeamDAO<PhieuMuonCT, String> {

    String INSERT_SQL = "INSERT INTO PhieuMuonCT(MaPM,Barcode,SoLuong,ThanhTien) VALUES(?,?,?,?)";
    String DELETE_SQL = "DELETE FROM PhieuMuonCT WHERE MaPM = ?";
    String SELECT_ALL_SQL = "SELECT * FROM PhieuMuonCT";
    String SELECT_BY_ID_SQL = "SELECT * FROM PhieuMuonCT WHERE MaPM = ?";

    @Override
    public void insert(PhieuMuonCT entity) {
        jdbcHepler.update(INSERT_SQL, entity.getMaPM(), entity.getBarcode(), entity.getSoLuong(), entity.getThanhTien());
    }

    @Override
    public void update(PhieuMuonCT entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PhieuMuonCT> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PhieuMuonCT selectById(String key) {
        List<PhieuMuonCT> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);

    }

    @Override
    protected List<PhieuMuonCT> selectBySql(String sql, Object... args) {
        List<PhieuMuonCT> list = new ArrayList<PhieuMuonCT>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

                PhieuMuonCT entity = new PhieuMuonCT();
                entity.setMaPM(rs.getString(1));
                entity.setBarcode(rs.getString(2));
                entity.setSoLuong(rs.getInt(3));
                entity.setThanhTien(rs.getFloat(4));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
