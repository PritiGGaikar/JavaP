package Technical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;


import CommonFunction.RW;

public class AlarmUnit extends RW{
	 

	/*Technical
	Admin
	Alarm Unit*/
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
	
	public void AlarmUnits(WebDriver driver1) throws Exception { //(priority=28)
	
		WebDriver driver = driver1;
	
		WebElement technical = driver.findElement(By.linkText(data.getData(4, 1269, 2))); // pathfor "Technical"s
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		Thread.sleep(2000);
		

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1270, 2)));// path for Admin																					
		Admin.click();
		action.moveToElement(Admin).build().perform();
		

		WebElement AlarmUnit = driver.findElement(By.linkText(data.getData(4, 1271, 2))); // path for Alarm Unit
		AlarmUnit.click();	
		Thread.sleep(5000);
		
	}
	
	public void PMSAlarmUnit(WebDriver driver1) throws Exception { //(priority=29)

		WebDriver driver = driver1;
		
	
		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(2000);
		
		
		String TotalRecords = driver.findElement(By.id(data.getData(4, 1273, 2))).getText();     //Total  TotalRecords&page
		
		System.out.println("In PMS Alarm Unit Total Records & pages  are " + TotalRecords);
		
	}	
		public void AddNewUnit(WebDriver driver1) throws Exception {            //(priority=30)

			WebDriver driver = driver1;
			
			
		click_element( driver, "id",(data.getData(4, 1274, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
			
		sendkeys( driver,"id",(data.getData(4, 1275, 2)), (data.getData(4, 1276, 2)));  //Path for Add New unit
		Thread.sleep(2000);
			
		click_element( driver, "id",(data.getData(4, 1277, 2)));  //Path for Save
		Thread.sleep(2000);
		
		
		
		
		click_element( driver, "id",(data.getData(4, 1278, 2)));  //Path for Add New unit
		Thread.sleep(2000);
	
			
		sendkeys( driver,"id",(data.getData(4, 1279, 2)), (data.getData(4, 1280, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1281, 2)));  //Path for Save
		Thread.sleep(2000);
		
		
		
		click_element( driver, "id",(data.getData(4, 1282, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
		sendkeys( driver,"id",(data.getData(4, 1283, 2)), (data.getData(4, 1284, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1285, 2)));  //Path for Save
		Thread.sleep(2000);
		
		       //Verify Add name
	
		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(2000);
		
		clear_element(driver, "id", (data.getData(4, 1286, 2))); // Clear unit name
		Thread.sleep(2000);
		
		sendkeys( driver,"id",(data.getData(4, 1286, 2)), (data.getData(4, 1276, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(2000);
		
		clear_element(driver, "id", (data.getData(4, 1286, 2))); // Clear unit name
		Thread.sleep(2000);
				
		sendkeys( driver,"id",(data.getData(4, 1286, 2)), (data.getData(4, 1280, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
		Thread.sleep(2000);
		
		clear_element(driver, "id", (data.getData(4, 1286, 2))); // Clear unit name
		Thread.sleep(2000);
			
		sendkeys( driver,"id",(data.getData(4, 1286, 2)), (data.getData(4, 1284, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
		Thread.sleep(2000);
		}
		
		public void EditUnit(WebDriver driver1) throws Exception {           //(priority=31)

			WebDriver driver = driver1;
			

			click_element( driver, "id",(data.getData(4, 1272, 2)));  //Path for Refresh
			Thread.sleep(2000);
			
			
		clear_element(driver, "id", (data.getData(4, 1286, 2))); // Clear unit name
		Thread.sleep(2000);
		
		
		  //sendkeys( driver,"id",(data.getData(4, 1287, 2)), (data.getData(4, 1288, 2));  //Path for Edit Unit
		Thread.sleep(2000);
		
		
		click_element( driver, "id",(data.getData(4, 1289, 2)));  //Path for Search Button
		Thread.sleep(2000);
		
						
		click_element( driver, "id",(data.getData(4, 1290, 2)));  //Path for Edit
		Thread.sleep(2000);
		
		
		clear_element(driver, "xpath", (data.getData(4, 1291, 2))); // Clear unit name
		Thread.sleep(2000);
		
		sendkeys( driver,"id",(data.getData(4, 1292, 2)), (data.getData(4, 1293, 2)));  //Path for Edit Unit
		Thread.sleep(2000);		
		
		click_element( driver, "id",(data.getData(4, 1294, 2)));  //Path for Save
		Thread.sleep(2000);
		
		}
		
		public void Delete(WebDriver driver1) throws Exception {      //(priority=32)

			WebDriver driver = driver1;
			
			
		clear_element(driver, "xpath", (data.getData(4, 1295, 2))); // Clear unit name
		Thread.sleep(2000);
	
		sendkeys( driver,"id",(data.getData(4, 1296, 2)), (data.getData(4, 1297, 2)));  //Path for Edit Unit
		Thread.sleep(2000);	
			
		click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1299, 2)));  //Path for Delete
		Thread.sleep(2000);
		
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Delete unit
	     String Alert = alert.getText();
	     System.out.println("Alert msg for DeleteUnit:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	     
	 	
			clear_element(driver, "xpath", (data.getData(4, 1295, 2))); // Clear unit name
			Thread.sleep(2000);
		
			sendkeys( driver,"id",(data.getData(4, 1296, 2)), (data.getData(4, 1284, 2)));  //Path for Edit Unit
			Thread.sleep(2000);	
				
			click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
			Thread.sleep(2000);
			
			click_element( driver, "id",(data.getData(4, 1299, 2)));  //Path for Delete
			Thread.sleep(2000);
			
			 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Delete unit
		     String Alert1 = alert1.getText();
		     System.out.println("Alert msg for DeleteUnit:"+Alert1);
		     alert1.accept();		
		     Thread.sleep(4000);
		    
		     
		 	
				clear_element(driver, "xpath", (data.getData(4, 1295, 2))); // Clear unit name
				Thread.sleep(2000);
			
				sendkeys( driver,"id",(data.getData(4, 1296, 2)), (data.getData(4, 1276, 2)));  //Path for Edit Unit
				Thread.sleep(2000);	
					
				click_element( driver, "id",(data.getData(4, 1298, 2)));  //Path for Search Button
				Thread.sleep(2000);
				
				click_element( driver, "id",(data.getData(4, 1299, 2)));  //Path for Delete
				Thread.sleep(2000);
				
				 Alert alert2 = driver.switchTo().alert();                                         //Alert handling for Delete unit
			     String Alert2 = alert2.getText();
			     System.out.println("Alert msg for DeleteUnit:"+Alert2);
			     alert2.accept();
			     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			     Thread.sleep(4000);
			    
	    
		}	
		
	
            public void EditBlank(WebDriver driver1) throws Exception {         //(priority=33)

              	WebDriver driver = driver1;
             
              	click_element( driver, "id",(data.getData(4, 1300, 2)));  //Path for Add New unit
        		Thread.sleep(2000);
        		     			
        		//sendkeys( driver,"id",(data.getData(4, 1301, 2)),(data.getData(4, 1302, 2)));  //Path for Add New unit
        		Thread.sleep(2000);       		
        		
        		click_element( driver, "id",(data.getData(4, 1303, 2)));  //Path for Save
        		Thread.sleep(2000);     		
        		
        		//Alert handling for Blank Edit unit
        		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Blank Edit unit
        	     String Alert = alert.getText();
        	    
        	     System.out.println("Alert msg for Blank Edit unit:"+Alert);
        	     alert.accept();
        	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        	     Thread.sleep(4000);
        		
        	     sendkeys( driver,"id",(data.getData(4, 1304, 2)), (data.getData(4, 1305, 2)));  //Path for Add New unit
         		Thread.sleep(2000);
         		
         		
         		click_element( driver, "id",(data.getData(4, 1306, 2)));  //Path for Save
        		Thread.sleep(2000);	
      		 
	
            }

			

}
