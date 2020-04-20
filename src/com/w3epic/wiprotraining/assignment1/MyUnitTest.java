package com.w3epic.wiprotraining.assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() {
		Demo1 myUnit = new Demo1();
		assertEquals("Result", "HelloWorld", myUnit.stringConcat("Hello", "World"));
	}

}
