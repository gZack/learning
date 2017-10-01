package mpp.demos.lecture11.signatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// void forEach(Consumer<? super T> action)
// why ? super T
public class ForEach {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<Comparable> nonNullComparables = new ArrayList<>();
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<String> strings = Arrays.asList("A", "B", "C");
		//The Consumer type here must be Comparable, but T is Integer
		//or String
		ints.forEach(x -> {if(x != null) nonNullComparables.add(x);});
		strings.forEach(x -> {if(x != null) nonNullComparables.add(x);});
	}
}
