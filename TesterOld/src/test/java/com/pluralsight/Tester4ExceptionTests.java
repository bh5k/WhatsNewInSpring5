package com.pluralsight;

import org.junit.Test;

public class Tester4ExceptionTests {

	@Test(expected = Exception.class)
	public void exception() throws Exception {
		
		throw new Exception("Test exceptions");
		
	}

	@Test(timeout = 1)
	public void timeout() throws InterruptedException {
	    Thread.sleep(10);
	}
}
