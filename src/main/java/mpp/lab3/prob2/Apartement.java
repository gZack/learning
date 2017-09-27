package mpp.lab3.prob2;

public class Apartement {

    private double rent;

    private Building building;

    public Apartement(final double rent, final Building building){
        this.rent = rent;
        this.building = building;
    }

    public double getRent() {
        return rent;
    }
}
