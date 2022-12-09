/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class PhieuMuonCT {

    private String MaPM;
    private String Barcode;
    private Integer SoLuong;
    private Float ThanhTien;

    public PhieuMuonCT(String MaPM, String Barcode, Integer SoLuong, Float ThanhTien) {
        this.MaPM = MaPM;
        this.Barcode = Barcode;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public PhieuMuonCT() {
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

}
