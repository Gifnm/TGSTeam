/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.CaLamViecCTDAO;
import Model.CaLamViecCT;
import Model.NhanVien;
import Model.SanPham;
import com.edysys.utils.Auth;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class ChamCong extends javax.swing.JFrame {

    /**
     * Creates new form ChamCong
     */
    public ChamCong() {
        initComponents();
        innit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbNgay = new javax.swing.JLabel();
        JpnChamCong = new javax.swing.JPanel();

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Chấm tất cả");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setText("Vui lòng chấm công ngay khi vào ca");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Ngày:");

        jlbNgay.setFont(new java.awt.Font(".VnArial", 1, 16)); // NOI18N
        jlbNgay.setForeground(new java.awt.Color(153, 153, 255));
        jlbNgay.setText("\"Ngày\"");

        JpnChamCong.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout JpnChamCongLayout = new javax.swing.GroupLayout(JpnChamCong);
        JpnChamCong.setLayout(JpnChamCongLayout);
        JpnChamCongLayout.setHorizontalGroup(
            JpnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        JpnChamCongLayout.setVerticalGroup(
            JpnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(JpnChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlbNgay)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpnChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChamCong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChamCong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpnChamCong;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jlbNgay;
    // End of variables declaration//GEN-END:variables
public void innit() {
        Image img1 = Toolkit.getDefaultToolkit().createImage("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\icon\\bird.png");
        this.setIconImage(img1);
        NhanVien nv = new NhanVien();
        nv = Auth.user;
        List = dao.selectByDateAndMaNV(LayNgay(), nv.getMaNV());
        this.JpnChamCong.setLayout(new GridLayout(List.size(), 2, 10, 10));
        jlbNgay.setText(LayNgay());
        for (CaLamViecCT caLamViecCT : List) {
            this.JpnChamCong.add(new Label(caLamViecCT.getMaCaLV()));
            if (caLamViecCT.getMaCaLV().equalsIgnoreCase("CA1")) {
                this.JpnChamCong.add(chamCong1);
                if (caLamViecCT.getThoiGianChamCong() != null) {
                    // this.JpnChamCong.add(new Button("Đã chấm"));
                    chamCong1.setLabel("Đã chấm");
                    chamCong1.setEnabled(false);
                } else {

                    chamCong1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            chamCong1.setEnabled(false);
                            caLamViecCT.setThoiGianChamCong(LayTime());
                            dao.updateTime(caLamViecCT);
                        }
                    });
                }
            } else if (caLamViecCT.getMaCaLV().equalsIgnoreCase("CA2")) {
                this.JpnChamCong.add(chamCong2);
                if (caLamViecCT.getThoiGianChamCong() != null) {
//                this.JpnChamCong.add(new Button("Đã chấm"));
                    chamCong2.setLabel("Đã chấm");
                    chamCong2.setEnabled(false);
                } else {

                    chamCong2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            caLamViecCT.setThoiGianChamCong(LayTime());
                            dao.updateTime(caLamViecCT);
                            chamCong2.setLabel("Đã chấm");
                            chamCong2.setEnabled(false);
                        }
                    });
                }
            } else if (caLamViecCT.getMaCaLV().equalsIgnoreCase("CA3")) {
                this.JpnChamCong.add(chamCong3);
                if (caLamViecCT.getThoiGianChamCong() != null) {
                    // this.JpnChamCong.add(new Button("Đã chấm"));
                    chamCong3.setLabel("Đã chấm");
                    chamCong3.setEnabled(false);
                } else {

                    chamCong3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            chamCong3.setName("Đã chấm");
                            caLamViecCT.setThoiGianChamCong(LayTime());
                            dao.updateTime(caLamViecCT);
                            chamCong3.setLabel("Đã chấm");
                            chamCong3.setEnabled(false);
                        }
                    });
                }
            } else if (caLamViecCT.getMaCaLV().equalsIgnoreCase("CA4")) {
                this.JpnChamCong.add(chamCong4);
                if (caLamViecCT.getThoiGianChamCong() != null) {
                    // this.JpnChamCong.add(new Button("Đã chấm"));
                    chamCong4.setLabel("Đã chấm");
                    chamCong4.setEnabled(false);
                } else {

                    chamCong4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            chamCong4.setName("Đã chấm");
                            caLamViecCT.setThoiGianChamCong(LayTime());
                            dao.updateTime(caLamViecCT);
                            chamCong4.setLabel("Đã chấm");
                            chamCong4.setEnabled(false);
                        }
                    });
                }
            } else if (caLamViecCT.getMaCaLV().equalsIgnoreCase("CA5")) {
                this.JpnChamCong.add(chamCong5);
                if (caLamViecCT.getThoiGianChamCong() != null) {
                    // this.JpnChamCong.add(new Button("Đã chấm"));
                    chamCong5.setLabel("Đã chấm");
                    chamCong5.setEnabled(false);
                } else {

                    chamCong5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            chamCong5.setName("Đã chấm");
                            caLamViecCT.setThoiGianChamCong(LayTime());
                            dao.updateTime(caLamViecCT);
                            chamCong5.setLabel("Đã chấm");
                            chamCong5.setEnabled(false);
                        }
                    });
                }
            }
        }
    }
    List<CaLamViecCT> List = new ArrayList<>();
    CaLamViecCTDAO dao = new CaLamViecCTDAO();
    Button chamCong1 = new Button("Chấm Ca 1");

    Button chamCong2 = new Button("Chấm Ca 2");
    Button chamCong3 = new Button("Chấm Ca 3");
    Button chamCong4 = new Button("Chấm Ca 4");
    Button chamCong5 = new Button("Chấm Ca 5");

    public String LayNgay() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        String timeNow = dateFormat.format(cal.getTime());
        return timeNow;
    }

    public String LayTime() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String timeNow = dateFormat.format(cal.getTime());
        return timeNow;
    }
}
