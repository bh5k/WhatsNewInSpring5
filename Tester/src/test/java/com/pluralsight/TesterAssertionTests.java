package com.pluralsight;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesterAssertionTests {

	@Test
	public void numbersShouldEqualTest() {
	    Assertions.assertTrue(
	      4 == 2 + 2, 
	      () -> "Numbers 4 and 2 + 2 are equal!");
	}
	
	@Test
	public void shouldAssertAll() {
	    List<Integer> list = Arrays.asList(1, 2, 4);
	    Assertions.assertAll("List assertions",
	        () -> Assertions.assertEquals(list.get(0).intValue(), 1),
	        () -> Assertions.assertEquals(list.get(1).intValue(), 2),
	        () -> Assertions.assertEquals(list.get(2).intValue(), 4),
	        () -> Assertions.assertThrows(Exception.class, () -> {
						throw new Exception("Test exceptions");
				    }));
	}
}
