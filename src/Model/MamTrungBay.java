/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class MamTrungBay {

    private Integer soKe;
    private Integer soMam;
    private String barcode;
    private Integer viTri;
    private Integer trungBay;

    public MamTrungBay(Integer soKe, Integer soMam, String barcode, Integer viTri, Integer trungBay) {
        this.soKe = soKe;
        this.soMam = soMam;
        this.barcode = barcode;
        this.viTri = viTri;
        this.trungBay = trungBay;
    }

    public MamTrungBay() {
    }

    public Integer getSoKe() {
        return soKe;
    }

    public void setSoKe(Integer soKe) {
        this.soKe = soKe;
    }

    public Integer getSoMam() {
        return soMam;
    }

    public void setSoMam(Integer soMam) {
        this.soMam = soMam;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getViTri() {
        return viTri;
    }

    public void setViTri(Integer viTri) {
        this.viTri = viTri;
    }

    public Integer getTrungBay() {
        return trungBay;
    }

    public void setTrungBay(Integer trungBay) {
        this.trungBay = trungBay;
    }

}
