package mpp.lab4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestCalcCompensation {

   public static void main(String[] args){
       /**
        * hourly salaried employee
        *
        * java month index starts from 0
        */
       Employee hourly = new Hourly(16,40);
       Paycheck paycheck = hourly.calcCompensation(8,2017);
       System.out.println("Hourly net pay: " + paycheck.getNetPay());

       /**
        * salaried employee
        * java month index starts from 0
        */
       Employee salaried = new Salaried(5000);
       paycheck = salaried.calcCompensation(8,2017);
       System.out.println("Salaried net pay: " + paycheck.getNetPay());

       /**
        * commissioned employee
        * java month index starts from 0
        */
       List<Order> orderList = new ArrayList<>();
       Calendar ca = Calendar.getInstance();
       Order order = new Order("No-1",ca.getTime(), 20);
       orderList.add(order);
       ca.add(Calendar.DAY_OF_MONTH,2);
       order = new Order("No-1", ca.getTime(), 20);
       orderList.add(order);
       Employee commissioned = new Commissioned(5000, orderList);
       paycheck = commissioned.calcCompensation(8,2017);
       System.out.println("Commissioned net pay: " + paycheck.getNetPay());


   }
}
