package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

	/**
	 * SendKeys method is also used to upload the file. There are some conditions here.
	 * <tag type="file"> -- this is mandatory attribute
	 * This attribute is mandatory to use the sendKeys method for file upload.
	 */
		
		
		driver.findElement(By.name("upfile")).sendKeys("/Users/manthanpandya/Desktop/Agile Scrum.pdf");
		
		//<tag type="file"> -- this is mandatory attribute
				//autoIT/Sikuli/Robot -- not recommended
		
		///Users/manthanpandya/Desktop
		
	}

}