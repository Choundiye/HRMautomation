package Pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Mainutility.Elementwait;

public class Loginclass {
	//data member
		@FindBy(xpath="//input[contains(@name,'username')]")
		private WebElement username;
		@FindBy(xpath="//input[@name='password'and@placeholder='Password']")
		private WebElement password;
		@FindBy(xpath="//button[contains(@type,'submit')]")
		private WebElement login;
		//constructor
		public Loginclass(WebDriver driver) {
			PageFactory.initElements(driver, this);
			Elementwait.explicitwait(10,"//input[contains(@name,'username')]");
		}
		//method
		public void sendkeyusername( String Uname) {
			username.sendKeys(Uname);
		}
		
		public void sendkeypassword(String pword) {
			password.sendKeys(pword);
		}
		public void clickonlogin() {
			login.click();
		}
		
		
		
}
