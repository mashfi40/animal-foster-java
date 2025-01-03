/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalfoster;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class AbusedFunction {
    public static boolean flag = false;
    public static void insertIntoAbused(String name, String contact, String animal, String address, String url, String imagePath){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abuse", "root", "root");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO reports(NameofReporter, Contact, AbusedAnimal , Address, URL , Image) VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, name);
            ps.setString(2, contact);
            ps.setString(3, animal);
            ps.setString(4, address);
            ps.setString(5, url);
            ps.setString(6, imagePath);
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Entry successful!");
            
        } catch (SQLException ex) {
            Logger.getLogger(AbusedFunction.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    /*public static void updateAbused(String breed, String gender, int qty){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catlist", "root", "root");
            
            PreparedStatement ps = con.prepareStatement("UPDATE cat SET Quantity=? WHERE Breed=? AND Gender=?");
            
            ps.setInt(1, qty);
            ps.setString(2, breed);
            ps.setString(3, gender);
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else if(ps.executeUpdate()==1 && flag){
                JOptionPane.showMessageDialog(null, "Stock updated successfully!");
                flag = false;
            }

        } 
        catch (SQLException ex) {
            Logger.getLogger(CatFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    public static ArrayList<Abused> TableGenerator(){
        ArrayList<Abused> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abuse", "root", "root");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT *  FROM reports");
            
            Abused pl;
            
            while(rs.next()){
                pl = new Abused(rs.getString("NameofReporter"),rs.getString("Contact"),rs.getString("AbusedAnimal"),rs.getString("Address"),rs.getString("URL"),rs.getString("Image"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AbusedFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
    
   public static ArrayList<Abused> homePageContent(){
        ArrayList<Abused> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abuse", "root", "root");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM reports ");
            
            Abused pl;
            
            while(rs.next()){
                
                pl = new Abused(rs.getString("NameofReporter"),rs.getString("Contact"),rs.getString("AbusedAnimal"),rs.getString("Address"),rs.getString("URL"),rs.getString("Image"));
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AbusedFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
   /*public static ArrayList<Abused> checkStock(){
        ArrayList<Abused> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abuse", "root", "root");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT id, name, listing,quantity,cost  FROM reports");
            
            Abused pl;
            
            while(rs.next()){
                pl = new Abused(rs.getString("ID"),rs.getString("Breed"),rs.getString("Gender"),rs.getInt("Quantity"),rs.getString("DateofArrival"), null);
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CatFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }*/
    
   public static void delete(String name){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abuse", "root", "root");
            PreparedStatement ps = con.prepareStatement("DELETE FROM reports WHERE NameofReporter=?");
            ps.setString(1,name );
            //ps.setString(2,gender );
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else
                JOptionPane.showMessageDialog(null, "Entry deleted successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(CatFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   }
}
