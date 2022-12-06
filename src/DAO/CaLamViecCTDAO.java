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
String INSERT_SQL = "INSERT INTO CaLamViecCT(MaCaLV,MaNV,Ngay,ThoiGianChamCong,XacNhanQuanLy,GioCongXacNhan,GhiChu) VALUES(?,?,?,?,?,?,?)";
     String UPDATE_SQL = "UPDATE CaLamViecCT SET MaCaLV = ? WHERE MaNV = ? and Ngay = ? and MaCaLV = ?";
     String DELETE_SQL = "DELETE FROM CaLamViecCT WHERE MaCaLV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM CaLamViecCT";
    String SELECT_BY_ID_SQL = "SELECT * FROM CaLamViecCT WHERE MaCaLV = ?";
    @Override
    public void insert(CaLamViecCT entity) {
        System.out.println("DAO.CaLamViecCTDAO.insert()");
         jdbcHepler.update(INSERT_SQL, entity.getMaCaLV(),entity.getMaNV(),entity.getNgay(),null,false,0,null);
    }

    @Override
    public void update(CaLamViecCT entity) {
         jdbcHepler.update(UPDATE_SQL, entity.getMaCaLV(),entity.getMaNV(),entity.getNgay(), entity.getMaCaLV());
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
               entity.setXacNhanQuanLy(rs.getBoolean(5));
               entity.setGioCongXacNhan(rs.getFloat(6));
               entity.setGhiChu(rs.getString(7));
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
    public void deleteAllBydate(String Ngay){
    String sQL = "Delete from CaLamViecCT Where Ngay = ?";
    jdbcHepler.update(sQL, Ngay);
    }
       public List<CaLamViecCT> selectByDateAndMaNV(String Date, Integer MaNV) {
           String sql = "Select * from CaLamViecCT where Ngay = ? and MaNV = ?";
        List<CaLamViecCT> list = this.selectBySql(sql, Date, MaNV);
        if (list.isEmpty()) {
            return null;
        }

        return list;
    }
       public void updateTime(CaLamViecCT enity){
       String sQL = "Update CaLamViecCT set ThoiGianChamCong = ? Where MaCaLV = ? and MaNV = ? and Ngay = ?";
       jdbcHepler.update(sQL, enity.getThoiGianChamCong(),enity.getMaCaLV(),enity.getMaNV(),enity.getNgay());
       
       }
       public List<CaLamViecCT> getLichSuChamCong(String Date, Integer MaNV) {
           String sql = "Select *   from CaLamViecCT\n" +
"Where (Ngay > CONVERT(VARCHAR(25),DATEADD(dd,-(DAY(GETDATE())-1),GETDATE()),101)   or Ngay = ?) and MaNV = ?\n" +
"ORDER BY Ngay desc";
        List<CaLamViecCT> list = this.selectBySql(sql, Date, MaNV);
        if (list.isEmpty()) {
            return null;
        }

        return list;
    }
       public List<CaLamViecCT> getCaLamViecChoXN() {
           String sql = "Select *   from CaLamViecCT\n" +
"Where XacNhanQuanLy = '0' and ThoiGianChamCong is not null order by Ngay desc";
        List<CaLamViecCT> list = this.selectBySql(sql);
        if (list.isEmpty()) {
            return null;
        }

        return list;
    }
    public static void main(String[] args) {
        CaLamViecCTDAO c = new CaLamViecCTDAO();
        c.deleteAllBydate("2022-11-15");
    }
}
