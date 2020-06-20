package com.java.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMethod {
	static WebDriver driver;
	static WebElement element;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void loginValid() {
		driver.get("http://testing.hescomtrm.com/");
		driver.findElement(By.name("txtusername")).sendKeys("TVD");
		driver.findElement(By.name("txtPassword")).sendKeys("99999");
		element = driver.findElement(By.xpath("//*[@id='ddlgroupname']"));
		element.click();
		Select select = new Select(element);
		select.selectByVisibleText("Super User");
		driver.findElement(By.id("btnlogin")).click();
	}

	public void loginInvalid(String username, String password) {
		MainMethod obj = new MainMethod();
		driver.get("http://testing.hescomtrm.com/");
		driver.findElement(By.name("txtusername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		element = driver.findElement(By.xpath("//*[@id='ddlgroupname']"));
		element.click();
		obj.alertMsg();
		Select select = new Select(element);
		select.selectByVisibleText("Super User");
		obj.alertMsg();
		driver.findElement(By.id("btnlogin")).click();
		obj.alertMsg();
	}

	public void checkValid() {
		String actualtitle = "Welcome";
		String expected = driver.getTitle();
		if (actualtitle.contentEquals(expected)) {
			System.out.println("--------------------------------");
			System.out.println("Actual Title: " + actualtitle);
			System.out.println("Expected Title: " + expected);
			System.out.println("Valid Test Case: Passed");
			System.out.println("--------------------------------");
			driver.close();
		} else {
			System.out.println("--------------------------------");
			System.out.println("Actual Title: " + actualtitle);
			System.out.println("Expected Title: " + expected);
			System.out.println("Valid Test Case: Failed");
			System.out.println("--------------------------------");
			driver.close();
		}
	}

	public void checkInvalid() {
		String actualtitle = "Login Page";
		String expected = driver.getTitle();
		if (actualtitle.contentEquals(expected)) {
			System.out.println("--------------------------------");
			System.out.println("Actual Title: " + actualtitle);
			System.out.println("Expected Title: " + expected);
			System.out.println("InValid Test Case: Passed");
			System.out.println("--------------------------------");
			driver.close();
		} else {
			System.out.println("--------------------------------");
			System.out.println("Actual Title: " + actualtitle);
			System.out.println("Expected Title: " + expected);
			System.out.println("InValid Test Case: Failed");
			System.out.println("--------------------------------");
			driver.close();
		}
	}

	public void alertMsg() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		myAlert.accept();
	}

	public static void main(String[] args) throws InterruptedException {
		MainMethod obj = new MainMethod();
		obj.launchBrowser();
		obj.loginValid();
		obj.checkValid();
		obj.launchBrowser();
		obj.loginInvalid("TVD", "999999");
		obj.checkInvalid();

	}
}
