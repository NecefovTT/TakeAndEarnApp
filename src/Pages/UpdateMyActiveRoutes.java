/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import DBConnected.DBConnection;
import Enums.BanTypes;
import Pojo.Equipment;
import Pojo.TheRoute;
import Pojo.Users;
import java.awt.Color;
import java.text.SimpleDateFormat;

/**
 *
 * @author TT
 */
public class UpdateMyActiveRoutes extends javax.swing.JFrame {

    /**
     * Creates new form IWantPassenger
     */
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    DBConnection dbc = new DBConnection();
    Users u = null;
    TheRoute r = null;
    Equipment e = null;

    int Rid;
    int Eid;

    public UpdateMyActiveRoutes() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public UpdateMyActiveRoutes(Users u, int Rid, int Eid) {
        initComponents();
        setLocationRelativeTo(this);

        this.u = u;
        this.Rid = Rid;

        r = dbc.findByTheRouteId(Rid);
        e = dbc.findByEquipForEqId(Eid);

        cbMyEquipment.addItem("Seçim edin");
        cbEquipOther.addItem("Seçim edin");

        if (e.getUser_id() == 11) {
            rbOther.setSelected(true);
            cbEquipOther.setVisible(true);
            rbMyEquipt.setSelected(false);
            cbMyEquipment.setVisible(false);
            cbEquipOther.addItem("Seçim edin");
            for (Equipment t : dbc.listEquipmentForOtherRoute()) {
                cbEquipOther.addItem(t);
                if (e.getId() == t.getId()) {
                    cbEquipOther.setSelectedItem(t);
                }
            }
        } else {
            rbMyEquipt.setSelected(true);
            cbMyEquipment.setVisible(true);
            rbOther.setSelected(false);
            cbEquipOther.setVisible(false);
            for (Equipment t : dbc.findByEquipForRoute(u.getId())) {
                cbMyEquipment.addItem(t);
                if (e.getId() == t.getId()) {
                    cbMyEquipment.setSelectedItem(t);
                }

            }
        }

        lblError.setVisible(false);

        try {
            txtWhereFrom.setText(r.getLoc_from());
            txtWhereTo.setText(r.getLoc_to());
            dtTime.setDate(sdf.parse(r.getDates()));
            if (r.getCategories() == 'L') {
                rbLocal.setSelected(true);
            } else {
                rbGlobal.setSelected(true);
            }
            spPassengerCount.setValue(r.getPassenger());
            spLuggage.setValue(r.getLuggage());

        } catch (Exception e) {
            e.printStackTrace();
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

        rbGroubCategory = new javax.swing.ButtonGroup();
        rbGroupEquipment = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cbMyEquipment = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtWhereFrom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWhereTo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dtTime = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        rbLocal = new javax.swing.JRadioButton();
        rbGlobal = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        spPassengerCount = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        spLuggage = new javax.swing.JSpinner();
        btnCancel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        rbMyEquipt = new javax.swing.JRadioButton();
        rbOther = new javax.swing.JRadioButton();
        cbEquipOther = new javax.swing.JComboBox();
        lblError = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        lblIWantPassBCK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Vasitə");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, -1, -1));

        cbMyEquipment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cbMyEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 77, 183, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Haradan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, -1, -1));

        txtWhereFrom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txtWhereFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 115, 183, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Haraya");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));

        txtWhereTo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txtWhereTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 153, 183, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Tarix");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 196, -1, -1));
        getContentPane().add(dtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 191, 128, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Kateqoriya");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 232, -1, -1));

        rbGroubCategory.add(rbLocal);
        rbLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbLocal.setText("Ölkə daxili");
        getContentPane().add(rbLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 229, -1, -1));

