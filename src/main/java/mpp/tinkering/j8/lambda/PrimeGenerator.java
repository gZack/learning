package mpp.tinkering.j8.lambda;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.stream.Stream;

public class PrimeGenerator {

    Function<Long,Stream<BigInteger>> primeGenerator
            = aLong -> Stream.iterate(BigInteger.ONE.add(BigInteger.ONE),
                                        bigInteger -> bigInteger.nextProbablePrime())
                                        .limit(aLong);

    public void printFirstNPrimes(long limit){
        primeGenerator.apply(limit)
                .forEach(System.out::println);
    }

    public static void main(String[] args){
        PrimeGenerator primeGenerator = new PrimeGenerator();
        primeGenerator.printFirstNPrimes(4);
    }
}
