package org.ermix.ex1;

public class Employe extends Personne {
    private int numeroEmploye;

    public Employe(String nom, int age, int numeroEmploye) {
        super(nom, age);
        this.numeroEmploye = numeroEmploye;
    }

    @Override
    public void description() {
        System.out.println("Je suis un employé, mon numéro est " + numeroEmploye + ".");
    }
}
