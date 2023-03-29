package Testpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.beust.jcommander.Parameter;

import testUtility.Screenshot;
import testUtility.Staticbrowser1;

public class Baseclass {
	static WebDriver driver;
	static ExtentTest logger;
	static ExtentReports report ;
	static ExtentHtmlReporter extent;
	@Parameters({"browser"})
	
 @BeforeTest 
 public  void beforetest(String browser){
 report=new ExtentReports();	
 extent=new ExtentHtmlReporter("test-output\\Reports\\"+File.separator+System.currentTimeMillis()+".Html");
 report.attachReporter(extent);
driver=	Staticbrowser1.browserlaunch(browser,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",10);
		}
	
@AfterMethod
public void aftermethod(ITestResult result) throws IOException {
if(result.getStatus()==ITestResult.FAILURE)
		 {
String path=Screenshot.capturepagescreenshot(driver);
logger.fail("test case is fail",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
logger.pass("test case is pass");
		 }
report.flush();
	}
@AfterTest 
public void aftertest() {
driver.quit();
	}
}















