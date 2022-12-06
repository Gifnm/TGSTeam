/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.*;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPham {

  private Integer ID;
 private String Barcode;
 private String TenSP;
 private Float GiaMuon;
 private Float DonGia;
 private Float giaNhap;
 private Integer VAT;
 private String MaLoaiSP;
 private Integer MaCH;
 private String HinhAnh;
 private Integer SoLuongTrungBay;
 private int SoLuongBan;

    public SanPham() {
        this.SoLuongBan = 1;
    }

    public SanPham(Integer ID, String Barcode, String TenSP, Float GiaMuon, Float DonGia, String MaLoaiSP, Integer MaCH, String HinhAnh, Integer SoLuongTrungBay) {
        this.ID = ID;
        this.Barcode = Barcode;
        this.TenSP = TenSP;
        this.GiaMuon = GiaMuon;
        this.DonGia = DonGia;
        this.MaLoaiSP = MaLoaiSP;
        this.MaCH = MaCH;
        this.HinhAnh = HinhAnh;
        this.SoLuongTrungBay = SoLuongTrungBay;
        this.SoLuongBan = 1;
    }

    public SanPham(Integer ID, String Barcode, String TenSP, Float GiaMuon, Float DonGia, Float giaNhap, Integer VAT, String MaLoaiSP, Integer MaCH, String HinhAnh, Integer SoLuongTrungBay, int SoLuongBan) {
        this.ID = ID;
        this.Barcode = Barcode;
        this.TenSP = TenSP;
        this.GiaMuon = GiaMuon;
        this.DonGia = DonGia;
        this.giaNhap = giaNhap;
        this.VAT = VAT;
        this.MaLoaiSP = MaLoaiSP;
        this.MaCH = MaCH;
        this.HinhAnh = HinhAnh;
        this.SoLuongTrungBay = SoLuongTrungBay;
        this.SoLuongBan = SoLuongBan;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public Float getGiaMuon() {
        return GiaMuon;
    }

    public void setGiaMuon(Float GiaMuon) {
        this.GiaMuon = GiaMuon;
    }

    public Float getDonGia() {
        return DonGia;
    }

    public void setDonGia(Float DonGia) {
        this.DonGia = DonGia;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public Integer getMaCH() {
        return MaCH;
    }

    public void setMaCH(Integer MaCH) {
        this.MaCH = MaCH;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public Integer getSoLuongTrungBay() {
        return SoLuongTrungBay;
    }

    public void setSoLuongTrungBay(Integer SoLuongTrungBay) {
        this.SoLuongTrungBay = SoLuongTrungBay;
    }

    public int getSoLuongBan() {
        return SoLuongBan;
    }

    public void setSoLuongBan(int SoLuongBan) {
        this.SoLuongBan = SoLuongBan;
    }

    public Float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public Integer getVAT() {
        return VAT;
    }

    public void setVAT(Integer VAT) {
        this.VAT = VAT;
    }
    
    
    public int getSoLuongNew(){
       
            this.SoLuongBan++;
            this.getThanhTien();
        
    return this.SoLuongBan;
    }
    public float getThanhTien(){
    
   return  this.SoLuongBan*this.getDonGia();
  
    }
    @Override 
        public String toString(){
    return this.TenSP;
    }
}
