package mpp.labs.lab9.lab3;

import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GeneratePrime {

    public static void main(String[] args){

        GeneratePrime generatePrime = new GeneratePrime();
        final IntUnaryOperator f = generatePrime::nextPrime;
        final IntStream prime = IntStream.iterate(2,f);

        //prime.forEach(System.out::println);
        Stream<BigInteger> bigIntegers = prime.mapToObj(n -> new BigInteger(String.valueOf(n)));

        bigIntegers.limit(10).forEach(System.out::println);


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
