package mpp.labs.lab7.prob5;

public class RubberDuck extends Duck implements UnFlayable {

    @Override
    public void fly() {
        UnFlayable.super.fly();
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
