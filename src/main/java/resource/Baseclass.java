package resource;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Site.Firefox;

public class Baseclass {
	
	
	public  WebDriver driver;
	public static Firefox fx;
 
	@AfterTest
	public void closeDriver() {

		driver.close();
	}

	@BeforeTest
	public WebDriver initializadriver() throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://google.com/");
		return driver;
	}

	@BeforeClass
	public void objectCreate() 
	{
       fx = new Firefox(driver);

	}


}


