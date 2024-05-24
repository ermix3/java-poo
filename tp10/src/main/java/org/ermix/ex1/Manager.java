package org.ermix.ex1;

public class Manager extends Personne {

    private int nombreDeProjets;

    public Manager(String nom, int age, int nombreDeProjets) {
        super(nom, age);
        this.nombreDeProjets = nombreDeProjets;
    }

    public void setNombreDeProjets(int nombreDeProjets) {
        this.nombreDeProjets = nombreDeProjets;
    }

    public int getNombreDeProjets() {
        return nombreDeProjets;
    }

    @Override
    public void description() {
        System.out.println("Je suis un manager, je gère " + nombreDeProjets + " projets.");
    }
}
