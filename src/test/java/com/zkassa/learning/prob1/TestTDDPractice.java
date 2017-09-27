package com.zkassa.learning.prob1;

import mpp.labs.lab10.prob1.TDDPractice;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestTDDPractice {

    @Test
    public void testLastCharIsUpper(){
        TDDPractice tddPractice = new TDDPractice();
        List<String> input = Arrays.asList("addis","ababa");
        List<String> result = tddPractice.changeLastCharToUpper(input);
        Assert.assertArrayEquals(new String[]{"addiS","ababA"},result.toArray());
    }

}
