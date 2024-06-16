package org.ermix.ex3;

public class Article {
    private String reference;
    private String designation;
    private double prixHT;
    private static double tauxTVA;

    public Article() {
    }

    public Article(String reference, String designation) {
        this.reference = reference;
        this.designation = designation;
    }

    public Article(String reference, String designation, double prixHT) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public double calculerPrixTTC() {
        return prixHT * (1 + tauxTVA / 100);
    }

    public void afficherArticle() {
        System.out.println("Référence: " + reference + " - Désignation: " + designation + " - Prix HT: " + prixHT + " - Taux TVA: " + tauxTVA + " - Prix TTC: " + calculerPrixTTC());
    }
}
