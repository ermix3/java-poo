package org.ermix;

public abstract class Vehicule {
    private String marque;
    private String modele;
    private int annee;
    private double prixParJour;

    public Vehicule(String marque, String modele, int annee, double prixParJour) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.prixParJour = prixParJour;
    }

    public abstract void afficherDetails();

    public double calculerCoutLocation(int jours) {
        return jours * prixParJour;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(double prixParJour) {
        this.prixParJour = prixParJour;
    }
}
