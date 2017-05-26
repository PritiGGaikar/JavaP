package Technical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import CommonFunction.RW;

public class PMSAccess extends RW {
	
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
	
	/*Technical
	Admin
	PMS Access*/
	public void PMSAccess1(WebDriver driver1) throws Exception {  //(priority=39)

      	WebDriver driver = driver1;
  
     	WebElement technical = driver.findElement(By.linkText(data.getData(4, 1349, 2))); // pathfor "Technical"s
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
	
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1350, 2)));// path for Admin
																					
		Admin.click();
		
		action.moveToElement(Admin).build().perform();
		Thread.sleep(2000);

		WebElement Access = driver.findElement(By.linkText(data.getData(4, 1351, 2))); // pathfor "PMS Access"
		Thread.sleep(5000);
		Access.click();
	
	}   	
      	
	public void AddPMSAccess(WebDriver driver1) throws Exception {  //(priority=40)(Verify)

      	WebDriver driver = driver1;
    
      	click_element( driver, "id",(data.getData(4, 1352, 2)));  //path for Add PMS Access
		Thread.sleep(2000);
		
		dropdown(driver, "id", (data.getData(4, 1353, 2)),(data.getData(4, 1354, 2)));//Dropdown Add PMS Access-J/E
		Thread.sleep(2000);
		
		
		dropdown(driver, "id", (data.getData(4, 1355, 2)),(data.getData(4, 1356, 2)));//Dropdown Add PMS Access-VERIFY
		Thread.sleep(2000);
	
		
		click_element( driver, "id",(data.getData(4, 1357, 2)));  //path for Save Button
		Thread.sleep(2000);
		
		
		Alert alert = driver.switchTo().alert();                                         //Alert handling for Add Access Verify
	     String Alert = alert.getText();
	     System.out.println("Alert msg for Add Access Verify:"+Alert);
	     alert.accept();
	 
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	  
}      		
	public void EditPMSAccess(WebDriver driver1) throws Exception {  //(priority=41)(Verify)

      	WebDriver driver = driver1;
      	
      	click_element( driver, "id",(data.getData(4, 1358, 2)));  //path for Refresh
		Thread.sleep(2000);
		
		
		click_element( driver, "id",(data.getData(4, 1359, 2)));  //path for Edit Add PMS Access
		Thread.sleep(2000);
	
		
		dropdown(driver, "id", (data.getData(4, 1360, 2)),(data.getData(4, 1361, 2)));//Dropdown Edit Add PMS Access-3/O
		Thread.sleep(2000);
		
		
		click_element( driver, "id",(data.getData(4, 1362, 2)));  //path for Save Button
		Thread.sleep(2000);
		
		
		
		Alert alert = driver.switchTo().alert();                                         //Alert handling for Access updated successfully
  	     String Alert = alert.getText();
  	     System.out.println("Alert msg for Access updated successfully:"+Alert);
  	     alert.accept();  
  	     Thread.sleep(4000);

  	  
	
	}       
	
	public void AddPMSAccessD(WebDriver driver1) throws Exception {  //(priority=42)(Delete)

      	WebDriver driver = driver1;
      
        
      	click_element( driver, "id",(data.getData(4, 1363, 2)));  //path for Add PMS Access
		Thread.sleep(2000);
		
		dropdown(driver, "id", (data.getData(4, 1364, 2)),(data.getData(4, 1365, 2)));//Dropdown Add PMS Access-J/E
		Thread.sleep(2000);
		
		
		dropdown(driver, "id", (data.getData(4, 1366, 2)),(data.getData(4, 1367, 2)));//Dropdown Add PMS Access-J/E DELETE
		Thread.sleep(2000);
		
		
		
		click_element( driver, "id",(data.getData(4, 1368, 2)));  //path for Save Button
		Thread.sleep(2000);
		
		
		Alert alert = driver.switchTo().alert();                                         //Alert handling for Add Access Verify
	     String Alert = alert.getText();
	     System.out.println("Alert msg for Add Access Verify:"+Alert);
	     alert.accept();
	   
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	
}      		
	
	public void Add1(WebDriver driver1) throws Exception {  //(priority=43)(Add PMS Access without selection)

      	WebDriver driver = driver1;	
    
      	click_element( driver, "id",(data.getData(4, 1369, 2)));  //path for Add PMS Access
		Thread.sleep(2000);
		

		click_element( driver, "id",(data.getData(4, 1370, 2)));  //path for Save Button
		Thread.sleep(2000);
	

		Alert alert = driver.switchTo().alert();                                         //Alert handling for Select Rank
	     String Alert = alert.getText();
	     System.out.println("Alert msg for Select Rank:"+Alert);
	     alert.accept();
	
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
		

		dropdown(driver, "id", (data.getData(4, 1371, 2)),(data.getData(4, 1372, 2)));//Dropdown Add PMS Access-4/E
		Thread.sleep(2000);
		
		
		dropdown(driver, "id", (data.getData(4, 1373, 2)),(data.getData(4, 1374, 2)));//Dropdown Add PMS Access-VERIFY
		Thread.sleep(2000);
		
		
		
		click_element( driver, "id",(data.getData(4, 1375, 2)));  //path for Save Button
		Thread.sleep(2000);
		
		
		Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Add Access Verify
	     String Alert1 = alert1.getText();
	     System.out.println("Alert msg for Add Access Verify:"+Alert1);
	     alert1.accept();
	     Thread.sleep(4000);
	  
		        		   	
	}   	
	
	public void ActionTypeDelete(WebDriver driver1) throws Exception {  //(priority=44)

      	WebDriver driver = driver1;	
      
      	
      	click_element( driver, "id",(data.getData(4, 1376, 2)));  //path for Refresh
      	Thread.sleep(2000);
      
      	
      	
      	dropdown(driver, "id", (data.getData(4, 1377, 2)),(data.getData(4, 1378, 2)));//Dropdown Action Type Delete
 		Thread.sleep(2000);
 		
	

 		click_element( driver, "id",(data.getData(4, 1379, 2)));  //path for Search Button
 		Thread.sleep(2000);
 		
 		
 		String DeleteType = driver.findElement(By.id(data.getData(4, 1380, 2))).getText();     //Total  DeleteType records  
 	
		System.out.println("Total  Delete Type records  are " + DeleteType);
		
		 
 		
	} 
	
	public void ActionTypeVerify(WebDriver driver1) throws Exception {  //(priority=45)

      	WebDriver driver = driver1;	
      
      	
      	click_element( driver, "id",(data.getData(4, 1381, 2)));  //path for Refresh
      	Thread.sleep(2000);
      
      	
      	dropdown(driver, "id", (data.getData(4, 1382, 2)),(data.getData(4, 1383, 2)));//Dropdown Action Type Verify
 		Thread.sleep(2000);
 		
	

 		click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
 		Thread.sleep(2000);
 		
 		
 		String VerifyType = driver.findElement(By.id(data.getData(4, 1385, 2))).getText();     //Total  VERIFY Type records  
 	
		System.out.println("Total  Delete Type records  are " + VerifyType);
		
	}
	public void Delete(WebDriver driver1) throws Exception {  //(priority=70)

      	WebDriver driver = driver1;
      	
    	click_element( driver, "id",(data.getData(4, 1386, 2)));  //path for Refresh
      	Thread.sleep(2000);
      
    	dropdown(driver, "id", "ctl00_MainContent_ddlAction_Type","VERIFY");//Dropdown Action Type Verify
 		Thread.sleep(2000);
 		

 		click_element( driver, "id","ctl00_MainContent_btnFilter");  //path for Search Button
 		Thread.sleep(2000);
 		
 		click_element( driver, "id","ctl00_MainContent_gvPMSAccess_ctl06_ImgDelete");  //path for Delete
      	Thread.sleep(2000);
      	
      	Alert alert = driver.switchTo().alert();                                         //Alert handling for Are you sure want to delete
 	     String Alert = alert.getText();
 	     System.out.println("Alert msg for Access updated successfully:"+Alert);
 	     alert.accept();  
 	     Thread.sleep(4000);


      	click_element( driver, "id",(data.getData(4, 1386, 2)));  //path for Refresh
      	Thread.sleep(2000);
     
      	dropdown(driver, "id", "ctl00_MainContent_ddlAction_Type","VERIFY");//Dropdown Action Type Verify
 		Thread.sleep(2000);
 		

 		click_element( driver, "id","ctl00_MainContent_btnFilter");  //path for Search Button
 		Thread.sleep(2000);
 		
 		click_element( driver, "id","ctl00_MainContent_gvPMSAccess_ctl02_ImgDelete");  //path for Delete
      	Thread.sleep(2000);
      	
      	Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Are you sure want to delete
	     String Alert1 = alert1.getText();
	     System.out.println("Alert msg for Access updated successfully:"+Alert1);
	     alert1.accept();  
	     Thread.sleep(4000);
      	

	 	click_element( driver, "id","ctl00_MainContent_btnFilter");  //path for Search Button
	 	Thread.sleep(2000);

      	dropdown(driver, "id", "ctl00_MainContent_ddlAction_Type","DELETE");//Dropdown Action Type Delete
 		Thread.sleep(2000);
 		
 		click_element( driver, "id",(data.getData(4, 1384, 2)));  //path for Search Button
 		Thread.sleep(2000);
      	
 		click_element( driver, "id","ctl00_MainContent_gvPMSAccess_ctl06_ImgDelete");  //path for Delete
      	Thread.sleep(2000);
      	
		
		Alert alert3 = driver.switchTo().alert();                                         //Alert handling for Access updated successfully
  	     String Alert3 = alert3.getText();
  	     System.out.println("Alert msg for Access updated successfully:"+Alert3);
  	     alert3.accept();  
  	     Thread.sleep(4000);

	}	
	public void TotalRecords(WebDriver driver1) throws Exception {  //(priority=71)

      	WebDriver driver = driver1;	
    
      	
      	click_element( driver, "id",(data.getData(4, 1386, 2)));  //path for Refresh
      	Thread.sleep(2000);
      	
      	                	

 		click_element( driver, "id",(data.getData(4, 1387, 2)));  //path for Search Button
 		Thread.sleep(2000);
 		
 		
 		String VerifyType = driver.findElement(By.id(data.getData(4, 1388, 2))).getText();     //Total  Record PMS Access
 		
		System.out.println("Total Record PMS Access  are " + VerifyType);
		
	}
	
		

}
