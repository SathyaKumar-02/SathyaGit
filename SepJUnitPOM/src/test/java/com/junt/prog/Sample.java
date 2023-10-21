package com.junt.prog;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("Test Method 1");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Ignore
	@Test
	public void testMethod2() {
		System.out.println("Test Method 2");
	}
	
	@Test
	public void testMethod3() {
		System.out.println("Test Method 3");
	}
}
