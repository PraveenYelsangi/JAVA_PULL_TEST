package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TRM_test {
	static WebDriver driver;
	static int i;
	static String username, password;
	static WebElement element;

	public static void main(String[] args) throws InterruptedException {
		String actualtitle = "Welcome";
		//String expectedtitle = " ";
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		for (i = 1; i <= 2; i++) {
			if (i == 1) {
				username = "TVD";
				password = "99999";
			} else if (i == 2) {
				username = "TVD";
				password = "999999";
			}
			Alert action = null;
			try {
				action = driver.switchTo().alert();
			} catch (Exception e) {
				System.out.println("");

			}

			driver.get("http://testing.hescomtrm.com/");
			driver.findElement(By.name("txtusername")).sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			Thread.sleep(2000);
			element = driver.findElement(By.xpath("//*[@id='ddlgroupname']"));
			element.click();
			//Thread.sleep(2000);
			
			/*Alert a = driver.switchTo().alert();
			a.accept();*/

		

			if (action != null) {
				 WebDriverWait wait = new WebDriverWait(driver, 10);
				 Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
				 myAlert.accept();
			}else{
						//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Select select = new Select(element);
			select.selectByVisibleText("Super User");
			}
			if (action != null) {
				 WebDriverWait wait = new WebDriverWait(driver, 10);
				 Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
				 myAlert.accept();
			}else{
			driver.findElement(By.id("btnlogin")).click();
			}
			String expectedtitle = driver.getTitle();
			if (action != null) {
				 WebDriverWait wait = new WebDriverWait(driver, 10);
				 Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
				 myAlert.accept();
			}else{
				driver.findElement(By.id("ctl00_ImageButton1")).click();
			}
			
			/*if (action != null) {
				driver.switchTo().alert().accept();
				
			} else {*/
				
				
			//}

			// String url =driver.getCurrentUrl();
			
			System.out.println(expectedtitle);
			System.out.println(actualtitle);
			if (actualtitle.contains(expectedtitle)) {
				System.out.println("Test Case Passed");
			} else {
				System.out.println("Test Failed");
			}

		}
	}
}
