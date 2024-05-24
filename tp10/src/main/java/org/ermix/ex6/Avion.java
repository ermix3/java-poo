package org.ermix.ex6;

public class Avion implements Transport {

    private String compagnie;

    public Avion(String compagnie) {
        this.compagnie = compagnie;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    @Override
    public void demarer() {
        System.out.println("L'avion de la compagnie " + compagnie + " démarre.");
    }

    @Override
    public void arreter() {
        System.out.println("L'avion de la compagnie " + compagnie + " s'arrête.");
    }
}
