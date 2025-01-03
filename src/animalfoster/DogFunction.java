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
public class DogFunction {
    public static boolean flag = false;
    public static void insertIntodogs(String id, String breed, String gender, int qty, String date, String imagePath){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doglist", "root", "root");
         
            PreparedStatement ps = con.prepareStatement("INSERT INTO dog(ID, Breed, Gender , Quantity, DateofArrival , Image) VALUES(?,?,?,?,?,?)");
            
            ps.setString(1, id);
            ps.setString(2, breed);
            ps.setString(3, gender);
            ps.setInt(4, qty);
            ps.setString(5, date);
            ps.setString(6, imagePath);
            if(ps.executeUpdate()==1)
                JOptionPane.showMessageDialog(null, "Entry successful!");
            
        } catch (SQLException ex) {
            Logger.getLogger(DogFunction.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    public static void updatedogs(String breed, String gender, int qty){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doglist", "root", "root");
            
            PreparedStatement ps = con.prepareStatement("UPDATE dog SET Quantity=? WHERE Breed=? AND Gender=?");
            
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
    }
    
    public static ArrayList<Information> TableGenerator(){
        ArrayList<Information> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doglist", "root", "root");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT *  FROM dog");
            
            Information pl;
            
            while(rs.next()){
                pl = new Information(rs.getString("ID"),rs.getString("Breed"),rs.getString("Gender"),rs.getInt("Quantity"),rs.getString("DateofArrival"),rs.getString("Image"));
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DogFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
}
    
   public static ArrayList<Information> homePageContent(){
        ArrayList<Information> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doglist", "root", "root");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM dog");
            
            Information pl;
            
            while(rs.next()){
                
                pl = new Information(rs.getString("ID"),rs.getString("Breed"),rs.getString("Gender"),rs.getInt("Quantity"),rs.getString("DateofArrival"),rs.getString("Image"));
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DogFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
   public static ArrayList<Information> checkStock(){
        ArrayList<Information> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doglist", "root", "root");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT id, name, listing,quantity,cost  FROM dog");
            
            Information pl;
            
            while(rs.next()){
                pl = new Information(rs.getString("ID"),rs.getString("Breed"),rs.getString("Gender"),rs.getInt("Quantity"),rs.getString("DateofArrival"), null);
                
                list.add(pl);

            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DogFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
    
   public static void delete(String breed, String gender){
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doglist", "root", "root");
            PreparedStatement ps = con.prepareStatement("DELETE FROM dog WHERE Breed=? AND Gender=?");
            ps.setString(1,breed );
            ps.setString(2,gender );
            if(ps.executeUpdate()==0)
                JOptionPane.showMessageDialog(null, "Entry does not exist!");
            else
                JOptionPane.showMessageDialog(null, "Entry deleted successfully!");
            
        } catch (SQLException ex) {
            Logger.getLogger(DogFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
            
   }
}
