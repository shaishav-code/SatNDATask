package Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Firefox {

		
	    WebDriver driver;
		public Firefox (WebDriver driver) 
		{
	     this.driver = driver;
	      PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//textarea[@id='APjFqb']")
		WebElement Search_button;
		
		public void searchresult(String Search) {
			
			Search_button.sendKeys(Search);
			Search_button.submit();
		}
		
		 public void NoOfLink() throws InterruptedException {
		 int Count = driver.findElements(By.tagName("a")).size();

		System.out.println("Number of links on Web Page :" + Count);
		 }
		
		 @FindBy(xpath = "(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")
			WebElement Link;
		 
			public void ClickOnLink() {
				
				Link.click();
				driver.getTitle();
				String title = driver.getTitle();
			    System.out.println(title);
			}
		
	}

