/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import DBConnected.DBConnection;
import Pojo.Equipment;
import Pojo.TheRoute;
import Pojo.Users;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;

/**
 *
 * @author TT
 */
public class ShowAllForEquip extends javax.swing.JFrame {

    /**
     * Creates new form ShowAllForEquip
     */
    DBConnection dbc = new DBConnection();
    Users u = null;
    Users n = null;
    Equipment e = null;
    TheRoute r = null;
    int id;
    int Rid;
    int Eid;
    int Passenger_Count;
    Double Luggage_Count;
    String keyword = null;
    File f = null;

    public ShowAllForEquip() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public ShowAllForEquip(Users u, int id, int Rid, int Eid, int Passenger_Count, Double Luggage_Count, String keyword) {
        initComponents();
        setLocationRelativeTo(this);

        this.u = u;
        this.id = id;
        this.Rid = Rid;
        this.Eid = Eid;
        this.Passenger_Count = Passenger_Count;
        this.Luggage_Count = Luggage_Count;
        this.keyword = keyword;
        txtDescription.setEditable(false);

        n = dbc.findByid(id);
        String lang = "";
        lblName.setText(n.getName());
        lblSurname.setText(n.getSurname());
        lblFatherName.setText(n.getFather_name());
        if (n.getGender() == 'M') {
            lblGender.setText("Kişi");
        } else {
            lblGender.setText("Qadın");
        }
        lblEmail.setText(n.getEmail());
        lblPhone.setText(n.getPhone());
        lblDtBirth.setText(n.getDate_of_birth());
        if (n.getLanguages().contains("AZ")) {
            lang = lang + "AZ";
        }
        if (n.getLanguages().contains("TR")) {
            lang = lang + " TR";
        }
        if (n.getLanguages().contains("EN")) {
            lang = lang + " EN";
        }
        if (n.getLanguages().contains("RU")) {
            lang = lang + " RU";
        }
        lblLanguage.setText(lang);
        txtDescription.setText(n.getDescription());

        if (n.getImage() != null) {
            Image img = Toolkit.getDefaultToolkit().createImage(n.getImage()).getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon imageIcon = new ImageIcon(img);
            lblImage.setIcon(imageIcon);
        } else {
            lblImage.setIcon(lblImage.getIcon());
        }

        e = dbc.findByEquipUserId(Eid);
        lblBrand.setText(e.getBrand());
        lblModel.setText(e.getModel());
        lblBanType.setText(e.getBan_type());
        if (e.getConditioner() == 'Y') {
            lblConditioner.setText("Vardır");
        } else {
            lblConditioner.setText("Yoxdur");
        }

        r = dbc.findByTheRouteId(Rid);
        if (r.getCategories() == 'L') {
            lblCategories.setText("Ölkə daxili");
        } else {
            lblCategories.setText("Ölkə xarici");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblFatherName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblDtBirth = new javax.swing.JLabel();
        lblLanguage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblBanType = new javax.swing.JLabel();
        lblConditioner = new javax.swing.JLabel();
        lblCategories = new javax.swing.JLabel();
        btnApply = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblX = new javax.swing.JLabel();
        lblSendMessage = new javax.swing.JLabel();
        lblShowAllEqBCK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Ad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Soyad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Ata adı");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Cinsi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("E-Poçta");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Telefon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Doğum tarixi");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Dil");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 227, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Haqqında");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, -1, -1));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RegisterProfilePicture.png"))); // NOI18N
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblImage.setOpaque(true);
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 45, -1, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 46, -1, -1));

        lblSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(255, 255, 255));
        lblSurname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSurname.setText("Surname");
        getContentPane().add(lblSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 72, -1, -1));

        lblFatherName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFatherName.setForeground(new java.awt.Color(255, 255, 255));
        lblFatherName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFatherName.setText("FatherName");
        getContentPane().add(lblFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 98, -1, -1));

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblGender.setText("Gender");
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 124, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmail.setText("Email");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 150, -1, -1));

        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhone.setText("Phone");
        getContentPane().add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 176, -1, 20));

        lblDtBirth.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDtBirth.setForeground(new java.awt.Color(255, 255, 255));
        lblDtBirth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDtBirth.setText("DateOfBirth");
        getContentPane().add(lblDtBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 202, -1, 20));

        lblLanguage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLanguage.setForeground(new java.awt.Color(255, 255, 255));
        lblLanguage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLanguage.setText("Language");
        getContentPane().add(lblLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 228, -1, -1));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 223, 92));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Marka");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, -1, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Model");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 279, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Ban növü");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Kondisioner");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Kategoriya");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 357, -1, -1));

        lblBrand.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(255, 255, 255));
        lblBrand.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBrand.setText("Brand");
        getContentPane().add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 254, -1, -1));

        lblModel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblModel.setForeground(new java.awt.Color(255, 255, 255));
        lblModel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblModel.setText("Model");
        getContentPane().add(lblModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        lblBanType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBanType.setForeground(new java.awt.Color(255, 255, 255));
        lblBanType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBanType.setText("BanType");
        getContentPane().add(lblBanType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 306, -1, -1));

        lblConditioner.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblConditioner.setForeground(new java.awt.Color(255, 255, 255));
        lblConditioner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConditioner.setText("Conditioner");
        getContentPane().add(lblConditioner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 332, -1, -1));

        lblCategories.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCategories.setForeground(new java.awt.Color(255, 255, 255));
        lblCategories.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCategories.setText("Categories");
        getContentPane().add(lblCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 358, -1, -1));

        btnApply.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnApply.setText("Sifariş et");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });
        getContentPane().add(btnApply, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 530, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Geri");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 83, -1));

        lblX.setBackground(new java.awt.Color(255, 255, 255));
        lblX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblX.setForeground(new java.awt.Color(204, 0, 0));
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("X");
        lblX.setOpaque(true);
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXMouseExited(evt);
            }
        });
        getContentPane().add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 29, 25));

        lblSendMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSendMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MessagesIcon(2).png"))); // NOI18N
        lblSendMessage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSendMessage.setOpaque(true);
        lblSendMessage.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSendMessageMouseMoved(evt);
            }
        });
        lblSendMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSendMessageMouseClicked(evt);
            }
        });
        getContentPane().add(lblSendMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 200, 30, 30));

        lblShowAllEqBCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowAllEqBCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ShowAllEquipBCK.png"))); // NOI18N
        lblShowAllEqBCK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblShowAllEqBCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if (keyword == "ToGo") {
            IWantToGo iw = new IWantToGo(u);
            iw.setVisible(true);
            dispose();
        } else {
            IWantToSend iws = new IWantToSend(u);
            iws.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_btnCancelActionPerformed

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        if (keyword == "ToGo") {
            IWantToGo iw = new IWantToGo(u);
            iw.setVisible(true);
            dispose();
        } else {
            IWantToSend iws = new IWantToSend(u);
            iws.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lblXMouseClicked

    private void lblXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseEntered
        lblX.setBackground(Color.red);
        lblX.setForeground(Color.white);
    }//GEN-LAST:event_lblXMouseEntered

    private void lblXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseExited
        lblX.setBackground(Color.white);
        lblX.setForeground(Color.red);
    }//GEN-LAST:event_lblXMouseExited

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        try {
            SendOrder so = new SendOrder(u, id, Rid, Passenger_Count, Luggage_Count, "IWantGo");
            so.setVisible(true);
            dispose();
        } catch (Exception e) {
            ErrorDialog er = new ErrorDialog(this, true, "Her hansı bir obyekt seçilməyib");
            er.setVisible(true);
        }
    }//GEN-LAST:event_btnApplyActionPerformed

    private void lblSendMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSendMessageMouseClicked
        SendMessagesPage sm = new SendMessagesPage(u, id, Rid, Eid, Passenger_Count, Luggage_Count, "ToGo");
        sm.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblSendMessageMouseClicked

    private void lblSendMessageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSendMessageMouseMoved
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        lblSendMessage.setCursor(c);
    }//GEN-LAST:event_lblSendMessageMouseMoved

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
            java.util.logging.Logger.getLogger(ShowAllForEquip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllForEquip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllForEquip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllForEquip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowAllForEquip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanType;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblCategories;
    private javax.swing.JLabel lblConditioner;
    private javax.swing.JLabel lblDtBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFatherName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSendMessage;
    private javax.swing.JLabel lblShowAllEqBCK;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblX;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
}