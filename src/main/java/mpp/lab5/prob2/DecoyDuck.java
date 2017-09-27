package mpp.lab5.prob2;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        this.flyBehaviour = new CannotFly();
        this.quackBehaviour = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("display");
    }
}
