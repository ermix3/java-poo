package org.ermix.ex7;

public class Service implements Vendable {

    private double tauxHoraire;
    private double heuresPrevu;

    public Service(double tauxHoraire, double heuresPrevu) {
        this.tauxHoraire = tauxHoraire;
        this.heuresPrevu = heuresPrevu;
    }


    @Override
    public double calculePrix() {
        return tauxHoraire * heuresPrevu;
    }
}
