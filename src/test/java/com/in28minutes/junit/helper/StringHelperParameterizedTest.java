package com.in28minutes.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper stringHelper = new StringHelper();

	private String input;
	private String expectedOutput;

	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions_ainFirst2Positions() {
		assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
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
