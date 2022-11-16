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
public class LienCaThe {

    private String MaHD;
    private String NgayCaThe;
    private String ChuanChi;
    private Double SoTien;
    private String NganHang;

    public LienCaThe(String MaHD, String NgayCaThe, String ChuanChi, Double SoTien, String NganHang) {
        this.MaHD = MaHD;
        this.NgayCaThe = NgayCaThe;
        this.ChuanChi = ChuanChi;
        this.SoTien = SoTien;
        this.NganHang = NganHang;
    }

    public LienCaThe() {
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayCaThe() {
        return NgayCaThe;
    }

    public void setNgayCaThe(String NgayCaThe) {
        this.NgayCaThe = NgayCaThe;
    }

    public String getChuanChi() {
        return ChuanChi;
    }

    public void setChuanChi(String ChuanChi) {
        this.ChuanChi = ChuanChi;
    }

    public Double getSoTien() {
        return SoTien;
    }

    public void setSoTien(Double SoTien) {
        this.SoTien = SoTien;
    }

    public String getNganHang() {
        return NganHang;
    }

    public void setNganHang(String NganHang) {
        this.NganHang = NganHang;
    }

}
