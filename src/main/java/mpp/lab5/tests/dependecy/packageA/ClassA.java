package mpp.lab5.tests.dependecy.packageA;

public abstract class ClassA {
    public static ClassA getClassA(int x){
        if (x == 1){
            return new Subclass1();
        }

        return new Subclass2();
    }

}
