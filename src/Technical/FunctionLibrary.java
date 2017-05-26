package Technical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;
import CommonFunction.RW;

public class FunctionLibrary  extends RW {
	
	
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
     	Function Library*/
     	public void FunctionsLibrary1(WebDriver driver1) throws Exception {  //(priority=47)

           	WebDriver driver = driver1;	
         
           	WebElement technical = driver.findElement(By.linkText(data.getData(4, 1391, 2))); // pathfor "Technical"s
     		Actions action = new Actions(driver);
     		action.moveToElement(technical).build().perform();
     		action.moveToElement(technical).perform();
     		Thread.sleep(2000);

     		WebElement Admin = driver.findElement(By.xpath(data.getData(4, 1392, 2)));// path for Admin
     																					
     		Admin.click();
     		action.moveToElement(Admin).build().perform();

     		WebElement FunctionLibrary = driver.findElement(By.linkText(data.getData(4, 1393, 2))); // path for Function Library
     		FunctionLibrary.click();
  		    Thread.sleep(5000);
     		
     	}
     	
     	
     	public void AddFunction(WebDriver driver1) throws Exception {  //(priority=48)

           	WebDriver driver = driver1;	
         	Thread.sleep(2000);
         	
           	click_element( driver, "id",(data.getData(4, 1394, 2)));  //path for add Function
           	Thread.sleep(2000);
   
           	sendkeys( driver,"xpath",(data.getData(4, 1395, 2)), (data.getData(4, 1396, 2)));  //Path for Function name-PritiG
     		Thread.sleep(2000);
     		
     		click_element( driver, "id",(data.getData(4, 1399, 2)));  //path for save button
           	Thread.sleep(2000);
      
           	 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for FPlease Enter Short Code.
      	     String Alert1 = alert1.getText();
      	     System.out.println("Alert msg Function saved successfully:"+Alert1);
      	     alert1.accept();
      		Thread.sleep(1000);
      		
     		sendkeys( driver,"xpath",(data.getData(4, 1397, 2)), (data.getData(4, 1398, 2)));  //Path for short code-9867
     		Thread.sleep(2000);
     	
     		click_element( driver, "id",(data.getData(4, 1399, 2)));  //path for save button
           	Thread.sleep(1000);
      
           	Alert alert2 = driver.switchTo().alert();                                         //Alert handling for Function saved successfully
      	     String Alert2 = alert2.getText();
      	     System.out.println("Alert msg Function saved successfully:"+Alert2);
      	     alert2.accept();      	
      	     Thread.sleep(1000);
      	     
      		click_element( driver, "id",(data.getData(4, 1417, 2)));  //path for Refresh
           	Thread.sleep(2000);

           	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1396, 2)));  //Path for Function name-PritiG
     		Thread.sleep(1000);
     		
     		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
           	Thread.sleep(1000);
     	}     	
     	
     	
     	public void AddFunctionname(WebDriver driver1) throws Exception {  //(priority=49)

           	WebDriver driver = driver1;	
           	
           	click_element( driver, "id",(data.getData(4, 1417, 2)));  //path for Refresh
           	Thread.sleep(2000);
           	
           	click_element( driver, "id",(data.getData(4, 1400, 2)));  //path for add Function
           	Thread.sleep(2000);
          
           //	sendkeys( driver,"id",(data.getData(4, 1401, 2)),(data.getData(4, 1402, 2)));  //Path for Function name-
     	    	
     	//	sendkeys( driver,"id",(data.getData(4, 1403, 2)),(data.getData(4, 1404, 2)));  //Path for short code-    		
     	
     		click_element( driver, "id",(data.getData(4, 1405, 2)));  //path for save button
           	Thread.sleep(2000);
          
           	
           	Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Please Enter Function Name
      	     String Alert1 = alert1.getText();
      	     System.out.println("Alert msg Function saved successfully:"+Alert1);
      	     alert1.accept();    	  
      	     Thread.sleep(1000);
      	     
      	     
      	    sendkeys( driver,"id",(data.getData(4, 1406, 2)), (data.getData(4, 1407, 2)));  //Path for Function name-Piyu
     		Thread.sleep(2000);
     		
     	
     		sendkeys( driver,"id",(data.getData(4, 1408, 2)),(data.getData(4, 1409, 2)));  //Path for short code-98672
     		Thread.sleep(1000);
     	
     		click_element( driver, "id",(data.getData(4, 1410, 2)));  //path for save button
           	Thread.sleep(2000);
           
           	
           	Alert alert = driver.switchTo().alert();                                         //Alert handling for Function saved successfully
     	     String Alert = alert.getText();
     	     System.out.println("Alert msg Function saved successfully:"+Alert);
     	     alert.accept();
      	     Thread.sleep(1000);
      	     
      		click_element( driver, "id",(data.getData(4, 1417, 2)));  //path for Refresh
           	Thread.sleep(2000);
           	
        	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1407, 2)));  //Path for name-piyu
     		Thread.sleep(2000);
     	
           	
     		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
           	Thread.sleep(2000);
     	
     	}     	
     	
     	
     	public void EditFunction(WebDriver driver1) throws Exception {  //(priority=51)

           	WebDriver driver = driver1;
         
           	click_element( driver, "id",(data.getData(4, 1417, 2)));  //path for Refresh
           	Thread.sleep(2000);
           	
           	sendkeys( driver,"id",(data.getData(4, 1418, 2)), (data.getData(4, 1419, 2)));  //Path for name-piyu
     		Thread.sleep(2000);
     	
           	
     		click_element( driver, "id",(data.getData(4, 1420, 2)));  //path for Search button
           	Thread.sleep(2000);
         
           	click_element( driver, "id",(data.getData(4, 1421, 2)));  //path for Edit piyu
           	Thread.sleep(2000);
       
           	clear_element( driver, "id", (data.getData(4, 1422, 2))); //Clear Function Name
         	Thread.sleep(2000);
     
           	sendkeys( driver,"xpath",(data.getData(4, 1423, 2)), (data.getData(4, 1424, 2)));  //Path for name-priyanka
     		Thread.sleep(2000);
     		
     		
     		click_element( driver, "id",(data.getData(4, 1425, 2)));  //path for save button
           	Thread.sleep(2000);
           
           	
           	Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Function saved successfully
      	     String Alert1 = alert1.getText();
      	     System.out.println("Alert msg Function saved successfully:"+Alert1);
      	     alert1.accept();
      	  
      	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      	     Thread.sleep(4000);
      	     
      		click_element( driver, "id",(data.getData(4, 1417, 2)));  //path for Refresh
           	Thread.sleep(2000);
           	
        	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1424, 2)));  //Path for name-priyanka
     		Thread.sleep(2000);
     	
     		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
           	Thread.sleep(2000);
     	
     	}  
     	public void DeleteFunction(WebDriver driver1) throws Exception {  //(priority=52)

           	WebDriver driver = driver1;
           

     	click_element( driver, "id",(data.getData(4, 1426, 2)));  //path for Refresh
       	Thread.sleep(2000);

       	
       	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1396, 2)));  //Path for name-PritiG
 		Thread.sleep(2000);
 		
 		
 		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
       	Thread.sleep(2000);
       	
       	click_element( driver, "id",(data.getData(4, 1430, 2)));  //path for Delete
       	Thread.sleep(2000);
      
       	Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Delet Function 
  	     String Alert1 = alert1.getText();
  	     System.out.println("Alert msg Delete Function :"+Alert1);
  	     alert1.accept();
  	     Thread.sleep(2000);
  	     
  	    Alert alert = driver.switchTo().alert();                                         //Alert handling for Delete Function 
 	     String Alert = alert.getText();
 	     System.out.println("Alert msg Delete Function :"+Alert);
 	     alert.accept(); 
 	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	     Thread.sleep(2000);
 	     
 	    click_element( driver, "id",(data.getData(4, 1426, 2)));  //path for Refresh
       	Thread.sleep(2000);

       	
       	sendkeys( driver,"id",(data.getData(4, 1437, 2)), (data.getData(4, 1396, 2)));  //Path for name-PritiG
 		Thread.sleep(2000);
 		
 		
 		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
       	Thread.sleep(2000);
 	     
 	     

      	click_element( driver, "id",(data.getData(4, 1431, 2)));  //path for Refresh
        	Thread.sleep(2000);
       
        	
        	sendkeys( driver,"id",(data.getData(4, 1427, 2)), (data.getData(4, 1413, 2)));  //Path for name-Pihu 
  		Thread.sleep(2000);
  	    	
  		click_element( driver, "id",(data.getData(4, 1429, 2)));  //path for Search button
        	Thread.sleep(2000);
       
        	
        	click_element( driver, "id",(data.getData(4, 1435, 2)));  //path for Delete
        	Thread.sleep(2000);
        	
        	Alert alert3 = driver.switchTo().alert();                                         //Alert handling for Delet Function 
   	     String Alert3 = alert3.getText();
   	     System.out.println("Alert msg Delete Function :"+Alert3);
   	     alert3.accept();
   	 
   	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	     Thread.sleep(4000);
   	     
   	    Alert alert4 = driver.switchTo().alert();                                         //Alert handling for Delete Function 
  	     String Alert4 = alert4.getText();
  	     System.out.println("Alert msg Delete Function :"+Alert4);
  	     alert4.accept();
  	    
  	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	     Thread.sleep(4000);
  	     
  	     
  	     

       	click_element( driver, "id",(data.getData(4, 1436, 2)));  //path for Refresh
         	Thread.sleep(2000);
        
         	
         	sendkeys( driver,"id",(data.getData(4, 1427, 2)), (data.getData(4, 1413, 2)));  //Path for name-priyanka
   		Thread.sleep(2000);
   		
         	
   		click_element( driver, "id",(data.getData(4, 1439, 2)));  //path for Search button
         	Thread.sleep(2000);
        
         	
         	click_element( driver, "id",(data.getData(4, 1440, 2)));  //path for Delete
         	Thread.sleep(2000);
         
       	
         	Alert alert6 = driver.switchTo().alert();                                         //Alert handling for Delet Function 
    	     String Alert6 = alert6.getText();
    	     System.out.println("Alert msg Delete Function :"+Alert6);
    	     alert6.accept();
    	   
    	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	     Thread.sleep(4000);
    	     
    	    Alert alert7 = driver.switchTo().alert();                                         //Alert handling for Delete Function 
   	     String Alert7 = alert7.getText();
   	     System.out.println("Alert msg Delete Function :"+Alert7);
   	     alert7.accept();
   	  
   	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   	     Thread.sleep(4000);

        	click_element( driver, "id",(data.getData(4, 1436, 2)));  //path for Refresh
          	Thread.sleep(2000);
         
          	
          	sendkeys( driver,"id",(data.getData(4, 1427, 2)), (data.getData(4, 1424, 2)));  //Path for name-priyanka
    		Thread.sleep(2000);
    		
          	
    		click_element( driver, "id",(data.getData(4, 1439, 2)));  //path for Search button
          	Thread.sleep(2000);
  	     
  }
     	
     	public void Blankcode(WebDriver driver1) throws Exception {  //(priority=53)

           	WebDriver driver = driver1;
    
           	click_element( driver, "id",(data.getData(4, 1441, 2)));  //path for Refresh
           	Thread.sleep(2000);
          

           	click_element( driver, "id",(data.getData(4, 1442, 2)));  //path for Add Function
           	Thread.sleep(2000);
          

           	click_element( driver, "id",(data.getData(4, 1443, 2)));  //path for Save
           	Thread.sleep(2000);
          
           	
           	 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please Enter Function Name.
     	     String Alert = alert.getText();
     	     System.out.println("Alert msg Please Enter Function Name. :"+Alert);
     	     alert.accept();
     	    
     	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     	     Thread.sleep(4000);
     	     
     	     
     	     click_element( driver, "id",(data.getData(4, 1444, 2)));  //path for close Popu pbutton
          	Thread.sleep(2000);
          	
        	           	     
     	}
     	public void Samename(WebDriver driver1) throws Exception {  //(priority=54)

           	WebDriver driver = driver1;
       
           	
           	click_element( driver, "id",(data.getData(4, 1445, 2)));  //path for Refresh
           	Thread.sleep(1000);
          
           	
           	click_element( driver, "id",(data.getData(4, 1446, 2)));  //path for Add Function
           	Thread.sleep(1000);           	
      
          	sendkeys( driver,"xpath",(data.getData(4, 1447, 2)), (data.getData(4, 1448, 2)));  //Path for name-Priyanka Function1u 
      		Thread.sleep(2000);
      	
      		
      		sendkeys( driver,"id",(data.getData(4, 1449, 2)), (data.getData(4, 1450, 2)));  //Path for Code-PF1 
      		Thread.sleep(1000);
      		
      		
      		click_element( driver, "id",(data.getData(4, 1451, 2)));  //path for Save
           	Thread.sleep(2000);
          
           	
           	click_element( driver, "id",(data.getData(4, 1452, 2)));  //path for closePopupbutton
           	Thread.sleep(2000);
          

     	}
     	
     	public void TotalFunctionRecords(WebDriver driver1) throws Exception {  //(priority=55)

           	WebDriver driver = driver1;
           
           	
           	click_element( driver, "id",(data.getData(4, 1453, 2)));  //path for Refresh
           	Thread.sleep(2000);
         
           	
           	String VerifyType = driver.findElement(By.xpath(data.getData(4, 1454, 2))).getText();     //Total  Function Record
     		System.out.println("Total Function Library Records  are " + VerifyType);
     	
     	}
           	
}

