/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ASUS
 */
public class CaLamViecCT {

    private String MaCaLV;
    private Integer MaNV;
    private String Ngay;
    private String ThoiGianChamCong;
    private Boolean xacNhanQuanLy;
    private Float gioCongXacNhan;
    private String ghiChu;
    public CaLamViecCT() {
    }

    public CaLamViecCT(String MaCaLV, Integer MaNV, String Ngay) {
        this.MaCaLV = MaCaLV;
        this.MaNV = MaNV;
        this.Ngay = Ngay;
        this.ThoiGianChamCong = null;
    }

    public CaLamViecCT(String MaCaLV, Integer MaNV, String Ngay, String ThoiGianChamCong, Boolean xacNhanQuanLy, Float gioCongXacNhan, String ghiChu) {
        this.MaCaLV = MaCaLV;
        this.MaNV = MaNV;
        this.Ngay = Ngay;
        this.ThoiGianChamCong = ThoiGianChamCong;
        this.xacNhanQuanLy = xacNhanQuanLy;
        this.gioCongXacNhan = gioCongXacNhan;
        this.ghiChu = ghiChu;
    }

    

    

    public String getMaCaLV() {
        return MaCaLV;
    }

    public void setMaCaLV(String MaCaLV) {
        this.MaCaLV = MaCaLV;
    }

    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getThoiGianChamCong() {
        return ThoiGianChamCong;
    }

    public void setThoiGianChamCong(String ThoiGianChamCong) {
        this.ThoiGianChamCong = ThoiGianChamCong;
    }

    public Boolean getXacNhanQuanLy() {
        return xacNhanQuanLy;
    }

    public void setXacNhanQuanLy(Boolean xacNhanQuanLy) {
        this.xacNhanQuanLy = xacNhanQuanLy;
    }

    public Float getGioCongXacNhan() {
        return gioCongXacNhan;
    }

    public void setGioCongXacNhan(Float gioCongXacNhan) {
        this.gioCongXacNhan = gioCongXacNhan;
    }

    

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
}
