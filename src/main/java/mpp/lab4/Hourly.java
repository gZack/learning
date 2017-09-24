package temp.lab4;

import mpp.mpp.lab4.Employee;

public class Hourly extends Employee {

    private final int WEEKS_IN_A_MONTH = 4;
    private double hourlyWage;
    private int hoursPerWeek;

    public Hourly(final double hourlyWage, final int hoursPerWeek){
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    double calcGrossPay(int month, int year) {
        return hourlyWage*hoursPerWeek*WEEKS_IN_A_MONTH;
    }

    @Override
    public void print() {
        System.out.println("Monthly net salary of Hourly employee is: "
                + calcCompensation(9,2017).getNetPay());
    }
}
