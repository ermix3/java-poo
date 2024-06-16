package org.ermix;

import org.ermix.ex2.Rectangle;
import org.ermix.ex3.Article;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the application...");

        System.out.println("\n---------------- Ex2 -------------------");

        System.out.println("---------------- Création d'un rectangle");
        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.afficherRectangle();

        System.out.println("\n---------------- Ex3 -------------------");

        System.out.println("---------------- Création d'un article");
        Article article = new Article("ADSF-12125", "Article 1", 10);
        article.afficherArticle();
        System.out.println("Prix TTC: " + article.calculerPrixTTC());

    }
}