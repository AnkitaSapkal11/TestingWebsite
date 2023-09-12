package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class About  extends WebTestBase{
	
   
   @FindBy(xpath="//*[@id=\"menu_button_container\"]/div/div[3]/div/button")
	
	 WebElement about;
   
   @FindBy(xpath="//*[@id=\"about_sidebar_link\"]")
	
	 WebElement about2;
   
 
	
	 WebElement loginbutton;
   public  About() {
  	 PageFactory.initElements(driver, this);
   }
	public void aboutClick() {
		about.click();
		about2.click();
	}

}
