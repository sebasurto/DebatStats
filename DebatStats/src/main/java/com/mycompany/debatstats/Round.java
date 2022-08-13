/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.debatstats;

import java.util.LinkedList;

/**
 *
 * @author User
 */
class Round {
  public String roundNum;
  public String camera;
  public int sp;
  public String rol;
  public int points;
  public LinkedList <String> judges;



    public Round(String roundNum, int sp, String rol, int points) {
        this.roundNum = roundNum;
        this.sp = sp;
        this.rol = rol;
        this.points = points;
        this.judges = new LinkedList<>();
    }

    public String getRoundNum() {
        return roundNum;
    }

    public void setRoundNum(String roundNum) {
        this.roundNum = roundNum;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public LinkedList<String> getJudges() {
        return judges;
    }

    public void setJudges(LinkedList<String> judges) {
        this.judges = judges;
    }
    
    
  
}
