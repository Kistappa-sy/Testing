package testclasses;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name="input")
	public Object[][] getData(){
		return new Object [][] {
			{"bmw" , "m3"},
			{"audi" ,"a6"},
			{"benz" ,"c300"}
		};
	} 

}