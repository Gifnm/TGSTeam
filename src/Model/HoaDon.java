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
public class HoaDon {

    private String MaHD;
    private Integer MaNV;
    private String NgayTao;
    private Float TienMat;
    private Float TienThoi;
    private Float TongTien;

    public HoaDon() {
    }

    public HoaDon(String MaHD, Integer MaNV, String NgayTao, Float TienMat, Float TienThoi, Float TongTien) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.NgayTao = NgayTao;
        this.TienMat = TienMat;
        this.TienThoi = TienThoi;
        this.TongTien = TongTien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
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

    public Float getTongTien() {
        return TongTien;
    }

    public void setTongTien(Float TongTien) {
        this.TongTien = TongTien;
    }

   
}
