package org.ermix.ex5;

public class Cercle implements Forme {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;

        // Mise a jour l'aire et le périmètre
        calculerAire();
        calculerPerimetre();
    }

    @Override
    public double calculerAire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}
