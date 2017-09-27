package mpp.quiz.prob;

import java.util.Arrays;
import java.util.List;

public class MyNumber {
    private int first;
    private int second;
    List<Compute> compute;

    public MyNumber(int first, int second){
        this.first = first;
        this.second = second;
        this.compute = Arrays.asList(new Divide(), new Multiply());
    }

    /*public int sum(){
        return compute.stream()
                .mapToInt(compute1 -> compute1.operation(first,second)
                        + Compute.add(first,second))
                .sum();
    }*/

    public int operation(){
        return compute.stream()
                .map(compute1 -> compute1.operation(first,second))
                .reduce(0, (x,y) -> x+y);
    }

    public int sum(){
        return compute.stream()
                .map(compute1 -> Compute.add(first,second))
                .reduce(0, (x,y) -> x+y);
    }

    public void add(Compute compute){
        this.compute.add(compute);
    }
}
