package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_EnableTimeout {

	@BeforeClass
	public void beforeClass() {
	}

	@Test(enabled=false)
	public void testMethod1() {
		System.out.println("TestMethod1");
	}

	@Test(timeOut=300)
	public void testMethod2() throws InterruptedException {
		System.out.println("TestMethod2");
		Thread.sleep(400);
	}

	@AfterClass
	public void afterClass() {
	}

}
