package Pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashoard extends utility  {
	WebDriver w;
	
	public dashoard(WebDriver w) {
		super(w);
		this.w=w;
		PageFactory.initElements(w,this);
	}

	@FindBy(xpath="//input[@type='search']")WebElement search;
	@FindBy(xpath="//button[contains(text(),'ADD TO CART')]")WebElement addtocart;
	
	public void addveg(String veg) throws Exception {
		
		w.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		search.sendKeys(veg);
		scroll();
		Thread.sleep(2000);
		addtocart.click();
		search.clear();
		scroll();
		
	}

}
