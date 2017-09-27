package mpp.lab3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {

    private List<Building> buildings;

    public LandLord(){
        this.buildings = new ArrayList<>();
    }

    public double calculateMonthlyProfit(){

        double totalMonthlyProfit = 0.0;

        for (Building building : buildings){
            totalMonthlyProfit += building.getProfit();
        }

        return totalMonthlyProfit;
    }

    public void addBuilding(Building building){
        buildings.add(building);
    }
}
