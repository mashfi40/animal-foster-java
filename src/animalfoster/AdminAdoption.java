/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package animalfoster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AdminAdoption extends javax.swing.JFrame {

    /**
     * Creates new form AdminAdoption
     */
    public AdminAdoption() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        view = new javax.swing.JButton();
        StopAbuse = new javax.swing.JLabel();
        Adopt = new javax.swing.JLabel();
        HealthCare = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        GetInvolved = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        HomePage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Contact", "E-mail", "Address", "NID", "Reasons to Adopt", "Animals Adopted "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(40);
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1520, 460));

        view.setBackground(new java.awt.Color(153, 153, 153));
        view.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        view.setText("View Adopters");
        view.setBorderPainted(false);
        view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view.setFocusPainted(false);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        StopAbuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/StopAbuse.png"))); // NOI18N
        StopAbuse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StopAbuse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StopAbuseMousePressed(evt);
            }
        });
        jPanel1.add(StopAbuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 670, 130, 130));

        Adopt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/AdoptLogo.png"))); // NOI18N
        Adopt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Adopt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdoptMousePressed(evt);
            }
        });
        jPanel1.add(Adopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 670, 130, 130));

        HealthCare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/HealthCare.png"))); // NOI18N
        HealthCare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HealthCare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HealthCareMousePressed(evt);
            }
        });
        jPanel1.add(HealthCare, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 660, 130, 130));

        Minimize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Minimize.setForeground(new java.awt.Color(204, 204, 204));
        Minimize.setText("-");
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        jPanel1.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 10, 10, 10));

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exit.setForeground(new java.awt.Color(204, 204, 204));
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 10, 10, -1));

        GetInvolved.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        GetInvolved.setForeground(new java.awt.Color(255, 255, 255));
        GetInvolved.setText("Get Involved");
        GetInvolved.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GetInvolved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GetInvolvedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GetInvolvedMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GetInvolvedMousePressed(evt);
            }
        });
        jPanel1.add(GetInvolved, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 30, -1, -1));

        help.setForeground(new java.awt.Color(204, 204, 204));
        help.setText("Help?");
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jPanel1.add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 40, -1, -1));

        HomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/FosterLogo.png"))); // NOI18N
        HomePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePageMouseClicked(evt);
            }
        });
        jPanel1.add(HomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 113));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 116, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/Background3.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1540, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/adopter", "root", "root");
            String sql = "select * from adopter";
            PreparedStatement ptst = c.prepareStatement(sql);
            ResultSet rs = ptst.executeQuery();

            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            JOptionPane.showMessageDialog(this, "Data viewed");
            c.close();
        }
        catch(SQLException ex){
            Logger.getLogger(HealthCare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewActionPerformed

    private void StopAbuseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopAbuseMousePressed
        // TODO add your handling code here:
        dispose();
        AbuseReports sa = new AbuseReports();
        sa.setVisible(true);
    }//GEN-LAST:event_StopAbuseMousePressed

    private void AdoptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdoptMousePressed
        // TODO add your handling code here:
        dispose();
        AdminAdoption da = new AdminAdoption();
        da.setVisible(true);
    }//GEN-LAST:event_AdoptMousePressed

    private void HealthCareMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealthCareMousePressed
        // TODO add your handling code here:
        dispose();
        AdminHealth hc = new AdminHealth();
        hc.setVisible(true);
    }//GEN-LAST:event_HealthCareMousePressed

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void GetInvolvedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetInvolvedMouseClicked
        // TODO add your handling code here:
        dispose();
        LogOut lp = new LogOut();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_GetInvolvedMouseClicked

    private void GetInvolvedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetInvolvedMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_GetInvolvedMouseEntered

    private void GetInvolvedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GetInvolvedMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetInvolvedMousePressed

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        // TODO add your handling code here:
        dispose();
        AccessedHelp ah = new AccessedHelp();
        ah.setVisible(true);
    }//GEN-LAST:event_helpMouseClicked

    private void HomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageMouseClicked
        // TODO add your handling code here:
        dispose();
        AccessedFrontDisplay afd = new AccessedFrontDisplay();
        afd.setVisible(true);
    }//GEN-LAST:event_HomePageMouseClicked

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
            java.util.logging.Logger.getLogger(AdminAdoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAdoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAdoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAdoption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAdoption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adopt;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel GetInvolved;
    private javax.swing.JLabel HealthCare;
    private javax.swing.JLabel HomePage;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel StopAbuse;
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
