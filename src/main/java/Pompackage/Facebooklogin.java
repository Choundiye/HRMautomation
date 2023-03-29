package Pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin {
@FindBy (xpath="//input[@type='text'and@name='email']")
private WebElement username;
@FindBy(xpath="//input[@type='password'and @name='pass']")
private WebElement password;
@FindBy(xpath="//button[@id='loginbutton'and@name='login']")
private WebElement login;


public Facebooklogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
public void sendusername(String padma) {
	username.sendKeys(padma);
}
public void sendpassword(String pass123) {
	password.sendKeys(pass123);
}
public void clickonlogin () {
	login.click();
}
}
