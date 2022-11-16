/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.HoaDonCT;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonCTDAO extends TGSTeamDAO<HoaDonCT, String> {

    String INSERT_SQL = "INSERT INTO HoaDonCT(MaHD,Barcode,SoLuong,ThanhTien) VALUES(?,?,?,?)";
    //String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?,HoTen = ?, VaiTro = ? WHERE MaNV = ?";
    //String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDonCT";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDonCT WHERE MaHD = ?";

    @Override
    public void insert(HoaDonCT entity) {
        jdbcHepler.update(INSERT_SQL, entity.getMaHD(), entity.getBarcode(), entity.getSoLuong(), entity.getThanhTien());
    }

    @Override
    public void update(HoaDonCT entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDonCT> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDonCT selectById(String key) {
        List<HoaDonCT> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);
    }

    @Override
    protected List<HoaDonCT> selectBySql(String sql, Object... args) {
        List<HoaDonCT> list = new ArrayList<HoaDonCT>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

                HoaDonCT entity = new HoaDonCT();
                entity.setMaHD(rs.getString(1));
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
   public List<HoaDonCT> selectByMaHD(String key) {
        List<HoaDonCT> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list;
    }
}
