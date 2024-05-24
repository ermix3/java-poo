package org.ermix;
import java.util.Objects;


public class Personnel extends Personne {
    private final String poste;

    public Personnel(String nom, int age, String poste) {
        super(nom, age);
        this.nom = nom;
        this.age = age;
        this.poste = poste;
    }

    public String getPoste() {
        return poste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return age == personnel.age &&
                Objects.equals(nom, personnel.nom) &&
                Objects.equals(poste, personnel.poste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, age, poste);
    }

    @Override
    public String description() {
        return "Je suis un personnel:"
                + "\n\tNom: " + nom
                + "\n\tAge: " + age
                + "\n\tPoste: " + poste;
    }
}
