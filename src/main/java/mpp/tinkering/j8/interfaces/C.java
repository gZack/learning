package mpp.tinkering.j8.interfaces;

public class C implements A,B {
    @Override
    public void display() {
        A.super.display();
    }
}
