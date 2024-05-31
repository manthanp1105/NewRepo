package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SomeFunctions {

	static WebDriver driver;
	static String url = "https://naveenautomationlabs.com/opencart/index.php?route=account/register";

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String name = driver.findElement(By.xpath("//label[@for='input-telephone']")).getText();
		System.out.println("Name of text is:"+name);
		
		
		
		
		
		
		
		
		

	}

}
