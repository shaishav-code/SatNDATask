package Site;

import org.testng.annotations.Test;

import resource.Baseclass;

public class Saturday_April extends Baseclass{
	
	@Test
	
	public void navigation() throws Exception {
		
		
		fx.searchresult("Selenium");
		Thread.sleep(3000);
		
		fx.NoOfLink();
		Thread.sleep(3000);
		
		fx.ClickOnLink();
		Thread.sleep(3000);
		
		
		
	}
}

