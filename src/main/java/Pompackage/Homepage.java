package Pompackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
		WebDriverWait Wait;
	//data member
    @FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	private WebElement Admin;
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
	private WebElement Pim;
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")
	private WebElement Leave;
	
	
	//construtor
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//method
     public boolean isdisplayadminoption() {
		boolean result=Admin.isDisplayed();
		return result;
	}
	public boolean isdisplaypimoption() {
		boolean result=Pim.isDisplayed();
		return result;
	}
	public boolean isdisplayLeaveoption() {
		boolean result=Leave.isDisplayed();
		return result;
		}
	}
