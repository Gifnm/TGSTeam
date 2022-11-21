/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CaLamViec;
import com.edysys.utils.jdbcHepler;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CaLamViecDAO extends TGSTeamDAO<CaLamViec, String>{
    String INSERT_SQL = "INSERT INTO CaLamViec(MaCaLV,ThoiGianBatDau,ThoiGianKetThuc) VALUES(?,?,?)";
    String SELECT_ALL_SQL = "SELECT * FROM CaLamViec";
    String SELECT_BY_ID_SQL = "SELECT * FROM CaLamViec WHERE MaCaLV = ?";
    @Override
    public void insert(CaLamViec entity) {
         jdbcHepler.update(INSERT_SQL, entity.getMaCaLV(),entity.getThoiGianBatDau(),entity.getThoiGianKetThuc());
    }

    @Override
    public void update(CaLamViec entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CaLamViec> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public CaLamViec selectById(String key) {
       List<CaLamViec> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {

            return null;
        }

        return list.get(0);
    }

    @Override
    protected List<CaLamViec> selectBySql(String sql, Object... args) {
        List<CaLamViec> list = new ArrayList<CaLamViec>();
        try {

            ResultSet rs = jdbcHepler.query(sql, args);

            while (rs.next()) {

                CaLamViec entity = new CaLamViec();
              entity.setMaCaLV(rs.getString(1));
              entity.setThoiGianBatDau(rs.getString(2));
              entity.setThoiGianKetThuc(rs.getString(3));
              entity.setSoGioCong(rs.getInt(4));
                list.add(entity);

            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    
}
