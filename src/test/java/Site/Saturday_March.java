package Site;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Saturday_March {
	public static WebDriver driver;
	
	
	
	@Test(priority=2)
	
	public void quit()
	
	{
	driver.close();
	
	}
	
	@Test(priority=1)

		public void initbrowser() throws InterruptedException, IOException
		
		{
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		WebElement variable = driver.findElement(By.name("q"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		variable.sendKeys("Narola Infotech");
		variable.sendKeys(Keys.ENTER); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Narola Infotech'][1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='CONTACT']")).click();
		Thread.sleep(1000);
		
		WebElement firstname = driver.findElement(By.xpath("//div[@id='wpcf7-f10027-o1']//input[@placeholder='First Name']"));
		firstname.sendKeys("Nayan");
		Thread.sleep(1000);
		WebElement lastame = driver.findElement(By.xpath("//div[@id='wpcf7-f10027-o1']//input[@placeholder='Last Name']"));
		lastame.sendKeys("Akojwar");
		Thread.sleep(1000);
		WebElement emailfield = driver.findElement(By.xpath("//div[@id='wpcf7-f10027-o1']//input[@placeholder='Email']"));
		emailfield.sendKeys("nda@narola.email");
		Thread.sleep(1000);
		WebElement phonefield = driver.findElement(By.xpath("//div[@id='wpcf7-f10027-o1']//input[@placeholder='Phone']"));
		phonefield.sendKeys("90392792712");
		Thread.sleep(1000);
		WebElement timefield = driver.findElement(By.xpath("//select[@id='git_time_2']"));
		timefield.click();
		Thread.sleep(2000);
		WebElement Stime = driver.findElement(By.xpath("//select[@id='git_time_2']//option[@value='09:00'][normalize-space()='09:00']"));
		Stime.click();
		Thread.sleep(1000);
		WebElement messagefield = driver.findElement(By.xpath("//div[@id='wpcf7-f10027-o1']//textarea[@placeholder='Message']"));
		messagefield.sendKeys("Demo Testing");
		
		Thread.sleep(2000);
		
		Saturday_March.takess();
		}
	
	
	
		public static void takess() throws IOException
		
		{
		TakesScreenshot scrshot = (TakesScreenshot)driver;  //type casting
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
		String path = "//Users//c100-96//eclipse-workspace//page//demo//pic.jpg";

		File destination = new File(path);
	
		FileHandler.copy(source, destination);
		
		}
	
	
}
