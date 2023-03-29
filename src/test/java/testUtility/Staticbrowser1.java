package testUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Staticbrowser1 {
	static WebDriver driver;
	String Browser;
	@BeforeTest
	 public static WebDriver browserlaunch(String browser ,String url,int timeout) {
	if(browser.equalsIgnoreCase("chrome")) {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(option);  }
	else if(browser.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();}
	else if(browser.equalsIgnoreCase("edge")) {
	WebDriverManager.edgedriver().setup();
	driver=new FirefoxDriver();
	}
	WebDriverManager.chromedriver().setup();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	return driver;
	}
}
