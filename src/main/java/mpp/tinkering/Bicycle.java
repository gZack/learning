package mpp.tinkering;

public class Bicycle extends Vehicle implements Product {
    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public static void main(String[] args){
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.getPrice());
    }
}
