package org.ermix;

public class GestionVehicules{

    public static int nombreDeVehicules;


    public static void incrementeNombreDeVehicules(){
        nombreDeVehicules++;
    }

    public static void afficherNombreDeVehicules(){
        System.out.println("Nombre de véhicules : " + nombreDeVehicules);
    }
}
