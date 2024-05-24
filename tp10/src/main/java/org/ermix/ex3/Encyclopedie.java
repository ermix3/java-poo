package org.ermix.ex3;

public class Encyclopedie extends Livre {

    private int volume;

    public Encyclopedie(String titre, String auteur, int volume) {
        super(titre, auteur);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Titre: " + getTitre() + ", Auteur: " + getAuteur());
    }
}