        rbGroubCategory.add(rbGlobal);
        rbGlobal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbGlobal.setText("Ölkə xarici");
        getContentPane().add(rbGlobal, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 229, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Sernişin sayı");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 272, -1, -1));
        getContentPane().add(spPassengerCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 270, 63, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Yük");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        getContentPane().add(spLuggage, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 308, 63, -1));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Geri");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 75, -1));

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsert.setText("Daxil et");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        rbGroupEquipment.add(rbMyEquipt);
        rbMyEquipt.setText("Öz vasitəm");
        rbMyEquipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbMyEquiptMouseClicked(evt);
            }
        });
        getContentPane().add(rbMyEquipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 36, -1, -1));

        rbGroupEquipment.add(rbOther);
        rbOther.setText("Digər Vasitə");
        rbOther.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbOtherMouseClicked(evt);
            }
        });
        getContentPane().add(rbOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 36, -1, -1));

        cbEquipOther.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(cbEquipOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 77, 183, -1));

        lblError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("Her hansı bir vasitə seçilməyib");
        getContentPane().add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        lblX.setBackground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 30, 25));

        lblIWantPassBCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIWantPassBCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IWantPassengerBCK.png"))); // NOI18N
        lblIWantPassBCK.setText("jLabel8");
        lblIWantPassBCK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblIWantPassBCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        if (rbMyEquipt.isSelected()) {
            if (cbMyEquipment.getSelectedIndex() != 0) {
                Equipment e = (Equipment) cbMyEquipment.getSelectedItem();
                r.setEq_id(e.getId());
                r.setLoc_from(txtWhereFrom.getText());
                r.setLoc_to(txtWhereTo.getText());
                r.setDates(sdf.format(dtTime.getDate()));
                if (rbLocal.isSelected()) {
                    r.setCategories('L');
                } else {
                    r.setCategories('G');
                }
                r.setPassenger(Integer.parseInt(spPassengerCount.getValue().toString()));
                r.setLuggage(Double.parseDouble(spLuggage.getValue().toString()));
                r.setStatus(1);
                dbc.updateTheRoute(r);

                MyActiveRoutes my = new MyActiveRoutes(u);
                my.setVisible(true);
                dispose();
            } else {
                lblError.setVisible(true);
                lblError.setForeground(Color.red);
            }
        } else if (rbOther.isSelected()) {
            if (cbEquipOther.getSelectedIndex() != 0) {
                Equipment e = (Equipment) cbEquipOther.getSelectedItem();
                r.setEq_id(e.getId());
                r.setLoc_from(txtWhereFrom.getText());
                r.setLoc_to(txtWhereTo.getText());
                r.setDates(sdf.format(dtTime.getDate()));
                if (rbLocal.isSelected()) {
                    r.setCategories('L');
                } else {
                    r.setCategories('G');
                }
                r.setPassenger(Integer.parseInt(spPassengerCount.getValue().toString()));
                r.setLuggage(Double.parseDouble(spLuggage.getValue().toString()));
                r.setStatus(1);
                dbc.updateTheRoute(r);

                MyActiveRoutes my = new MyActiveRoutes(u);
                my.setVisible(true);
                dispose();
            } else {
                lblError.setVisible(true);
                lblError.setForeground(Color.red);
            }
        }


    }//GEN-LAST:event_btnInsertActionPerformed

    private void rbMyEquiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbMyEquiptMouseClicked
        rbMyEquipt.setSelected(true);
        cbMyEquipment.setVisible(true);
        cbEquipOther.setVisible(false);
        cbMyEquipment.removeAllItems();
        cbEquipOther.removeAllItems();
        cbMyEquipment.addItem("Seçim edin");
        for (Equipment e : dbc.findByEquipForRoute(u.getId())) {
            cbMyEquipment.addItem(e);
        }
    }//GEN-LAST:event_rbMyEquiptMouseClicked

    private void rbOtherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbOtherMouseClicked
        rbOther.setSelected(true);
        cbEquipOther.setVisible(true);
        cbMyEquipment.setVisible(false);
        cbEquipOther.removeAllItems();
        cbMyEquipment.removeAllItems();
        cbEquipOther.addItem("Seçim edin");
        for (Equipment e : dbc.listEquipmentForOtherRoute()) {
            cbEquipOther.addItem(e);
        }
    }//GEN-LAST:event_rbOtherMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked


    }//GEN-LAST:event_btnCancelMouseClicked

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        MyActiveRoutes my = new MyActiveRoutes(u);
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
        MyActiveRoutes my = new MyActiveRoutes(u);
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
            java.util.logging.Logger.getLogger(UpdateMyActiveRoutes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMyActiveRoutes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMyActiveRoutes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMyActiveRoutes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMyActiveRoutes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInsert;
    private javax.swing.JComboBox cbEquipOther;
    private javax.swing.JComboBox cbMyEquipment;
    private com.toedter.calendar.JDateChooser dtTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblIWantPassBCK;
    private javax.swing.JLabel lblX;
    private javax.swing.JRadioButton rbGlobal;
    private javax.swing.ButtonGroup rbGroubCategory;
    private javax.swing.ButtonGroup rbGroupEquipment;
    private javax.swing.JRadioButton rbLocal;
    private javax.swing.JRadioButton rbMyEquipt;
    private javax.swing.JRadioButton rbOther;
    private javax.swing.JSpinner spLuggage;
    private javax.swing.JSpinner spPassengerCount;
    private javax.swing.JTextField txtWhereFrom;
    private javax.swing.JTextField txtWhereTo;
    // End of variables declaration//GEN-END:variables
}
