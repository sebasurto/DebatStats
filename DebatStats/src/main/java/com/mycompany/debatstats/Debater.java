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
public class Debater {
   public String name;
   public String society;
   public LinkedList <DebaterTournament> tournaments;
   public Image foto;

    public Debater(String name) {
        this.name = name;
        this.tournaments = new LinkedList<>();
    }
    public Debater() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public LinkedList<DebaterTournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(LinkedList<DebaterTournament> tournaments) {
        this.tournaments = tournaments;
    }
   
}
