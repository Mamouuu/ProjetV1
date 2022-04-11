/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.doucet.tp1;

/**
 *
 * @author bdoucet01
 */
public class Vecteur2D {
    private double vx;
    private double vy;
    
    
    Vecteur2D(){
        this.vx=0;
        this.vy=0;
    }
    public double getVx(){
        return this.vx;
    }
    public double getVy(){
        return this.vy;
    }
    public void setVx(double vx){
        this.vx=vx;
    }
    public void setVy(double vy){
        this.vy=vy;
    }
    
    @Override
    public String toString(){
        return ("vx: "+this.vx+" et vy: "+this.vy);
    }
    
}
