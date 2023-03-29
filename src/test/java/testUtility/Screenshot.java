package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static String capturepagescreenshot( WebDriver driver) throws IOException {
	String p=System.getProperty("user.dir");
	System.out.println(p);
String path=System.getProperty("user.dir")+File.separator+"test-output"+File.separator+"screenshot"+File.separator+currentTimeMillis()+".png";
File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest =new File(path);
FileHandler.copy(source, dest);
	
return path;
}

}

