package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class utility {
	WebDriver w;

	public utility(WebDriver w) 
	{
		this.w =w;
	}

	public void scroll()
	{
		JavascriptExecutor js = (JavascriptExecutor)w;
		js.executeScript("window.scrollBy(0, 500)");
	}

}
