/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class PhieuMuon {

    private String MaPM;
    private Integer MaNV;
    private String NgayLap;
    private String NgayTraDuKien;
    private String NgayTra;
    private Boolean TrangThaiTra;
    private Float TongTien;
    private Float TienMat;
    private Float TienThoi;

    public PhieuMuon(String MaPM, Integer MaNV, String NgayLap, String NgayTraDuKien, String NgayTra, Boolean TrangThaiTra, Float TongTien, Float TienMat, Float TienThoi) {
        this.MaPM = MaPM;
        this.MaNV = MaNV;
        this.NgayLap = NgayLap;
        this.NgayTraDuKien = NgayTraDuKien;
        this.NgayTra = NgayTra;
        this.TrangThaiTra = TrangThaiTra;
        this.TongTien = TongTien;
        this.TienMat = TienMat;
        this.TienThoi = TienThoi;
    }

    public PhieuMuon() {
    }

    public String getMaPM() {
        return MaPM;
    }

    public void setMaPM(String MaPM) {
        this.MaPM = MaPM;
    }

    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getNgayTraDuKien() {
        return NgayTraDuKien;
    }

    public void setNgayTraDuKien(String NgayTraDuKien) {
        this.NgayTraDuKien = NgayTraDuKien;
    }

    public String getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }

    public Boolean getTrangThaiTra() {
        return TrangThaiTra;
    }

    public void setTrangThaiTra(Boolean TrangThaiTra) {
        this.TrangThaiTra = TrangThaiTra;
    }

    public Float getTongTien() {
        return TongTien;
    }

    public void setTongTien(Float TongTien) {
        this.TongTien = TongTien;
    }

    public Float getTienMat() {
        return TienMat;
    }

    public void setTienMat(Float TienMat) {
        this.TienMat = TienMat;
    }

    public Float getTienThoi() {
        return TienThoi;
    }

    public void setTienThoi(Float TienThoi) {
        this.TienThoi = TienThoi;
    }

}
