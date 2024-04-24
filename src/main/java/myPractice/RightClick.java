package myPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		String url = "http://swisnl.github.io/jQuery-contextMenu/demo.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.xpath("//span[text ()= 'right click me']"));

		Actions act = new Actions(driver);

		act.contextClick(rightclick).build().perform();

		List<WebElement> menus = driver.findElements(By.cssSelector("ul.context-menu-list span"));

		System.out.println(menus.size());

		for (WebElement e : menus) {
			String name = e.getText();
			if (name.equals("Copy")) {
				e.click();

				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
				break;
			}
		}

	}

}
