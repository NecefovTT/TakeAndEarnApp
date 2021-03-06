/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import DBConnected.DBConnection;
import Models.NotificationsTableModel;
import Pojo.Users;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TT
 */
public class MyNotifications extends javax.swing.JFrame {

    /**
     * Creates new form MyNotifications
     */
    DBConnection dbc = new DBConnection();
    Users u = null;

    public MyNotifications() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public MyNotifications(Users u) {
        initComponents();
        setLocationRelativeTo(this);

        this.u = u;

        refresh();

    }

    public void refresh() {
        List<String> h = new ArrayList<String>();
        h.add("Id");
        h.add("Kimden");
        h.add("User_id_to");
        h.add("Haradan");
        h.add("Haraya");
        h.add("Sərnişin sayı");
        h.add("Yük miqdarı");
        h.add("Qeyd");
        h.add("Status");
        h.add("User_id_from");

        NotificationsTableModel model = new NotificationsTableModel(dbc.listMyNotifications(u.getId()), h);
        tblMyNotifications.setModel(model);

        tblMyNotifications.getColumnModel().getColumn(0).setMinWidth(0);
        tblMyNotifications.getColumnModel().getColumn(0).setMaxWidth(0);
        tblMyNotifications.getColumnModel().getColumn(0).setWidth(0);

        tblMyNotifications.getColumnModel().getColumn(2).setMinWidth(0);
        tblMyNotifications.getColumnModel().getColumn(2).setMaxWidth(0);
        tblMyNotifications.getColumnModel().getColumn(2).setWidth(0);

        tblMyNotifications.getColumnModel().getColumn(9).setMinWidth(0);
        tblMyNotifications.getColumnModel().getColumn(9).setMaxWidth(0);
        tblMyNotifications.getColumnModel().getColumn(9).setWidth(0);

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
        tblMyNotifications = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        lblX = new javax.swing.JLabel();
        btnCancelOrder = new javax.swing.JButton();
        lblMyNotificationsBCK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tblMyNotifications);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, 230));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Geri");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        btnShowAll.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnShowAll.setText("Ətraflı");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 90, -1));

        btnAccept.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAccept.setText("Təsdiq et");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 90, -1));

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
        getContentPane().add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 1, 30, 25));

        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelOrder.setText("Ləğv et");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 90, -1));

        lblMyNotificationsBCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IWantToGo.png"))); // NOI18N
        lblMyNotificationsBCK.setText("jLabel1");
        lblMyNotificationsBCK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblMyNotificationsBCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        MyProfile mp = new MyProfile(u);
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        try {
            ShowAllForOrder so = new ShowAllForOrder(this, true, u, Integer.parseInt(tblMyNotifications.getValueAt(tblMyNotifications.getSelectedRow(), 9).toString()));
            so.setVisible(true);
            dispose();
        } catch (Exception e) {
            ErrorDialog er = new ErrorDialog(this, true, "Her hansı bir obyekt seçilməyib");
            er.setVisible(true);
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        try {
            CancelOrderDialog cancel = new CancelOrderDialog(this, true, u,
                    Integer.parseInt(tblMyNotifications.getValueAt(tblMyNotifications.getSelectedRow(), 0).toString()), "CancelOrderOwner");
            cancel.setVisible(true);
            dispose();
        } catch (Exception e) {
            ErrorDialog er = new ErrorDialog(this, true, "Her hansı bir obyekt seçilməyib");
            er.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        try {

            CancelOrderDialog cancel = new CancelOrderDialog(this, true, u,
                    Integer.parseInt(tblMyNotifications.getValueAt(tblMyNotifications.getSelectedRow(), 0).toString()), "AcceptOrder");
            cancel.setVisible(true);
            dispose();

        } catch (Exception e) {
            ErrorDialog er = new ErrorDialog(this, true, "Her hansı bir obyekt seçilməyib");
            er.setVisible(true);
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

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
            java.util.logging.Logger.getLogger(MyNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyNotifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyNotifications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMyNotificationsBCK;
    private javax.swing.JLabel lblX;
    private javax.swing.JTable tblMyNotifications;
    // End of variables declaration//GEN-END:variables
}
