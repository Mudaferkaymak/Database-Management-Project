/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package petshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI-NB
 */
public class Profile extends javax.swing.JFrame {
    
    private final String dbUrl = "jdbc:postgresql://localhost/petset";
    private final String dbUsername = "postgres";
    private final String dbPassword = "mudafer69";
    Connection conn = null;
    /**
     * Creates new form my_ads
     * @param username
     */
    public Profile(String username) throws SQLException {
        Profile.username = username;
        initComponents();
        displayMyAds();
        conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        String selectQuery = "SELECT * FROM users WHERE userName = ?";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
                selectStatement.setString(1, Profile.username);

                ResultSet resultSet = selectStatement.executeQuery();
                if (resultSet.next()) {
                    nameField.setText(resultSet.getString("name"));
                    surnameField.setText(resultSet.getString("surname"));
                    passwordField.setText(resultSet.getString("password"));
                    adressField.setText(resultSet.getString("address"));
                    phonenumberField.setText(resultSet.getString("telNo"));
                    usernameField.setText(resultSet.getString("userName"));
                } else {
                    // Kullanıcı bulunamadı
                    JOptionPane.showMessageDialog(this, "User not found.");
                }
    
    
    
    }static String username;
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
        jLabel20 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        hayvan_btn3 = new javax.swing.JButton();
        kullanici_btn3 = new javax.swing.JButton();
        musteri_btn3 = new javax.swing.JButton();
        fatura_btn3 = new javax.swing.JButton();
        urun_btn3 = new javax.swing.JButton();
        cikis_btn3 = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myAdsTable = new javax.swing.JTable();
        surname_Label = new javax.swing.JLabel();
        surnameField = new javax.swing.JPasswordField();
        phonenumber_Label = new javax.swing.JLabel();
        address_Label = new javax.swing.JLabel();
        adressField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        phonenumberField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        name_Label = new javax.swing.JLabel();
        username_Label = new javax.swing.JLabel();
        password_Label = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

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

        jLabel20.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel20.setText("HAYVANLAR");

        jLabel44.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel44.setText("KULLANICILAR");

        jLabel48.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel48.setText("ILANLAR");

        jLabel49.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel49.setText("PROFIL");

        jLabel50.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel50.setText("       CIKIS");

        jLabel52.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel52.setText("ILANLARIM");

        hayvan_btn3.setBackground(new java.awt.Color(255, 204, 204));
        hayvan_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hayvan_btn3pets_btn(evt);
            }
        });

        kullanici_btn3.setBackground(new java.awt.Color(255, 204, 204));
        kullanici_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_btn3users_btn(evt);
            }
        });

        musteri_btn3.setBackground(new java.awt.Color(255, 204, 204));
        musteri_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_btn3customers_btn(evt);
            }
        });

        fatura_btn3.setBackground(new java.awt.Color(255, 204, 204));
        fatura_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatura_btn3billing_btn(evt);
            }
        });

        urun_btn3.setBackground(new java.awt.Color(255, 204, 204));
        urun_btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/customer.png"))); // NOI18N

        cikis_btn3.setBackground(new java.awt.Color(255, 204, 204));
        cikis_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikis_btn3logout_btn(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(hayvan_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kullanici_btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musteri_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel48)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(fatura_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(urun_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cikis_btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hayvan_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteri_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fatura_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urun_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cikis_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        myAdsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myAdsTable.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        myAdsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        myAdsTable.setRowHeight(30);
        myAdsTable.setRowMargin(2);
        myAdsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myAdsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myAdsTable);

        surname_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        surname_Label.setText("Surname");

        surnameField.setBackground(new java.awt.Color(245, 245, 245));
        surnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFieldActionPerformed(evt);
            }
        });

        phonenumber_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        phonenumber_Label.setText("Phone Number");

        address_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        address_Label.setText("Address");

        adressField.setBackground(new java.awt.Color(245, 245, 245));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                            .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(phonenumber_Label)
                        .addGap(18, 18, 18)
                        .addComponent(phonenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 136, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address_Label)
                            .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phonenumber_Label)
                            .addComponent(phonenumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hayvan_btn3pets_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hayvan_btn3pets_btn
        // TODO add your handling code here:

    }//GEN-LAST:event_hayvan_btn3pets_btn

    private void kullanici_btn3users_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_btn3users_btn
        // TODO add your handling code here:

    }//GEN-LAST:event_kullanici_btn3users_btn

    private void musteri_btn3customers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_btn3customers_btn
        // TODO add your handling code here:

    }//GEN-LAST:event_musteri_btn3customers_btn

    private void fatura_btn3billing_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatura_btn3billing_btn
        // TODO add your handling code here:

    }//GEN-LAST:event_fatura_btn3billing_btn

    private void cikis_btn3logout_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikis_btn3logout_btn
        // TODO add your handling code here:

    }//GEN-LAST:event_cikis_btn3logout_btn

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_btnActionPerformed

    private void myAdsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAdsTableMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_myAdsTableMouseClicked

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
                new Profile(username).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_Label;
    private javax.swing.JTextField adressField;
    private javax.swing.JButton cikis_btn3;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton edit_btn1;
    private javax.swing.JButton fatura_btn3;
    private javax.swing.JButton hayvan_btn3;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kullanici_btn3;
    private javax.swing.JButton musteri_btn3;
    private javax.swing.JTable myAdsTable;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel name_Label;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel password_Label;
    private javax.swing.JTextField phonenumberField;
    private javax.swing.JLabel phonenumber_Label;
    private javax.swing.JPasswordField surnameField;
    private javax.swing.JLabel surname_Label;
    private javax.swing.JButton urun_btn3;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel username_Label;
    // End of variables declaration//GEN-END:variables

    private void displayMyAds() throws SQLException { 
        try {
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

            // Select user ID using PreparedStatement and set username as a parameter
            String selectIDQuery = "SELECT id FROM users WHERE username = ?";
            PreparedStatement selectIDStatement = conn.prepareStatement(selectIDQuery);
            selectIDStatement.setString(1, Profile.username);
            ResultSet idset = selectIDStatement.executeQuery();

            // Check if the result set has any rows
            if (idset.next()) {
                int userId = idset.getInt("id");

                // Use the user ID in the ad selection query
                String selectQuery = "SELECT * FROM ad WHERE userid = ?";
                PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
                selectStatement.setInt(1, userId);

                ResultSet resultSet = selectStatement.executeQuery();

                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                String[] columnNames = new String[columnCount];

                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = metaData.getColumnName(i);
                }

                DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
                Object[] row;

                while (resultSet.next()) {
                    row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = resultSet.getObject(i);
                    }
                    tableModel.addRow(row);
                }

                myAdsTable.setModel(tableModel);

                // Close resources in the finally block
                resultSet.close();
                selectStatement.close();
            } else {
                System.out.println("User not found."); // Handle this case appropriately
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle the exception appropriately in your application
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately in your application
            }
        }
    }
}