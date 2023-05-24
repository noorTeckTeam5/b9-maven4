package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BMWRadioBtn {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://testautomationpractice.blogspot.com/";

		WebDriverManager.chromedriver().setup();

	WebDriver	driver = new ChromeDriver();
		Thread.sleep(3000);
		// maximize the browser
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
}
}