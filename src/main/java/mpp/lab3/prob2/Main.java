package mpp.lab3.prob2;

public class Main {

    public static void main(String[] args){

        LandLord landLord = new LandLord();

        Building b1 = new Building(100, landLord);

        Apartement ap11 = new Apartement(200, b1);
        Apartement ap12 = new Apartement(300, b1);
        Apartement ap13 = new Apartement(400, b1);
        Apartement ap14 = new Apartement(500, b1);

        b1.addApartement(ap11);
        b1.addApartement(ap12);
        b1.addApartement(ap13);
        b1.addApartement(ap14);

        Building b2 = new Building(200, landLord);

        Apartement ap21 = new Apartement(600, b2);
        Apartement ap22 = new Apartement(700, b2);
        Apartement ap23 = new Apartement(800, b2);
        Apartement ap24 = new Apartement(900, b2);

        b2.addApartement(ap21);
        b2.addApartement(ap22);
        b2.addApartement(ap23);
        b2.addApartement(ap24);

        landLord.addBuilding(b1);
        landLord.addBuilding(b2);

        System.out.println(landLord.calculateMonthlyProfit());

    }
}
