/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animalfoster;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class AnimalFoster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        FrontDisplay fd = new FrontDisplay();
        fd.setVisible(true);
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AnimalFoster.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab", "root", "root");
        
        System.out.println("The connection name is "+ c);
    }
    
}
