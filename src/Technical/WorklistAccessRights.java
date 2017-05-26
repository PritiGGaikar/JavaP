package Technical;

import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

//import com.relevantcodes.extentreports.ExtentReports;

import CommonFunction.RW;



public class WorklistAccessRights extends RW {
	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	        report = new ExtentReports("C:\\Users\\Priti\\workspace\\All Admin\\Report\\All admin.html", false);
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}

	public void worklistindex(WebDriver driver1) throws Exception {
		WebDriver driver= driver1;

		
	    
		                                   // Mouse Hover Action
		// path for "Technical"
		WebElement technical = driver.findElement(By.linkText(data.getData(4, 1163, 2)));
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// path for "Admin"
		WebElement admin = driver.findElement(By.xpath(data.getData(4, 1165, 2)));
		admin.click();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// path for "worklistaccess"
		WebElement worklistaccess = driver.findElement(By.linkText(data.getData(4, 1166, 2)));
		worklistaccess.click();
		Thread.sleep(5000);
		


		// For " Giving the Access to user"
		driver.findElement(By.xpath(data.getData(4, 1167, 2))).click();
	
		Thread.sleep(1000);

		// Select "UserName" Dropdown
		Select username = new Select(driver.findElement(By.id(data.getData(4, 1168, 2))));
		Thread.sleep(2000);
		username.selectByIndex(3);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);

		// Select "ActionType" Dropdown
		Select Actiontype = new Select(driver.findElement(By.xpath(data.getData(4, 1170, 2))));
		Actiontype.selectByVisibleText(data.getData(4, 1171, 2));
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// Select checkboxes
		// NCR
		driver.findElement(By.xpath(data.getData(4, 1172, 2))).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		// DEFECT Checkbox
		driver.findElement(By.xpath(data.getData(4, 1173, 2))).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		// NOTE Checkbox
		driver.findElement(By.xpath(data.getData(4, 1174, 2))).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// Click on SAVE button
		driver.findElement(By.xpath(data.getData(4, 1175, 2))).click();
		Thread.sleep(3000);
					
	}
	                                  
                                        // For Validation "Search Functionality"
		
		public void search(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
			
		// For selecting only "REWORK" Dropdown
		Select username1 = new Select(driver.findElement(By.xpath(data.getData(4, 1176, 2))));
		username1.selectByVisibleText(data.getData(4, 1177, 2));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		// For " Search" Button
		driver.findElement(By.xpath(data.getData(4, 1178, 2))).click();		
		Thread.sleep(3000);
		
		
		}
		
		
		

		                            // For validation (by using " Delete" functionality)
		public void delete(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
		
			
	    // Get total Record count
		String Record = driver.findElement(By.xpath(data.getData(4, 1179, 2))).getText(); 
		System.out.println("total record counts are  " + Record);

		// For " Delete" any one record
		driver.findElement(By.xpath(data.getData(4, 1180, 2))).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();                                         
	    String Alert = alert.getText();
	    System.out.print("Alert msg for deleteing any one record sent is:"+Alert);
	    alert.accept();
	  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(4000);
		
         // For verifying the "access record" count
		String verifyrecord = driver.findElement(By.xpath(data.getData(4, 1181, 2))).getText(); // Reworked job
		System.out.println("Verified record counts are  " + verifyrecord);
		
		}
		
		

		                                  // for " * fields is not entered" {for Username}
		public void alertuserName(WebDriver driver1) throws Exception {
			WebDriver driver = driver1;
			
			
		// For " Giving the Access to user"
		driver.findElement(By.xpath(data.getData(4, 1167, 2))).click();
		Thread.sleep(5000);
		
		// Click on SAVE button
		driver.findElement(By.xpath(data.getData(4, 1175, 2))).click();
		Thread.sleep(3000);
		
		// Capturing "alert message"
		Alert alert1 = driver.switchTo().alert();                                         
		String Alert1 = alert1.getText();
		System.out.print("Alert msg for username is:"+Alert1);
		alert1.accept();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//click on username
		Select username = new Select(driver.findElement(By.id(data.getData(4, 1550, 2))));
		Thread.sleep(2000);
		username.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		

		//click on actiontype
		Select actiontype = new Select(driver.findElement(By.xpath(data.getData(4, 1176, 2))));
		Thread.sleep(2000);
		actiontype.selectByIndex(0);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		//click on job type
		driver.findElement(By.xpath(data.getData(4, 1551, 2))).click();
		Thread.sleep(4000);
		
		//click on save
		driver.findElement(By.xpath(data.getData(4, 1552, 2))).click();
		Thread.sleep(4000);
		
		
		}
		                                    
		                               // For EDIT Functionality
		public void editrecord(WebDriver driver1) throws Exception {
			WebDriver driver= driver1;
			
			
		// Click on "Edit" Button
		driver.findElement(By.xpath(data.getData(4, 1185, 2))).click();
		Thread.sleep(1000);
		
		//Select "Username" dropdown
		Select username1 = new Select(driver.findElement(By.xpath(data.getData(4, 1186, 2))));
		Thread.sleep(2000);
		username1.selectByIndex(5);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		// DeSelect checkboxes
		// NCR
		driver.findElement(By.xpath(data.getData(4, 1172, 2))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		// Click on SAVE button
		driver.findElement(By.xpath(data.getData(4, 1189, 2))).click();
		Thread.sleep(3000);
		
			
		// Click on Refresh
		driver.findElement(By.xpath(data.getData(4, 1190, 2))).click();
		Thread.sleep(3000);
		
		
		}}