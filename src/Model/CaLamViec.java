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
public class CaLamViec {

    private String MaCaLV;
    private String ThoiGianBatDau;
    private String ThoiGianKetThuc;
    private Integer soGioCong;

    public CaLamViec() {
    }

    public CaLamViec(String MaCaLV, String ThoiGianBatDau, String ThoiGianKetThuc) {
        this.MaCaLV = MaCaLV;
        this.ThoiGianBatDau = ThoiGianBatDau;
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public CaLamViec(String MaCaLV, String ThoiGianBatDau, String ThoiGianKetThuc, Integer soGioCong) {
        this.MaCaLV = MaCaLV;
        this.ThoiGianBatDau = ThoiGianBatDau;
        this.ThoiGianKetThuc = ThoiGianKetThuc;
        this.soGioCong = soGioCong;
    }

    public String getMaCaLV() {
        return MaCaLV;
    }

    public void setMaCaLV(String MaCaLV) {
        this.MaCaLV = MaCaLV;
    }

    public String getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public void setThoiGianBatDau(String ThoiGianBatDau) {
        this.ThoiGianBatDau = ThoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String ThoiGianKetThuc) {
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public Integer getSoGioCong() {
        return soGioCong;
    }

    public void setSoGioCong(Integer soGioCong) {
        this.soGioCong = soGioCong;
    }

}
