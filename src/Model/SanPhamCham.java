/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class SanPhamCham {

    private String MaDotCH;
    private String Barcode;
    private Integer SoLuongCanCham;
    private Boolean TrangThai;

    public SanPhamCham(String MaDotCH, String Barcode, Integer SoLuongCanCham, Boolean TrangThai) {
        this.MaDotCH = MaDotCH;
        this.Barcode = Barcode;
        this.SoLuongCanCham = SoLuongCanCham;
        this.TrangThai = TrangThai;
    }

    public SanPhamCham() {
    }

    public String getMaDotCH() {
        return MaDotCH;
    }

    public void setMaDotCH(String MaDotCH) {
        this.MaDotCH = MaDotCH;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public Integer getSoLuongCanCham() {
        return SoLuongCanCham;
    }

    public void setSoLuongCanCham(Integer SoLuongCanCham) {
        this.SoLuongCanCham = SoLuongCanCham;
    }

    public Boolean getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(Boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

}
