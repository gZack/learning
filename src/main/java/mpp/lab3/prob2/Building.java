package temp.lab3.prob2;

import mpp.mpp.lab3.prob2.Apartement;
import mpp.mpp.lab3.prob2.LandLord;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<Apartement> apartements;
    private LandLord landLord;

    private double maintainanceCost;

    public Building(final double maintainanceCost, LandLord landLord){
        this.maintainanceCost = maintainanceCost;
        this.apartements = new ArrayList<>();
        this.landLord = landLord;
    }

    public List<Apartement> getApartements() {
        return apartements;
    }

    public double getProfit(){

        double profit = 0.0;

        for (Apartement apartement:apartements
             ) {
            profit += apartement.getRent();
        }

        return profit - maintainanceCost;
    }

    public void addApartement(Apartement apartement){
        apartements.add(apartement);
    }
}
