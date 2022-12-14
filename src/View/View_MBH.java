/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.CaLamViecCTDAO;
import DAO.HoaDonCTDAO;
import DAO.HoaDonDAO;
import DAO.PhieuMuonCTDAO;
import DAO.PhieuMuonDAO;
import DAO.SanPhamDAO;
import Model.CaLamViecCT;
import Model.HoaDon;
import Model.HoaDonCT;
import Model.NhanVien;
import Model.PhieuMuon;
import Model.PhieuMuonCT;
import Model.SanPham;
import com.edysys.utils.Auth;
import com.edysys.utils.MsgBox;
import com.edysys.utils.jdbcHepler;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS
 */
public class View_MBH extends javax.swing.JFrame {

    /**
     * Creates new form PMBH
     */
    private DefaultListModel listModel;
    // table tra c???u phi???u xu???t
    private List<HoaDon> danSachHD = new ArrayList<>();
    DefaultTableModel modelHD = new DefaultTableModel();
    // table tra c???u phi???u xu???t

    // tbale l???ch s??? phi???u xu???t
    private List<HoaDonCT> danSachLsHD = new ArrayList<>();
    DefaultTableModel modellshd = new DefaultTableModel();
    // table l???ch s??? phi???u xu???t

    // tbale b??n h??ng
    private ArrayList<SanPham> list = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    //tbale b??n h??ng

    // table tem gi??
    DefaultTableModel modelTemGia = new DefaultTableModel();
    List<SanPham> listTemGia = new ArrayList();
    //  tem gi??
    // Model tbale Nh???p tr???
    DefaultTableModel modelNhapTra = new DefaultTableModel();
    List<HoaDonCT> danhSachNhapTra = new ArrayList<>();
    // List t??m ki???m
    ArrayList<SanPham> listTimKiem = new ArrayList<>();
    //
    int[] row;
    Jpn_PhieuXuat phieuXuat1 = new Jpn_PhieuXuat();
    Jpn_PhieuXuat phieuXuat2 = new Jpn_PhieuXuat();
    Jpn_PhieuXuat phieuXuat3 = new Jpn_PhieuXuat();
    float tienThoi = 0;
    boolean chay = true;
    String maSo;
    String key = "";
    SanPhamDAO spDAO = new SanPhamDAO();
    HoaDonDAO hdDAO = new HoaDonDAO();
    HoaDonCTDAO hdctDAO = new HoaDonCTDAO();
    int indexPhieuxuat = 0;

    public View_MBH() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//tblSach.setRowSelectionAllowed(false);
        txtBarcode.requestFocus();
        jpmMenuSeach.add(jpnSeach);
        //URL iconClass = View_MBH.class.getResource("\\icon\\Book-icon.png");

