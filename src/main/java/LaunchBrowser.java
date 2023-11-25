import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	
	/*@Test
	public  void helloWorld() throws InterruptedException {
		
		 
        
        		
		 WebDriver driver = new SafariDriver(); 
        		// Launch Website 
        		driver.navigate().to("https://amazon.com/"); 

        		// Click on the search text box and send value 
        		Thread.sleep(3000);
        		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
        		Thread.sleep(3000);
        		driver.findElement(By.id("nav-search-submit-button")).click();
        		Thread.sleep(3000);
        		System.out.println(driver.getTitle());
        		// Close the Browser 
        		driver.close();
	}*/
	
	@Test
	public  void helloWorldChrome() throws InterruptedException {
        		
		        WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver", "/Users/pottipaduavinash7/Downloads/chromedriver-mac-x64/chromedriver");
        		WebDriver driver = new ChromeDriver();
        		driver.manage().deleteAllCookies();
        		driver.manage().window().maximize();
        		// Launch Website 
        		driver.get("https://amazon.com/"); 
        		// Click on the search text box and send value 
        		Thread.sleep(3000);
        		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
        		Thread.sleep(3000);
        		driver.findElement(By.id("nav-search-submit-button")).click();
        		Thread.sleep(3000);
        		//System.out.println(driver.getTitle());
        		String title = driver.getTitle();
        		System.out.println(title);
        		// Close the Browser 
        		driver.close();
	}
	
}
