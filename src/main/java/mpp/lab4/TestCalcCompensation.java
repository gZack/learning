package temp.lab4;

import mpp.mpp.lab4.Commissioned;
import mpp.mpp.lab4.Employee;
import mpp.mpp.lab4.Hourly;
import mpp.mpp.lab4.Order;
import mpp.mpp.lab4.Paycheck;
import mpp.mpp.lab4.Salaried;

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
       mpp.mpp.lab4.Employee hourly = new Hourly(16,40);
       Paycheck paycheck = hourly.calcCompensation(8,2017);
       System.out.println("Hourly net pay: " + paycheck.getNetPay());

       /**
        * salaried employee
        * java month index starts from 0
        */
       mpp.mpp.lab4.Employee salaried = new Salaried(5000);
       paycheck = salaried.calcCompensation(8,2017);
       System.out.println("Salaried net pay: " + paycheck.getNetPay());

       /**
        * commissioned employee
        * java month index starts from 0
        */
       List<mpp.mpp.lab4.Order> orderList = new ArrayList<>();
       Calendar ca = Calendar.getInstance();
       mpp.mpp.lab4.Order order = new mpp.mpp.lab4.Order("No-1",ca.getTime(), 20);
       orderList.add(order);
       ca.add(Calendar.DAY_OF_MONTH,2);
       order = new Order("No-1", ca.getTime(), 20);
       orderList.add(order);
       Employee commissioned = new Commissioned(5000, orderList);
       paycheck = commissioned.calcCompensation(8,2017);
       System.out.println("Commissioned net pay: " + paycheck.getNetPay());


   }
}
