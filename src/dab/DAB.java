/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dab;

/**
 *
 * @author lp
 */
public class DAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gestionnaire distributeur = new Distributeur(50);
        distributeur.setSuivant(new Distributeur(20))
                .setSuivant(new Distributeur(10))
                .setSuivant(new Distributeur(5))
                .setSuivant(new Distributeur(2))
                .setSuivant(new Distributeur(1));
                distributeur.distribuer(new Monnaie(133));
                
        
    }
    
}
