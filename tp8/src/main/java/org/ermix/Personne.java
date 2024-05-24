package org.ermix;

public abstract class Personne {

    protected String nom;
    protected int age;

    Personne(String nom, int age) {
//        if (nom == null || nom.isEmpty()) {
//            throw new IllegalArgumentException("Nom cannot be null or empty");
//        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public abstract String description();

    public void saluer() {
        System.out.println("Bonjour, je m'appelle " + nom);
    }
}
