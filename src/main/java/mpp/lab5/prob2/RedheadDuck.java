package mpp.lab5.prob2;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
