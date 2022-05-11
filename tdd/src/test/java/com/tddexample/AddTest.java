package com.tddexample;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AddTest {
	Add addnum = new Add();

	@Test
	public void testAddnumbers() {
		int expected = 3;
		int actual = addnum.addnumbers("1,2");
		//fail("Not yet implemented");
		assertEquals("The method should add numbers",expected, actual);
	}
	
	@Test
	public void testEmptyStringAdd() {
		int expected = 0;
		int actual = addnum.addnumbers("");
		assertEquals("The method should return 0. ",expected, actual);
	}

	@Test
	public void testSingleNumAdd() {
		assertEquals("The method should return the entered value. ", 5, addnum.addnumbers("5"));
	}
	
	@Test
	public void testUnknownNumAdd() {
		int expected = 22;
		int actual = addnum.addnumbers("1,2,3,5,1,10");
		assertEquals("The method should add all numbers in the input string", expected, actual);
	}
	
	@Test
	public void testNewlineBetweenNum() {
		int expected = 6;
		int actual = addnum.addnumbers("1\n2,3");
		assertEquals("The method should handle new line in between numbers", expected, actual);
	}
}
