package org.ermix.ex4;

public class EmployeHoraire implements Payable {

    private double tauxHoraire;
    private double heuresTravaillees;

    public EmployeHoraire(double tauxHoraire, double heuresTravaillees) {
        this.tauxHoraire = tauxHoraire;
        this.heuresTravaillees = heuresTravaillees;
    }

    @Override
    public double calculerSalaire() {
        return tauxHoraire * heuresTravaillees;
    }
}
