/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CaLamViecCT;
import Model.HoaDon;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CaLamViecCTDAO extends TGSTeamDAO<CaLamViecCT, String>{
String INSERT_SQL = "INSERT INTO CaLamViecCT(MaCaLV,MaNV,Ngay,ThoiGianChamCong) VALUES(?,?,?,?)";
     String UPDATE_SQL = "UPDATE CaLamViecCT SET MaCaLV = ? WHERE MaNV = ? and Ngay = ?";
     String DELETE_SQL = "DELETE FROM CaLamViecCT WHERE MaCaLV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CaLamViecCT";
    String SELECT_BY_ID_SQL = "SELECT * FROM CaLamViecCT WHERE MaCaLV = ?";
    @Override
    public void insert(CaLamViecCT entity) {
         jdbcHepler.update(INSERT_SQL, entity.getMaCaLV(),entity.getMaNV(),entity.getNgay(),null);
    }

    @Override
    public void update(CaLamViecCT entity) {
         jdbcHepler.update(UPDATE_SQL, entity.getMaCaLV(),entity.getMaNV(),entity.getNgay());
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CaLamViecCT> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public CaLamViecCT selectById(String key) {
        List<CaLamViecCT> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);
    }

    @Override
    protected List<CaLamViecCT> selectBySql(String sql, Object... args) {
        List<CaLamViecCT> list = new ArrayList<CaLamViecCT>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

                CaLamViecCT entity = new CaLamViecCT();
               entity.setMaCaLV(rs.getString(1));
               entity.setMaNV(rs.getInt(2));
               entity.setNgay(rs.getString(3));
               entity.setThoiGianChamCong(rs.getString(4));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public List<CaLamViecCT> selectByDate(String key) {
        String SelectBy_Date = "Select * from CaLamViecCT where Ngay = ?";
        List<CaLamViecCT> list = this.selectBySql(SelectBy_Date, key);
        if (list.isEmpty()) {

            return null;
        }

        return list;
    }
    public boolean KiemTraCaLam(String ngay, String maCaLamViec, Integer MaNv) {
        String SelectBy_Date = "select * from CaLamViecCT where Ngay = ? and MaCaLV = ? and MaNV = ?";
        List<CaLamViecCT> list = this.selectBySql(SelectBy_Date, ngay,maCaLamViec,MaNv);
        if (list.isEmpty()) {

            return false;
        }

        return true;
    }
    
}
