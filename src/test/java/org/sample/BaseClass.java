package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public static WebDriver  driver;
	
	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        return driver;
	}
	
	
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void title() {
		String y = driver.getTitle();
        System.out.println(y);
	}
	
	public static  void pageUrl() {
		String y1 = driver.getCurrentUrl();
		System.out.println(y1);

	}
	
	public static  void closeTheBrowser() {
		driver.close();
	}
	
	public static void passTxt(WebElement element,String value) {
		element.sendKeys(value);
	}
	

	public static void btnClick(WebElement element) {
		element.click();
	
	}
	
	public static void screenshot(String f) throws IOException {
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\HP\\eclipse-workspace\\MavenProject7Pm\\screenshot\\"+f+".png");
        FileUtils.copyFile(source, des);

	}
	
	public static void dragdrop(WebElement from,WebElement to) {
		Actions a = new Actions(driver);	
		a.dragAndDrop(from, to).perform();
	}
	
	
	
	

}
