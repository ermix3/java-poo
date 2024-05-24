package org.ermix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start the program...");

        System.out.println("Nombre de véhicules avant l'instantiation : " + GestionVehicules.nombreDeVehicules);

        Voiture voiture = new Voiture("Peugeot", "208", 2017, 50, 5, "essence");
        Moto moto = new Moto("Yamaha", "MT-07", 2018, 30, 689);

        System.out.println("Nombre de véhicules  : " + GestionVehicules.nombreDeVehicules);

        System.out.println("-------------------- Test de la méthode afficherDetails *** Voiture ***  --------------------");
        voiture.afficherDetails();

        System.out.println("-------------------- Test de la méthode afficherDetails *** Moto ***  --------------------");
        moto.afficherDetails();

        System.out.println("-------------------- Test de la méthode calculerCoutLocation --------------------");
        System.out.println("Le coût de location de la voiture pour 3 jours est de " + voiture.calculerCoutLocation(3) + " euros");

    }
}