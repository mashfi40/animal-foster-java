/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalfoster;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Asus
 */
public class Functions {
    public static void addAnimal(String id1,String cat1,String breed1,String gen1,String quan1,String date1,String image1,JFrame frame){
       try{
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/animalarrival", "root", "root");
        String sql="insert into arrival(ID, Category, Breed, Gender, Quantity, DateofArrival, Image) values(?,?,?,?,?,?,?)";
        PreparedStatement ptst=c.prepareStatement(sql);
        ptst.setString(1, id1);
        ptst.setString(2, cat1);
        ptst.setString(3, breed1);
        ptst.setString(4, gen1);
        ptst.setString(5, quan1);
        ptst.setString(6, date1);
        try{    
        InputStream is =new FileInputStream(new File(image1));
        ptst.setBlob(7,is);
        }catch(Exception e){
          JOptionPane.showMessageDialog(frame, "Error image: "+e.getMessage());  
          return;
        }
        try{
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(frame, "Data inserted");
        c.close();
       }catch(Exception e){
           JOptionPane.showMessageDialog(frame, "Error image: "+e.getMessage());
       }
        }
       catch(Exception e){
           JOptionPane.showMessageDialog(frame, "Data Error:"+e.getMessage());
       }       
    }
    
    public static void updateAnimal(String id1,String cat1,String breed1,String gen1,String quan1,String date1,String image1,JFrame frame){
       try{
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/animalarrival", "root", "root");
        String sql="update arrival set Gender=?, Quantity=? where ID=?";
        PreparedStatement ptst=c.prepareStatement(sql);
        ptst.setString(1, gen1);
        ptst.setString(2, quan1);
        ptst.setString(3, id1);
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(frame, "Data updated");
        }
       catch(Exception e){
           JOptionPane.showMessageDialog(frame, "Data Error:"+e.getMessage());
       }        
    }
    
    public static void deleteAnimal(String id1,String cat1,String breed1,String gen1,String quan1,String date1,String image1,JFrame frame){
        try{
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/animalarrival", "root", "root");
        String sql = "delete from arrival where ID=?";
        PreparedStatement ptst = c.prepareStatement(sql);
        ptst.setString(1, id1);
        ptst.executeUpdate();
        JOptionPane.showMessageDialog(frame, "Data deleted");
        c.close();
    }
        catch(SQLException ex){
            Logger.getLogger(ArrivalofAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
