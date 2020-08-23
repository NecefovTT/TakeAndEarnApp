/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import DBConnected.DBConnection;
import Models.NotificationsTableModel;
import Models.TheRouteTableModel;
import Pojo.Users;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TT
 */
public class MyOrder extends javax.swing.JFrame {

    /**
     * Creates new form MyOrder
     */
    DBConnection dbc = new DBConnection();
    Users u = null;

    public MyOrder() {
        initComponents();
        setLocationRelativeTo(this);
    }

    public MyOrder(Users u) {
        initComponents();
        setLocationRelativeTo(this);

        this.u = u;

        refresh();
    }

    public void refresh() {
        List<String> h = new ArrayList<String>();
        h.add("ID");
        h.add("Ad");
        h.add("Surucu");
        h.add("Haradan");
        h.add("Haraya");
        h.add("Sərnişin sayı");
        h.add("Yük miqdarı");
        h.add("Note");
        h.add("Status");
        h.add("UserId from");
        h.add("Vaxt");

        NotificationsTableModel model = new NotificationsTableModel(dbc.listMyOrder(u.getId()), h);
        tblMyOrder.setModel(model);

        tblMyOrder.getColumnModel().getColumn(0).setMinWidth(0);
        tblMyOrder.getColumnModel().getColumn(0).setMaxWidth(0);
        tblMyOrder.getColumnModel().getColumn(0).setWidth(0);

        tblMyOrder.getColumnModel().getColumn(1).setMinWidth(0);
        tblMyOrder.getColumnModel().getColumn(1).setMaxWidth(0);
        tblMyOrder.getColumnModel().getColumn(1).setWidth(0);

        tblMyOrder.getColumnModel().getColumn(7).setMinWidth(0);
        tblMyOrder.getColumnModel().getColumn(7).setMaxWidth(0);
        tblMyOrder.getColumnModel().getColumn(7).setWidth(0);

        tblMyOrder.getColumnModel().getColumn(9).setMinWidth(0);
        tblMyOrder.getColumnModel().getColumn(9).setMaxWidth(0);
        tblMyOrder.getColumnModel().getColumn(9).setWidth(0);

        tblMyOrder.getColumnModel().getColumn(5).setMinWidth(90);
        tblMyOrder.getColumnModel().getColumn(5).setMaxWidth(90);
        tblMyOrder.getColumnModel().getColumn(5).setWidth(90);

        tblMyOrder.getColumnModel().getColumn(6).setMinWidth(90);
        tblMyOrder.getColumnModel().getColumn(6).setMaxWidth(90);
        tblMyOrder.getColumnModel().getColumn(6).setWidth(90);
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
        tblMyOrder = new javax.swing.JTable();
        lblX = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnAbolish = new javax.swing.JButton();
        lblMyOrderBCK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tblMyOrder);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 760, 230));

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

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("Geri");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        btnAbolish.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAbolish.setText("Sifarişi ləğv et");
        btnAbolish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbolishActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbolish, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 310, 115, -1));

        lblMyOrderBCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMyOrderBCK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IWantToGo.png"))); // NOI18N
        lblMyOrderBCK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblMyOrderBCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        MyProfile mp = new MyProfile(u);
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAbolishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbolishActionPerformed
        try {
            CancelOrderDialog cancel = new CancelOrderDialog(this, true, u,
                    Integer.parseInt(tblMyOrder.getValueAt(tblMyOrder.getSelectedRow(), 0).toString()), "CancelOrderClient");
            cancel.setVisible(true);
            refresh();
            dispose();
        } catch (Exception e) {
            ErrorDialog er = new ErrorDialog(this, true, "Her hansı bir obyekt seçilməyib");
            er.setVisible(true);
        }
    }//GEN-LAST:event_btnAbolishActionPerformed

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
            java.util.logging.Logger.getLogger(MyOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbolish;
    private javax.swing.JButton btnCancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMyOrderBCK;
    private javax.swing.JLabel lblX;
    private javax.swing.JTable tblMyOrder;
    // End of variables declaration//GEN-END:variables
}
