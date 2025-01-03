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
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class AddCategory extends javax.swing.JFrame {

    /**
     * Creates new form AddCategory1
     */
    public AddCategory() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cat = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        idno = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        view = new javax.swing.JButton();
        Minimize = new javax.swing.JLabel();
        GetInvolved = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Users = new javax.swing.JLabel();
        addCategory = new javax.swing.JLabel();
        arrival = new javax.swing.JLabel();
        HomePage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Category");

        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(153, 0, 0));
        add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.setBorderPainted(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("List of Category");

        table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID No.", "Category", "Types"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(40);
        jScrollPane1.setViewportView(table);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("ID No.");

        delete.setBackground(new java.awt.Color(153, 0, 0));
        delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setBorderPainted(false);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setFocusPainted(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Types");

        view.setBackground(new java.awt.Color(153, 0, 0));
        view.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("View");
        view.setBorderPainted(false);
        view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view.setFocusPainted(false);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(delete)
                        .addGap(116, 116, 116)
                        .addComponent(view)
                        .addGap(190, 190, 190))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idno, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 860, 540));

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
        jPanel1.add(GetInvolved, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

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

        Users.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Users.setForeground(new java.awt.Color(255, 255, 255));
        Users.setText("Users");
        Users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsersMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsersMousePressed(evt);
            }
        });
        jPanel1.add(Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 30, -1, -1));

        addCategory.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addCategory.setForeground(new java.awt.Color(204, 0, 0));
        addCategory.setText("Category");
        addCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCategoryMouseClicked(evt);
            }
        });
        jPanel1.add(addCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, -1, -1));

        arrival.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        arrival.setForeground(new java.awt.Color(255, 255, 255));
        arrival.setText("Arrival of Animal");
        arrival.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arrival.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrivalMouseClicked(evt);
            }
        });
        jPanel1.add(arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 200, 30));

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

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseClicked
        // TODO add your handling code here:
        dispose();
        UserList ul = new UserList();
        ul.setVisible(true);
    }//GEN-LAST:event_UsersMouseClicked

    private void UsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_UsersMouseEntered

    private void UsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsersMousePressed

    private void addCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCategoryMouseClicked
        // TODO add your handling code here:
        dispose();
        AddCategory ac = new AddCategory();
        ac.setVisible(true);
    }//GEN-LAST:event_addCategoryMouseClicked

    private void arrivalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrivalMouseClicked
        // TODO add your handling code here:
        dispose();
        ArrivalofAnimal aa = new ArrivalofAnimal();
        aa.setVisible(true);
    }//GEN-LAST:event_arrivalMouseClicked

    private void HomePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePageMouseClicked
        // TODO add your handling code here:
        dispose();
        ArrivalofAnimal aa = new ArrivalofAnimal();
        aa.setVisible(true);
    }//GEN-LAST:event_HomePageMouseClicked

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try{
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/addcategory", "root", "root");
        String sql = "insert into category(ID, Category, Types) values (?,?,?)";
        PreparedStatement ptst = c.prepareStatement(sql);
        ptst.setString(1, idno.getText());
        ptst.setString(2, cat.getText());
        ptst.setString(3, type.getText());
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data inserted");
        c.close();
    }
        catch(SQLException ex){
            Logger.getLogger(AddCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        try{
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/addcategory", "root", "root");
        String sql = "select * from category";
        PreparedStatement ptst = c.prepareStatement(sql);
        ResultSet rs = ptst.executeQuery();
        
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);        
        while(rs.next()){
            model.addRow(new String[] {rs.getString(1),rs.getString(2),rs.getString(3)});
        }
        
        JOptionPane.showMessageDialog(this, "Data viewed");
        c.close();
    }
        catch(SQLException ex){
            Logger.getLogger(AddCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/addcategory", "root", "root");
        String sql = "delete from category where ID=?";
        PreparedStatement ptst = c.prepareStatement(sql);
        ptst.setString(1, idno.getText());
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data deleted");
        c.close();
    }
        catch(SQLException ex){
            Logger.getLogger(AddCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(AddCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel GetInvolved;
    private javax.swing.JLabel HomePage;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Users;
    private javax.swing.JButton add;
    private javax.swing.JLabel addCategory;
    private javax.swing.JLabel arrival;
    private javax.swing.JTextField cat;
    private javax.swing.JButton delete;
    private javax.swing.JTextField idno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField type;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
