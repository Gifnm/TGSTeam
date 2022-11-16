/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.*;

/**
 *
 * @author ASUS
 */
public class NhanVien {
//    static String MaNV;
//
//    public static String getMaNV() {
//        return MaNV;
//    }
//
//    public static void setMaNV(String MaNV) {
//        NhanVien.MaNV = MaNV;
//    }

    private Integer MaNV;
    private String HoTenNV;
    private Boolean GioiTinh;
    private String DiaChi;
    private String SoDienThoai;
    private String Email;
    private String NgaySinh;
    private String MatKhau;
    private String HinhAnh;
    private Integer MaCH;
    private String VaiTro;

    public NhanVien(Integer MaNV, String HoTenNV, Boolean GioiTinh, String DiaChi, String SoDienThoai, String Email, String NgaySinh, String MatKhau, String HinhAnh, Integer MaCH, String VaiTro) {
        this.MaNV = MaNV;
        this.HoTenNV = HoTenNV;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
        this.NgaySinh = NgaySinh;
        this.MatKhau = MatKhau;
        this.HinhAnh = HinhAnh;
        this.MaCH = MaCH;
        this.VaiTro = VaiTro;
    }

    public NhanVien() {
    }

    public Integer getMaNV() {
        return MaNV;
    }

    public void setMaNV(Integer MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoTenNV() {
        return HoTenNV;
    }

    public void setHoTenNV(String HoTenNV) {
        this.HoTenNV = HoTenNV;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public Integer getMaCH() {
        return MaCH;
    }

    public void setMaCH(Integer MaCH) {
        this.MaCH = MaCH;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

}
