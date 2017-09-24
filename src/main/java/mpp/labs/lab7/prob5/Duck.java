package mpp.lab5.prob2;

public abstract class Duck{
    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;

    public void swim(){
        System.out.println("swimming");
    }

    public void quack(){
        quackBehaviour.quack();
    };

    public void fly(){
        flyBehaviour.fly();
    }

    public abstract void display();

}
