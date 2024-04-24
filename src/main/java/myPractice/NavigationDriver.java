package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDriver {

	public static void main(String[] args) throws InterruptedException {
	
		String url = "https://www.amazon.ca/";
		
		WebDriver driver = new ChromeDriver();
		
		
		
		/*
		 * driver can be launched 2 ways.
		 * .get method and navigate.to method. Both will work fine.
		 * NOTE: navigate.to mthod internally calling .get method only. so better to use .get method to launch the url.
		 * navigate.to method is slower than .get method. beacuse it has to call internal .get method.
		 */
		
	
		
		driver.get(url);
		
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
	}

}
