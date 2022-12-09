/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.HoaDonCT;
import Model.PhieuMuon;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PhieuMuonDAO extends TGSTeamDAO<PhieuMuon, String> {

    String INSERT_SQL = "INSERT INTO PhieuMuon(MaPM,MaNV,NgayLap,NgayTraDuKien,NgayTra,TrangThaiTra,TongTien,TienMat,TienThoi) VALUES(?,?,?,?,?,?,?,?,?)";
    //String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?,HoTen = ?, VaiTro = ? WHERE MaNV = ?";
    String DELETE_SQL = "DELETE FROM PhieuMuon WHERE MaPM = ?";
    String SELECT_ALL_SQL = "SELECT * FROM PhieuMuon";
    String SELECT_BY_ID_SQL = "SELECT * FROM PhieuMuon WHERE MaHD = ?";

    @Override
    public void insert(PhieuMuon entity) {
        // MaPM,MaNV,NgayLap,NgayTraDuKien,NgayTra,TrangThaiTra,TongTien,TienMat,TienThoi
        jdbcHepler.update(INSERT_SQL, entity.getMaPM(), entity.getMaNV(), entity.getNgayLap(), entity.getNgayTraDuKien(), entity.getNgayTra(), entity.getTrangThaiTra(), entity.getTongTien(), entity.getTienMat(), entity.getTienThoi());
    }

    @Override
    public void update(PhieuMuon entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<PhieuMuon> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public PhieuMuon selectById(String key) {
        List<PhieuMuon> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);
    }

    @Override
    protected List<PhieuMuon> selectBySql(String sql, Object... args) {
        List<PhieuMuon> list = new ArrayList<PhieuMuon>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

                PhieuMuon entity = new PhieuMuon();
                entity.setMaPM(rs.getString(1));
                entity.setMaNV(rs.getInt(2));
                entity.setNgayLap(rs.getString(3));
                entity.setNgayTraDuKien(rs.getString(4));
                entity.setNgayTra(rs.getString(5));
                entity.setTrangThaiTra(rs.getBoolean(6));
                entity.setTongTien(rs.getFloat(7));
                entity.setTienMat(rs.getFloat(8));
                entity.setTienThoi(rs.getFloat(9));

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
