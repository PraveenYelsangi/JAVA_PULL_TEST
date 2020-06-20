package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TRM_testNegetive {
	static WebDriver driver;
	static WebElement element;

	public static void main(String[] args) throws InterruptedException {
		String actualtitle = "Login Page";
		//String expectedtitle = " ";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("http://testing.hescomtrm.com/");
			driver.findElement(By.name("txtusername")).sendKeys("TVD");
			driver.findElement(By.name("txtPassword")).sendKeys("999999");
			String expectedtitle = driver.getTitle();
			element = driver.findElement(By.xpath("//*[@id='ddlgroupname']"));
			element.click();
			
			 WebDriverWait wait = new WebDriverWait(driver, 10);
			 Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
			 myAlert.accept();
			
			Select select = new Select(element);
			select.selectByVisibleText("Super User");
			
			Alert myAlert1 = wait.until(ExpectedConditions.alertIsPresent());
			 myAlert1.accept();
			 
			driver.findElement(By.id("btnlogin")).click();
			
		    Alert myAlert2 = wait.until(ExpectedConditions.alertIsPresent());
			myAlert2.accept();
			
			if(expectedtitle.contentEquals(actualtitle)){
				System.out.println("Passed");
			}else{
				System.out.println("Failed");
			}
			
			
	}
}
