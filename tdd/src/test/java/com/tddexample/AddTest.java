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

}
