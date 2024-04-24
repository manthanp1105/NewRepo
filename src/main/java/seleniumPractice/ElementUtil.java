package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementUtil {
	static WebDriver driver;
	
	public static void main(String args[]) {
		driver = new ChromeDriver();
		
	}
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}
	
	
	

}
