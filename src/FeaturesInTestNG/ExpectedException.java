package FeaturesInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExpectedException {
	@Test(expectedExceptions=NumberFormatException.class)
	public void handleException(){
		String s="100a";
		int x=Integer.parseInt(s);
		System.out.println(x);
	}
	@Test(expectedExceptions=IllegalStateException.class)
	public void setup(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}

}
