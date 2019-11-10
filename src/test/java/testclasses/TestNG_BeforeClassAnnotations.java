package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClassAnnotations {

	@BeforeClass
	public void setUp() {
		System.out.println("\nThis runs before Class");
	}

	@AfterClass
	public void CleanUp() {
		System.out.println("\nThis runs after Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nThis runs before every Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nThis runs after every Method");
	}

	@Test
	public void testMethod1() {
		System.out.println("\nRunning test -> TestMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning test -> TestMethod2");
	}

}
