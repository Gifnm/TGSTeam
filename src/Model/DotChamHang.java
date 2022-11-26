/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class DotChamHang {

    private String MaDotCH;
    private Integer MaCH;
    private Integer MaNV;
    private String ThoiGianTao;
    private Boolean TrangThai;

    public DotChamHang() {
    }

    public DotChamHang(String MaDotCH, Integer MaCH, Integer MaNV, String ThoiGianTao, Boolean TrangThai) {
        this.MaDotCH = MaDotCH;
        this.MaCH = MaCH;
        this.MaNV = MaNV;
        this.ThoiGianTao = ThoiGianTao;
        this.TrangThai = TrangThai;
    }

    public String getMaDotCH() {
        return MaDotCH;
    }

    public void setMaDotCH(String MaDotCH) {
        this.MaDotCH = MaDotCH;
    }

    public Integer getMaCH() {
        return MaCH;
    }

    public void setMaCH(Integer MaCH) {
        this.MaCH = MaCH;
    }

    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    public String getThoiGianTao() {
        return ThoiGianTao;
    }

    public void setThoiGianTao(String ThoiGianTao) {
        this.ThoiGianTao = ThoiGianTao;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
