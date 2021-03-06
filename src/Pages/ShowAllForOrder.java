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
import javax.swing.ImageIcon;

/**
 *
 * @author TT
 */
public class ShowAllForOrder extends javax.swing.JDialog {

    /**
     * Creates new form ShowAllDialog
     */
    DBConnection dbc = new DBConnection();
    Users u = null;
    Users n = null;
    int id;
    byte b[] = null;
    File f = null;

    public ShowAllForOrder(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
    }

    public ShowAllForOrder(java.awt.Frame parent, boolean modal, Users u, int id) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);

        this.u = u;
        this.id = id;

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

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFatherName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblDtBirth = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblLanguage = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        lblShowAllBCK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(89, 178, 178));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jPanel1.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 1, 29, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Ad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 44, 28, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("jLabel3");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 45, 165, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Soyad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 74, -1, -1));

        lblSurname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(255, 255, 255));
        lblSurname.setText("jLabel4");
        jPanel1.add(lblSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 75, 165, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Ata adi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 104, -1, -1));

        lblFatherName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFatherName.setForeground(new java.awt.Color(255, 255, 255));
        lblFatherName.setText("jLabel5");
        jPanel1.add(lblFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 105, 165, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Cinsi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 134, -1, -1));

        lblGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("jLabel6");
        jPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 135, 165, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 164, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("jLabel7");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 165, 165, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Telefon");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 194, -1, -1));

        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("jLabel10");
        jPanel1.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 195, 165, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Dogum tarixi");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 224, -1, -1));

        lblDtBirth.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDtBirth.setForeground(new java.awt.Color(255, 255, 255));
        lblDtBirth.setText("jLabel11");
        jPanel1.add(lblDtBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 225, 165, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Dil");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 254, -1, -1));

        lblLanguage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLanguage.setForeground(new java.awt.Color(255, 255, 255));
        lblLanguage.setText("jLabel12");
        jPanel1.add(lblLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 255, 165, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Haqqinda");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 284, -1, 14));

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RegisterProfilePicture.png"))); // NOI18N
        lblImage.setOpaque(true);
        jPanel1.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 44, -1, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Geri");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 482, 80, -1));

        btnAccept.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAccept.setText("Təsdiqlə");
        jPanel1.add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 482, 80, -1));

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, -1));

        lblShowAllBCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowAllBCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UpdateBCK.png"))); // NOI18N
        lblShowAllBCK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblShowAllBCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        MyNotifications my = new MyNotifications(u);
        my.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblXMouseClicked

    private void lblXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseEntered
        lblX.setBackground(Color.red);
        lblX.setForeground(Color.white);
    }//GEN-LAST:event_lblXMouseEntered

    private void lblXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseExited
        lblX.setBackground(Color.white);
        lblX.setForeground(Color.red);
    }//GEN-LAST:event_lblXMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        MyNotifications my = new MyNotifications(u);
        my.setVisible(true);
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
            java.util.logging.Logger.getLogger(ShowAllForOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowAllForOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowAllForOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowAllForOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ShowAllForOrder dialog = new ShowAllForOrder(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDtBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFatherName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblShowAllBCK;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblX;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
}
