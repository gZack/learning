package mpp.lab4;

public abstract class Employee {

    final Paycheck calcCompensation(int month, int year){

        double grossPay = calcGrossPay(month, year);

        Paycheck paycheck =  new Paycheck(grossPay,0.23,
                0.05,0.01,.03,0.075);

        return paycheck;
    }

    abstract double calcGrossPay(int month, int year);

    public void print(){
        System.out.println("Employee abstract class");
    }
}
