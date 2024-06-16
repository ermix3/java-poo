package org.ermix.ex2;

public class Disque {
    private double rayon;
    private double diametre;
    private double surface;

    public Disque(double rayon) {
        setRayon(rayon);
    }

    public double getRayon() {
        return rayon;
    }

    public double getDiametre() {
        return diametre;
    }

    public double getsurface() {
        return surface;
    }

    public void setRayon(double value) {
        rayon = value;
        diametre = 2 * rayon;
        surface = Math.PI * rayon * rayon;
    }
}
