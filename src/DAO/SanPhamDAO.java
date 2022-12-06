/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.SanPham;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class SanPhamDAO extends TGSTeamDAO<SanPham, String>{
String INSERT_SQL = "INSERT INTO NhanVien(MaNv,MatKhau,HoTen,VaiTro) VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?,HoTen = ?, VaiTro = ? WHERE MaNV = ?";
    String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM SanPham WHERE Barcode = ?";

    @Override
    public void insert(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(SanPham entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SanPham> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham selectById(String key) {
       List<SanPham> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);
    }

    @Override
    protected List<SanPham> selectBySql(String sql, Object... args) {
           List<SanPham> list = new ArrayList<SanPham>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

                SanPham entity = new SanPham();
                entity.setID(rs.getInt(1));
                entity.setBarcode(rs.getString(2));
                entity.setTenSP(rs.getString(3));
                entity.setGiaMuon(rs.getFloat(4));
                entity.setDonGia(rs.getFloat(5));
                entity.setGiaNhap(rs.getFloat(6));
                entity.setVAT(rs.getInt(7));
                entity.setMaLoaiSP(rs.getString(8));
                entity.setMaCH(rs.getInt(9));
                entity.setHinhAnh(rs.getString(10));
                entity.setSoLuongTrungBay(rs.getInt(11));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    
    }
    public List<SanPham> selectBykeyWork(String KeyWork) {
		// TODO Auto-generated method stub
		String SelectByKeyWork = "SELECT * FROM SanPham WHERE TenSP LIKE ?";
		return this.selectBySql(SelectByKeyWork,"%"+KeyWork+"%");
	}
    public List<SanPham> selectBykeyBarcode(String keyBarcode) {
		// TODO Auto-generated method stub
		String SelectByKeyWork = "SELECT * FROM SanPham WHERE Barcode LIKE ?";
		return this.selectBySql(SelectByKeyWork,keyBarcode+"%");
	}
    
}
