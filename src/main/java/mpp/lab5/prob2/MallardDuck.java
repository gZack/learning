package mpp.lab5.prob2;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
