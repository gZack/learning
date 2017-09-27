package mpp.lab4;

public class Salaried extends Employee {

    private double salary;

    public Salaried(final double salary){
        this.salary = salary;
    }

    @Override
    double calcGrossPay(int month, int year) {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Monthly net salary of Salaried employee is: "
                + calcCompensation(9,2017).getNetPay());
    }
}
