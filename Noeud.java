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
public class Noeud {
    protected int identificateur;
    protected double px;
    protected double py;
    protected Vecteur2D force;
    protected Noeud noeud;
    
    
    public int getIdentificateur(){
        return this.identificateur;
    }
    public void setIdentificateur(int val){
        this.identificateur=val;
    }
    public double getPx(){
        return this.px;
    }
    public double getPy(){
        return this.py;
    }
    public void setPx(double px){
        this.px=px;
    }
    public void setPy(double py){
        this.py=py;
    }
    public Vecteur2D getForce(){
        return this.force;
    }
    public void setForce(Vecteur2D force){
        this.force=force;
    }
}
