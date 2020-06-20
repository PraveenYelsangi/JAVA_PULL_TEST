package com.java.selenium;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generate {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium jars\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://testing.hescomtrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtusername']")).sendKeys("TVD");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("99999");
		driver.findElement(By.xpath("//*[@id='ddlgroupname']")).sendKeys("Super user");
		// driver.findElement(By.id("btnlogin")).click();
		Thread.sleep(2000);
		// driver.switchTo().alert().accept();
		driver.findElement(By.id("btnlogin")).click();

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Collections']"))).build().perform();
		action.click();

		driver.findElement(By.xpath("//a[contains(text(),'Manual Collection Entry')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_rblPaymentmode_1")).click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//img[contains(@id,'imgChqdate')]")).click();

		driver.findElement(By.xpath("//div[contains(@class,'ajax__calendar_title')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'ajax__calendar_title')]")).click();

		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_CalExtCheqDate_years']")));*/

		WebElement date = driver
				.findElement(By.xpath("//tbody[@id='ctl00_ContentPlaceHolder1_CalExtCheqDate_yearsBody']"));
		List<WebElement> row = date.findElements(By.tagName("tr"));

		
		List<WebElement> col = date.findElements(By.tagName("td"));
		

		for (WebElement cell : col) {
			String date1 = cell.getText();
			System.out.println(date1);
			if (date1.equals("2023"))

			{
				System.out.println("done2");
				cell.findElement(By.xpath("//div[contains(@class,'ajax__calendar_years')]//div[text()='2023']"))
						.click();
				System.out.println(cell.isDisplayed());
				System.out.println("done3");
			}

		}
		System.out.println("done5");

		Thread.sleep(2000);

		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 10);
		 * wait1.until(ExpectedConditions.visibilityOfElementLocated( By.xpath(
		 * "//div[@id='ctl00_ContentPlaceHolder1_CalExtCheqDate_months']")));
		 */

		WebElement date1 = driver
				.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_CalExtCheqDate_monthsTable']"));
		List<WebElement> row1 = date1.findElements(By.tagName("tr"));

	
		List<WebElement> col1 = date1.findElements(By.tagName("td"));
	

		for (WebElement cell1 : col1) {
			String date2 = cell1.getText();
			System.out.println(date2);
			if (date2.equalsIgnoreCase("Jun")){
				System.out.println("done2");
				cell1.findElement(By.xpath("//div[contains(@class,'ajax__calendar_month')]//div[text()='Jun']"))
						.click();
				System.out.println("done3");
			}

		}
		
		
		/*WebDriverWait wait0 = new WebDriverWait(driver, 20);
		wait0.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_CalExtCheqDate_days']")));*/

		WebElement date0 = driver
				.findElement(By.xpath("//table[@id='ctl00_ContentPlaceHolder1_CalExtCheqDate_daysTable']"));
		List<WebElement> row0 = date0.findElements(By.tagName("tr"));
	
		List<WebElement> col0 = date0.findElements(By.tagName("td"));
		

		for (WebElement cell0 : col0) {
			String date9 = cell0.getText();
			System.out.println(date9);
			if (date9.equalsIgnoreCase("5"))

			{
				System.out.println("done2");
				cell0.findElement(By.xpath("//div[contains(@class,'ajax__calendar_day')]//div[text()='5']"))
						.click();
				System.out.println("done3");
			}

		}
		
		
		System.out.println("not done");

	}

	/*
	 * DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy ");
	 * 
	 * //get current date time with Date() Date date = new Date();
	 * 
	 * // Now format the date String date1= dateFormat.format(date);
	 * 
	 * // Print the Date System.out.println(date1);
	 */

	/*
	 * WebDriverWait wait = new WebDriverWait(driver,20);
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//div[@id='ctl00_ContentPlaceHolder1_CalendarExtender3_body']")));
	 */

	/*
	 * WebElement dateWidget = driver.findElement(By.xpath(
	 * "//div[@id='ctl00_ContentPlaceHolder1_CalendarExtender3_body']"));
	 * List<WebElement> columns=dateWidget.findElements((By.xpath(
	 * "//tbody[@id='ctl00_ContentPlaceHolder1_CalendarExtender3_yearsBody']"
	 * )));
	 * 
	 * 
	 * for(WebElement ele:columns) {
	 * 
	 * String date=ele.getText();
	 * 
	 * if(date.equalsIgnoreCase("2021"))
	 * //ctl00_ContentPlaceHolder1_CalendarExtender3_year_0_2 { ele.click();
	 * break; }
	 * 
	 * }
	 */
	// WebElement dateWidget =
	// driver.findElement(By.xpath("//tbody[@id='ctl00_ContentPlaceHolder1_CalendarExtender3_yearsBody']"));

	/*
	 * // Generate Ticket Actions action = new Actions(driver);
	 * action.moveToElement(driver.findElement(By.xpath(
	 * "//a[text()='MasterInformation']"))).build().perform(); action.click();
	 * 
	 * driver.findElement(By.xpath("//a[contains(text(),'Generate Ticket')]")).
	 * click(); Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor)
	 * driver; js.executeScript("window.scrollBy(0,80)"); WebElement ele =
	 * driver.findElement(By.xpath(
	 * "//input[@id='ctl00_ContentPlaceHolder1_fUpload']"));
	 * ele.sendKeys("C:\\Users\\Sagar\\Documents\\4506021000.png");
	 */
	// driver.switchTo().activeElement().sendKeys("C:\\Users\\Sagar\\Documents\\4506021000.png");
	// driver.switchTo().activeElement();
	// driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_fUpload']")).sendKeys("‪C:\\Users\\Sagar\\Documents\\4506021000.png");

}
