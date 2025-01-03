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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class Search {
    static int cat = 0;
    static int dog = 0;
    static int bird = 0;
    public static ArrayList<Information> catSearch(String model){
        ArrayList<Information> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catlist", "root", "root");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM cat WHERE Breed=? ");
            ps.setString(1, model);
            
            ResultSet rs = ps.executeQuery();
            
            Information pl, gl, kl=null;
            
            while(rs.next()){
                pl = new Information(rs.getString("ID"),rs.getString("Breed"),rs.getString("Gender"),rs.getInt("Quantity"),rs.getString("DateofArrival"), rs.getString("Image"));
                cat++;
                
                list.add(pl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doglist", "root", "root");
            ps = con.prepareStatement("SELECT * FROM dog WHERE Breed=? ");
            ps.setString(1, model);
            
            rs = ps.executeQuery();

            
            while(rs.next()){
                gl = new Information(rs.getString("ID"),rs.getString("Breed"),rs.getString("Gender"),rs.getInt("Quantity"),rs.getString("DateofArrival"), rs.getString("Image"));
                
                dog++;
                list.add(gl);

            }
            con.close();
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/birdlist", "root", "root");
            ps = con.prepareStatement("SELECT * FROM bird WHERE Breed=? ");
            ps.setString(1, model);
            
            rs = ps.executeQuery();

            
            while(rs.next()){
                kl = new Information(rs.getString("ID"),rs.getString("Breed"),rs.getString("Gender"),rs.getInt("Quantity"),rs.getString("DateofArrival"),rs.getString("Image"));
               
                bird++;
                list.add(kl);

            }
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
   }
}
