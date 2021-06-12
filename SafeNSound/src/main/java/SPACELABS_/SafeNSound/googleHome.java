package SPACELABS_.SafeNSound;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHome {
  
	public WebDriver driver;
  
  @FindBy (xpath="//*[@class='gLFyf gsfi']") WebElement searchfld;
  @FindBy (xpath="(//*[@class='gNO89b'])[1]") WebElement searchbtn;
  @FindBy (xpath="(//*[@class='iUh30 Zu0yb qLRx3b tjvcx'])[1]") WebElement linkspacelabs;
  @FindBy (xpath="//*[@class='LC20lb DKV0Md']") WebElement txtoflinks;


  
  public googleHome (WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  
  
  public void googleSearch() {
	  searchfld.click();
	  searchfld.sendKeys("spacelabs safensound");
  }
  
  public void searchButton() {
	  searchbtn.click();
  }
  
  
  public void presence() {
	  boolean linkexistornot=linkspacelabs.isDisplayed();
	  System.out.println(linkexistornot);
  }
  
 
  
  public void searchLinks() {
	 java.util.List<WebElement> allinks = driver.findElements(By.xpath("//a"));
	 
	 for(int i=0;i<allinks.size();i++)
	 {
		 System.out.println(allinks.get(i).getAttribute("href"));
		 System.out.println(allinks.get(i).getText());
		 
	 }
	 
  }
  
  
  public void textHeadings() {
	  String text = txtoflinks.getText();
	  System.out.println("Here are the texts: "+text);
  }
  
  
  
}
