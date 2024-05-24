package org.ermix;

import org.ermix.ex1.Employe;
import org.ermix.ex1.Manager;
import org.ermix.ex1.Personne;
import org.ermix.ex2.Article;
import org.ermix.ex3.Encyclopedie;
import org.ermix.ex3.Livre;
import org.ermix.ex3.Roman;
import org.ermix.ex4.EmployeHoraire;
import org.ermix.ex4.EmployeSalarie;
import org.ermix.ex4.Payable;
import org.ermix.ex5.Cercle;
import org.ermix.ex5.Forme;
import org.ermix.ex5.Rectangle;
import org.ermix.ex6.Avion;
import org.ermix.ex6.Transport;
import org.ermix.ex6.Voiture;
import org.ermix.ex7.Produit;
import org.ermix.ex7.Service;
import org.ermix.ex7.Vendable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the application...");

        System.out.println("---------------- Ex1 -------------------");

        System.out.println("\n---------------- Création d'un employé");
        Personne p1 = new Employe("Alice", 25, 123);
        p1.saluer();
        p1.description();

        System.out.println("\n---------------- Création d'un manager");
        Personne p2 = new Manager("Bob", 30, 5);
        p2.saluer();
        p2.description();

        System.out.println("\n---------------- Ex2 -------------------");

        System.out.println("\n---------------- Création d'un article");
        Article a1 = new Article("AA223DD", "Livre", 10, 5);
        System.out.println("Prix TTC : " + a1.calculerPrixTTC());
        a1.afficherArticle();

        System.out.println("\n---------------- Copie d'un article");
        Article a2 = new Article(a1);
        System.out.println("Prix TTC : " + a2.calculerPrixTTC());
        a2.afficherArticle();

        System.out.println("\n---------------- Ex3 -------------------");

        System.out.println("\n---------------- Création d'un roman");
        Livre l1 = new Roman("titre 1", "auteur 1", "genre 1");
        l1.afficherDetails();

        System.out.println("\n---------------- Création d'une encyclopédie");
        Livre ec1 = new Encyclopedie("titre 2", "auteur 2", 12);
        ec1.afficherDetails();


        System.out.println("\n---------------- Ex4 -------------------");

        System.out.println("\n---------------- Création d'un employé horaire");
        Payable e1 = new EmployeHoraire(10, 40);
        System.out.println("Salaire : " + e1.calculerSalaire() + "€");

        System.out.println("\n---------------- Création d'un employé salarié");
        Payable e2 = new EmployeSalarie(2000);
        System.out.println("Salaire : " + e2.calculerSalaire() + "€");


        System.out.println("\n---------------- Ex5 -------------------");

        System.out.println("\n---------------- Création d'un cercle");
        Forme f1 = new Cercle(5);
        System.out.println("Aire du cercle : " + f1.calculerAire());
        System.out.println("Périmètre du cercle : " + f1.calculerPerimetre());

        System.out.println("\n---------------- Création d'un rectangle");
        Forme f2 = new Rectangle(5, 10);
        System.out.println("Aire du rectangle : " + f2.calculerAire());
        System.out.println("Périmètre du rectangle : " + f2.calculerPerimetre());


        System.out.println("\n---------------- Ex6 -------------------");

        System.out.println("\n---------------- Création d'un voiture");
        Transport t1 = new Voiture("Peugeot");
        t1.demarer();
        t1.arreter();

        System.out.println("\n---------------- Création d'avion");
        Transport t2 = new Avion("Airbus");
        t2.demarer();
        t2.arreter();


        System.out.println("\n---------------- Ex7 -------------------");

        System.out.println("\n---------------- Création d'un produit");
        Vendable v1 = new Produit(100);
        System.out.println("Prix : " + v1.calculePrix() + "€");

        System.out.println("\n---------------- Création d'un service");
        Vendable v2 = new Service(100, 20);
        System.out.println("Prix : " + v2.calculePrix() + "€");

        System.out.println("Ending the application...");
    }
}