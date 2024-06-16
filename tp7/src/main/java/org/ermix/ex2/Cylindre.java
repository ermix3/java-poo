package org.ermix.ex2;

public class Cylindre extends Disque {
    private double hauteur;
    private double volume;

    public Cylindre(double rayon, double hauteur) {
        super(rayon);
        setHauteur(hauteur);
    }

    public double getHauteur() {
        return hauteur;
    }

    public double getVolume() {
        return volume;
    }

    public void setRayon(double value) {
        setRayon(value);
        volume = getsurface() * hauteur;
    }

    public void setHauteur(double value) {
        hauteur = value;
        volume = getsurface() * hauteur;
    }
}
