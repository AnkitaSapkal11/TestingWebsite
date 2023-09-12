package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.WebTestBase;
public class LoginPage extends WebTestBase{
	@FindBy(xpath="//*[@id=\"user-name\"]")
	
	 WebElement username;
	
    @FindBy(xpath="//*[@id=\"password\"]")
	
	 WebElement password;
    
    @FindBy(xpath="//*[@id=\"login-button\"]")
	
	 WebElement loginbutton;
    
    @FindBy(id="inventory_container")
	
	 WebElement Addcard;
    
    @FindBy(xpath=" //*[@id=\"shopping_cart_container\"]/a")
	
	 WebElement Addcardicon;
    
    @FindBy(xpath="//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	
	 WebElement Checkout;
    
    @FindBy(xpath=" //*[@id=\"inventory_filter_container\"]/select")
	
	 WebElement filter;
    
  
  
    public  LoginPage() {
   	 PageFactory.initElements(driver, this);
   		
   	}
   	public void Login (String un , String pwd) {
   		username.sendKeys(un);
   		password.sendKeys(pwd);
   		loginbutton.click();
   		
   		
   		
   	}
   	public void AddCard () {
   		Addcard.click();
   		Addcardicon.click();
   		Checkout.click();
   		
   	}
   	
   	
}




