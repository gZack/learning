package mpp.labs.lab9.prob4;

import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class GeneratePrime {

    final IntUnaryOperator f = this::nextPrime;
    static final BiFunction<Long, IntUnaryOperator, IntStream>
            reusableStream = (l,f) -> IntStream.iterate(2,f).limit(l);

    public static void main(String[] args){
        GeneratePrime generatePrime = new GeneratePrime();

        generatePrime.printFirstNPrimes(1000);
        System.out.println("----------");
        generatePrime.printFirstNPrimes(2000);
    }

    private void printFirstNPrimes(long n){
        reusableStream.apply(n,f).forEach(System.out::println);
    }

    int nextPrime(int n){
        n++;
        while (!isPrime(n)){
            n++;
        }
        return n;
    }

    boolean isPrime(int n){
        return BigInteger.valueOf(n).isProbablePrime(1);
    }
}
