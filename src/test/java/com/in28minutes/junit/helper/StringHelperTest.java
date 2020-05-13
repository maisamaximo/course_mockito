package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper stringHelper;
	
	@Before
	public void before() {
		stringHelper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_ainFirst2Positions() {
		assertEquals("BC", stringHelper.truncateAInFirst2Positions("AABC"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_ainFirstPosition() {
		assertEquals("BC", stringHelper.truncateAInFirst2Positions("ABC"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Equals2Scenario() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_OnlyOneScenario() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
