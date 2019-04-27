package NewMavenPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void login() {
	  
	  driver.findElement(By.name("userName")).sendKeys("batman");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/deepakkumarbehera/Tools/chromedriver");
	  driver =new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/index.php");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}