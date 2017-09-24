package temp.lab3.prob2;

import mpp.mpp.lab3.prob2.Building;

import java.util.ArrayList;
import java.util.List;

public class LandLord {

    private List<mpp.mpp.lab3.prob2.Building> buildings;

    public LandLord(){
        this.buildings = new ArrayList<>();
    }

    public double calculateMonthlyProfit(){

        double totalMonthlyProfit = 0.0;

        for (mpp.mpp.lab3.prob2.Building building : buildings){
            totalMonthlyProfit += building.getProfit();
        }

        return totalMonthlyProfit;
    }

    public void addBuilding(Building building){
        buildings.add(building);
    }
}
