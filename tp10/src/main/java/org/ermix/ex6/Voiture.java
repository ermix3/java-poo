package org.ermix.ex6;

public class Voiture implements Transport {

    private String marque;

    public Voiture(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public void demarer() {
        System.out.println("La voiture de marque " + marque + " démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture de marque " + marque + " s'arrête.");
    }
}
