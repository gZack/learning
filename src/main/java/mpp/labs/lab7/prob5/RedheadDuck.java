package mpp.labs.lab7.prob5;

public class RedheadDuck extends Duck implements Flayable {

    @Override
    public void fly() {
        Flayable.super.fly();
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
