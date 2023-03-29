package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import Pompackage.Facebooklogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTNG1 {
	 WebDriver driver;
	@Parameters({"browser"})
	
	@BeforeTest
	public void beforetest(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(option);  }
	else if(browser.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
		}
	else if(browser.equalsIgnoreCase("edge")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
		}
	WebDriverManager.chromedriver().setup();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	}

    @BeforeClass
    public void beforeclass() {
	System.out.println("beforeclass");
    }
    @BeforeMethod
    public void beforemethod() {
	System.out.println("beforemethod");
    }
    @Test
    public void varifyloginfunctionlity() {
/*Facebooklogin login=new Facebooklogin(driver);
    login.sendusername("padma");
    login.sendpassword("padma123");
    login.clickonlogin();*/
System.out.println("browser launch");
    }
    @AfterMethod
    public void Aftermethod() {
	System.out.println("aftermethod"); }
    @AfterClass
    public void afterclass() {
	System.out.println("afterclass");
    }
@AfterTest
public void aftertest() {
	driver.quit();
}


















}
