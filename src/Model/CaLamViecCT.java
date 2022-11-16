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

    public CaLamViecCT() {
    }

    public CaLamViecCT(String MaCaLV, Integer MaNV, String Ngay) {
        this.MaCaLV = MaCaLV;
        this.MaNV = MaNV;
        this.Ngay = Ngay;
        this.ThoiGianChamCong = null;
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

}
