package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	@Test
	public  void helloWorldChrome() throws InterruptedException {
        		
		        WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver", "/Users/pottipaduavinash7/Downloads/chromedriver-mac-x64/chromedriver");
        		WebDriver driver = new ChromeDriver();
        		driver.manage().deleteAllCookies();
        		driver.manage().window().maximize();
        		// Launch Website 
        		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
        		// Click on the search text box and send value 
        		Thread.sleep(3000);
        		//System.out.println(driver.getTitle());
        		String title = driver.getTitle();
        		//System.out.println(title);
        		//System.out.println(driver.getCurrentUrl());
        		//System.out.println(driver.getPageSource());
        		// Close the Browser 
        		driver.close();
	}
}
