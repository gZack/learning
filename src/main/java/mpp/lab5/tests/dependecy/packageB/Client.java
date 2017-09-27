package mpp.lab5.tests.dependecy.packageB;

import mpp.lab5.tests.dependecy.packageA.ClassA;

public class Client {
    public static void main(String[] args){
        ClassA.getClassA(1);
        ClassA.getClassA(2);
    }
}
