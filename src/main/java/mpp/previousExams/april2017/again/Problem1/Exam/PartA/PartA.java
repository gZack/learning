package mpp.previousExams.april2017.again.Problem1.Exam.PartA;

import java.util.function.BiPredicate;

//work with this lambda expression:   (Double x, Double y) -> x * y < x + y
public class PartA {
	// name and type of lambda goes here

	BiPredicate<Double,Double> biPredicate = (Double x, Double y) -> x * y < x + y;
	
	// representing lambda as a method refrence

	BiPredicate<Double,Double> biPredicateMR = this::greaterThan;
	
	//representing lambda as a static nested class

	class MyBiPredicate implements BiPredicate<Double,Double>{

		@Override
		public boolean test(Double x, Double y) {
			return x * y < x + y;
		}
	}
	
	//evaluate with Double inputs 2.1, 0.35
	public void evaluator() {
		assert biPredicate.test(2.1, 0.35) == true;
		assert biPredicateMR.test(2.1, 0.35) == true;
		MyBiPredicate myBiPredicate = new MyBiPredicate();
		assert myBiPredicate.test(2.1, 0.35) == true;

		
	}
	public static void main(String[] args) {
		PartA p = new PartA();
		p.evaluator();
	}

	boolean greaterThan(Double x, Double y){
		return  x * y < x + y;
	}
	
}
