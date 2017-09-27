package mpp.tinkering.generics;


import java.util.ArrayList;
import java.util.List;

public class Manager extends Employe {


    public static void main(String[] args){
        List<Manager> managers = new ArrayList<>();
        //List<Employe> employes = managers;
        List<? extends Employe> employes = managers;
    }
}
