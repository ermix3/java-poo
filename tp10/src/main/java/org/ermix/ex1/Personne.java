package org.ermix.ex1;

public abstract class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public abstract void description();

    public void saluer() {
        System.out.println("Bonjour, je m'appelle " + nom + " et j'ai " + age + " ans.");
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
}
