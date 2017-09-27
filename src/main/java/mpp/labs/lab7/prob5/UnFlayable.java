package mpp.labs.lab7.prob5;

public interface UnFlayable {
    default void fly(){
        System.out.println("Cannot fly");
    }
}
