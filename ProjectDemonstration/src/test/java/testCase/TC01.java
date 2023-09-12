package testCase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.About;
import Pages.LoginPage;
import testBase.WebTestBase;


public class TC01 extends WebTestBase{

	LoginPage login;
	About about;
	
	public TC01() {
		super();
		
	}


	@BeforeMethod
	public void BeforeMethod() {
		initialization();
		login=new LoginPage();
		about= new About();
		
	}
	@Test (priority = 0)
	
	public void verifylogin() {
		login.Login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test (priority = 1)
	public void verifyabout() {
		login.Login(prop.getProperty("username"),prop.getProperty("password"));
		about.aboutClick();
		
	}
	

	@Test (priority = 2)
	public void VerifyAddToCard() {
		login.Login(prop.getProperty("username"),prop.getProperty("password"));
		
		login.AddCard();
		
	}
	

}