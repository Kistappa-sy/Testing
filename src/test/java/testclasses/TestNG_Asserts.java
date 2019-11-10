package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_Asserts {

	@Test
	public void testSum() {
		SoftAssert as=new SoftAssert();
		System.out.println("\nRunning Test -> testSum");
		SomeClassToTest obj = new SomeClassToTest();
		System.out.println("\nRunning test => Testsum");
		int result = obj.sumNumbers(1, 2);
		as.assertEquals(result, 2);
		System.out.println("\nRunning test => Testsum");
		as.assertEquals(result, 3);
		as.assertAll();
	}

}