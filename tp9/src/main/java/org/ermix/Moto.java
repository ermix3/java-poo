package org.ermix;

public class Moto extends Vehicule {
    private int cylindree;

    public int getCylindree() {
        return cylindree;
    }

    public void setCylindree(int cylindree) {
        this.cylindree = cylindree;
    }

    public Moto(String marque, String modele, int annee, double prixParJour, int cylindree) {
        super(marque, modele, annee, prixParJour);
        this.cylindree = cylindree;

        GestionVehicules.incrementeNombreDeVehicules();
    }

    @Override
    public void afficherDetails() {
        System.out.println("Moto " + getMarque() + " " + getModele() + " de " + getAnnee() + " avec une cylindrée de " + cylindree + " cm3");
    }

}
