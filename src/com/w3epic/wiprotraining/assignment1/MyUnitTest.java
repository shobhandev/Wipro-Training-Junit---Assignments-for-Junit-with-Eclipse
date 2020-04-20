package com.w3epic.wiprotraining.assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void testStringConcat() {
		Demo myUnit = new Demo();
		assertEquals("Result", "HelloWorld", myUnit.stringConcat("Hello", "World"));
	}

}
