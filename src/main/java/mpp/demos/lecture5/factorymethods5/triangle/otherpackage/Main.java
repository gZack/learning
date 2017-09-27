package mpp.demos.lecture5.factorymethods5.triangle.otherpackage;
import mpp.demos.lecture5.factorymethods5.triangle.Triangle;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Triangle myTriangle = Triangle.fromThreeSides(1, 1, 1);
		System.out.println(Arrays.toString(myTriangle.getAngles(myTriangle)));		
	}

}
