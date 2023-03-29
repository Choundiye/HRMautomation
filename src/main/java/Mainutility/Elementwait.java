package Mainutility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elementwait {

public static WebDriver explicitwait(int time ,String webelementlocator,WebDriver driver) {
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(webelementlocator)));
return driver;
}
}

