package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void setup() {
		System.out.println("Before Test");
	}

	@Test
	public void test() {
		System.out.println("teste executed");
	}

	@Test
	public void test1() {
		System.out.println("teste1 executed");
	}

	@After
	public void tearDown() {
		System.out.println("After test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

}
