/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import DAO.KeTrungBayDAO;
import DAO.MamTrungBayDAO;
import DAO.SanPhamDAO;
import Model.KeTrungBay;
import Model.MamTrungBay;
import Model.SanPham;
import com.edysys.utils.MsgBox;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author ASUS
 */
public class Tbhh_Jpn extends javax.swing.JPanel {

    /**
     * Creates new form Tbhh_Jpn
     */
    public Tbhh_Jpn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtTiemKiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jlbHinhAnh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jblTenSanPham = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbSoKe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlbSoMam = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jlbViTri = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlbTrungBay = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlbSoLuong = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlbTonKho = new javax.swing.JLabel();
        jlbGiaSP = new javax.swing.JLabel();
        jlbBarcode = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSoKe = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jlbMam = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpnKe = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTiemKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTiemKiemKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-icon.png"))); // NOI18N
        jButton1.setText("Tìm Kiếm");

        jlbHinhAnh.setBackground(new java.awt.Color(204, 204, 204));
        jlbHinhAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHinhAnh.setText("Hình Ảnh");
        jlbHinhAnh.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Kệ: ");

        jblTenSanPham.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jblTenSanPham.setText("Tên sản phẩm");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Giá sản phẩm:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Barcode:");

        jlbSoKe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbSoKe.setText("0");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Mâm:");

