package OrangeHRM.com.HRMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("welcome");
		//System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
		
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com/");

	}

}
