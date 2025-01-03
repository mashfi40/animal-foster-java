/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animalfoster;

/**
 *
 * @author Asus
 */
public class Abused {
    private String name;
    private String contact;
    private String animal;
    private String address;
    private String url;
    private String mimage;

    public Abused(String name, String contact, String animal, String address, String url, String image) {
        this.name = name;
        this.contact = contact;
        this.animal = animal;
        this.address = address;
        this.url = url;
        this.mimage = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getMimage() {
        //return new ImageIcon(new ImageIcon(mimage).getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        return mimage;
    }

    public void setMimage(String mimage) {
        this.mimage = mimage;
    }    
}
