package org.ermix.ex7;

public class Produit implements Vendable {

    private double prixBase;

    public Produit(double prixBase) {
        this.prixBase = prixBase;
    }


    @Override
    public double calculePrix() {
        return prixBase;
    }
}
