package temp.lab3.prob2;

import mpp.mpp.lab3.prob2.Building;

public class Apartement {

    private double rent;

    private mpp.mpp.lab3.prob2.Building building;

    public Apartement(final double rent, final Building building){
        this.rent = rent;
        this.building = building;
    }

    public double getRent() {
        return rent;
    }
}
