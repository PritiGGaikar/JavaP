package Technical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import CommonFunction.RW;

public class InspectionType extends RW{
	
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
	
	public void InspectionTypes(WebDriver driver1) throws InterruptedException {//(priority=16)

		WebDriver driver = driver1;
	
	
		WebElement technical = driver.findElement(By.linkText(data.getData(4, 1193, 2))); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		Thread.sleep(2000);
	
		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1194, 2)));// path for Admin
		Thread.sleep(2000);
		Admin.click();
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);
		
		 
	     WebElement InspectionTypeList = driver.findElement(By.linkText(data.getData(4, 1195, 2)));//path for "Inspection Type"
	     InspectionTypeList.click();
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	}  
	     
	public void AddInspection(WebDriver driver1) throws InterruptedException { //(priority=17)

		WebDriver driver = driver1;    
	     
	     
	     driver.findElement(By.id(data.getData(4, 1196, 2))).click(); //Clicking on Add button
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	     driver.findElement(By.id(data.getData(4, 1197, 2))).sendKeys(data.getData(4, 1198, 2));      //Type Inspection name "Priti"
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	  
	     driver.findElement(By.id(data.getData(4, 1199, 2))).click();                    //Clicking on Save button
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	     
	     
	}
	public void Searchandedit(WebDriver driver1) throws InterruptedException { //(priority=18)

		WebDriver driver = driver1;    
	      
	     driver.findElement(By.id(data.getData(4, 1200, 2))).click(); //Clicking on Add button
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id(data.getData(4, 1201, 2))).sendKeys(data.getData(4, 1202, 2));      //Type Inspection name "Pooja"
	     Thread.sleep(2000);
	    
	   driver.findElement(By.id(data.getData(4, 1203, 2))).click();                     //Clicking on Save button
	    Thread.sleep(2000);
	    
	    
	     driver.findElement(By.id(data.getData(4, 1200, 2))).click(); //Clicking on Add button
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id(data.getData(4, 1201, 2))).sendKeys(data.getData(4, 1202, 2));      //Type Inspection name "Pooja"
	     Thread.sleep(2000);
	    
	   driver.findElement(By.id(data.getData(4, 1203, 2))).click();                     //Clicking on Save button
	    Thread.sleep(2000);
	    
	    Alert alert = driver.switchTo().alert();                                         //Alert handling for name blank
	     String Alert = alert.getText();
	     System.out.print("Alert msg for Inspection name blank is:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	    
	    
	}
	    
	public void EditName(WebDriver driver1) throws Exception { //(priority=19)

		WebDriver driver = driver1;    
	    
		clear_element(driver, "id", (data.getData(4, 1215, 2)));// Clear Inspection Type
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1216, 2)), (data.getData(4, 1198, 2))); //Sendkeys for Inspection Type
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1218, 2))); //Click on Search
		Thread.sleep(1000);
	    
	    driver.findElement(By.id(data.getData(4, 1204, 2))).click();       //Clicking on Edit button
	    Thread.sleep(4000);
	     
	    driver.findElement(By.id(data.getData(4, 1205, 2))).clear();    //clear Inspection name 
	    Thread.sleep(2000);
	 
	     driver.findElement(By.id(data.getData(4, 1206, 2))).sendKeys(data.getData(4, 1207, 2));      //Retype inspection name
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id(data.getData(4, 1208, 2))).click();                    //Clicking  on Save button
	     Thread.sleep(2000);
	     

			clear_element(driver, "id", (data.getData(4, 1215, 2)));// Clear Inspection Type
			Thread.sleep(1000);
			
			sendkeys(driver,"id", (data.getData(4, 1216, 2)), (data.getData(4, 1207, 2))); //Sendkeys for Inspection Type
			Thread.sleep(1000);
			
			click_element(driver, "id",(data.getData(4, 1218, 2))); //Click on Search
			Thread.sleep(1000);
	     
	}
	
	
	public void Blankname(WebDriver driver1) throws InterruptedException {//(priority=20)

		WebDriver driver = driver1;    
	         
	     
	     

	     driver.findElement(By.id(data.getData(4, 1209, 2))).click();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);     //Clicking on Add button
	     Thread.sleep(1000);
	     
	     driver.findElement(By.id(data.getData(4, 1210, 2)));      //Inspection type name Blank 
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     Thread.sleep(1000);
	     
	    driver.findElement(By.id(data.getData(4, 1211, 2))).click();                    //Clicking on Save button
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(3000);
	    
	    Alert alert = driver.switchTo().alert();                                         //Alert handling for name blank
	     String Alert = alert.getText();
	     System.out.print("Alert msg for Inspection name blank is:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	      
	      //For Already existing Assigner name
	    driver.findElement(By.id(data.getData(4, 1212, 2))).sendKeys(data.getData(4, 1213, 2));      //Retype Inspection name
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	  
	     
	     driver.findElement(By.id(data.getData(4, 1214, 2))).click();                    //Clicking on Save button
	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	     Thread.sleep(1000);
	     
	}
	
	public void Delete(WebDriver driver1) throws Exception { //(priority=21)

		WebDriver driver = driver1;    
	     
		

	  	clear_element(driver, "id", (data.getData(4, 1215, 2)));// Clear Inspection Type
		Thread.sleep(1000);
		
		sendkeys(driver,"id", (data.getData(4, 1216, 2)), (data.getData(4, 1217, 2))); //Sendkeys for Inspection Type
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1218, 2))); //Click on Search
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1219, 2))); //Click on Delet
		Thread.sleep(1000);

		//Alert handling for Threshold value's are updated.
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Threshold value's are updated.
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
		clear_element(driver, "id", (data.getData(4, 1220, 2)));// Clear Inspection Type
		Thread.sleep(1000);
		
		sendkeys(driver,"id",(data.getData(4, 1221, 2)), (data.getData(4, 1222, 2))); //Sendkeys for Inspection Type
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1223, 2))); //Click on Search
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1224, 2))); //Click on Delet
		Thread.sleep(1000);
		
		//Alert handling for Delete Inpection
		 Alert alert2 = driver.switchTo().alert();                                         //Alert handling for Delete Inpection
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
		clear_element(driver, "id",(data.getData(4, 1225, 2)));// Clear Inspection Type
		Thread.sleep(1000);
		
		sendkeys(driver,"id",(data.getData(4, 1226, 2)), (data.getData(4, 1227, 2))); //Sendkeys for Inspection Type
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1228, 2))); //Click on Search
		Thread.sleep(1000);
		
		click_element(driver, "id",(data.getData(4, 1229, 2))); //Click on Delet
		Thread.sleep(1000);
		
		//Alert handling for Delete Inpection
		 Alert alert3 = driver.switchTo().alert();                                         //Alert handling for TDelete Inpection
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	     //Verifying Delete name
	     
	     clear_element(driver, "id",(data.getData(4, 1225, 2)));// Clear Inspection Type
		 Thread.sleep(1000);
			
		sendkeys(driver,"id",(data.getData(4, 1226, 2)), (data.getData(4, 1227, 2))); //Sendkeys for Inspection Type
		Thread.sleep(1000);
			
		click_element(driver, "id",(data.getData(4, 1228, 2))); //Click on Search
		Thread.sleep(1000);

		clear_element(driver, "id",(data.getData(4, 1225, 2)));// Clear Inspection Type
		 Thread.sleep(1000);
			
		sendkeys(driver,"id",(data.getData(4, 1226, 2)), (data.getData(4, 1207, 2))); //Sendkeys for Inspection Type
		Thread.sleep(1000);
			
		click_element(driver, "id",(data.getData(4, 1228, 2))); //Click on Search
		Thread.sleep(1000);

		
		clear_element(driver, "id",(data.getData(4, 1225, 2)));// Clear Inspection Type
		 Thread.sleep(1000);
			
		sendkeys(driver,"id",(data.getData(4, 1226, 2)), (data.getData(4, 1213, 2))); //Sendkeys for Inspection Type
		Thread.sleep(1000);
			
		click_element(driver, "id",(data.getData(4, 1228, 2))); //Click on Search
		Thread.sleep(1000);

	}
}
	



