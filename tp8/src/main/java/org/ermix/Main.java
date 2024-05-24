package org.ermix;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("--------------------------------------------------");

        Personnel p = new Personnel("Jean", 30, "Directeur");
        System.out.println(p.description());
        p.saluer();


        System.out.println("--------------------------------------------------");

        Etudiant e = new Etudiant("Paul", 20, "Informatique");
        System.out.println(e.description());
        e.saluer();

    }
}