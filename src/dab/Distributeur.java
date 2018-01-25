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
public class Distributeur implements Gestionnaire {

    Gestionnaire gestionnaireSuivant;
    int valeurBillet;

    public Distributeur(int valeurBillet) {
        this.valeurBillet = valeurBillet;
    }

    @Override
    public Gestionnaire setSuivant(Gestionnaire gestionnaireSuivant) {
        this.gestionnaireSuivant = gestionnaireSuivant;
        return this.gestionnaireSuivant;
    }

    @Override
    public void distribuer(Monnaie monnaie) {
        if (monnaie.getMontant() >= valeurBillet) {
            int num = monnaie.getMontant() / valeurBillet;
            int remainder = monnaie.getMontant() % valeurBillet;
            System.out.println("Distribution de " + num + " billet(s)/pièce(s) de " + valeurBillet + "€");
            if (remainder != 0) {
                gestionnaireSuivant.distribuer(new Monnaie(remainder));
            }

        } else {
            gestionnaireSuivant.distribuer(monnaie);
        }
    }
}
