package Technical;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;

import CommonFunction.RW;

public class WorklistAssignerList extends RW {
	
	
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
	
	  public void WorklistAssignerListindex(WebDriver driver1) throws Exception   {  //(priority=9)
		   WebDriver driver = driver1;  
		   WebElement technical = driver.findElement(By.linkText(data.getData(4, 1130, 2))); //path for "Technical"
		     Actions action = new Actions(driver);
		     action.moveToElement(technical).build().perform();
		     action.moveToElement(technical).perform();
		     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		     Thread.sleep(4000);
		     
		     WebElement admin = driver.findElement(By.xpath(data.getData(4, 1131, 2)));//path for "Admin"
		     admin.click();
		     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		     Thread.sleep(4000);
		     
		     WebElement worklistassignerList = driver.findElement(By.linkText(data.getData(4, 1132, 2)));//path for "WorklistAssignorList"
		     worklistassignerList.click();
		     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		     Thread.sleep(2000);
		     
		     driver.findElement(By.id(data.getData(4, 1133, 2))).click();
		     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//Clicking on Add button
		     Thread.sleep(4000);
		     
		     driver.findElement(By.id(data.getData(4, 1134, 2))).sendKeys(data.getData(4, 1135, 2));      //Type Assignor name 
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     	     Thread.sleep(4000);
		  
     	    
		     driver.findElement(By.id(data.getData(4, 1136, 2))).click();                    //Clicking on Save button
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(4000);
		     
		     driver.findElement(By.id(data.getData(4, 1137, 2))).sendKeys(data.getData(4, 1138, 2));      //Type Assignor name in Assignor Field
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     	     Thread.sleep(4000);
     	    
     	    
     	    
     	   driver.findElement(By.id(data.getData(4, 1139, 2))).click();                     //Clicking on search button
     	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(4000);
		    
     	    
     	    driver.findElement(By.id(data.getData(4, 1140, 2))).click();       //Clicking on Edit button
     	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(4000);
		    
		    driver.findElement(By.id(data.getData(4, 1141, 2))).clear();
		    Thread.sleep(2000);
     	     driver.findElement(By.id(data.getData(4, 1142, 2))).sendKeys(data.getData(4, 1143, 2));      //Retype Assignor name
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	     Thread.sleep(4000);
    	     
    		    
		     driver.findElement(By.id(data.getData(4, 1144, 2))).click();                    //Clicking again on Save button
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(4000);
     	    
	  }
	  public void Alert(WebDriver driver1) throws Exception  {  //(priority=10)
		  WebDriver driver = driver1;  
		  
		
		     
             driver.findElement(By.id(data.getData(4, 1145, 2))).click();
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);     //Clicking on Add button
		     Thread.sleep(1000);
		     
		     driver.findElement(By.id(data.getData(4, 1146, 2)));      //Keeping Assignor name Blank 
		     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	     Thread.sleep(1000);
     	     
     	    driver.findElement(By.id(data.getData(4, 1147, 2))).click();                    //Clicking on Save button
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(3000);
     	    
		    Alert alert = driver.switchTo().alert();                                         //Alert handling for keeping the field blank
		     String Alert = alert.getText();
		     System.out.print("Alert msg for keeping Assignor name blank is:"+Alert);
		     alert.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(4000);
     	      
     	      //For Already existing Assigner name
     	    driver.findElement(By.id(data.getData(4, 1148, 2))).sendKeys(data.getData(4, 1149, 2));      //Retype Assignor name
		     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	     Thread.sleep(2000);
		  
    	     
    	     driver.findElement(By.id(data.getData(4, 1150, 2))).click();                    //Clicking on Save button
    	     driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	     Thread.sleep(3000);
 		    
 		                          
      /*	  
 		  Alert alert1 = driver.switchTo().alert();                                                  //Alert handling for Existing assignor name
 	     String Alert1 = alert1.getText();
 	     System.out.print("Alert msg for existing assignor name is:"+Alert1);
 	     alert1.accept();
 	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 	     Thread.sleep(4000);*/
   	      
   	      //For Deleting assignor
 	     
 	    driver.findElement(By.id(data.getData(4, 1151, 2))).clear();
 	    driver.findElement(By.id(data.getData(4, 1152, 2))).sendKeys(data.getData(4, 1153, 2));      //Type Assignor name in Assignor Field
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
	    
	    
	    
	   driver.findElement(By.id(data.getData(4, 1154, 2))).click();                     //Clicking on search button
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(4000);
	    

		 driver.findElement(By.xpath(data.getData(4, 1155, 2))).click();              //Deleting Assignor
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	     Thread.sleep(2000);
   	      
  	   Alert alert2 = driver.switchTo().alert();                                                  //Alert handling for Delete confirmation
	     String Alert2 = alert2.getText();
	     System.out.print("Alert msg for existing assignor name is:"+Alert2);
	     alert2.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(4000);
 	      
	     //Cancel Deletion
	        driver.findElement(By.id(data.getData(4, 1156, 2))).clear();
	 	    driver.findElement(By.id(data.getData(4, 1157, 2))).sendKeys(data.getData(4, 1158, 2));      //Type Assignor name in Assignor Field
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(4000);
		    
		    
		    
		    driver.findElement(By.id(data.getData(4, 1159, 2))).click();                     //Clicking on search button
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    Thread.sleep(4000);
		    
			 driver.findElement(By.xpath(data.getData(4, 1160, 2))).click();              //Deleting Assignor
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  	     Thread.sleep(2000);
		    
		    Alert alert3 = driver.switchTo().alert();                                                  //Alert handling for Delete confirmation
		     String Alert3 = alert3.getText();
		     System.out.print("Alert msg for existing assignor name is:"+Alert3);
		     alert3.dismiss();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(4000);
		    
 		    
	  }
	  
	  

}
