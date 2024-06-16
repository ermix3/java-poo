package org.ermix.ex1;

public class Cheval {
    private String nom;
    private String couleur;
    private int anneeNaissance;

    public String getNom() {
        return nom;
    }

    public String getCouleur(){
        return couleur;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setNom(String value) {
        nom = value;
    }

    public void setCouleur(String value) {
        couleur = value;
    }

    public void setAnnneeNaissance(int value) {
        anneeNaissance = value;
    }
}
