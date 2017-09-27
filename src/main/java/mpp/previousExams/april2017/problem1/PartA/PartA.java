package mpp.previousExams.april2017.problem1.PartA;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class PartA {
	// name and type of lambda goes here
	final BiPredicate<Double,Double> doubleBiPredicate1 =  (x, y) -> x*y < x+y;
	
	// representing lambda as a method refrence
	final BiPredicate<Double,Double> doubleBiPredicate2 = this::check;
	
	//representing lambda as a static nested class
	static class MyBiPredicate implements BiPredicate<Double, Double>{

		@Override
		public boolean test(Double x, Double y) {
			return x*y < x+y;
		}
	}
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {

		System.out.println(doubleBiPredicate1.test(2.1,0.35));
		System.out.println(doubleBiPredicate2.test(2.1,0.35));
		System.out.println(new MyBiPredicate().test(2.1,0.35));

	}
	public static void main(String[] args) {
		PartA p = new PartA();
		p.evaluator();
	}

	boolean check(double x, double y){
		return x*y < x+y;
	}
	
}
