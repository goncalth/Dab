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
public interface Gestionnaire {
    
    public Gestionnaire setSuivant(Gestionnaire gestionnaireSuivant);
    
    public void distribuer(Monnaie monnaie);
    
}
