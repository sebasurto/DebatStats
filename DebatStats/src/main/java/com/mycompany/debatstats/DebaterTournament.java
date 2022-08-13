/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.debatstats;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author User
 */
class DebaterTournament{
    public LinkedList <Round> rounds;
    public String name;
    public String teamName;
    public Debater partner;
    public int points;
    public double prodSP; // promedioSP
    public double ds; //desviacion standar

    public DebaterTournament(LinkedList<Round> rounds, String name, String teamName) {
        this.rounds = rounds;
        this.name = name;
        this.teamName = teamName;
        this.points = calculeTotalPoints();
    }

    public LinkedList<Round> getRounds() {
        return rounds;
    }

    public void setRounds(LinkedList<Round> rounds) {
        this.rounds = rounds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Debater getPartner() {
        return partner;
    }

    public void setPartner(Debater partner) {
        this.partner = partner;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getProdSP() {
        return prodSP;
    }

    public void setProdSP(double prodSP) {
        this.prodSP = prodSP;
    }

    public double getDs() {
        return ds;
    }

    public void setDs(double ds) {
        this.ds = ds;
    }
    
    
    private int calculeTotalPoints (){
        int cont =0;
        for (Round i : this.rounds)
            cont = i.getPoints()+cont;
        return cont;
    }
    private DecimalFormat calculePromSP (){
        double prom = 0;
        double sum =0;
        int cont =0;
        for (Round i : this.rounds){
            sum = i.getSp()+sum;
            cont++;
        }
        prom = sum/cont;
        return numFormated(prom);
    }
    private double calculeDS (){
        double sptemp = 0;
        
        return sptemp;
    }
    public DecimalFormat numFormated (double num){
        DecimalFormat formato = new DecimalFormat("#.00");
        System.out.println(formato.format(num)); 
        return formato;
    }
}
