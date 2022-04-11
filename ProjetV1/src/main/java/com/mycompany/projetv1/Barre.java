/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.doucet.tp1;

/**
 *
 * @author cquesne01
 */
public class Barre {
    //donc la si je rajoute un comm ça marche 
    //Variables
    
    int identificateur;
    int noeudDepart;
    int noeudArrivee;
    double Tmax;
    double Cmax;
    double cout;
    
    // constructeur
    
    Barre(int identificateur, int noeudDepart, int noeudArrivee, 
            double Tmax, double Cmax, double cout){
        this.identificateur=identificateur;
        this.noeudDepart=noeudDepart;
        this.noeudArrivee=noeudArrivee;
        this.Tmax=Tmax;
        this.Cmax=Cmax;
        this.cout=cout;
    }
    
    Barre(int identificateur, int noeudDepart, int noeudArrivee, double cout){
        this.identificateur=identificateur;
        this.noeudDepart=noeudDepart;
        this.noeudArrivee=noeudArrivee;
        this.cout=cout;
    }
    
    // Get et Set
    
    public int getIdentificateur (){
        return this.identificateur;
    }
    
    public void setIdentificateur (int identificateur){
        this.identificateur=identificateur;
    } 
    
    public int getNoeudDepart (){
        return this.noeudDepart;
    }
    
    public void setNoeudDepart (int noeudDepart){
        this.noeudDepart=noeudDepart;
    }
    
    public int getNoeudArrivee (){
        return this.noeudArrivee;
    }
    
    public void setNoeudArrivee (int noeudArrivee){
        this.noeudArrivee=noeudArrivee;
    }
    
    public double getTmax (){
        return this.Tmax;
    }
    
    public void setTmax (double Tmax){
        this.Tmax=Tmax;
    }
    
    public double getCmax (){
        return this.Cmax;
    }
    
    public void setCmax (double Cmax){
        this.Cmax=Cmax;
    }
    
}
