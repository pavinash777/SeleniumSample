package seleniumprograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyMethods {

	@Test
	public void verify() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "/Users/pottipaduavinash7/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		// Launch Website 
		driver.get("https://www.amazon.in/"); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(driver.getTitle());
		// Click on the search text box and send value 
		WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[4]/ul/span[1]/li/span/a/div/label/i"));
		
		Boolean res = checkbox.isSelected();
		System.out.println(res);
		checkbox.click();
		Boolean res1 = checkbox.isSelected();
		System.out.println(res1);
		driver.close();
		
	}
}
