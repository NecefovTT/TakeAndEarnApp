/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import DBConnected.DBConnection;
import Pojo.Users;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author TT
 */
public class RegisterUser extends javax.swing.JFrame {

    /**
     * Creates new form RegisterUser
     */
    DBConnection dbc = new DBConnection();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    JFileChooser chooser = new JFileChooser();
    File f = null;
    byte b[] = null;

    public RegisterUser() {
        initComponents();
        setLocationRelativeTo(this);
        rbMale.setSelected(true);
        lblError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JPasswordField();
        txtPassword2 = new javax.swing.JPasswordField();
        txtPhone = new javax.swing.JTextField();
        cbAZ = new javax.swing.JCheckBox();
        cbEN = new javax.swing.JCheckBox();
        cbRU = new javax.swing.JCheckBox();
        cbTR = new javax.swing.JCheckBox();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescription = new javax.swing.JTextArea();
        lblImage = new javax.swing.JLabel();
        btnChoosePhoto = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        dtBirth = new com.toedter.calendar.JDateChooser();
        lblError = new javax.swing.JLabel();
        lblRegistrationBCK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(89, 178, 178));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 1, 25, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Ad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 25, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Soyad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 51, -1, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Ata Adı");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, -1, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("E-poçta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 123, -1, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("İstifadəçi adı");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 159, -1, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Şifrə");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 195, -1, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Təkrar şifrə");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 231, 68, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Telefon");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 267, -1, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Doğum tarixi");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 303, -1, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Dil");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 339, -1, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Cins");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 375, -1, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Haqqında");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 411, -1, 25));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 22, 160, -1));
        jPanel1.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 53, 160, -1));
        jPanel1.add(txtFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 89, 160, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 125, 160, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 161, 160, -1));
        jPanel1.add(txtPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 197, 160, -1));
        jPanel1.add(txtPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 233, 160, -1));
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 269, 160, -1));

        cbAZ.setBackground(new java.awt.Color(89, 178, 178));
        cbAZ.setForeground(new java.awt.Color(255, 255, 255));
        cbAZ.setText("AZ");
        jPanel1.add(cbAZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 340, -1, -1));

        cbEN.setBackground(new java.awt.Color(89, 178, 178));
        cbEN.setForeground(new java.awt.Color(255, 255, 255));
        cbEN.setText("EN");
        jPanel1.add(cbEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 340, -1, -1));

        cbRU.setBackground(new java.awt.Color(89, 178, 178));
        cbRU.setForeground(new java.awt.Color(255, 255, 255));
        cbRU.setText("RU");
        jPanel1.add(cbRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 340, -1, -1));

        cbTR.setBackground(new java.awt.Color(89, 178, 178));
        cbTR.setForeground(new java.awt.Color(255, 255, 255));
        cbTR.setText("TR");
        jPanel1.add(cbTR, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 340, -1, -1));

        rbMale.setBackground(new java.awt.Color(89, 178, 178));
        rbGroupGender.add(rbMale);
        rbMale.setForeground(new java.awt.Color(255, 255, 255));
        rbMale.setText("Kisi");
        jPanel1.add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 377, -1, -1));

        rbFemale.setBackground(new java.awt.Color(89, 178, 178));
        rbGroupGender.add(rbFemale);
        rbFemale.setForeground(new java.awt.Color(255, 255, 255));
        rbFemale.setText("Qadin");
        jPanel1.add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 377, -1, -1));

        txtAreaDescription.setColumns(20);
        txtAreaDescription.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 442, 256, -1));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RegisterProfilePicture.png"))); // NOI18N
        lblImage.setOpaque(true);
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 37, 140, 140));

        btnChoosePhoto.setText("Şəkil seç");
        btnChoosePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoosePhotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnChoosePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 207, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Ləğv et");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsert.setText("İrəli");
        btnInsert.setPreferredSize(new java.awt.Dimension(69, 23));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));
        jPanel1.add(dtBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 303, 160, -1));

        lblError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("Error Label");
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 230, -1));

        lblRegistrationBCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrationBCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpdateBCK.png"))); // NOI18N
        jPanel1.add(lblRegistrationBCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseEntered
        lblX.setBackground(Color.red);
        lblX.setForeground(Color.white);
    }//GEN-LAST:event_lblXMouseEntered

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        dispose();
    }//GEN-LAST:event_lblXMouseClicked

    private void lblXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseExited
        lblX.setBackground(Color.white);
        lblX.setForeground(Color.red);
    }//GEN-LAST:event_lblXMouseExited

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        if (dbc.findByUsername(txtUsername.getText()) == 0) {
            if (txtPassword1.getText().equals(txtPassword2.getText())) {
                String lang = "";
                Users u = new Users();
                u.setName(txtName.getText());
                u.setSurname(txtSurname.getText());
                u.setFather_name(txtFatherName.getText());
                if (rbFemale.isSelected()) {
                    u.setGender('F');
                } else if (rbMale.isSelected()) {
                    u.setGender('M');
                }
                u.setEmail(txtEmail.getText());
                u.setUsername(txtUsername.getText());
                u.setPhone(txtPhone.getText());
                u.setPassword(txtPassword1.getText());
                u.setDate_of_birth(sdf.format(dtBirth.getDate()));
                u.setImage(b);
                u.setDescription(txtAreaDescription.getText());
                if (cbAZ.isSelected()) {
                    lang = lang + cbAZ.getText() + ",";
                }
                if (cbEN.isSelected()) {
                    lang = lang + cbEN.getText() + ",";
                }
                if (cbRU.isSelected()) {
                    lang = lang + cbRU.getText() + ",";
                }
                if (cbTR.isSelected()) {
                    lang = lang + cbTR.getText() + ",";
                }
                u.setLanguages(lang);
                u.setRegister(sdf.format(new Date()));
                u.setStatus(1);
                u.setRole(1);
                dbc.insertUsers(u);

                MyProfile mp = new MyProfile(dbc.findByUsernameIdForReturnFromRegister(txtUsername.getText()));
                mp.setVisible(true);
                dispose();
            } else {
                ErrorDialog er = new ErrorDialog(this, true, "Sifreler uyusmur!");
                er.setVisible(true);
            }

        } else {
            lblError.setVisible(true);
            lblError.setForeground(Color.red);
            lblError.setBackground(Color.white);
            lblError.setText(txtUsername.getText() + " istifadəçi adı mövcuddur");
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnChoosePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoosePhotoActionPerformed
        chooser.showOpenDialog(null);
        f = chooser.getSelectedFile();

        if (f != null) {
            b = new byte[(int) f.length()];
            try {
                InputStream oxu = new FileInputStream(f);
                oxu.read(b);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Toolkit toolkitLogo = Toolkit.getDefaultToolkit();
            Image imageLogo = toolkitLogo.getImage(f.getAbsolutePath());
            lblImage.setIcon(new ImageIcon(imageLogo.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), java.awt.Image.SCALE_DEFAULT)));

        } else {
            b = null;
        }
    }//GEN-LAST:event_btnChoosePhotoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChoosePhoto;
    private javax.swing.JButton btnInsert;
    private javax.swing.JCheckBox cbAZ;
    private javax.swing.JCheckBox cbEN;
    private javax.swing.JCheckBox cbRU;
    private javax.swing.JCheckBox cbTR;
    private com.toedter.calendar.JDateChooser dtBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblRegistrationBCK;
    private javax.swing.JLabel lblX;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.ButtonGroup rbGroupGender;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea txtAreaDescription;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JPasswordField txtPassword2;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
