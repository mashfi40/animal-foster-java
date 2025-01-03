/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalfoster;

/**
 *
 * @author Asus
 */
public class Information {
    private String id;
    private String breed;
    private String gender;
    private int qty;
    private String date;
    private String mimage;

    public Information(String id, String breed, String gender, int qty, String date, String image) {
        this.id = id;
        this.breed = breed;
        this.gender = gender;
        this.qty = qty;
        this.date = date;
        this.mimage = image;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getQuantity() {
        return qty;
    }

    public void setQuantity(int qty) {
        this.qty = qty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMimage() {
        //return new ImageIcon(new ImageIcon(mimage).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        return mimage;
    }

    public void setMimage(String mimage) {
        this.mimage = mimage;
    }    
}
