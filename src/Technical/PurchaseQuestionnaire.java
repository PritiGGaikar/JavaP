package Technical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import CommonFunction.RW;

public class PurchaseQuestionnaire extends RW{

	 

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

	public void PurchaseQuestionnair(WebDriver driver1) throws InterruptedException {  //(priority=15)

		WebDriver driver = driver1;
		
		WebElement technical = driver.findElement(By.linkText(data.getData(5,2,2))); // pathfor "Purchase"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(5,3,2)));// path for Admin																				
		Admin.click();		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(3000);

		WebElement UnitPackings  = driver.findElement(By.linkText(data.getData(5,112,2))); // path for UnitPackings
		UnitPackings.click();    	
		Thread.sleep(3000);
		
	}

	public void AddNewQuestion(WebDriver driver1) throws Exception {  //(priority=16)

		WebDriver driver = driver1;
		
		dropdown(driver, "id", (data.getData(5,113,2)),(data.getData(5,114,2)));// Dropdown -->Department -->Stores
		Thread.sleep(1000);

		click_element(driver, "id",(data.getData(5,115,2))); //Click on Add New Question
		Thread.sleep(2000);		
		
		clear_element(driver, "id", (data.getData(5,116,2)));// Clear Question
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,117,2)), (data.getData(5,118,2))); //Sendkeys for Question
		Thread.sleep(1000);
		

		click_element(driver, "id",(data.getData(5,119,2))); //Click on Save and close
		Thread.sleep(2000);	
		
		//Alert handling for Select Department
		 Alert alert = driver.switchTo().alert();            //Alert handling for Select Department
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	     
	     click_element(driver, "id","ctl00_MainContent_btncancel"); //Click on Save and close
			Thread.sleep(2000);	
		/*
		dropdown(driver, "id", (data.getData(5,120,2)),(data.getData(5,121,2)));// Dropdown -->Department -->Stores
		Thread.sleep(1000);
		
		dropdown(driver, "id", (data.getData(5,122,2)),(data.getData(5,123,2)));// Dropdown -->GradingType -->True/False
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,124,2))); //Click on Save and close
		Thread.sleep(2000);	
		
		//Alert handling for Select Options
		 Alert alert1 = driver.switchTo().alert();            //Alert handling for Select Options
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(5000);	*/
}
	/*
	public void AddNewGrade(WebDriver driver1) throws Exception {  //(priority=17)

		WebDriver driver = driver1;
		
		dropdown(driver, "id", (data.getData(5,125,2)), (data.getData(5,126,2)));// Dropdown -->Department -->Repairs
		Thread.sleep(1000);

		click_element(driver, "id",(data.getData(5,127,2))); //Click on Add New Grade
		Thread.sleep(2000);	
		
		clear_element(driver, "id", (data.getData(5,128,2)));// Clear Grade
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,129,2)), (data.getData(5,130,2))); //Sendkeys for Grade
		Thread.sleep(1000);	
					
	    radioButton(driver, "id", (data.getData(5,131,2))); // Radio button for grade Type
		Thread.sleep(1000);	
		
		click_element(driver, "id",(data.getData(5,132,2))); //Click on Save and  Close
		Thread.sleep(2000);			 
				
		//Alert handling for Select Options
		 Alert alert = driver.switchTo().alert();            //Alert handling for Select Options
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
		
		dropdown(driver, "id", (data.getData(5,133,2)),(data.getData(5,134,2)));// Dropdown -->Min Point -->Stores
		Thread.sleep(1000);
		
		dropdown(driver, "id", (data.getData(5,135,2)),(data.getData(5,136,2)));// Dropdown -->Max Point -->True/False
		Thread.sleep(1000);
		
		dropdown(driver, "id", (data.getData(5,137,2)),(data.getData(5,138,2)));// Dropdown -->Max Point -->True/False
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,139,2))); //Click on Save and close
		Thread.sleep(2000);	
		
		
	}
	

	public void DeleteQuestion(WebDriver driver1) throws Exception {  //(priority=18)

		WebDriver driver = driver1;
		
		clear_element(driver, "id", (data.getData(5,140,2)));// Clear Search
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(5,141,2)), (data.getData(5,142,2))); //Sendkeys for Question
		Thread.sleep(1000);
		
		dropdown(driver, "id",(data.getData(5,143,2)),(data.getData(5,144,2)));// Dropdown -->Department -->Stores
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(5,145,2))); //Click on Delete
		Thread.sleep(2000);	
		
		//Alert handling for Delete
		 Alert alert = driver.switchTo().alert();            //Alert handling for Delete
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	     clear_element(driver, "id", (data.getData(5,146,2)));// Clear Search
			Thread.sleep(1000);
		
			sendkeys(driver,"id", (data.getData(5,147,2)), (data.getData(5,148,2))); //Sendkeys for Question
			Thread.sleep(1000);
			
			dropdown(driver, "id", (data.getData(5,149,2)),(data.getData(5,150,2)));// Dropdown -->Department -->Stores
			Thread.sleep(1000);
			
			click_element(driver, "id",(data.getData(5,151,2))); //Click on Delete
			Thread.sleep(2000);	
			
			//Alert handling for Delete
			 Alert alert1 = driver.switchTo().alert();            //Alert handling for Delete
		     String Alert1 = alert1.getText();    	   
		     System.out.println("Alert msg for:"+Alert1);
		     alert1.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(2000);
	
	}*/

}