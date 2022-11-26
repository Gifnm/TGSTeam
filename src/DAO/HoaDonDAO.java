/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.HoaDon;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonDAO extends TGSTeamDAO<HoaDon, String> {

    String INSERT_SQL = "INSERT INTO HoaDon(MaHD,MaNV,NgayTao,TienMat,TienThoi,TongTien) VALUES(?,?,?,?,?,?)";
    // String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?,HoTen = ?, VaiTro = ? WHERE MaNV = ?";
    // String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM HoaDon order by STT desc";
    String SELECT_BY_ID_SQL = "SELECT * FROM HoaDon WHERE MaHD = ?";

    @Override
    public void insert(HoaDon entity) {
        jdbcHepler.update(INSERT_SQL, entity.getMaHD(), entity.getMaNV(), entity.getNgayTao(), entity.getTienMat(), entity.getTienThoi(), entity.getTongTien());
    }

    @Override
    public void update(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon selectById(String key) {
        List<HoaDon> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<HoaDon>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getString(1));
                entity.setMaNV(rs.getInt(2));
                entity.setNgayTao(rs.getString(3));
                entity.setTienMat(rs.getFloat(4));
                entity.setTienThoi(rs.getFloat(5));
                entity.setTongTien(rs.getFloat(6));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<HoaDon> selectHoaDonForToDay(String oh, String ooh) {
        String sql = "Select * from HoaDon where NgayTao > ? and NgayTao < ? order by STT desc";
        List<HoaDon> list = this.selectBySql(sql, oh,ooh);
        if (list.isEmpty()) {

            return null;
        }

        return list;
    }
}
