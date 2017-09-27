package mpp.lab5.prob2;

public class RubberDuck extends Duck {

    public RubberDuck(){
        this.flyBehaviour = new CannotFly();
        this.quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
