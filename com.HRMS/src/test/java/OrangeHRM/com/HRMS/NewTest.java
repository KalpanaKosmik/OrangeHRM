package OrangeHRM.com.HRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class NewTest {
	WebDriver driver;
  @Test
  public void login() {
	  driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("selenium");
	  driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("selenium");
	  driver.findElement(By.xpath("//input[@name='Submit']")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
