package org.ermix.ex3;

public class Roman extends Livre {
    private String genre;

    public Roman(String titre, String auteur, String genre) {
        super(titre, auteur);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Titre: " + getTitre() + ", Auteur: " + getAuteur());
    }
}
