/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class KeTrungBay {

    private Integer SoKe;
    private Integer MaCH;

    public KeTrungBay() {
    }

    public KeTrungBay(Integer SoKe, Integer MaCH) {
        this.SoKe = SoKe;
        this.MaCH = MaCH;
    }

    public Integer getSoKe() {
        return SoKe;
    }

    public void setSoKe(Integer SoKe) {
        this.SoKe = SoKe;
    }

    public Integer getMaCH() {
        return MaCH;
    }

    public void setMaCH(Integer MaCH) {
        this.MaCH = MaCH;
    }

}