        Image img1 = Toolkit.getDefaultToolkit().createImage("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\icon\\bird.png");
        this.setIconImage(img1);

        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\icon\\bird.png")));
        this.setLocationRelativeTo(null);
        this.setTitle("MBH");
        model = (DefaultTableModel) tblSach.getModel();
        tblSach.setModel(model);
        modelHD = (DefaultTableModel) tblPhieuXuat.getModel();
        tblPhieuXuat.setModel(modelHD);
        modellshd = (DefaultTableModel) tblLichSuPx.getModel();
        tblLichSuPx.setModel(modellshd);
        listModel = new DefaultListModel();
        JListSanPham.setModel(listModel);
        tblPhieuXuat.setDefaultRenderer(Object.class, new RenderTablaPrestamos());
        //set model cho table nh???p tr???
        modelNhapTra = (DefaultTableModel) jtblNhapTra.getModel();
        jtblNhapTra.setModel(modelNhapTra);
      
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jdlHoaDon = new javax.swing.JDialog();
        btnInLai = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLichSuPx = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTienMat = new javax.swing.JLabel();
        lblLsTienThoi = new javax.swing.JLabel();
        lblLsTongTien = new javax.swing.JLabel();
        jpnSeach = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        JListSanPham = new javax.swing.JList<>();
        jpmMenuSeach = new javax.swing.JPopupMenu();
        JdlNhapTra = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        txtNhapTraBarcode = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtblNhapTra = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JtbTabbed = new javax.swing.JTabbedPane();
        JpnPhieuXuat = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblPhaiThu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtTienMat = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jlbDaGiam = new javax.swing.JLabel();
        lblTienThoi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        jpnKiemTraGia = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        JpnTraCuuPx = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtMaPX = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnXemPhieuXuat = new javax.swing.JButton();
        jdcFirtDay = new com.toedter.calendar.JDateChooser();
        jdcNextDay = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhieuXuat = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlbDoanhThu = new javax.swing.JLabel();
        jlbGiaTriBillTB = new javax.swing.JLabel();
        jlbSoPhieuXuat = new javax.swing.JLabel();
        JtbNhanVien = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmnNhapTra = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jdlHoaDon.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jdlHoaDonComponentShown(evt);
            }
        });
        jdlHoaDon.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jdlHoaDonWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jdlHoaDonWindowOpened(evt);
            }
        });

        btnInLai.setBackground(new java.awt.Color(255, 255, 255));
        btnInLai.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnInLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/print-icon.png"))); // NOI18N
        btnInLai.setText("In l???i");
        btnInLai.setBorder(null);
        btnInLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInLaiActionPerformed(evt);
            }
        });

        tblLichSuPx.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblLichSuPx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T??n s???n ph???m", "S??? l?????ng", "????n gi??", "Th??nh ti???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLichSuPx.setRowHeight(25);
        jScrollPane4.setViewportView(tblLichSuPx);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 165, 221));
        jLabel3.setText("Ti???n m???t:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(113, 210, 162));
        jLabel6.setText("Ti???n th???i:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(235, 66, 85));
        jLabel7.setText("T???ng ti???n:");

        lblTienMat.setText("0");

        lblLsTienThoi.setText("0");

        lblLsTongTien.setText("0");

        javax.swing.GroupLayout jdlHoaDonLayout = new javax.swing.GroupLayout(jdlHoaDon.getContentPane());
        jdlHoaDon.getContentPane().setLayout(jdlHoaDonLayout);
        jdlHoaDonLayout.setHorizontalGroup(
            jdlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
            .addGroup(jdlHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTienMat, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLsTienThoi, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLsTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInLai, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdlHoaDonLayout.setVerticalGroup(
            jdlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdlHoaDonLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jdlHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTienMat)
                    .addComponent(jLabel6)
                    .addComponent(lblLsTienThoi)
                    .addComponent(jLabel7)
                    .addComponent(lblLsTongTien)
                    .addComponent(btnInLai, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JListSanPham.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JListSanPham.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JListSanPham.setForeground(new java.awt.Color(51, 153, 255));
        JListSanPham.setVisibleRowCount(35);
        JListSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JListSanPhamMouseClicked(evt);
            }
        });
        JListSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JListSanPhamKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(JListSanPham);

        javax.swing.GroupLayout jpnSeachLayout = new javax.swing.GroupLayout(jpnSeach);
        jpnSeach.setLayout(jpnSeachLayout);
        jpnSeachLayout.setHorizontalGroup(
            jpnSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jpnSeachLayout.setVerticalGroup(
            jpnSeachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );

        jpmMenuSeach.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Nh???p m?? h??a ????n:");

        txtNhapTraBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNhapTraBarcodeKeyPressed(evt);
            }
        });

        jtblNhapTra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtblNhapTra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? s???n ph???m", "T??n s???n ph???m", "S??? l?????ng", "????n gi??"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblNhapTra.setRowHeight(20);
        jtblNhapTra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtblNhapTraKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jtblNhapTra);

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Nh???p tr??? h??a ????n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setText("Nh???p tr??? s???n ph???m");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 102));
        jLabel18.setText("L??u ??: X??a c??c s???n ph???m kh??ng mu???n nh???p tr???");

        javax.swing.GroupLayout JdlNhapTraLayout = new javax.swing.GroupLayout(JdlNhapTra.getContentPane());
        JdlNhapTra.getContentPane().setLayout(JdlNhapTraLayout);
        JdlNhapTraLayout.setHorizontalGroup(
            JdlNhapTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(JdlNhapTraLayout.createSequentialGroup()
                .addGroup(JdlNhapTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JdlNhapTraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JdlNhapTraLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNhapTraBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(20, 20, 20)
                .addComponent(jButton4)
                .addGap(7, 7, 7))
        );
        JdlNhapTraLayout.setVerticalGroup(
            JdlNhapTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JdlNhapTraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JdlNhapTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JdlNhapTraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNhapTraBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)
                        .addComponent(jButton4)))
                .addGap(23, 23, 23)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JtbTabbed.setBackground(new java.awt.Color(255, 255, 255));
        JtbTabbed.setForeground(new java.awt.Color(102, 102, 102));
        JtbTabbed.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        JtbTabbed.setOpaque(true);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nh???p m?? s???n ph???m (F8)");
        jLabel1.setOpaque(true);

        txtBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarcodeActionPerformed(evt);
            }
        });
        txtBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Ph???i thu:");

        lblPhaiThu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPhaiThu.setForeground(new java.awt.Color(255, 102, 102));
        lblPhaiThu.setText("0");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("T???ng ti???n:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("???? gi???m:");

        jPanel7.setBackground(new java.awt.Color(153, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ti???n m???t (F9)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Arial", 1, 14))); // NOI18N

        txtTienMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienMatActionPerformed(evt);
            }
        });
        txtTienMat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTienMatPropertyChange(evt);
            }
        });
        txtTienMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTienMatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienMatKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("C?? th??? F7");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setText("PMH F4");

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setText("T??ch ??i???m Ctrl + 2");

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setText("In Bill F12");

        jButton12.setText("Ctrl + 2");

        jButton14.setText("F12");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("F4");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("F7");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTienMat)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel32)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTienMat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jButton1))
                .addGap(9, 9, 9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jButton14))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Ti???n th???i l???i:");

        lblTongTien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTongTien.setForeground(new java.awt.Color(102, 102, 102));
        lblTongTien.setText("0");

        jlbDaGiam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbDaGiam.setForeground(new java.awt.Color(102, 102, 102));
        jlbDaGiam.setText("0");

        lblTienThoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTienThoi.setForeground(new java.awt.Color(102, 102, 102));
        lblTienThoi.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTienThoi)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTongTien)
                    .addComponent(lblPhaiThu)
                    .addComponent(jlbDaGiam))
                .addGap(42, 42, 42))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtBarcode)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblPhaiThu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTongTien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlbDaGiam))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTienThoi))
                .addGap(0, 65, Short.MAX_VALUE))
        );

        tblSach.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "T??n s???n ph???m", "S??? l?????ng", "????n gi??", "Th??nh ti???n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSach.setRowHeight(30);
        tblSach.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        tblSach.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblSachPropertyChange(evt);
            }
        });
        tblSach.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblSachKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSachKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tblSachKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        javax.swing.GroupLayout JpnPhieuXuatLayout = new javax.swing.GroupLayout(JpnPhieuXuat);
        JpnPhieuXuat.setLayout(JpnPhieuXuatLayout);
        JpnPhieuXuatLayout.setHorizontalGroup(
            JpnPhieuXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpnPhieuXuatLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JpnPhieuXuatLayout.setVerticalGroup(
            JpnPhieuXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JtbTabbed.addTab("Phi???u xu???t", JpnPhieuXuat);

        jPanel12.setBackground(new java.awt.Color(153, 204, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("Nh???p m?? s???n ph???m (F8)");
        jLabel28.setOpaque(true);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField7)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "T??n s???n ph???m", "S??? l?????ng", "????n gi??", "Th??nh ti???n"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jpnKiemTraGiaLayout = new javax.swing.GroupLayout(jpnKiemTraGia);
        jpnKiemTraGia.setLayout(jpnKiemTraGiaLayout);
        jpnKiemTraGiaLayout.setHorizontalGroup(
            jpnKiemTraGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKiemTraGiaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jpnKiemTraGiaLayout.setVerticalGroup(
            jpnKiemTraGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKiemTraGiaLayout.createSequentialGroup()
                .addGroup(jpnKiemTraGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        JtbTabbed.addTab("Ki???m tra gi??", jpnKiemTraGia);

        jLabel37.setText("M?? phi???u xu???t:");

        txtMaPX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaPXKeyPressed(evt);
            }
        });

        jLabel38.setText("T??? ng??y:");

        jLabel39.setText("?????n ng??y:");

        btnXemPhieuXuat.setBackground(new java.awt.Color(255, 255, 255));
        btnXemPhieuXuat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnXemPhieuXuat.setText("Xem");
        btnXemPhieuXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemPhieuXuatActionPerformed(evt);
            }
        });

        jdcFirtDay.setDateFormatString("yyyy-MM-dd");

        jdcNextDay.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaPX, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcFirtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcNextDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnXemPhieuXuat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaPX)
                        .addComponent(jLabel37)
                        .addComponent(jLabel38)
                        .addComponent(jLabel39)
                        .addComponent(btnXemPhieuXuat))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcNextDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFirtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        tblPhieuXuat.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblPhieuXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? phi???u xu???t", "Ng??y xu???t", "T???ng ti???n", "Ph???i thu", "Ti???n m???t", "???? gi???m", "Ti???n c?? th???", "Ti???n th???i l???i"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieuXuat.setGridColor(new java.awt.Color(102, 102, 102));
        tblPhieuXuat.setRowHeight(30);
        tblPhieuXuat.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblPhieuXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuXuatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPhieuXuat);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Doanh thu:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("S??? phi???u xu???t:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Gi?? tr??? Bill trung b??nh:");

        jlbDoanhThu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbDoanhThu.setForeground(new java.awt.Color(255, 0, 102));
        jlbDoanhThu.setText("0");

        jlbGiaTriBillTB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbGiaTriBillTB.setForeground(new java.awt.Color(255, 102, 51));
        jlbGiaTriBillTB.setText("0");

        jlbSoPhieuXuat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlbSoPhieuXuat.setForeground(new java.awt.Color(0, 153, 204));
        jlbSoPhieuXuat.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlbDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbSoPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbGiaTriBillTB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jlbDoanhThu)
                    .addComponent(jlbGiaTriBillTB)
                    .addComponent(jlbSoPhieuXuat))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JpnTraCuuPxLayout = new javax.swing.GroupLayout(JpnTraCuuPx);
        JpnTraCuuPx.setLayout(JpnTraCuuPxLayout);
        JpnTraCuuPxLayout.setHorizontalGroup(
            JpnTraCuuPxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
            .addGroup(JpnTraCuuPxLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JpnTraCuuPxLayout.setVerticalGroup(
            JpnTraCuuPxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpnTraCuuPxLayout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        JtbTabbed.addTab("Tra c???u phi???u xu???t", JpnTraCuuPx);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(JtbTabbed)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(JtbTabbed)
                .addGap(0, 0, 0))
        );

        JtbNhanVien.setBackground(new java.awt.Color(153, 204, 255));
        JtbNhanVien.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JtbNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JtbNhanVien.setText("jLabel33");
        JtbNhanVien.setOpaque(true);

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("B??n H??ng");
        jMenu1.setOpaque(true);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem1.setText("In Bill");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItem2.setText("Nh???p s???n ph???m");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jMenuItem3.setText("Nh???p ti???n m???t");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem6.setText("ReMoveTab");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jMenuItem5.setText("Th??m phi???u xu???t");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);
        jMenu1.add(jSeparator1);

        jmnNhapTra.setText("Nh???p tr???");
        jMenu1.add(jmnNhapTra);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ch???c n??ng kh??c");

        jMenuItem4.setText("????ng xu???t");
        jMenu2.add(jMenuItem4);

        jMenuItem7.setText("L???ch s??? ch???m c??ng");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem9.setText("L???ch ph??n ca c?? nh??n");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem8.setText("L???ch ph??n ca c???a h??ng");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JtbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(JtbNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarcodeActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int tabSelected = JtbTabbed.getSelectedIndex();
        String nameTabSelected = JtbTabbed.getTitleAt(tabSelected);
       
        {
        if (nameTabSelected.equalsIgnoreCase("Phi???u xu???t") || nameTabSelected.equalsIgnoreCase("Ki???m tra gi??") || nameTabSelected.equalsIgnoreCase("M?????n/tr???") || nameTabSelected.equalsIgnoreCase("Tra c???u phi???u xu???t")) {
            if (txtTienMat.equals("") || Float.parseFloat(lblPhaiThu.getText()) > Float.parseFloat(txtTienMat.getText())) {
                MsgBox.alert(null, "Vui l??ng ki???m tra ti???n m???t");
            } else {
                InHOaDon();
                ResetMBH();
            }
        } else {
            if (nameTabSelected.equalsIgnoreCase("Phi???u xu???t 1")) {
                if (phieuXuat1.CheckTienMat()) {
                    list = phieuXuat1.getList();
                    InHOaDon();
                    phieuXuat1.ResetMBH();
                    ResetMBH();
                } else {
                    MsgBox.alert(this, "Ti???n m???t kh??ng h???p l???");
                }
            } else if (nameTabSelected.equalsIgnoreCase("Phi???u xu???t 2")) {
                if (phieuXuat2.CheckTienMat()) {
                    list = phieuXuat1.getList();
                    InHOaDon();
                    phieuXuat1.ResetMBH();
                    ResetMBH();
                } else {
                    MsgBox.alert(this, "Ti???n m???t kh??ng h???p l???");
                }
            } else if (nameTabSelected.equalsIgnoreCase("Phi???u xu???t 3")) {
                if (phieuXuat3.CheckTienMat()) {
                    list = phieuXuat1.getList();
                    InHOaDon();
                    phieuXuat1.ResetMBH();
                    ResetMBH();
                } else {
                    MsgBox.alert(this, "Ti???n m???t kh??ng h???p l???");
                }
            }
        }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        txtBarcode.requestFocus();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtBarcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getSanPham(txtBarcode.getText());
            txtBarcode.setText("");
            txtTienMat.setText(lblPhaiThu.getText());

        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("View.View_MBH.txtBarcodeKeyPressed()");
            tblSach.setRowSelectionInterval(indexRow, indexRow);
            // tblSach.editCellAt(tblSach.getSelectedRow(), 2);
            tblSach.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN && listTimKiem.size() > 0) {
            JListSanPham.requestFocus();
        }
    }//GEN-LAST:event_txtBarcodeKeyPressed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        txtTienMat.requestFocus();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtTienMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienMatActionPerformed

    private void txtTienMatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTienMatPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTienMatPropertyChange

    private void txtTienMatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienMatKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTienMatKeyPressed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
        row = tblSach.getSelectedRows();
    }//GEN-LAST:event_tblSachMouseClicked

    private void tblSachPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblSachPropertyChange
        // TODO add your handling code here:
        if (list.size() > 0) {
            int thaydoi = tblSach.getSelectedRow();
            System.out.println(tblSach.getValueAt(thaydoi, 2));
            int i = (int) tblSach.getValueAt(thaydoi, 2);
            list.get(thaydoi).setSoLuongBan(i);
        }
        FillToTable();
    }//GEN-LAST:event_tblSachPropertyChange

    private void tblSachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSachKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            removeRow(row);
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_UP) {
            if (indexRow == list.size()) {
                indexRow = 0;
                //tblSach.editCellAt(indexRow,2);
                // tblSach.setRowSelectionInterval(indexRow, indexRow);  
            } else {

                //tblSach.setRowSelectionInterval(indexRow, indexRow);
                //tblSach.editCellAt(indexRow,2);
                indexRow++;
                System.out.println(indexRow + "/" + list.size());

            }

        }
    }//GEN-LAST:event_tblSachKeyPressed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void txtTienMatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienMatKeyReleased
        // TODO add your handling code here:
        if (list.size() > 0) {
            try {
                if (Float.parseFloat(txtTienMat.getText()) >= LayTongTien()) {
                    tienThoi = Float.parseFloat(txtTienMat.getText()) - LayTongTien();
                    lblTienThoi.setText(tienThoi + " VND");
                } else {
                    lblTienThoi.setText("0");
                }
            } catch (NumberFormatException e) {
                lblTienThoi.setText("0");
            }
        }
    }//GEN-LAST:event_txtTienMatKeyReleased

    private void btnXemPhieuXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemPhieuXuatActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String firstDay = sdf.format(jdcFirtDay.getDate());
        String NextDay = sdf.format(jdcNextDay.getDate());
        System.out.println(firstDay);
        System.out.println(NextDay);
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            java.util.Date fiDate = sdf.parse(firstDay);
            java.util.Date nDate = sdf.parse(NextDay);
            if (fiDate.compareTo(nDate) > 0) {
                MsgBox.alert(this, "Ng??y kh??ng h???p l???");
            } else {

                danSachHD = hdDAO.selectHoaDonForToDay(firstDay + " 00:00:00", NextDay + " 23:59:00");

                modelHD.setRowCount(0);
                int TongTien = 0;
                modelHD.setRowCount(0);
                for (HoaDon hoaDon : danSachHD) {
                    modelHD.addRow(new Object[]{hoaDon.getMaHD(), hoaDon.getNgayTao(), hoaDon.getTongTien(), hoaDon.getTienThoi() > 0 ? 0 : hoaDon.getTongTien(), hoaDon.getTienMat(), 0, 0, hoaDon.getTienThoi()});
                }
                jlbSoPhieuXuat.setText(danSachHD.size() + "");
                float doanhThu = 0;
                for (HoaDon hoaDon : danSachHD) {
                    doanhThu = doanhThu + hoaDon.getTongTien();
                }
                jlbDoanhThu.setText(doanhThu + "");
                jlbGiaTriBillTB.setText((doanhThu / danSachHD.size()) + "");
            }
        } catch (ParseException ex) {
            System.out.println("fa");
            Logger.getLogger(View_MBH.class.getName()).log(Level.SEVERE, null, ex);
        }

        //FillToTablePx();
    }//GEN-LAST:event_btnXemPhieuXuatActionPerformed

    private void tblPhieuXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuXuatMouseClicked
        // TODO add your handling code here:
        this.jdlHoaDon.setVisible(true);
        this.jdlHoaDon.setSize(1058, 580);
        this.jdlHoaDon.setLocationRelativeTo(null);
    }//GEN-LAST:event_tblPhieuXuatMouseClicked

    private void jdlHoaDonWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jdlHoaDonWindowOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_jdlHoaDonWindowOpened

    private void btnInLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInLaiActionPerformed
        // TODO add your handling code here:
        try {
            Hashtable map = new Hashtable();
            JasperReport rpt = JasperCompileManager.compileReport("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\Report\\HoaDon.jrxml");
            map.put("sMaHD", key);
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TGSTeam", "sa", "123");
            JasperPrint p = JasperFillManager.fillReport(rpt, map, conn);
            JasperViewer.viewReport(p, false);
        } catch (JRException ex) {
            Logger.getLogger(View_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(View_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInLaiActionPerformed

    private void jdlHoaDonWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jdlHoaDonWindowClosed
        // TODO add your handling code here:

    }//GEN-LAST:event_jdlHoaDonWindowClosed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if (indexPhieuxuat < 3) {
            indexPhieuxuat++;
            if (indexPhieuxuat == 1) {
                //   ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\icon\\delete-icon.png");
                JtbTabbed.addTab("Phi???u xu???t " + indexPhieuxuat, phieuXuat1);
                JtbTabbed.setSelectedIndex(JtbTabbed.getTabCount() - 1);
            } else if (indexPhieuxuat == 2) {
                Jpn_PhieuXuat jpn = new Jpn_PhieuXuat();
                JtbTabbed.addTab("Phi???u xu???t " + indexPhieuxuat, phieuXuat2);
                JtbTabbed.setSelectedIndex(JtbTabbed.getTabCount() - 1);
            } else if (indexPhieuxuat == 3) {
                Jpn_PhieuXuat jpn = new Jpn_PhieuXuat();
                JtbTabbed.addTab("Phi???u xu???t " + indexPhieuxuat, phieuXuat3);
                JtbTabbed.setSelectedIndex(JtbTabbed.getTabCount() - 1);
            }
        }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        int index = JtbTabbed.getSelectedIndex();
        String nameTab = JtbTabbed.getTitleAt(index);
        if (nameTab.equalsIgnoreCase("Phi???u xu???t 1") || nameTab.equalsIgnoreCase("Phi???u xu???t 2") || nameTab.equalsIgnoreCase("Phi???u xu???t 3")) {
            JtbTabbed.remove(index);
            indexPhieuxuat--;
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jdlHoaDonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jdlHoaDonComponentShown
        // TODO add your handling code here:
        FillToTableLsPx();
    }//GEN-LAST:event_jdlHoaDonComponentShown

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        View_LichSuChamCong view_LichSuChamCong = new View_LichSuChamCong();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            view_LichSuChamCong.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        NhanVien nv = new NhanVien();
        nv = Auth.user;
        // Hi???n th??? t??n nh??n vi??n ??? Bottom m??ng h??nh
        JtbNhanVien.setText(nv.getHoTenNV() + "-" + nv.getMaNV());
        /*
       - Hi???n th??? form ch???m c??ng
       + ??i???u ki???n 1: Nh??n vi??n c?? ca l??m vi???c
       + ??i???u ki???n 2: nh??n vi??n c?? ca ch??a ch???m
         */
        // Gi???i quy???t di???u ki???n 1: T??m ki???m CaLamViecCT v???i di???u 2 tham s??? (MaNV,Ngay), k???t qu??? kh??c null => Nh??n vi??n c?? ca l??m vi???c
        // Gi???i quy???t ??i???u ki???n 2: L???y ThoiGianChamCong n???u tr??? v??? null => nh??n vi??n ch??a ch???m c??ng
        CaLamViecCTDAO dao = new CaLamViecCTDAO();
        List<CaLamViecCT> list = new ArrayList<>();
        list = dao.selectByDateAndMaNV(LayNgay(), nv.getMaNV());
        if (list.size() > 0) {
            for (CaLamViecCT caLamViecCT : list) {
                if (caLamViecCT.getThoiGianChamCong() == null) {
                    ChamCong chamCong_View = new ChamCong();
                    try {
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                        chamCong_View.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    };
                    chamCong_View.setLocationRelativeTo(null);
                    return;
                }
            }
        }

    }//GEN-LAST:event_formWindowOpened

    private void txtBarcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyReleased
        // TODO add your handling code here:
        String text = txtBarcode.getText();
        if (!text.equals("")) {
            listModel.removeAllElements();
            listTimKiem.removeAll(listTimKiem);
            List<SanPham> sp = new ArrayList<>();
            try {
                Integer.parseInt(text);
                sp = spDAO.selectBykeyBarcode(text);
                for (SanPham sanPham : sp) {
                    listTimKiem.add(sanPham);
                    listModel.addElement(sanPham.getTenSP());
                }
                jpmMenuSeach.show(txtBarcode, 0, txtBarcode.getHeight());
            } catch (Exception e) {
                listTimKiem.removeAll(listTimKiem);
                sp = spDAO.selectBykeyWork(text);
                for (SanPham sanPham : sp) {
                    listTimKiem.add(sanPham);
                    listModel.addElement(sanPham.getTenSP());
                }
                jpmMenuSeach.show(txtBarcode, 0, txtBarcode.getHeight());
            }
        } else {
            jpmMenuSeach.setVisible(false);
        }
    }//GEN-LAST:event_txtBarcodeKeyReleased

    private void JListSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JListSanPhamMouseClicked
        // TODO add your handling code here:

        int index = JListSanPham.getSelectedIndex();
        SanPham sanPham = new SanPham();
        sanPham = listTimKiem.get(index);
        getSanPham(sanPham.getBarcode());
        txtBarcode.setText("");
        txtBarcode.requestFocus();
        FillToTable();

    }//GEN-LAST:event_JListSanPhamMouseClicked

    private void txtMaPXKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaPXKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            getPX();
            txtMaPX.setText("");
        }
    }//GEN-LAST:event_txtMaPXKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String key;
        key = txtNhapTraBarcode.getText().substring(2, txtNhapTraBarcode.getText().length());
        hdctDAO.delete(key);
        hdDAO.delete(key);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNhapTraBarcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhapTraBarcodeKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            filltoTbaleNhapTra();
            txtNhapTraBarcode.setText("");
        }
    }//GEN-LAST:event_txtNhapTraBarcodeKeyPressed

    private void jtblNhapTraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblNhapTraKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            int index = jtblNhapTra.getSelectedRow();
            listTbaleNhapTra.remove(index);
        }
    }//GEN-LAST:event_jtblNhapTraKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        danhSachNhapTra = hdctDAO.selectByMaHD(txtNhapTraBarcode.getText().substring(2, txtNhapTraBarcode.getText().length()));
        for (HoaDonCT hoaDonCT : danhSachNhapTra) {
            for (HoaDonCT hoaDonCT1 : listTbaleNhapTra) {
                if (hoaDonCT.getBarcode().equals(hoaDonCT1.getBarcode())) {
                    if (hoaDonCT.getSoLuong() == hoaDonCT1.getSoLuong()) {
                        hdctDAO.deleteWithBarcodeAndMaHD(hoaDonCT1.getBarcode(), hoaDonCT1.getMaHD());
                    } else if (hoaDonCT.getSoLuong() > hoaDonCT1.getSoLuong()) {
                        hdctDAO.UpdateSoLuong(hoaDonCT1.getSoLuong(), hoaDonCT1.getBarcode(), hoaDonCT1.getMaHD());
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtBarcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyTyped
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_HOME) {
            System.out.println("View.View_MBH.txtBarcodeKeyTyped()");
            int index = 1;
            //tblSach.setRowSelectionInterval(index, index);
        }
    }//GEN-LAST:event_txtBarcodeKeyTyped

    private void tblSachKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSachKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_tblSachKeyTyped

    private void tblSachKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSachKeyReleased
//tblSach.editCellAt(indexRow, 2);

    }//GEN-LAST:event_tblSachKeyReleased

    private void JListSanPhamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JListSanPhamKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int index = JListSanPham.getSelectedIndex();
            SanPham sanPham = new SanPham();
            sanPham = listTimKiem.get(index);
            getSanPham(sanPham.getBarcode());
            txtBarcode.setText("");
            txtBarcode.requestFocus();
            FillToTable();
        }

    }//GEN-LAST:event_JListSanPhamKeyPressed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
         LichPhanCaCaNhan lichPhanCaCaNhan;
        try {
            lichPhanCaCaNhan = new LichPhanCaCaNhan();
            lichPhanCaCaNhan.setLocationRelativeTo(this);
            try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LichPhanCaCaNhan().setVisible(true)
                    ;
           
        } catch (Exception e) {
            e.printStackTrace();
        };
        } catch (ParseException ex) {
            Logger.getLogger(View_TBHH.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(View_MBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_MBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_MBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_MBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new View_MBH().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListSanPham;
    private javax.swing.JDialog JdlNhapTra;
    private javax.swing.JPanel JpnPhieuXuat;
    private javax.swing.JPanel JpnTraCuuPx;
    private javax.swing.JLabel JtbNhanVien;
    private javax.swing.JTabbedPane JtbTabbed;
    private javax.swing.JButton btnInLai;
    private javax.swing.JButton btnXemPhieuXuat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField7;
    private com.toedter.calendar.JDateChooser jdcFirtDay;
    private com.toedter.calendar.JDateChooser jdcNextDay;
    private javax.swing.JDialog jdlHoaDon;
    private javax.swing.JLabel jlbDaGiam;
    private javax.swing.JLabel jlbDoanhThu;
    private javax.swing.JLabel jlbGiaTriBillTB;
    private javax.swing.JLabel jlbSoPhieuXuat;
    private javax.swing.JMenuItem jmnNhapTra;
    private javax.swing.JPopupMenu jpmMenuSeach;
    private javax.swing.JPanel jpnKiemTraGia;
    private javax.swing.JPanel jpnSeach;
    private javax.swing.JTable jtblNhapTra;
    private javax.swing.JLabel lblLsTienThoi;
    private javax.swing.JLabel lblLsTongTien;
    private javax.swing.JLabel lblPhaiThu;
    private javax.swing.JLabel lblTienMat;
    private javax.swing.JLabel lblTienThoi;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JTable tblLichSuPx;
    private javax.swing.JTable tblPhieuXuat;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtMaPX;
    private javax.swing.JTextField txtNhapTraBarcode;
    private javax.swing.JTextField txtTienMat;
    // End of variables declaration//GEN-END:variables
  int indexRow = 0;
    int soNgayMuon = 0;
    boolean kiemTraNgayMuon = false;
    PhieuMuon phieuMuon;
// DAO
    PhieuMuonDAO  phieuMuonDAO = new PhieuMuonDAO();
    PhieuMuonCTDAO phieuMuonCTDAO = new PhieuMuonCTDAO();
            
    public void FillToTablePx() {
        danSachHD = hdDAO.selectAll();
        modelHD.setRowCount(0);
        int TongTien = 0;
        modelHD.setRowCount(0);
        for (HoaDon hoaDon : danSachHD) {
            modelHD.addRow(new Object[]{hoaDon.getMaHD(), hoaDon.getNgayTao(), hoaDon.getTongTien(), hoaDon.getTienThoi() > 0 ? 0 : hoaDon.getTongTien(), hoaDon.getTienMat(), 0, 0, hoaDon.getTienThoi()});
        }
    }

    public void FillToTableLsPx() {
        System.out.println("View.View_MBH.FillToTableLsPx()");
        int phieuXuat = tblPhieuXuat.getSelectedRow();
        key = (String) tblPhieuXuat.getValueAt(phieuXuat, 0);
        System.out.println(key);
        HoaDon hd = hdDAO.selectById(key);
        System.out.println("Ma HD :" + key);
        lblTienMat.setText(hd.getTienMat() + "");
        lblLsTongTien.setText(hd.getTongTien() + "");
        lblLsTienThoi.setText(hd.getTienThoi() + "");
        System.out.println("L???y HD" + hd.getMaHD());
        danSachLsHD = hdctDAO.selectByMaHD(key);
        System.out.println("L???y hdct" + danSachLsHD.size());
        modellshd.setRowCount(0);
        for (HoaDonCT hoaDonCT : danSachLsHD) {
            SanPham sp = spDAO.selectById(hoaDonCT.getBarcode());
            modellshd.addRow(new Object[]{sp.getTenSP(), hoaDonCT.getSoLuong(), sp.getDonGia(), hoaDonCT.getThanhTien()});
        }

    }

    public void FillToTable() {
        int STT = 1;
        model.setRowCount(0);
        int TongTien = 0;
        for (SanPham sp : list) {
            model.addRow(new Object[]{STT, sp.getTenSP(), sp.getSoLuongBan(), sp.getDonGia(), sp.getThanhTien()});
            STT++;
        }
        LayTongTien();
        txtTienMat.setText(LayTongTien() + "");
    }

    public void FillToTableTeamGia() {
        modelTemGia.setRowCount(0);
        for (SanPham sanPham : listTemGia) {
            modelTemGia.addRow(new Object[]{sanPham.getTenSP(), sanPham.getDonGia()});
        }
    }

    public Float LayTongTien() {
        float tongTien = 0;
        for (SanPham sanPham : list) {
            tongTien = tongTien + sanPham.getThanhTien();
        }
        lblPhaiThu.setText(String.valueOf(tongTien));
        lblTongTien.setText(String.valueOf(tongTien));
        return tongTien;
    }

    public void xuatBill() {
        try {
            Hashtable map = new Hashtable();
            JasperReport rpt = JasperCompileManager.compileReport("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\Report\\HoaDon.jrxml");
            map.put("sMaHD", maSo.trim());
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TGSTeam", "sa", "123");
            JasperPrint p = JasperFillManager.fillReport(rpt, map, conn);
            //JasperViewer.viewReport(p, false);
            JasperPrintManager.printReport(p, false);
        } catch (JRException ex) {
            Logger.getLogger(View_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(View_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getSanPham(String barcode) {

        SanPham sp = new SanPham();
        sp = spDAO.selectById(barcode);
        if (sp == null) {
            MsgBox.alert(this, "S???n ph???m kh??ng t???n t???i, vui l??ng ki???m tra l???i m?? s???n ph???m!");
        } else {
            for (SanPham sanPham : list) {
                if (sp.getBarcode().equals(sanPham.getBarcode())) {
                    sanPham.setSoLuongBan(sanPham.getSoLuongNew());
                    FillToTable();
                    LayTongTien();
                    return;
                }
            }
            list.add(sp);
            FillToTable();
            LayTongTien();
        }
    }


    public String LayThoiGian() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        String timeNow = dateFormat.format(cal.getTime());
        return timeNow;
    }

    public void InHOaDon() {
        // Tao MaHD
        maSo = "";
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar cal = Calendar.getInstance();
        String timeNow = dateFormat.format(cal.getTime());
        String tienMat = txtTienMat.getText();
        tienMat = tienMat == "" ? "0" : tienMat;
        maSo = maSo + timeNow;
        // Tao HD
        HoaDon hd = new HoaDon(maSo, Auth.user.getMaNV(), LayThoiGian(), Float.parseFloat(tienMat), tienThoi, LayTongTien());
        hdDAO.insert(hd);
        // TaoHDCT
        for (SanPham sanPham : list) {
            HoaDonCT hdct = new HoaDonCT(maSo, sanPham.getBarcode(), sanPham.getSoLuongBan(), sanPham.getThanhTien());
            hdctDAO.insert(hdct);
        }
        xuatBill();
    }
    
    public void removeRow(int[] indices) { // xoa mot tap cac hang da duoc chon
        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            list.remove(indices[i]);
        }
        FillToTable();
    }

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

    public void ResetMBH() {
        list.removeAll(list);
        FillToTable();
        lblTongTien.setText("0");
        lblTienThoi.setText("0");
        lblPhaiThu.setText("0");
        jlbDaGiam.setText("0");
        txtBarcode.requestFocus();
        txtTienMat.setText("");

    }

    private void getPX() {
        String key;
        key = txtMaPX.getText().substring(2, txtMaPX.getText().length());
        HoaDon hoaDon = hdDAO.selectById(key);
        modelHD.setRowCount(0);
        int TongTien = 0;
        modelHD.setRowCount(0);
        modelHD.addRow(new Object[]{hoaDon.getMaHD(), hoaDon.getNgayTao(), hoaDon.getTongTien(), hoaDon.getTienThoi() > 0 ? 0 : hoaDon.getTongTien(), hoaDon.getTienMat(), 0, 0, hoaDon.getTienThoi()});
        jlbSoPhieuXuat.setText("1");
        float doanhThu = 0;
        doanhThu = doanhThu + hoaDon.getTongTien();
        jlbDoanhThu.setText(doanhThu + "");
        jlbGiaTriBillTB.setText("" + doanhThu);
    }
    List<HoaDonCT> listTbaleNhapTra = new ArrayList<>();

    private void filltoTbaleNhapTra() {
        String key = txtNhapTraBarcode.getText().substring(2, txtNhapTraBarcode.getText().length());
        listTbaleNhapTra = hdctDAO.selectByMaHD(key);
        modelNhapTra.setRowCount(0);
        for (HoaDonCT hoaDonCT : listTbaleNhapTra) {
            SanPham sanPham = new SanPham();
            sanPham = spDAO.selectById(hoaDonCT.getBarcode());
            modelNhapTra.addRow(new Object[]{hoaDonCT.getMaHD(), sanPham.getTenSP(), hoaDonCT.getSoLuong(), sanPham.getDonGia()});
        }
    }

    // Tra ve so ngay muon sach = NgayTra - Ngay hi???n t???i
// Class css for table

    private void xuatPhieuMuon() {
        try {
            Hashtable map = new Hashtable();
            JasperReport rpt = JasperCompileManager.compileReport("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\TGSTeam\\src\\Report\\PhieuMuonTra.jrxml");
            map.put("sMaPX", maSo.trim());
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TGSTeam", "sa", "123");
            JasperPrint p = JasperFillManager.fillReport(rpt, map, conn);
            JasperViewer.viewReport(p, false);
            //JasperPrintManager.printReport(p, false);
        } catch (JRException ex) {
            Logger.getLogger(View_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(View_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public class RenderTablaPrestamos extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setBackground(row % 2 == 0 ? Color.LIGHT_GRAY : Color.WHITE);
            return c;
        }
    }
}
