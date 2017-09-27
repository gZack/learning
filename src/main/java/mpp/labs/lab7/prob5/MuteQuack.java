package mpp.labs.lab7.prob5;

public class MuteQuack implements Unquackable {
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
