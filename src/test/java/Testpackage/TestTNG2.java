package Testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pompackage.Loginclass;
import testUtility.ReadFile;
import testUtility.Screenshot;
import testUtility.Staticbrowser1;

public class TestTNG2 {
 WebDriver driver;
 @Parameters({"browser"})
	
@BeforeTest 
public  void beforetest(String browser){
	
driver=	Staticbrowser1.browserlaunch(browser,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",10);
	}
@BeforeClass
public void beforeclass(){
System.out.println("before class");
	}
@BeforeMethod
public void beforemethod() {
System.out.println("before method");
}
 @Test
 public void test1() throws InterruptedException, EncryptedDocumentException, IOException {
 Loginclass login=new Loginclass(driver);

	 Thread.sleep(3000);
login.sendkeyusername(ReadFile.fetchdatafromexcel(1, 1));
 login.sendkeypassword(ReadFile.fetchdatafromexcel(2, 1));
	  
	login.clickonlogin();
	Thread.sleep(3000);
	 }
@AfterMethod
public void aftermethod() {
System.out.println("after method");
}
@AfterClass
public void afterclass() {
System.out.println("afterclass");
}

@AfterTest 
public void aftertest() {
	driver.quit();
}
}





















