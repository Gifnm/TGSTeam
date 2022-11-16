/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.NhanVien;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class NhanVienDAO extends TGSTeamDAO<NhanVien, Integer>{
   String INSERT_SQL = "INSERT INTO NhanVien(MaNv,MatKhau,HoTen,VaiTro) VALUES(?,?,?,?)";
   // String UPDATE_SQL = "UPDATE NhanVien SET MatKhau = ?,HoTen = ?, VaiTro = ? WHERE MaNV = ?";
   // String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";
    @Override
    public void insert(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Integer key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhanVien> selectAll() {
       return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(Integer key) {
     List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);
    }
    

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
       List<NhanVien> list = new ArrayList<NhanVien>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

               NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getInt(1));
                entity.setHoTenNV(rs.getString(2));
                entity.setGioiTinh(rs.getBoolean(3));
                entity.setDiaChi(rs.getString(4));
                entity.setSoDienThoai(rs.getString(5));
                entity.setEmail(rs.getString(6));
                entity.setNgaySinh(rs.getString(7));
                entity.setMatKhau(rs.getString(8));
                entity.setHinhAnh(rs.getString(9));
                entity.setMaCH(rs.getInt(10));
                entity.setVaiTro(rs.getString(11));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
}
