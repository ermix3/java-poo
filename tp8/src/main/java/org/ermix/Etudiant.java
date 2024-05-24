package org.ermix;

public class Etudiant extends Personne {
    private final String numeroEtudiant;

    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

    Etudiant(String nom, int age, String numeroEtudiant) {
        super(nom, age);
        this.numeroEtudiant = numeroEtudiant;
    }

    @Override
    public String description() {
        return "Je suis un étudiant:"
                + "\n\tNom: " + nom
                + "\n\tAge: " + age
                + "\n\tNuméro étudiant: " + numeroEtudiant;
    }

    public String etudier() {
        return "J'étudie...";
    }
}
