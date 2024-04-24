package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class elementMove {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String url = "http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html";

		// Topcasting.
		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();

		WebElement l1 = driver.findElement(By.className("menulink"));

//		Actions act = new Actions(driver);
//
//		act.moveToElement(l1).build().perform();

		moveToElement(l1);

		Thread.sleep(3000);
		driver.findElement(By.linkText("ARTICLES")).click();

	}

	/**
	 * ALWAYS pass driver as a constructor for Actions class object creation. Only
	 * moving the mouse to the dropdown menu. NOT Clicking on it. Actions class is
	 * used for hover over the dropdown. Mouse will move to the MIDDLE of the
	 * element. moveToElement method is used to just move the mouse to the element
	 * location.
	 * 
	 * @param element
	 */
	public static void moveToElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();

	}
}
