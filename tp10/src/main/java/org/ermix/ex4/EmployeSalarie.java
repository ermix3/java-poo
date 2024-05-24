package org.ermix.ex4;

public class EmployeSalarie implements Payable {
    private double salaireMensuel;

    public EmployeSalarie(double salaireMensuel) {
        this.salaireMensuel = salaireMensuel;
    }


    @Override
    public double calculerSalaire() {
        return salaireMensuel;
    }
}
