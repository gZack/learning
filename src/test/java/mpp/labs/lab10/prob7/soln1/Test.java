package mpp.labs.lab10.prob7.soln1;

import mpp.labs.lab10.prob7.Employee;
import mpp.labs.lab10.prob7.Main;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class Test {

    @org.junit.Test
    public void fullNamesToString(){

        List<Employee> employeeList = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        Assert.assertEquals("Alice Richards, Joe Stevens, John Sims, Steven Walters"
                , Main.asString(employeeList));

    }
}
