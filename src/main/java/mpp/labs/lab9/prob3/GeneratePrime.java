package mpp.labs.lab9.prob3;

import java.math.BigInteger;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class GeneratePrime {

    final UnaryOperator<BigInteger> f = this::nextPrime;
    //final IntStream prime = IntStream.iterate(2,f);
    Stream<BigInteger> big = Stream.iterate(BigInteger.valueOf(2),f);

    public void evaluator(){
        big.limit(12).forEach(System.out::println);

        //Stream<BigInteger> bigIntegers = prime.mapToObj(n -> new BigInteger(String.valueOf(n)));
        //bigIntegers.limit(10).forEach(System.out::println);
    }

    public static void main(String[] args){
        GeneratePrime generatePrime = new GeneratePrime();
        generatePrime.evaluator();

        //System.out.println(generatePrime.f.apply(BigInteger.valueOf(2)));

    }

    BigInteger nextPrime(BigInteger n){

        //n++;
        n = n.add(BigInteger.ONE);

        while (!isPrime(n)){
            n = n.add(BigInteger.ONE);
        }

        return n;
    }

    boolean isPrime(BigInteger n){
        return n.isProbablePrime(1);
    }
}
