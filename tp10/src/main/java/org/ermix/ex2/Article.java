package org.ermix.ex2;

public class Article {
    private String reference;
    private String designation;
    private double prixHT;
    private double tauxTVA;

    public Article(String reference, String designation, double prixHT, double tauxTVA) {
        this.reference = reference;
        this.designation = designation;
        this.prixHT = prixHT;
        this.tauxTVA = tauxTVA;
    }

    public Article(Article article){
        this.reference = article.reference;
        this.designation = article.designation;
        this.prixHT = article.prixHT;
        this.tauxTVA = article.tauxTVA;
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

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public double calculerPrixTTC(){
        return prixHT * (1 + tauxTVA / 100);
    }

    public void afficherArticle(){
        System.out.println("Référence : " + reference);
        System.out.println("Désignation : " + designation);
        System.out.println("Prix HT : " + prixHT);
        System.out.println("Taux TVA : " + tauxTVA);
    }
}
