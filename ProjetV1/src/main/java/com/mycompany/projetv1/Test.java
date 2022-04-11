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
public class Test {

    
    public static void main(String [] args){
        Noeud heyYou=entreeNoeud();
        System.out.println(heyYou +" de nombre d'inconnues : "+ nbrInconnues(heyYou));
    }
    public static Noeud entreeNoeud(){
        Vecteur2D force;
        force=new Vecteur2D();
        Noeud noeudCree;
        int typeNoeud;
        System.out.println("Vous venez de créer un noeud. Quel est sa position en x ?");
        double px=Lire.d();
        System.out.println("Quel est sa position en y ?");
        double py=Lire.d();
        System.out.println("Quel est son identificateur ?");
        int identificateur=Lire.i();
        System.out.println("Quel est vx de sa force ?");
        force.setVx(Lire.d());
        System.out.println("Quel est vy de sa force ?");
        force.setVy(Lire.d());
        System.out.println("Quel est le type de noeud ? (0 pour noeud simple, 1 pour appui simple, 2 pour appui double)");
        typeNoeud=Lire.i();
        if (typeNoeud==0){
            noeudCree=new NoeudSimple(identificateur,px,py,force);
        }else if(typeNoeud==1){
            noeudCree=new NoeudAppuiSimple(identificateur,px,py,force);
        }else if(typeNoeud==2){
            noeudCree=new NoeudAppuiDouble(identificateur,px,py,force);
        }else{  //Gestion d'erreur à supprimer
            noeudCree=new NoeudSimple(0,0);
        }
        return noeudCree;
    }
    
    public static int nbrInconnues(Noeud noeud){
        if (noeud instanceof NoeudSimple){
            return 0;
        }else if (noeud instanceof NoeudAppuiSimple){
            return 1;
        }else if(noeud instanceof NoeudAppuiDouble){
            return 2;
        }else{ //Gestion d'erreur à supprimer
            return 100;
        }
    }
}
