/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package animalfoster;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class AccessedFrontDisplay extends javax.swing.JFrame {

    /**
     * Creates new form AccessedFrontDisplay
     */
    public AccessedFrontDisplay() {
        initComponents();
        show(position);
    }
    int position = 0;
    
    public String[] takeImage()
    {
        File f = new File(getClass().getResource("/Images").getFile());
        String[] Images = f.list();
        return Images;
    }
    
    public void show(int index)
    {
        String[] Images = takeImage();
        String img = Images[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/"+img));
        Image image = icon.getImage().getScaledInstance(Slider.getWidth(), Slider.getHeight(), Image.SCALE_SMOOTH);
        Slider.setIcon(new ImageIcon(image));
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
        StopAbuse = new javax.swing.JLabel();
        events = new javax.swing.JLabel();
        Adopt = new javax.swing.JLabel();
        HealthCare = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        GetInvolved = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        OurTeam = new javax.swing.JLabel();
        HomePage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Slider = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StopAbuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/StopAbuse.png"))); // NOI18N
        StopAbuse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StopAbuse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StopAbuseMousePressed(evt);
            }
        });
        jPanel1.add(StopAbuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 130, 130));

        events.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        events.setForeground(new java.awt.Color(255, 255, 255));
        events.setText("Keep up with our EVENTS . . .");
        events.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventsMouseClicked(evt);
            }
        });
        jPanel1.add(events, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 250, -1));

        Adopt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/AdoptLogo.png"))); // NOI18N
        Adopt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Adopt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdoptMousePressed(evt);
            }
        });
        jPanel1.add(Adopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 650, 130, 130));

        HealthCare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/HealthCare.png"))); // NOI18N
        HealthCare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HealthCare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HealthCareMouseClicked(evt);
            }
        });
        jPanel1.add(HealthCare, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 650, 130, 130));

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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail  Us");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, -1, -1));

        help.setForeground(new java.awt.Color(204, 204, 204));
        help.setText("Help?");
        help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jPanel1.add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(1490, 40, -1, -1));

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/Left.png"))); // NOI18N
        previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previousMousePressed(evt);
            }
        });
        jPanel1.add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, 50));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/Right.png"))); // NOI18N
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 330, 50, 50));

        OurTeam.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        OurTeam.setForeground(new java.awt.Color(255, 255, 255));
        OurTeam.setText("Our Team");
        OurTeam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OurTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OurTeamMouseClicked(evt);
            }
        });
        jPanel1.add(OurTeam, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, 110, 30));

        HomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/FosterLogo.png"))); // NOI18N
        HomePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePageMouseClicked(evt);
            }
        });
        jPanel1.add(HomePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 113));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 116, -1, -1));
        jPanel1.add(Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 600));

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

    private void previousMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMousePressed
        // TODO add your handling code here:
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrontDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.Slider.getX();
        if(p>-1)
        {
            Animacion.Animacion.mover_izquierda(1540, 0, 1, 2, Slider);
        }
        position=position-1;
        if(position<0)
        {
            position = 0;
        }
        show(position);
    }//GEN-LAST:event_previousMousePressed

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
        // TODO add your handling code here:
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrontDisplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p = this.Slider.getX();
        if(p>-1)
        {
            Animacion.Animacion.mover_izquierda(1540, 0, 1, 2, Slider);
        }
        position=position+1;
        if(position>=takeImage().length)
        {
            position = takeImage().length-1;
        }
        show(position);
    }//GEN-LAST:event_nextMousePressed

    private void HomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageMouseClicked
        // TODO add your handling code here:
        dispose();
        AccessedFrontDisplay afd = new AccessedFrontDisplay();
        afd.setVisible(true);
    }//GEN-LAST:event_HomePageMouseClicked

    private void AdoptMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdoptMousePressed
        // TODO add your handling code here:
        dispose();
        DisplayAnimal da = new DisplayAnimal();
        da.setVisible(true);
    }//GEN-LAST:event_AdoptMousePressed

    private void OurTeamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OurTeamMouseClicked
        // TODO add your handling code here:
        dispose();
        OurTeam ot = new OurTeam();
        ot.setVisible(true);
    }//GEN-LAST:event_OurTeamMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        // TODO add your handling code here:
        dispose();
        AccessedHelp ah = new AccessedHelp();
        ah.setVisible(true);
    }//GEN-LAST:event_helpMouseClicked

    private void StopAbuseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopAbuseMousePressed
        // TODO add your handling code here:
        dispose();
        StopAbuse sa = new StopAbuse();
        sa.setVisible(true);
    }//GEN-LAST:event_StopAbuseMousePressed

    private void eventsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventsMouseClicked
        // TODO add your handling code here:
        dispose();
        EventUser sa = new EventUser();
        sa.setVisible(true);
    }//GEN-LAST:event_eventsMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Email sa = new Email();
        sa.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void HealthCareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealthCareMouseClicked
        // TODO add your handling code here:
        dispose();
        HealthCare hc = new HealthCare();
        hc.setVisible(true);
    }//GEN-LAST:event_HealthCareMouseClicked

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
            java.util.logging.Logger.getLogger(AccessedFrontDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessedFrontDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessedFrontDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessedFrontDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccessedFrontDisplay().setVisible(true);
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
    private javax.swing.JLabel OurTeam;
    private javax.swing.JLabel Slider;
    private javax.swing.JLabel StopAbuse;
    private javax.swing.JLabel events;
    private javax.swing.JLabel help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel next;
    private javax.swing.JLabel previous;
    // End of variables declaration//GEN-END:variables
}
