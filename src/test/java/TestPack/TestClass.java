package TestPack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.dashoard;

public class TestClass extends BaseClass{
	
	public WebDriver w;

	@Test
	public void checkoutEndToEnd() throws Exception {

		w = initalize();
		dashoard d = new dashoard(w);
		d.addveg("Brocolli - 1 Kg");
		ScreenShot();
		
	}


}

