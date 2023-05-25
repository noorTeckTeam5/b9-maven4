package seleniumHomeWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise1Lakhwinder {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://ntkhr.noortecktraining.com/web/index.php/auth/login";
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement userName = driver.findElement(By.cssSelector("input[name='username']"));
		userName.sendKeys("ntk-admin");

		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("Ntk-orange!admin.123");

		WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
		loginBtn.click();

		String headerText = driver.findElement(By.cssSelector(".oxd-topbar-header-breadcrumb")).getText();

		if (headerText.equals("Dashboard")) {
			System.out.println("Actual Match Expected");
		} else {
			System.out.println("Actual Failed To Match Expected");
		}

		Thread.sleep(3000);
		driver.quit();
	}
}
