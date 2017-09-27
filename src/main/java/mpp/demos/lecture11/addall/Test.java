package mpp.demos.lecture11.addall;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		MyList<Employee> list = new MyListImpl<Employee>();
		Employee e = new Employee("Joe", 100000);
		list.add(e);
		Manager m = new Manager("John", 200000);
		list.add(m);
		MyList<Manager> list2 = new MyListImpl<Manager>();
		list2.add(m);
		list.addAll(list2); //compiler error
		
//		ArrayList<? extends Integer> list3 = new ArrayList<>();
//		list3.add(2);

		List<Employee> l = new ArrayList<>();
		Employee e1 = new Employee("Joe", 100000);
		l.add(e1);
		Manager m1 = new Manager("John", 200000);
		l.add(m1);
		List<Manager> l2 = new ArrayList<>();
		l2.add(m);
		l.addAll(l2);
		
	}
}
