/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package petshop;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Types;

/**
 *
 * @author MSI-NB
 */
public class Profile extends javax.swing.JFrame {
    
    private final String dbUrl = "jdbc:postgresql://localhost/petset";
    private final String dbUsername = "postgres";
    private final String dbPassword = "mudafer69";
    private static int userid;
 
    Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    /**
     * Creates new form my_ads
     * @param username
     */
    public Profile() throws SQLException {
        initComponents();
        displayProfile();
        displayCount();
        displayMyApplications();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit_btn1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        products_btn = new javax.swing.JButton();
        ads_btn = new javax.swing.JButton();
        myads_btn = new javax.swing.JButton();
        profile_btn = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        edit_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        applicationsTable = new javax.swing.JTable();
        surname_Label = new javax.swing.JLabel();
        surnameField = new javax.swing.JPasswordField();
        countLabel = new javax.swing.JLabel();
        address_Label = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        phonenumberField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        name_Label = new javax.swing.JLabel();
        username_Label = new javax.swing.JLabel();
        password_Label = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        applicationsTable1 = new javax.swing.JTable();
        phonenumber_Label1 = new javax.swing.JLabel();

        edit_btn1.setBackground(new java.awt.Color(255, 204, 204));
        edit_btn1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        edit_btn1.setText("EDIT");
        edit_btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        edit_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(1204, 163));

