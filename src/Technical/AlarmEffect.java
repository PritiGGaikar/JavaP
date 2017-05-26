package Technical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.relevantcodes.extentreports.ExtentReports;


import CommonFunction.RW;

public class AlarmEffect extends RW{
	
	 
	
	 /*   Technical
	Admin
	Alarm Effect
*/private static ExtentReports report;
public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
    if (report == null) {
        report = new ExtentReports("C:\\Users\\Priti\\workspace\\All Admin\\Report\\All admin.html", false);
        
        report
            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
            .addSystemInfo("Environment", "QA");
    }
    
    return report;
}

	public void AlarmEffects(WebDriver driver1) throws Exception {   //(priority=34)

		WebDriver driver = driver1;
	

		WebElement technical = driver.findElement(By.linkText(data.getData(4, 1309, 2))); // pathfor "Technical"
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		Thread.sleep(2000);

		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1310, 2)));// path for Admin
																					
		Admin.click();
		
		action.moveToElement(Admin).build().perform();

		WebElement AlarmEffect = driver.findElement(By.linkText(data.getData(4, 1311, 2))); // path for Alarm Effect
		AlarmEffect.click();
	
		Thread.sleep(5000);
		
		click_element( driver, "id",(data.getData(4, 1312, 2)));  //Path for Refresh
		Thread.sleep(2000);
		
		String TotalRecords = driver.findElement(By.id(data.getData(4, 1313, 2))).getText();     //Total  PMS Alarm Effect 
		
		System.out.println("In PMS Alarm Effect  Total Records & pages  are " + TotalRecords);
		
	}

	public void AddNewEffect(WebDriver driver1) throws Exception {   //(priority=35)

		WebDriver driver = driver1;
		

		click_element( driver, "id",(data.getData(4, 1314, 2)));  //Path for Add New Effect
		Thread.sleep(2000);
		
		sendkeys( driver,"id",(data.getData(4, 1315, 2)), (data.getData(4, 1316, 2)));  //Path for Add New Effect name
		Thread.sleep(2000);
		
		
		click_element( driver, "id",(data.getData(4, 1317, 2)));  //Path for Save
		Thread.sleep(2000);
		
		
		
		
		click_element( driver, "id",(data.getData(4, 1318, 2)));  //Path for Add New Effect
		Thread.sleep(2000);
		
			
		sendkeys( driver,"id",(data.getData(4, 1319, 2)), (data.getData(4, 1320, 2)));  //Path for Add New Effect name
		Thread.sleep(2000);
		
		
		click_element( driver, "id",(data.getData(4, 1321, 2)));  //Path for Save
		Thread.sleep(2000);
		
		
		
		
		click_element( driver, "id",(data.getData(4, 1322, 2)));  //Path forAdd New Effect
		Thread.sleep(2000);
		
			
		sendkeys( driver,"id",(data.getData(4, 1323, 2)), (data.getData(4, 1324, 2)));  //Path for Add New Effect name
		Thread.sleep(2000);
		
		
		click_element( driver, "id",(data.getData(4, 1325, 2)));  //Path for Save
		Thread.sleep(2000);
		    	        		
}
	public void EditEffect(WebDriver driver1) throws Exception {  //(priority=36)

		WebDriver driver = driver1;
		
	clear_element(driver, "id", (data.getData(4, 1326, 2))); // Clear unit name
	Thread.sleep(2000);
	
	
	sendkeys( driver,"id",(data.getData(4, 1327, 2)), (data.getData(4, 1328, 2)));  //Path for Edit Unit
	Thread.sleep(2000);
	
	click_element( driver, "id",(data.getData(4, 1329, 2)));  //Path for Search Button
	Thread.sleep(2000);
	
					
	click_element( driver, "id",(data.getData(4, 1330, 2)));  //Path for Edit
	Thread.sleep(2000);
	
	
	clear_element(driver, "xpath", (data.getData(4, 1331, 2))); // Clear unit name
	Thread.sleep(2000);
	
	sendkeys( driver,"xpath",(data.getData(4, 1332, 2)), (data.getData(4, 1333, 2)));  //Path for Edit Unit
	Thread.sleep(2000);	
	
	click_element( driver, "id",(data.getData(4, 1334, 2)));  //Path for Save
	Thread.sleep(2000);

	}
	
	
	
	public void Delete(WebDriver driver1) throws Exception {   //(priority=37)

		WebDriver driver = driver1;
		
		
	clear_element(driver, "id", (data.getData(4, 1335, 2))); // Clear unit name
	Thread.sleep(2000);
	
	sendkeys( driver,"id",(data.getData(4, 1336, 2)), (data.getData(4, 1337, 2)));  //Path for Edit Unit
	Thread.sleep(2000);
		
	click_element( driver, "id",(data.getData(4, 1338, 2)));  //Path for Search Button
	Thread.sleep(2000);
	
	
	click_element( driver, "id",(data.getData(4, 1339, 2)));  //Path for Delete
	Thread.sleep(2000);
	
	 Alert alert = driver.switchTo().alert();                                         //Alert handling for Delete unit
     String Alert = alert.getText();
     System.out.println("Alert msg for DeleteEffect:"+Alert);
     alert.accept();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     Thread.sleep(4000);
	
	}	
	
	public void EditBlank(WebDriver driver1) throws Exception {  //(priority=38)


      	WebDriver driver = driver1;
    

      	click_element( driver, "id",(data.getData(4, 1340, 2)));  //Path for Edit Effect
		Thread.sleep(2000);
	
			
		//sendkeys( driver,"id",(data.getData(4, 1341, 2)), (data.getData(4, 1342, 2)));  //Path for Add New unit
		Thread.sleep(2000);
		
		click_element( driver, "id",(data.getData(4, 1343, 2)));  //Path for Save
		Thread.sleep(2000);
	
		//Alert handling for Blank Edit unit
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Blank Edit unit
	     String Alert = alert.getText();
	     System.out.println("Alert msg for Blank Edit Effect:"+Alert);
	     alert.accept();
	   
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
		
	     sendkeys( driver,"id",(data.getData(4, 1344, 2)), (data.getData(4, 1345, 2)));  //Path for Add New unit
 		Thread.sleep(2000);
 	
 		
 		click_element( driver, "id",(data.getData(4, 1346, 2)));  //Path for Save
		Thread.sleep(2000);	
		

    }
	

}
