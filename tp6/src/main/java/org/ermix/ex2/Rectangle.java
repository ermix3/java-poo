package org.ermix.ex2;

public class Rectangle {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double aire() {
        return longueur * largeur;
    }

    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    public boolean estCarre() {
        return longueur == largeur;
    }

    public void afficherRectangle() {
        System.out.println("Longueur: " + longueur + "- Largeur: " + largeur + "- Périmètre: " + perimetre() + "- Aire: " + aire() + (estCarre() ? " - Il s’agit d’un carré" : "Il ne s’agit pas d’un carré"));
    }
}