        products_btn.setBackground(new java.awt.Color(255, 204, 204));
        products_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1375593-200-removebg-preview 1.png"))); // NOI18N
        products_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1375593-200-removebg-preview 1.png"))); // NOI18N
        products_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_btnusers_btn(evt);
            }
        });

        ads_btn.setBackground(new java.awt.Color(255, 204, 204));
        ads_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pets.png"))); // NOI18N
        ads_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ads_btncustomers_btn(evt);
            }
        });

        myads_btn.setBackground(new java.awt.Color(255, 204, 204));
        myads_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill.png"))); // NOI18N
        myads_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myads_btnbilling_btn(evt);
            }
        });

        profile_btn.setBackground(new java.awt.Color(255, 204, 204));
        profile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        profile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_btnActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel44.setText("PRODUCTS");

        logout_btn.setBackground(new java.awt.Color(255, 204, 204));
        logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnlogout_btn(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel48.setText("ADS");

        jLabel49.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel49.setText("PROFILE");

        jLabel50.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel50.setText("LOG OUT");

        jLabel52.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel52.setText("MY ADS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(products_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(ads_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel48)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(myads_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)
                        .addGap(145, 145, 145)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(products_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ads_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myads_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        edit_btn.setBackground(new java.awt.Color(255, 204, 204));
        edit_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        edit_btn.setText("EDIT");
        edit_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        applicationsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        applicationsTable.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        applicationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Age", "Gender", "Address", "Description"
            }
        ));
        applicationsTable.setRowHeight(30);
        applicationsTable.setRowMargin(2);
        applicationsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicationsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(applicationsTable);

        surname_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        surname_Label.setText("Surname");

        surnameField.setBackground(new java.awt.Color(245, 245, 245));
        surnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFieldActionPerformed(evt);
            }
        });

        countLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N

        address_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        address_Label.setText("Address");

        addressField.setBackground(new java.awt.Color(245, 245, 245));

        nameField.setBackground(new java.awt.Color(245, 245, 245));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(245, 245, 245));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        phonenumberField.setBackground(new java.awt.Color(245, 245, 245));
        phonenumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberFieldActionPerformed(evt);
            }
        });

        usernameField.setBackground(new java.awt.Color(245, 245, 245));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        name_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        name_Label.setText("Name");

        username_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label.setText("Username");

        password_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        password_Label.setText("Password");

        jLabel15.setFont(new java.awt.Font("Imprint MT Shadow", 1, 25)); // NOI18N
        jLabel15.setText("Basvurularım");

        jLabel16.setFont(new java.awt.Font("Imprint MT Shadow", 1, 25)); // NOI18N
        jLabel16.setText("Siparislerim");

        applicationsTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        applicationsTable1.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        applicationsTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Age", "Gender", "Address", "Description"
            }
        ));
        applicationsTable1.setRowHeight(30);
        applicationsTable1.setRowMargin(2);
        applicationsTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applicationsTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(applicationsTable1);

        phonenumber_Label1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        phonenumber_Label1.setText("Phone Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(username_Label)
                                    .addGap(70, 70, 70)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(name_Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(surname_Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(password_Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(address_Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(phonenumber_Label1)
                                .addGap(18, 18, 18)
                                .addComponent(phonenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countLabel)
                            .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username_Label)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_Label)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surname_Label)
                            .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password_Label)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_Label)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phonenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonenumber_Label1))
                        .addGap(43, 43, 43)
                        .addComponent(countLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String updateQuery = "Update users Set username = ? , name = ?, surname = ?, password = ?, address = ?, telno = ? where name = ?";
            PreparedStatement updateStatement = (PreparedStatement) conn.prepareStatement(updateQuery);

            if (nameField.getText().isEmpty() || usernameField.getText().isEmpty() || surnameField.getText().isEmpty() || passwordField.getText().isEmpty() || addressField.getText().isEmpty() || phonenumberField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter all required fields.");

            } else {
                updateStatement.setString(1, usernameField.getText());
                updateStatement.setString(2, nameField.getText());
                updateStatement.setString(3, surnameField.getText());
                updateStatement.setString(4, passwordField.getText());
                updateStatement.setString(5, addressField.getText());
                updateStatement.setString(6, phonenumberField.getText());
                updateStatement.setString(7, Login.userName);
                updateStatement.executeUpdate();
                Login.userName = usernameField.getText();
                JOptionPane.showMessageDialog(this, "You updated your profile");
                updateStatement.close();
                displayProfile();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_btnActionPerformed

    private void applicationsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationsTableMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_applicationsTableMouseClicked

    private void edit_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_btn1ActionPerformed

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void phonenumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenumberFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void products_btnusers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btnusers_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Products().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_products_btnusers_btn

    private void ads_btncustomers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ads_btncustomers_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Ads().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_ads_btncustomers_btn

    private void myads_btnbilling_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myads_btnbilling_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MyAds().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_myads_btnbilling_btn

    private void profile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_btnActionPerformed
        
    }//GEN-LAST:event_profile_btnActionPerformed

    private void logout_btnlogout_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnlogout_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }//GEN-LAST:event_logout_btnlogout_btn

    private void applicationsTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applicationsTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_applicationsTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Profile().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel address_Label;
    private javax.swing.JButton ads_btn;
    private javax.swing.JTable applicationsTable;
    private javax.swing.JTable applicationsTable1;
    private javax.swing.JLabel countLabel;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton edit_btn1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton myads_btn;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel name_Label;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel password_Label;
    private javax.swing.JTextField phonenumberField;
    private javax.swing.JLabel phonenumber_Label1;
    private javax.swing.JButton products_btn;
    private javax.swing.JButton profile_btn;
    private javax.swing.JPasswordField surnameField;
    private javax.swing.JLabel surname_Label;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel username_Label;
    // End of variables declaration//GEN-END:variables

    private void displayProfile() throws SQLException {     
        try (Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword)) {
            
      String getUserFunction = "{call get_user_by_name(?)}";
    try (CallableStatement getUserStatement = conn.prepareCall(getUserFunction)) {
        getUserStatement.setString(1, Login.userName);
        getUserStatement.execute();
       
        ResultSet resultSet = getUserStatement.getResultSet();

        if (resultSet != null && resultSet.next()) {
            nameField.setText(resultSet.getString("name"));
            surnameField.setText(resultSet.getString("surname"));
            passwordField.setText(resultSet.getString("password"));
            addressField.setText(resultSet.getString("address"));
            phonenumberField.setText(resultSet.getString("telNo"));
            usernameField.setText(resultSet.getString("userName"));
        } else {
            JOptionPane.showMessageDialog(this, "User not found.");
        }
    }
} catch (SQLException ex) {
    Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(this, ex);
}

    }

    private void displayMyApplications() throws SQLException {
        
        String selectIDQuery = "SELECT id FROM users WHERE username = ?";
        PreparedStatement selectIDStatement = conn.prepareStatement(selectIDQuery);
        selectIDStatement.setString(1, Login.userName);
        ResultSet idset = selectIDStatement.executeQuery();
        
        if (idset.next()) {
            Profile.userid = idset.getInt("id");
            
            String selectQuery = "SELECT application.adID, application.referencedID, application.date FROM application WHERE applicantID = ?";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            selectStatement.setInt(1, Profile.userid);
            ResultSet resultSet = selectStatement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            String[] columnNames = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnNames[i - 1] = metaData.getColumnName(i);
            }

            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
            Object[] row ;

            while (resultSet.next()) {
                row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                tableModel.addRow(row);
            }

            applicationsTable.setModel(tableModel);

            selectStatement.close();
            resultSet.close();
        }
    }

    private void displayCount() throws SQLException {
        String selectIDQuery = "SELECT id FROM users WHERE username = ?";
        PreparedStatement selectIDStatement = conn.prepareStatement(selectIDQuery);
        selectIDStatement.setString(1, Login.userName);
        ResultSet idset = selectIDStatement.executeQuery();
        
        if (idset.next()) {
            Profile.userid = idset.getInt("id");
        }
        String selectQuery = "SELECT count(*) AS total FROM application GROUP BY applicantid HAVING applicantID = ?";
        PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
        selectStatement.setInt(1, Profile.userid);
        System.out.println(Profile.userid);
        ResultSet resultSet = selectStatement.executeQuery();
        
        int count = 0;
        if (resultSet.next()) {
            count = resultSet.getInt("total");
        }
        System.out.println(count);
        jLabel15.setText("Your " + String.valueOf(count)+" Application(s)");
    }
   
}
