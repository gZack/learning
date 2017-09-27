package mpp.lab4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(final double baseSalary, final List<Order> orders){
        this.baseSalary = baseSalary;
        this.orders = orders != null ? orders : new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    private double getCommissionByDate(int month, int year){
        return getOrdersAmount(month,year);
    }

    public double getOrdersAmount(int month, int year){

        double totalOrderAmount = 0.0;

        Calendar ca = Calendar.getInstance();

        for(Order order : orders){
            ca.setTime(order.getOrderDate());
            if(ca.get(Calendar.MONTH) == month
                    && ca.get(Calendar.YEAR) == year){
                totalOrderAmount += order.getOrderAmount();
            }
        }

        return totalOrderAmount;
    }

    @Override
    double calcGrossPay(int month, int year) {
        return baseSalary + getCommissionByDate(month,year);
    }

    @Override
    public void print() {
        System.out.println("Monthly net salary of Commissioned employee is: "
                + calcCompensation(9,2017).getNetPay());
    }
}
