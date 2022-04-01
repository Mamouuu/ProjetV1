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
public class NoeudAppuiDouble extends NoeudAppui{
    //Constructeurs
    NoeudAppuiDouble(int identificateur,double px,double py,Vecteur2D force){
        this.identificateur=identificateur;
        this.px=px;
        this.py=py;
        this.force=force;
    }
    
    NoeudAppuiDouble(double px,double py,Vecteur2D force){
        this.identificateur=-1;
        this.px=px;
        this.py=py;
        this.force=force;
    }
    
    NoeudAppuiDouble(double px,double py){
        this.identificateur=-1;
        this.px=px;
        this.py=py;
        force.setVx(0);
        force.setVy(0);
    }
    
    @Override
    public String toString(){
        return("identificateur: "+this.identificateur+" ,px: "+this.px+" ,py: "+this.py+" et force: "+this.force.toString());
    }
    
}
