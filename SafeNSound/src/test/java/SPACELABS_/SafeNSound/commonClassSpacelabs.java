package SPACELABS_.SafeNSound;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class commonClassSpacelabs {
  
	public WebDriver driver;
  
	@BeforeClass
    public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();	
	  driver =new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	
	  
  }
  
 
}
