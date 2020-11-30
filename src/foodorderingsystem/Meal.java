/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

//Import classes
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author RYAN
 */


public class  Meal extends javax.swing.JFrame implements MainInterface {

    //Creating feilds
    private double Total; 
    private int count;
    
    //Connection settings to database
    Connection conn;
    String connectionUrl = "jdbc:mysql://localhost:3306/foodorderingsystem";
    String username= "sa";
    String Pass="anjalo9990";
    
    /**
     * Creates new form Meal
     */
    public Meal() {
        initComponents();
        Displayorder() ;
        FormatTable();
        CheckTable();
        GetTotal();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Sidepanel = new javax.swing.JPanel();
        FFbtn = new javax.swing.JButton();
        Mealbtn = new javax.swing.JButton();
        APBTN = new javax.swing.JButton();
        BVGBtn = new javax.swing.JButton();
        Logobtn = new javax.swing.JButton();
        Menupanel = new javax.swing.JPanel();
        Ricecurrybtn = new javax.swing.JButton();
        Kottubtn = new javax.swing.JButton();
        Friedricebtn = new javax.swing.JButton();
        lblFASTFOOD = new javax.swing.JLabel();
        firedricelbl = new javax.swing.JLabel();
        RIceandcurrylbl = new javax.swing.JLabel();
        Kottulbl = new javax.swing.JLabel();
        btnLKR = new javax.swing.JLabel();
        btnBurgerPrice = new javax.swing.JLabel();
        btnLKR1 = new javax.swing.JLabel();
        btnBurgerPrice1 = new javax.swing.JLabel();
        btnLKR2 = new javax.swing.JLabel();
        btnBurgerPrice2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ordertable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Deletebtn = new javax.swing.JButton();
        plateimg = new javax.swing.JLabel();
        Checkout1 = new javax.swing.JButton();
        Platebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sidepanel.setBackground(new java.awt.Color(255, 255, 255));
        Sidepanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        FFbtn.setBackground(new java.awt.Color(0, 204, 0));
        FFbtn.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        FFbtn.setForeground(new java.awt.Color(255, 255, 255));
        FFbtn.setText("Fast Food");
        FFbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FFbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FFbtn.setPreferredSize(new java.awt.Dimension(72, 36));
        FFbtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FFbtnMouseMoved(evt);
            }
        });
        FFbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FFbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FFbtnMousePressed(evt);
            }
        });

        Mealbtn.setBackground(new java.awt.Color(0, 102, 0));
        Mealbtn.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        Mealbtn.setForeground(new java.awt.Color(255, 255, 255));
        Mealbtn.setText("MEAL");
        Mealbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mealbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mealbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MealbtnMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MealbtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MealbtnMouseReleased(evt);
            }
        });

        APBTN.setBackground(new java.awt.Color(0, 204, 0));
        APBTN.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        APBTN.setForeground(new java.awt.Color(255, 255, 255));
        APBTN.setText("Apertizers");
        APBTN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        APBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        APBTN.setPreferredSize(new java.awt.Dimension(72, 36));
        APBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                APBTNMouseMoved(evt);
            }
        });
        APBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                APBTNMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                APBTNMousePressed(evt);
            }
        });

        BVGBtn.setBackground(new java.awt.Color(0, 204, 0));
        BVGBtn.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        BVGBtn.setForeground(new java.awt.Color(255, 255, 255));
        BVGBtn.setText("Beverages");
        BVGBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BVGBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BVGBtn.setPreferredSize(new java.awt.Dimension(72, 36));
        BVGBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BVGBtnMouseMoved(evt);
            }
        });
        BVGBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BVGBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BVGBtnMousePressed(evt);
            }
        });

        Logobtn.setBackground(new java.awt.Color(255, 255, 255));
        Logobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        Logobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogobtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SidepanelLayout = new javax.swing.GroupLayout(Sidepanel);
        Sidepanel.setLayout(SidepanelLayout);
        SidepanelLayout.setHorizontalGroup(
            SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidepanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(APBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BVGBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FFbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Mealbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(SidepanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Logobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SidepanelLayout.setVerticalGroup(
            SidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidepanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Logobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(Mealbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(FFbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(APBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BVGBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1.add(Sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 720));

        Menupanel.setBackground(new java.awt.Color(255, 255, 255));
        Menupanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Ricecurrybtn.setBackground(new java.awt.Color(255, 255, 255));
        Ricecurrybtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rice and curry_1.jpg"))); // NOI18N
        Ricecurrybtn.setPreferredSize(new java.awt.Dimension(281, 212));
        Ricecurrybtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ricecurrybtn(evt);
            }
        });

        Kottubtn.setBackground(new java.awt.Color(255, 255, 255));
        Kottubtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kottu.jpg"))); // NOI18N
        Kottubtn.setPreferredSize(new java.awt.Dimension(281, 212));
        Kottubtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Kottubtn(evt);
            }
        });

        Friedricebtn.setBackground(new java.awt.Color(255, 255, 255));
        Friedricebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fried.jpg"))); // NOI18N
        Friedricebtn.setPreferredSize(new java.awt.Dimension(281, 212));
        Friedricebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friedrice(evt);
            }
        });
        Friedricebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FriedricebtnActionPerformed(evt);
            }
        });

        lblFASTFOOD.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblFASTFOOD.setForeground(new java.awt.Color(51, 204, 0));
        lblFASTFOOD.setText("Meals");

        firedricelbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        firedricelbl.setText("Fried Rice");

        RIceandcurrylbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RIceandcurrylbl.setText("Rice and Curry");

        Kottulbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Kottulbl.setText("Kottu Roti");

        btnLKR.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLKR.setForeground(new java.awt.Color(153, 153, 153));
        btnLKR.setText("LKR");

        btnBurgerPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBurgerPrice.setForeground(new java.awt.Color(153, 153, 153));
        btnBurgerPrice.setText("200.00");

        btnLKR1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLKR1.setForeground(new java.awt.Color(153, 153, 153));
        btnLKR1.setText("LKR");

        btnBurgerPrice1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBurgerPrice1.setForeground(new java.awt.Color(153, 153, 153));
        btnBurgerPrice1.setText("110.00");

        btnLKR2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLKR2.setForeground(new java.awt.Color(153, 153, 153));
        btnLKR2.setText("LKR");

        btnBurgerPrice2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBurgerPrice2.setForeground(new java.awt.Color(153, 153, 153));
        btnBurgerPrice2.setText("200.00");

        javax.swing.GroupLayout MenupanelLayout = new javax.swing.GroupLayout(Menupanel);
        Menupanel.setLayout(MenupanelLayout);
        MenupanelLayout.setHorizontalGroup(
            MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                        .addComponent(Friedricebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addComponent(Ricecurrybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firedricelbl)
                            .addGroup(MenupanelLayout.createSequentialGroup()
                                .addComponent(btnLKR)
                                .addGap(18, 18, 18)
                                .addComponent(btnBurgerPrice)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenupanelLayout.createSequentialGroup()
                                .addComponent(btnLKR1)
                                .addGap(18, 18, 18)
                                .addComponent(btnBurgerPrice1))
                            .addComponent(RIceandcurrylbl))
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Kottubtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                                        .addComponent(Kottulbl)
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                                        .addComponent(btnLKR2)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBurgerPrice2)
                                        .addGap(78, 78, 78)))
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenupanelLayout.createSequentialGroup()
                                .addComponent(lblFASTFOOD)
                                .addGap(289, 289, 289))))))
        );
        MenupanelLayout.setVerticalGroup(
            MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenupanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblFASTFOOD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ricecurrybtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Friedricebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(firedricelbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLKR)
                            .addComponent(btnBurgerPrice)))
                    .addGroup(MenupanelLayout.createSequentialGroup()
                        .addComponent(RIceandcurrylbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBurgerPrice1)
                            .addComponent(btnLKR1))))
                .addGap(72, 72, 72)
                .addComponent(Kottubtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kottulbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBurgerPrice2)
                    .addComponent(btnLKR2))
                .addGap(6, 6, 6))
        );

        jPanel1.add(Menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 680, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jPanel2MouseWheelMoved(evt);
            }
        });

        Ordertable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Ordertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Product Description", "Qty", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Ordertable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Ordertable.setAutoscrolls(false);
        Ordertable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ordertable.setFillsViewportHeight(true);
        Ordertable.setFocusable(false);
        Ordertable.setGridColor(new java.awt.Color(255, 255, 255));
        Ordertable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Ordertable.setRowHeight(25);
        Ordertable.setSelectionBackground(new java.awt.Color(232, 57, 95));
        Ordertable.setShowHorizontalLines(false);
        Ordertable.setSurrendersFocusOnKeystroke(true);
        Ordertable.setUpdateSelectionOnSort(false);
        jScrollPane2.setViewportView(Ordertable);
        if (Ordertable.getColumnModel().getColumnCount() > 0) {
            Ordertable.getColumnModel().getColumn(0).setPreferredWidth(110);
            Ordertable.getColumnModel().getColumn(1).setPreferredWidth(250);
            Ordertable.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("Total");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("00.00");

        Deletebtn.setBackground(new java.awt.Color(255, 255, 255));
        Deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trash.png"))); // NOI18N
        Deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DeletebtnMousePressed(evt);
            }
        });

        plateimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EmptyPlate.jpeg"))); // NOI18N

        Checkout1.setBackground(new java.awt.Color(0, 153, 0));
        Checkout1.setFont(new java.awt.Font("Algerian", 1, 24));
        Checkout1.setForeground(new java.awt.Color(255, 255, 255));
        Checkout1.setText("CHECKOUT");
        Checkout1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Checkout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Checkout1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Checkout1MouseMoved(evt);
            }
        });
        Checkout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Checkout1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Checkout1MousePressed(evt);
            }
        });
        Checkout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkout1ActionPerformed(evt);
            }
        });

        Platebtn.setBackground(new java.awt.Color(0, 153, 0));
        Platebtn.setFont(new java.awt.Font("Algerian", 1, 24));
        Platebtn.setForeground(new java.awt.Color(255, 255, 255));
        Platebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_down_48px_5.png"))); // NOI18N
        Platebtn.setText("View Plate");
        Platebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Platebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Platebtn.setIconTextGap(1);
        Platebtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PlatebtnMouseMoved(evt);
            }
        });
        Platebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlatebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PlatebtnMousePressed(evt);
            }
        });
        Platebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Checkout1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(plateimg, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Platebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Platebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plateimg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Checkout1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 410, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void friedrice(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friedrice
      POPUP_Message_FriedRice fp= new POPUP_Message_FriedRice();
       fp.setVisible(true);
      DefaultTableModel model = (DefaultTableModel) Ordertable.getModel();
      model.setRowCount(0);
      Displayorder();
       GetTotal();
    }//GEN-LAST:event_friedrice

    private void Ricecurrybtn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ricecurrybtn
      POPUP_Message_Rice_and_Curry Rc= new POPUP_Message_Rice_and_Curry();
      Rc.setVisible(true);
      DefaultTableModel model = (DefaultTableModel) Ordertable.getModel();
      model.setRowCount(0);
      Displayorder();
      GetTotal();
    }//GEN-LAST:event_Ricecurrybtn

    private void Kottubtn(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Kottubtn
      POPUP_Message_Kottu Kp= new POPUP_Message_Kottu();
      Kp.setVisible(true);
      DefaultTableModel model = (DefaultTableModel) Ordertable.getModel();
      model.setRowCount(0);
      Displayorder();
       GetTotal();
    }//GEN-LAST:event_Kottubtn

    private void FFbtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMouseMoved
        FFbtn.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_FFbtnMouseMoved

    private void APBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMouseMoved
       APBTN.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_APBTNMouseMoved

    private void BVGBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMouseMoved
        BVGBtn.setBackground(new Color(0,102,0));
    }//GEN-LAST:event_BVGBtnMouseMoved

    private void MealbtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealbtnMouseReleased
       Mealbtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_MealbtnMouseReleased

    private void FFbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMouseExited
          FFbtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_FFbtnMouseExited

    private void APBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMouseExited
        APBTN.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_APBTNMouseExited

    private void BVGBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMouseExited
          BVGBtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_BVGBtnMouseExited

    private void MealbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealbtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_MealbtnMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
    }//GEN-LAST:event_formWindowOpened

    private void MealbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealbtnMousePressed
       this.show();
    }//GEN-LAST:event_MealbtnMousePressed

    private void APBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_APBTNMousePressed
       Appetizers ap= new Appetizers();
       ap.show();
       this.hide();
    }//GEN-LAST:event_APBTNMousePressed

    private void BVGBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BVGBtnMousePressed
        Beverages bv= new Beverages();
        bv.show();
        this.hide();
    }//GEN-LAST:event_BVGBtnMousePressed

    private void FFbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FFbtnMousePressed
        Fastfood ff= new Fastfood();
        ff.show();
        this.hide();
    }//GEN-LAST:event_FFbtnMousePressed

    private void jPanel2MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jPanel2MouseWheelMoved
         GetTotal();
    }//GEN-LAST:event_jPanel2MouseWheelMoved

    private void DeletebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletebtnMousePressed
       Deleteorder();
       DefaultTableModel model = (DefaultTableModel) Ordertable.getModel();
      model.setRowCount(0);
      Displayorder();
       GetTotal();
    }//GEN-LAST:event_DeletebtnMousePressed

    private void PlatebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlatebtnMousePressed
       DefaultTableModel model = (DefaultTableModel) Ordertable.getModel();
      model.setRowCount(0);
      Displayorder();
       GetTotal();
    }//GEN-LAST:event_PlatebtnMousePressed

    private void PlatebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlatebtnMouseExited
      Platebtn.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_PlatebtnMouseExited

    private void PlatebtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlatebtnMouseMoved
        Platebtn.setBackground(Color.RED);
    }//GEN-LAST:event_PlatebtnMouseMoved

    private void Checkout1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checkout1MouseMoved
      Checkout1.setBackground(Color.RED);
    }//GEN-LAST:event_Checkout1MouseMoved

    private void Checkout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checkout1MouseExited
        Checkout1.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_Checkout1MouseExited

    private void Checkout1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Checkout1MousePressed
     Order_Details od=new Order_Details();
     od.show();
     this.hide();
    }//GEN-LAST:event_Checkout1MousePressed

    private void PlatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlatebtnActionPerformed

    private void Checkout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkout1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Checkout1ActionPerformed

    private void FriedricebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FriedricebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FriedricebtnActionPerformed

    private void LogobtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogobtnMousePressed
      Home ml= new Home();
      ml.show();
      this.hide();
    }//GEN-LAST:event_LogobtnMousePressed
    
   
    //Member Methods 
     
    @Override
   public  void Displayorder(){
      String qry="SELECT * FROM SALESORDER";
      
      try{
      conn = DriverManager.getConnection(connectionUrl, username, Pass);
      Statement st=conn.prepareStatement(qry);
      ResultSet rs=st.executeQuery(qry);
      
      while(rs.next()){
      String item   =String.valueOf(rs.getInt("ItemNo"));
      String Des   = rs.getString("Product");
      String qty   = String.valueOf(rs.getInt("QTY"));
      String price =String.valueOf(rs.getInt("Total"));
      String tbdata[]={item,Des,qty,price};
      DefaultTableModel model=(DefaultTableModel)Ordertable.getModel();
      model.addRow(new Object[]{item,Des, qty, price});
      }
     
   }catch(SQLException e){
       JOptionPane.showMessageDialog(null,"Something went wrong\n");
   }
     finally{
       CheckTable();
       FormatTable();
      }
   } 
   
   
    @Override
    public void Deleteorder(){
    
     DefaultTableModel model=(DefaultTableModel)Ordertable.getModel();
          
          int row =Ordertable.getSelectedRow();
         
          
          String cell=Ordertable.getModel().getValueAt(row, 0).toString();
         
     
          String qry="DELETE FROM SALESORDER WHERE ItemNo = " + cell;
          
          try{
               Statement st=conn.prepareStatement(qry);
               st.execute(qry);
              JOptionPane.showMessageDialog(null,"Plate updated");
          }
          catch(SQLException e ){
                 e.printStackTrace();
           JOptionPane.showMessageDialog(null,"Error");
          }
          finally{
           CheckTable();
           FormatTable();
    }
    }
    
  
   
    @Override
  public void  CheckTable() {

       PreparedStatement stmt = null;
       ResultSet rs = null;
       String qry = " SELECT * From SALESORDER ";

       try {
            conn = DriverManager.getConnection(connectionUrl, username, Pass);
            stmt = (PreparedStatement) conn.prepareStatement(qry);
            rs =  stmt.executeQuery();
            setCount(0);
            while(rs.next()){
                setCount(getCount() + 1);
            }
            if(getCount() == 0){ 
                jScrollPane2.hide();
                Ordertable.setVisible(false);
                Deletebtn.setVisible(false);
                plateimg.show();
                
            }
            else{
                 jScrollPane2.show();
                 Ordertable.setVisible(true);
                Deletebtn.setVisible(true);
                 plateimg.hide();
            }
       } catch (SQLException ex) {
             ex.printStackTrace();
        }
 }
   
 
   
   //FOrmating table
    @Override
 public void FormatTable(){
       
       Ordertable.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15));
       Ordertable.getTableHeader().setOpaque(true);
       Ordertable.getTableHeader().setBackground(new Color(32,136,203));
       Ordertable.getTableHeader().setForeground(new Color(255,255,255));
       Ordertable.setRowHeight(25);
    
   }
   
  public void GetTotal(){
       
       PreparedStatement pst = null;
       ResultSet rs = null;
       String qry = "Select Sum(Total) as sumprice from SALESORDER";
       
       try{
              conn = DriverManager.getConnection(connectionUrl, username, Pass);
              pst=conn.prepareStatement(qry);
              rs=pst.executeQuery();
             if(rs.next()){
                              String sum = rs.getString("sumprice");
                              jLabel3.setText(sum);
             }
       }
       catch (SQLException ex) {
             ex.printStackTrace();
        }
 }
   
    /**
     * @param args the command line arguments
     */    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Meal().setVisible(true);
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APBTN;
    private javax.swing.JButton BVGBtn;
    private javax.swing.JButton Checkout1;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton FFbtn;
    private javax.swing.JButton Friedricebtn;
    private javax.swing.JButton Kottubtn;
    private javax.swing.JLabel Kottulbl;
    private javax.swing.JButton Logobtn;
    private javax.swing.JButton Mealbtn;
    private javax.swing.JPanel Menupanel;
    private javax.swing.JTable Ordertable;
    private javax.swing.JButton Platebtn;
    private javax.swing.JLabel RIceandcurrylbl;
    private javax.swing.JButton Ricecurrybtn;
    private javax.swing.JPanel Sidepanel;
    private javax.swing.JLabel btnBurgerPrice;
    private javax.swing.JLabel btnBurgerPrice1;
    private javax.swing.JLabel btnBurgerPrice2;
    private javax.swing.JLabel btnLKR;
    private javax.swing.JLabel btnLKR1;
    private javax.swing.JLabel btnLKR2;
    private javax.swing.JLabel firedricelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFASTFOOD;
    private javax.swing.JLabel plateimg;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
}
