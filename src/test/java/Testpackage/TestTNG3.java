package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pompackage.Homepage;
import Pompackage.Loginclass;

public class TestTNG3 extends Baseclass{
	
	@BeforeClass
	public void beforeclass() {
	System.out.println("before class");}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");}
	@Test
	public void varifyadminElements() throws InterruptedException{
	logger=report.createTest("Verify admin elements");
	SoftAssert s= new SoftAssert();
		 //login
    Loginclass login=new Loginclass(driver);
    Thread.sleep(3000);
    login.sendkeyusername("Admin");
    login.sendkeypassword("admin123");
	login.clickonlogin();
    Thread.sleep(3000);
   String ExpectedURL= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
   String ActurlURL=driver.getCurrentUrl();
		 
	Assert.assertEquals(ActurlURL,ExpectedURL);//pass
		 
	 Homepage page=new Homepage(driver);
	 boolean result1=page.isdisplayadminoption();
	s.assertTrue(result1,"admin option is present");
	 System.out.println("admin option is present");
	 
	 boolean result2= page.isdisplaypimoption();
	 s.assertTrue(result2, "pim option is present");
	 System.out.println("pim option is present");
	 
	 boolean result3=page.isdisplayLeaveoption();
	 s.assertTrue(result3, "leave option is present");
	 System.out.println("leave option is present");
	 s.assertAll();
	}
      @AfterClass
	public void afterclass() {
		System.out.println("after class");}
}
