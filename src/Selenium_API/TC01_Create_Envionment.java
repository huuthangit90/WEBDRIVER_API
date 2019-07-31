package Selenium_API;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TC01_Create_Envionment {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.landers.ph/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
  @Test
  public void TC01() {
	  String HomepageTitle = driver.getTitle();
	  Assert.assertEquals("Landers.ph | Landers Superstore", HomepageTitle);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
