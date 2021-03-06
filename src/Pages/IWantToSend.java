/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import DBConnected.DBConnection;
import Models.TheRouteTableModel;
import Pojo.Users;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TT
 */
public class IWantToSend extends javax.swing.JFrame {

    /**
     * Creates new form IWantToSend
     */
    DBConnection dbc = new DBConnection();
    Users u = null;

    public IWantToSend() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public IWantToSend(Users u) {
        initComponents();
        setLocationRelativeTo(this);

        this.u = u;

        refresh();

    }

    public void refresh() {

        List<String> h = new ArrayList<String>();
        h.add("Ad Soyad");
        h.add("// User Id //");
        h.add("Vasitə");
        h.add("Haradan");
        h.add("Haraya");
        h.add("Vaxt");
        h.add("Sərnişin sayı");
        h.add("Yük miqdarı");
        h.add("Route Id");
        h.add("Equo id");
        h.add("Status");
        h.add("User Id");

        TheRouteTableModel model = new TheRouteTableModel(dbc.listForRouteForIWantToSendTable(u.getId()), h);
        tblIWantToSend.setModel(model);

        tblIWantToSend.getColumnModel().getColumn(1).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(1).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(1).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(8).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(8).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(8).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(9).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(9).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(9).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(10).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(10).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(10).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(11).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(11).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(11).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(5).setMinWidth(90);
        tblIWantToSend.getColumnModel().getColumn(5).setMaxWidth(90);
        tblIWantToSend.getColumnModel().getColumn(5).setWidth(90);

        tblIWantToSend.getColumnModel().getColumn(6).setMinWidth(90);
        tblIWantToSend.getColumnModel().getColumn(6).setMaxWidth(90);
        tblIWantToSend.getColumnModel().getColumn(6).setWidth(90);

        tblIWantToSend.getColumnModel().getColumn(7).setMinWidth(90);
        tblIWantToSend.getColumnModel().getColumn(7).setMaxWidth(90);
        tblIWantToSend.getColumnModel().getColumn(7).setWidth(90);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblIWantToSend = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnApply = new javax.swing.JButton();
        lblX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLocFrom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLocTo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblIWantToSendBck = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tblIWantToSend);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, 230));

        btnCancel.setBackground(new java.awt.Color(255, 255, 255));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Geri");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        btnShowAll.setBackground(new java.awt.Color(255, 255, 255));
        btnShowAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnShowAll.setText("Ətraflı");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 90, -1));

        btnApply.setBackground(new java.awt.Color(255, 255, 255));
        btnApply.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnApply.setText("Sifariş et");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });
        getContentPane().add(btnApply, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 90, -1));

        lblX.setBackground(new java.awt.Color(255, 255, 255));
        lblX.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        getContentPane().add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Haradan :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtLocFrom.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txtLocFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 7, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Haraya :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 37, -1, -1));

        txtLocTo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txtLocTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 37, 130, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Axtar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 7, 117, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Bütün sifarişlər");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 37, 117, -1));

        lblIWantToSendBck.setBackground(new java.awt.Color(255, 255, 255));
        lblIWantToSendBck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIWantToSendBck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IWantToGo.png"))); // NOI18N
        lblIWantToSendBck.setText("jLabel1");
        lblIWantToSendBck.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblIWantToSendBck, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 761, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        MyProfile mp = new MyProfile(u);
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        try {
            ShowAllForEquip sh = new ShowAllForEquip(u, Integer.parseInt(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 1).toString()),
                    Integer.parseInt(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 8).toString()),
                    Integer.parseInt(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 9).toString()),
                    Integer.parseInt(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 6).toString()),
                    Double.parseDouble(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 7).toString()),
                    "ToSend");
            sh.setVisible(true);
            dispose();
        } catch (Exception e) {
            ErrorDialog er = new ErrorDialog(this, true, "Her hansı bir obyekt seçilməyib");
            er.setVisible(true);
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        MyProfile mp = new MyProfile(u);
        mp.setVisible(true);
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<String> h = new ArrayList<String>();
        h.add("Ad Soyad");
        h.add("// User Id //");
        h.add("Vasitə");
        h.add("Haradan");
        h.add("Haraya");
        h.add("Vaxt");
        h.add("Sərnişin sayı");
        h.add("Yük miqdarı");
        h.add("Route Id");
        h.add("Equo id");
        h.add("Status");

        if (!txtLocFrom.getText().isEmpty() && !txtLocTo.getText().isEmpty()) {
            TheRouteTableModel model = new TheRouteTableModel(dbc.findByLocFromAndLocTo(txtLocFrom.getText(), txtLocTo.getText(), u.getId()), h);
            tblIWantToSend.setModel(model);
        } else if (!txtLocFrom.getText().isEmpty() && txtLocTo.getText().isEmpty()) {
            TheRouteTableModel model = new TheRouteTableModel(dbc.findByLocFrom(txtLocFrom.getText(), u.getId()), h);
            tblIWantToSend.setModel(model);
        } else if (!txtLocTo.getText().isEmpty() && txtLocFrom.getText().isEmpty()) {
            TheRouteTableModel model = new TheRouteTableModel(dbc.findByLocTo(txtLocTo.getText(), u.getId()), h);
            tblIWantToSend.setModel(model);
        }

        tblIWantToSend.getColumnModel().getColumn(1).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(1).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(1).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(8).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(8).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(8).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(9).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(9).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(9).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(10).setMinWidth(0);
        tblIWantToSend.getColumnModel().getColumn(10).setMaxWidth(0);
        tblIWantToSend.getColumnModel().getColumn(10).setWidth(0);

        tblIWantToSend.getColumnModel().getColumn(5).setMinWidth(90);
        tblIWantToSend.getColumnModel().getColumn(5).setMaxWidth(90);
        tblIWantToSend.getColumnModel().getColumn(5).setWidth(90);

        tblIWantToSend.getColumnModel().getColumn(6).setMinWidth(90);
        tblIWantToSend.getColumnModel().getColumn(6).setMaxWidth(90);
        tblIWantToSend.getColumnModel().getColumn(6).setWidth(90);

        tblIWantToSend.getColumnModel().getColumn(7).setMinWidth(90);
        tblIWantToSend.getColumnModel().getColumn(7).setMaxWidth(90);
        tblIWantToSend.getColumnModel().getColumn(7).setWidth(90);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        refresh();
        txtLocFrom.setText("");
        txtLocTo.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        try {
            SendOrder so = new SendOrder(u, Integer.parseInt(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 11).toString()),
                    Integer.parseInt(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 8).toString()),
                    Integer.parseInt(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 6).toString()),
                    Double.parseDouble(tblIWantToSend.getValueAt(tblIWantToSend.getSelectedRow(), 7).toString()), "IWantSend");
            so.setVisible(true);
            dispose();
        } catch (Exception e) {
            ErrorDialog er = new ErrorDialog(this, true, "Her hansı bir obyekt seçilməyib");
            er.setVisible(true);
        }
    }//GEN-LAST:event_btnApplyActionPerformed

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
            java.util.logging.Logger.getLogger(IWantToSend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IWantToSend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IWantToSend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IWantToSend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IWantToSend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIWantToSendBck;
    private javax.swing.JLabel lblX;
    private javax.swing.JTable tblIWantToSend;
    private javax.swing.JTextField txtLocFrom;
    private javax.swing.JTextField txtLocTo;
    // End of variables declaration//GEN-END:variables
}
