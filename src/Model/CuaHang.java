/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class CuaHang {

    private Integer MaCH;
    private String TenCH;
    private String DiaChi;

    public CuaHang() {
    }

    public CuaHang(Integer MaCH, String TenCH, String DiaChi) {
        this.MaCH = MaCH;
        this.TenCH = TenCH;
        this.DiaChi = DiaChi;
    }

    public Integer getMaCH() {
        return MaCH;
    }

    public void setMaCH(Integer MaCH) {
        this.MaCH = MaCH;
    }

    public String getTenCH() {
        return TenCH;
    }

    public void setTenCH(String TenCH) {
        this.TenCH = TenCH;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

}