        jlbSoMam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbSoMam.setForeground(new java.awt.Color(51, 102, 255));
        jlbSoMam.setText("0");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 102));
        jLabel9.setText("Vị trí:");

        jlbViTri.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbViTri.setForeground(new java.awt.Color(255, 153, 102));
        jlbViTri.setText("0");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 102));
        jLabel11.setText("Trưng:");

        jlbTrungBay.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTrungBay.setForeground(new java.awt.Color(255, 51, 102));
        jlbTrungBay.setText("0");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setText("Số lượng:");

        jlbSoLuong.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbSoLuong.setForeground(new java.awt.Color(102, 102, 255));
        jlbSoLuong.setText("0");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("Tồn:");

        jlbTonKho.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbTonKho.setForeground(new java.awt.Color(0, 102, 51));
        jlbTonKho.setText("0");

        jlbGiaSP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbGiaSP.setForeground(new java.awt.Color(255, 51, 51));
        jlbGiaSP.setText("0");

        jlbBarcode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbBarcode.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jlbSoKe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlbSoMam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlbViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlbTrungBay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(jlbTonKho))
                                .addComponent(jblTenSanPham))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jlbGiaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(409, 409, 409))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jlbBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTiemKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jlbSoKe)
                            .addComponent(jLabel7)
                            .addComponent(jlbSoMam)
                            .addComponent(jLabel9)
                            .addComponent(jlbViTri)
                            .addComponent(jLabel11)
                            .addComponent(jlbTrungBay)
                            .addComponent(jLabel13)
                            .addComponent(jlbSoLuong)
                            .addComponent(jLabel15)
                            .addComponent(jlbTonKho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblTenSanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jlbGiaSP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jlbBarcode)))
                    .addComponent(jlbHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Xem sản phẩm", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtSoKe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSoKeKeyPressed(evt);
            }
        });

        jButton2.setText("Xem kê");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn kệ", " " }));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Chọn kệ:");

        jlbMam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbMam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMam.setText("1");

        jButton3.setText("<");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(">");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpnKe.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnKeLayout = new javax.swing.GroupLayout(jpnKe);
        jpnKe.setLayout(jpnKeLayout);
        jpnKeLayout.setHorizontalGroup(
            jpnKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
        );
        jpnKeLayout.setVerticalGroup(
            jpnKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jpnKe);

        jButton6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print-icon.png"))); // NOI18N
        jButton6.setText("In tem giá kệ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Mâm:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(215, 575, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtSoKe, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbMam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoKe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbMam)
                        .addComponent(jButton3)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Xem kệ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jpnKe.removeAll();
        KeTrungBay keTrungBay = new KeTrungBay();
        keTrungBay = keTrungBayDAO.selectById(Integer.parseInt(txtSoKe.getText()));
        if (keTrungBay == null) {
            MsgBox.alert(null, "Vui lòng kiểm tra lại số kệ");
        } else {
            XemMamTrungBay();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTiemKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiemKiemKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getViTriSanPham();
            txtTiemKiem.setText("");
        }
    }//GEN-LAST:event_txtTiemKiemKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.jpnKe.removeAll();
        if (viTriMam >= 1 && viTriMam < 5) {
            viTriMam++;
            XemMamTrungBay();
        } else if (viTriMam == 5) {
            viTriMam = 1;
            XemMamTrungBay();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.jpnKe.removeAll();
        if (viTriMam <= 5 && viTriMam > 1) {
            viTriMam--;
            XemMamTrungBay();
        } else if (viTriMam == 1) {
            viTriMam = 5;
            XemMamTrungBay();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        List<MamTrungBay> mamTrungBays = new ArrayList<>();
        mamTrungBays = mamTrungBayDAO.getSanPhamTrenKe(Integer.parseInt(txtSoKe.getText()));
        System.out.println(mamTrungBays.size());
        for (MamTrungBay mamTrungBay : mamTrungBays) {
            InTemaGiaSanPham(mamTrungBay.getBarcode());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtSoKeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoKeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.jpnKe.removeAll();
            KeTrungBay keTrungBay = new KeTrungBay();
            keTrungBay = keTrungBayDAO.selectById(Integer.parseInt(txtSoKe.getText()));
            if (keTrungBay == null) {
                MsgBox.alert(null, "Vui lòng kiểm tra lại số kệ");
            } else {
                XemMamTrungBay();
            }
        }
    }//GEN-LAST:event_txtSoKeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jblTenSanPham;
    private javax.swing.JLabel jlbBarcode;
    private javax.swing.JLabel jlbGiaSP;
    private javax.swing.JLabel jlbHinhAnh;
    private javax.swing.JLabel jlbMam;
    private javax.swing.JLabel jlbSoKe;
    private javax.swing.JLabel jlbSoLuong;
    private javax.swing.JLabel jlbSoMam;
    private javax.swing.JLabel jlbTonKho;
    private javax.swing.JLabel jlbTrungBay;
    private javax.swing.JLabel jlbViTri;
    private javax.swing.JPanel jpnKe;
    private javax.swing.JTextField txtSoKe;
    private javax.swing.JTextField txtTiemKiem;
    // End of variables declaration//GEN-END:variables
    KeTrungBayDAO keTrungBayDAO = new KeTrungBayDAO();
    SanPhamDAO sanPhamDAO = new SanPhamDAO();
    MamTrungBayDAO mamTrungBayDAO = new MamTrungBayDAO();
    SanPham sanPham = new SanPham();
    List<MamTrungBay> listMamTb = new ArrayList<>();
    int viTriMam = 1;
    String URL = "C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\";

    public void getViTriSanPham() {
        MamTrungBay mamTrungBay = new MamTrungBay();
        mamTrungBay = mamTrungBayDAO.selectByBarcode(txtTiemKiem.getText());
        System.out.println("View.Tbhh_Jpn.getViTriSanPham()");
        sanPham = sanPhamDAO.selectById(mamTrungBay.getBarcode());
        jlbSoKe.setText(mamTrungBay.getSoKe() + "");
        jlbSoMam.setText(mamTrungBay.getSoMam() + "");
        jlbViTri.setText(mamTrungBay.getViTri() + "");
        jlbSoLuong.setText("0");
        jlbTrungBay.setText(mamTrungBay.getTrungBay() + "");
        jlbTonKho.setText("0");
        jlbBarcode.setText(mamTrungBay.getBarcode());
        jlbGiaSP.setText(sanPham.getDonGia() + " VND");
        jblTenSanPham.setText(sanPham.getTenSP());
        //
        String sRcImage = URL + sanPham.getHinhAnh();
        ImageIcon imc = new ImageIcon(sRcImage);
        System.out.println(sRcImage);
        // btnHa.setIcon(imc);
        Image img = imc.getImage();
        Image newImg = img.getScaledInstance(jlbHinhAnh.getWidth(), jlbHinhAnh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImg);
        jlbHinhAnh.setIcon(icon);
    }

    public List<MamTrungBay> getMamtB() {

        listMamTb = mamTrungBayDAO.getMamTB(Integer.parseInt(txtSoKe.getText()), viTriMam);
        return listMamTb;
    }

    public void XemMamTrungBay() {
        getMamtB();
        System.out.println(listMamTb.size());
        jlbMam.setText(viTriMam + "");
        this.jpnKe.setLayout(new GridLayout(listMamTb.size(), 1, 0, 5));
        for (MamTrungBay mamTrungBay : listMamTb) {
            SanPham sp = new SanPham();
            sp = sanPhamDAO.selectById(mamTrungBay.getBarcode());
            System.out.println(sp.getBarcode());
            Jpn_ViTriHangHoa jpn_ViTriHangHoa = new Jpn_ViTriHangHoa();
            jpn_ViTriHangHoa.setSoKe(mamTrungBay.getSoKe() + "");
            jpn_ViTriHangHoa.setViTri(mamTrungBay.getViTri() + "");
            jpn_ViTriHangHoa.setSoLuongTB(mamTrungBay.getTrungBay() + "");
            jpn_ViTriHangHoa.setTonTaiCH("0");// cần update
            jpn_ViTriHangHoa.setTenSanPham(sp.getTenSP());
            jpn_ViTriHangHoa.setGiaBan(sp.getDonGia() + "");
            jpn_ViTriHangHoa.setBarcode(mamTrungBay.getBarcode());
            String sRcData = sp.getHinhAnh();
            sRcData = sRcData.replace('/', '\\');
            String sRc = URL + sRcData;
            jpn_ViTriHangHoa.setImage(sRc);
            this.jpnKe.add(jpn_ViTriHangHoa);
        }
        this.jpnKe.revalidate();
        this.jpnKe.repaint();
    }

    public void InTemaGiaSanPham(String barcode) {

        try {
            Hashtable map = new Hashtable();
            JasperReport rpt = JasperCompileManager.compileReport("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\Report\\TeamGia.jrxml");
            map.put("Barcode", barcode);
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TGSTeam", "sa", "123");
            JasperPrint p = JasperFillManager.fillReport(rpt, map, conn);
            // JasperViewer.viewReport(p, false); // Hiển thị file PDF
            JasperPrintManager.printReport(p, false);// Gửi Report đến máy in    
        } catch (JRException ex) {
            Logger.getLogger(View_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(View_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
