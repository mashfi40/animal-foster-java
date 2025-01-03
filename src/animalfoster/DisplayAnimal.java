/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package animalfoster;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Asus
 */
public class DisplayAnimal extends javax.swing.JFrame {

    /**
     * Creates new form DisplayAnimal
     */
    static Object[] data = new Object[4];   
    static int total = 0;
    static String tot = "";
    static boolean signInStatus = false;
    static int wrongPass = 0;
    
    public DisplayAnimal() {
        initComponents();
        
        //Adding last three entries from every categories in home
        
        ArrayList<Information> list = CatFunction.homePageContent();
        
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/CatImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = DogFunction.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/DogImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = BirdFunction.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/BirdImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
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
        cardParentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        homeTable = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        catPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        cartPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartItemTable = new javax.swing.JTable();
        adoptButton = new javax.swing.JButton();
        dogPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dogTable = new javax.swing.JTable();
        birdPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        birdTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        bird = new javax.swing.JButton();
        newarrival = new javax.swing.JButton();
        cat = new javax.swing.JButton();
        dog = new javax.swing.JButton();
        HealthCare = new javax.swing.JLabel();
        events = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Adopt = new javax.swing.JLabel();
        StopAbuse = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        GetInvolved = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        help = new javax.swing.JLabel();
        OurTeam = new javax.swing.JLabel();
        HomePage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cardParentPanel.setLayout(new java.awt.CardLayout());

        homeTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        homeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Breed", "Gender", "Quantity", "Date of Arrival", "Image"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        homeTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeTable.setGridColor(new java.awt.Color(255, 255, 255));
        homeTable.setSelectionBackground(new java.awt.Color(153, 0, 0));
        homeTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        homeTable.setShowGrid(false);
        homeTable.getTableHeader().setReorderingAllowed(false);
        homeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(homeTable);

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(homePanel, "card5");

        searchTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Breed", "Gender", "Quantity", "Date of Arrival", "Image"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        searchTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchTable.setSelectionBackground(new java.awt.Color(153, 0, 0));
        searchTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        searchTable.getTableHeader().setReorderingAllowed(false);
        searchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(searchTable);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(searchPanel, "card9");

        catTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Breed", "Gender", "Quantity", "Date of Arrival", "Image"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        catTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catTable.setSelectionBackground(new java.awt.Color(153, 0, 0));
        catTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        catTable.getTableHeader().setReorderingAllowed(false);
        catTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(catTable);

        javax.swing.GroupLayout catPanelLayout = new javax.swing.GroupLayout(catPanel);
        catPanel.setLayout(catPanelLayout);
        catPanelLayout.setHorizontalGroup(
            catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        catPanelLayout.setVerticalGroup(
            catPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(catPanel, "card4");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        cartItemTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cartItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Breed", "Gender", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartItemTable.setEnabled(false);
        cartItemTable.setGridColor(new java.awt.Color(255, 255, 255));
        cartItemTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        cartItemTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(cartItemTable);

        adoptButton.setBackground(new java.awt.Color(153, 0, 0));
        adoptButton.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        adoptButton.setForeground(new java.awt.Color(255, 255, 255));
        adoptButton.setText("Adopt");
        adoptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adoptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(622, 1198, Short.MAX_VALUE)
                .addComponent(adoptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(adoptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout cartPanelLayout = new javax.swing.GroupLayout(cartPanel);
        cartPanel.setLayout(cartPanelLayout);
        cartPanelLayout.setHorizontalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cartPanelLayout.setVerticalGroup(
            cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(cartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cartPanelLayout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 48, Short.MAX_VALUE)))
        );

        cardParentPanel.add(cartPanel, "card8");

        dogTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        dogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Breed", "Gender", "Quantity", "Date of Arrival", "Image"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        dogTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dogTable.setSelectionBackground(new java.awt.Color(153, 0, 0));
        dogTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        dogTable.getTableHeader().setReorderingAllowed(false);
        dogTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dogTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dogTable);

        javax.swing.GroupLayout dogPanelLayout = new javax.swing.GroupLayout(dogPanel);
        dogPanel.setLayout(dogPanelLayout);
        dogPanelLayout.setHorizontalGroup(
            dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        dogPanelLayout.setVerticalGroup(
            dogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(dogPanel, "card3");

        birdTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        birdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Breed", "Gender", "Quantity", "Date of Arrival", "Image"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.Integer.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        birdTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        birdTable.setSelectionBackground(new java.awt.Color(153, 0, 0));
        birdTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        birdTable.getTableHeader().setReorderingAllowed(false);
        birdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birdTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(birdTable);

        javax.swing.GroupLayout birdPanelLayout = new javax.swing.GroupLayout(birdPanel);
        birdPanel.setLayout(birdPanelLayout);
        birdPanelLayout.setHorizontalGroup(
            birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        birdPanelLayout.setVerticalGroup(
            birdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(birdPanel, "card2");

        jPanel1.add(cardParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1350, 590));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        bird.setBackground(new java.awt.Color(153, 0, 0));
        bird.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bird.setForeground(new java.awt.Color(255, 255, 255));
        bird.setText("Bird");
        bird.setToolTipText("See our arrivals");
        bird.setBorderPainted(false);
        bird.setContentAreaFilled(false);
        bird.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bird.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                birdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                birdMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                birdMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                birdMouseReleased(evt);
            }
        });
        bird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birdActionPerformed(evt);
            }
        });

        newarrival.setBackground(new java.awt.Color(153, 0, 0));
        newarrival.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        newarrival.setForeground(new java.awt.Color(255, 255, 255));
        newarrival.setText("New Arrival");
        newarrival.setToolTipText("See our arrivals");
        newarrival.setBorderPainted(false);
        newarrival.setContentAreaFilled(false);
        newarrival.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newarrival.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newarrivalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newarrivalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newarrivalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newarrivalMouseReleased(evt);
            }
        });
        newarrival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newarrivalActionPerformed(evt);
            }
        });

        cat.setBackground(new java.awt.Color(153, 0, 0));
        cat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cat.setForeground(new java.awt.Color(255, 255, 255));
        cat.setText("Cat");
        cat.setToolTipText("See our arrivals");
        cat.setBorderPainted(false);
        cat.setContentAreaFilled(false);
        cat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                catMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                catMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                catMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                catMouseReleased(evt);
            }
        });
        cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catActionPerformed(evt);
            }
        });

        dog.setBackground(new java.awt.Color(153, 0, 0));
        dog.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dog.setForeground(new java.awt.Color(255, 255, 255));
        dog.setText("Dog");
        dog.setToolTipText("See our arrivals");
        dog.setBorderPainted(false);
        dog.setContentAreaFilled(false);
        dog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dogMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dogMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dogMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dogMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dogMouseReleased(evt);
            }
        });
        dog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(newarrival)
                .addGap(156, 156, 156)
                .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178)
                .addComponent(dog, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(bird, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bird, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newarrival, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bird.getAccessibleContext().setAccessibleDescription("See or arrivals");

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1350, 60));

        HealthCare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/HealthCare.png"))); // NOI18N
        HealthCare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HealthCare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HealthCareMousePressed(evt);
            }
        });
        jPanel1.add(HealthCare, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 610, 130, 130));

        events.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        events.setForeground(new java.awt.Color(255, 255, 255));
        events.setText("Keep up with our EVENTS . . .");
        events.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        events.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventsMouseClicked(evt);
            }
        });
        jPanel1.add(events, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 250, -1));

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/search.png"))); // NOI18N
        search.setBorderPainted(false);
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.setFocusPainted(false);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 40, 40));

        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
        });
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 112, 270, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/add_friend_people_icon.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 110, 60, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Adoption List");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 130, 160, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 40));

        Adopt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/AdoptLogo.png"))); // NOI18N
        Adopt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Adopt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdoptMousePressed(evt);
            }
        });
        jPanel1.add(Adopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 400, 130, 130));

        StopAbuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalfoster/StopAbuse.png"))); // NOI18N
        StopAbuse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StopAbuse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StopAbuseMousePressed(evt);
            }
        });
        jPanel1.add(StopAbuse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 170, 130, 130));

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

    private void OurTeamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OurTeamMouseClicked
        // TODO add your handling code here:
        dispose();
        OurTeam ot = new OurTeam();
        ot.setVisible(true);
    }//GEN-LAST:event_OurTeamMouseClicked

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

    private void HealthCareMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealthCareMousePressed
        // TODO add your handling code here:
        dispose();
        HealthCare hc = new HealthCare();
        hc.setVisible(true);
    }//GEN-LAST:event_HealthCareMousePressed

    private void birdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_birdMouseEntered

    private void birdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_birdMouseExited

    private void birdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_birdMousePressed

    private void birdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_birdMouseReleased

    private void birdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birdActionPerformed
        // TODO add your handling code here:
        AddtoAdoption.categoryChooser = "Bird";
        ArrayList<Information> list = BirdFunction.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) birdTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        birdTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        birdTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        birdTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        birdTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        birdTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/BirdImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            birdTable.setRowHeight(150);
            birdTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_birdActionPerformed

    private void newarrivalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_newarrivalMouseEntered

    private void newarrivalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_newarrivalMouseExited

    private void newarrivalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_newarrivalMousePressed

    private void newarrivalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newarrivalMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_newarrivalMouseReleased

    private void newarrivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newarrivalActionPerformed
       cardParentPanel.removeAll();
        cardParentPanel.add(homePanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        //Adding last three entries from every categories in home
        
        ArrayList<Information> list = CatFunction.homePageContent();
        
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) homeTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/CatImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = DogFunction.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/DogImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        list.clear();
        
        list = BirdFunction.homePageContent();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        homeTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        homeTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/BirdImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            homeTable.setRowHeight(150);
            homeTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
    }//GEN-LAST:event_newarrivalActionPerformed

    private void catMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_catMouseEntered

    private void catMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_catMouseExited

    private void catMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_catMousePressed

    private void catMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_catMouseReleased

    private void catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catActionPerformed
         AddtoAdoption.categoryChooser = "Cat";
        ArrayList<Information> list = CatFunction.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) catTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        catTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        catTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        catTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        catTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        catTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/CatImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            catTable.setRowHeight(150);
            catTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
    }//GEN-LAST:event_catActionPerformed

    private void dogMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dogMouseEntered

    private void dogMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_dogMouseExited

    private void dogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dogMousePressed

    private void dogMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_dogMouseReleased

    private void dogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogActionPerformed
        // TODO add your handling code here:
        AddtoAdoption.categoryChooser = "Dog";
        ArrayList<Information> list = DogFunction.TableGenerator();
        Object rowData[] = new Object[6];
        
        DefaultTableModel model =  (DefaultTableModel) dogTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        dogTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        dogTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        dogTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        dogTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        dogTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/DogImages/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[5] = ii;
            model.addRow(rowData);
            dogTable.setRowHeight(150);
            dogTable.getColumnModel().getColumn(5).setPreferredWidth(150);
        }
        
    }//GEN-LAST:event_dogActionPerformed

    AddtoAdoption pi = new AddtoAdoption();
    
    private void homeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = homeTable.getSelectedRow();

        if(rowIndex<=2)
        AddtoAdoption.categoryChooser = "Cat";
        else if(rowIndex>2 && rowIndex<=5)
        AddtoAdoption.categoryChooser = "Dog";
        else
        AddtoAdoption.categoryChooser = "Bird";
        
        dispose();
        pi.setVisible(true);
        pi.pack();

        int selectedRow = homeTable.getSelectedRow();
        TableModel tm = homeTable.getModel();
        
        String id = tm.getValueAt(selectedRow, 0).toString();
        String breed = tm.getValueAt(selectedRow, 1).toString();
        String gender = tm.getValueAt(selectedRow, 2).toString();
        String quantity = tm.getValueAt(selectedRow, 3).toString();
        String date = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.BreedName.setText(breed);
        pi.Gender.setText(gender);
        pi.productInfoStock.setText(quantity);
        pi.productPhoto.setIcon(img);

    }//GEN-LAST:event_homeTableMouseClicked

    private void searchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = searchTable.getSelectedRow();

        if(Search.cat!=0 && rowIndex<Search.cat)
        AddtoAdoption.categoryChooser = "Cat";
        else if(Search.dog!=0 && rowIndex>=Search.cat && rowIndex<Search.cat+Search.dog)
        AddtoAdoption.categoryChooser = "Dog";
        else
        AddtoAdoption.categoryChooser = "Bird";

        pi.setVisible(true);
        pi.pack();

        int selectedRow = searchTable.getSelectedRow();
        TableModel tm = searchTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String breed = tm.getValueAt(selectedRow, 1).toString();
        String gender = tm.getValueAt(selectedRow, 2).toString();
        String quantity = tm.getValueAt(selectedRow, 3).toString();
        String date = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.BreedName.setText(breed);
        pi.Gender.setText(gender);
        pi.productInfoStock.setText(quantity);
        pi.productPhoto.setIcon(img);

    }//GEN-LAST:event_searchTableMouseClicked

    private void catTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catTableMouseClicked
        // TODO add your handling code here:
        dispose();
        pi.setVisible(true);
        pi.pack();

        int selectedRow = catTable.getSelectedRow();
        TableModel tm = catTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String breed = tm.getValueAt(selectedRow, 1).toString();
        String gender = tm.getValueAt(selectedRow, 2).toString();
        String quantity = tm.getValueAt(selectedRow, 3).toString();
        String date = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.BreedName.setText(breed);
        pi.Gender.setText(gender);
        pi.productInfoStock.setText(quantity);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_catTableMouseClicked

    private void adoptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptButtonActionPerformed
        // TODO add your handling code here:       
        dispose();
        DeliveryAddress a=new DeliveryAddress();
        a.setVisible(true);       
    }//GEN-LAST:event_adoptButtonActionPerformed

    private void dogTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogTableMouseClicked
        // TODO add your handling code here:
        dispose();
        pi.setVisible(true);
        pi.pack();

        int selectedRow = dogTable.getSelectedRow();
        TableModel tm = dogTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String breed = tm.getValueAt(selectedRow, 1).toString();
        String gender = tm.getValueAt(selectedRow, 2).toString();
        String quantity = tm.getValueAt(selectedRow, 3).toString();
        String date = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.BreedName.setText(breed);
        pi.Gender.setText(gender);
        pi.productInfoStock.setText(quantity);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_dogTableMouseClicked

    private void birdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdTableMouseClicked
        // TODO add your handling code here:
        dispose();
        pi.setVisible(true);
        pi.pack();

        int selectedRow = birdTable.getSelectedRow();
        TableModel tm = birdTable.getModel();

        String id = tm.getValueAt(selectedRow, 0).toString();
        String breed = tm.getValueAt(selectedRow, 1).toString();
        String gender = tm.getValueAt(selectedRow, 2).toString();
        String quantity = tm.getValueAt(selectedRow, 3).toString();
        String date = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);

        pi.BreedName.setText(breed);
        pi.Gender.setText(gender);
        pi.productInfoStock.setText(quantity);
        pi.productPhoto.setIcon(img);
    }//GEN-LAST:event_birdTableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        Search.cat=0;
        Search.dog=0;
        Search.bird=0;
        
        ArrayList<Information> list = Search.catSearch(searchBar.getText());
        Object rowData[] = new Object[6];
        int i, j, k;
        
        
        if(searchBar.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Search field empty!");
        else if(Search.cat==0 && Search.dog==0 && Search.bird==0)
            JOptionPane.showMessageDialog(null, "Sorry! Product does not exist!");
        else{
            cardParentPanel.removeAll();
            cardParentPanel.add(searchPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
                    
            DefaultTableModel model =  (DefaultTableModel) searchTable.getModel();
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            searchTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            searchTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );


            model.setRowCount(0);
            for(i=0 ; i<Search.cat; i++){
                rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/CatImages/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            for(k=i; k<Search.cat+Search.dog; k++){
                rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/DogImages/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
            System.out.println();
            for(j=k; j<Search.cat+Search.dog+Search.bird; j++){
                rowData[0] = list.get(i).getID();
            rowData[1] = list.get(i).getBreed();
            rowData[2] = list.get(i).getGender();
            rowData[3] = list.get(i).getQuantity();
            rowData[4] = list.get(i).getDate();
            String temp = list.get(i).getMimage();
                ImageIcon ii = new ImageIcon(getClass().getResource("/BirdImages/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[5] = ii;
                model.addRow(rowData);
                searchTable.setRowHeight(150);
                searchTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            }
        }
                
    }//GEN-LAST:event_searchActionPerformed

    private void catMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(catPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_catMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cardParentPanel.removeAll();
        cardParentPanel.add(cartPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
         DefaultTableModel model =  (DefaultTableModel) cartItemTable.getModel();
         model.setRowCount(0);
         total = 0;
         tot = "";
        
        for(int i=0; i<AddtoAdoption.cartItem.size(); i++){
            data[0] = AddtoAdoption.cartItem.get(i).getBreed();
            data[1] = AddtoAdoption.cartItem.get(i).getGender();
            
            data[2] = AddtoAdoption.cartItem.get(i).getQuantity();
            
            model.addRow(data);
            cartItemTable.setRowHeight(20);
            
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(dogPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_dogMouseClicked

    private void birdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(birdPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_birdMouseClicked

    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseClicked
         // TODO add your handling code here:
         searchBar.setText("");
    }//GEN-LAST:event_searchBarMouseClicked

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
            java.util.logging.Logger.getLogger(DisplayAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                JFrame newMain = new DisplayAnimal();
        newMain.setTitle("Foster Paradise");
        newMain.setVisible(true);
        newMain.setResizable(false);
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
    private javax.swing.JLabel StopAbuse;
    private javax.swing.JButton adoptButton;
    private javax.swing.JButton bird;
    private javax.swing.JPanel birdPanel;
    private javax.swing.JTable birdTable;
    private javax.swing.JPanel cardParentPanel;
    public static javax.swing.JTable cartItemTable;
    private javax.swing.JPanel cartPanel;
    private javax.swing.JButton cat;
    private javax.swing.JPanel catPanel;
    private javax.swing.JTable catTable;
    private javax.swing.JButton dog;
    private javax.swing.JPanel dogPanel;
    private javax.swing.JTable dogTable;
    private javax.swing.JLabel events;
    private javax.swing.JLabel help;
    private javax.swing.JPanel homePanel;
    private javax.swing.JTable homeTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton newarrival;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchBar;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTable searchTable;
    // End of variables declaration//GEN-END:variables
}
