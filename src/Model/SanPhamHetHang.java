/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class SanPhamHetHang {

    private Integer MaCH;
    private String Barcode;
    private String ThoiGianBao;

    public SanPhamHetHang() {
    }

    public SanPhamHetHang(Integer MaCH, String Barcode, String ThoiGianBao) {
        this.MaCH = MaCH;
        this.Barcode = Barcode;
        this.ThoiGianBao = ThoiGianBao;
    }

    public Integer getMaCH() {
        return MaCH;
    }

    public void setMaCH(Integer MaCH) {
        this.MaCH = MaCH;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public String getThoiGianBao() {
        return ThoiGianBao;
    }

    public void setThoiGianBao(String ThoiGianBao) {
        this.ThoiGianBao = ThoiGianBao;
    }

}
