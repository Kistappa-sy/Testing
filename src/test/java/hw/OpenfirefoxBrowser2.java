package hw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenfirefoxBrowser2 {
	private WebDriver driver;
	private String baseUrl;

	@BeforeMethod
	public void openbrowser() {
		driver = new FirefoxDriver();
		baseUrl="https://letskodeit.teachable.com";
		
	}

	@Test
	@Parameters({"firefox"})
	public void openbaseUrl() {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id=\"navbar\"]//ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("basu");
		driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("basu");
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input")).click();
		

	}

	@AfterMethod
	public void afterMethod() {
	}

}
