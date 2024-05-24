package org.ermix;

public class Voiture extends Vehicule {
    private int nombreDePortes;
    private String typeDeCarburant;

    public Voiture(String marque, String modele, int annee, double prixParJour, int nombreDePortes, String typeDeCarburant) {
        super(marque, modele, annee, prixParJour);
        this.nombreDePortes = nombreDePortes;
        this.typeDeCarburant = typeDeCarburant;

        GestionVehicules.incrementeNombreDeVehicules();
    }

    @Override
    public void afficherDetails() {
        System.out.println("Voiture " + getMarque() + " " + getModele() + " de " + getAnnee() + " avec " + nombreDePortes + " portes et fonctionnant au " + typeDeCarburant);
    }
}
