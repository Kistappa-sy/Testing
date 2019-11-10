package testclasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_TestAnnotation {

	@Test
	public void testMethod1() {
		SomeClassToTest sum = new SomeClassToTest();
		int result = sum.sumNumbers(1, 2);
		System.out.println("Running test ->testMethod 1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running test ->testMethod 2");
	}

	@Test
	public void testMethod3() {
		System.out.println("Running test ->testMethod 3");

	}
}
