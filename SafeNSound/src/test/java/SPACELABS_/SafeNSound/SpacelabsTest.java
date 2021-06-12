package SPACELABS_.SafeNSound;

import org.testng.annotations.Test;

public class SpacelabsTest extends commonClassSpacelabs {
  
  @Test(priority=1)
  public void test1() {
	  
	  googleHome gh=new googleHome(driver);
	  gh.googleSearch();
	  gh.searchButton();
	  gh.presence();
	  
  }
  
  @Test(priority=2)
  public void test2() {
	  googleHome gh=new googleHome(driver);
	  gh.searchLinks();
	  gh.textHeadings();
  }
  
  
  
}
