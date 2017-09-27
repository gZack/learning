package com.zkassa.learning;

import mpp.labs.lab10.prob1.TDDPractice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearningApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	void testLastCharIsUpper(){
		TDDPractice tddPractice = new TDDPractice();
		List<String> input = Arrays.asList("addis","ababa");
		List<String> result = tddPractice.changeLastCharToUpper(input);
		Assert.assertArrayEquals(input.toArray(),result.toArray());
	}

}
