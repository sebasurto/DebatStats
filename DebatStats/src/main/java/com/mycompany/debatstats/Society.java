/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.debatstats;

import java.util.LinkedList;
import javafx.scene.image.Image;

/**
 *
 * @author User
 */
public class Society {
    public String name;
    public String country;
    public String university;
    public Image  countryFlag;
    public Image societyLogo;
    public LinkedList <Debater> debaters;

    public Society(String name, String country) {
        this.name = name;
        this.country = country;
    }
     public Society() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Image getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(Image countryFlag) {
        this.countryFlag = countryFlag;
    }

    public Image getSocietyLogo() {
        return societyLogo;
    }

    public void setSocietyLogo(Image societyLogo) {
        this.societyLogo = societyLogo;
    }
     
    
}
