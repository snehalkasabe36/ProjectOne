package TestPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.google.common.io.Files;

public class BaseClass {
	public WebDriver w;
	
		public WebDriver initalize() throws Exception {
			
			FileReader fis= new FileReader("./config.properties");
			Properties p= new Properties();
			p.load(fis);
			String browser= p.getProperty("browser");
			
			System.out.println("Changes done");//date 07-09-2025
			//System.out.println("Changes done by snehal");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--incognito");
			w = new ChromeDriver(op);
			
			w.manage().window().maximize();
			w.manage().deleteAllCookies();
			w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			return w;
			
			
		}
		public void ScreenShot() throws Exception {
			TakesScreenshot ts = (TakesScreenshot) w;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshot/opentab.png");
			Files.copy(src, dest);
		}

}
