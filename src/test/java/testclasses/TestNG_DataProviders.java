package testclasses;

import org.testng.annotations.Test;

public class TestNG_DataProviders {
	
  @Test(dataProvider="input", dataProviderClass=TestData.class)
  public void testMethod1(String input1,String input2 ) {
	
	  System.out.println("Input1 : " +input1);
	  System.out.println(" Input2 : " +input2);
  }
}
