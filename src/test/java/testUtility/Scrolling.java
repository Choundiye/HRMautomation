package testUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolling {
    static WebDriver driver;
	public static void scrollingwebpage(int index,int a) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.(index, a);
	
	
	
	}




}
