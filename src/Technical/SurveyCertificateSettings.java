package Technical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import CommonFunction.RW;

public class SurveyCertificateSettings extends RW{

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
	
	public void Survey(WebDriver driver1) throws InterruptedException {         //(priority=0)

		WebDriver driver = driver1;
		WebElement technical = driver.findElement(By.linkText("Technical")); // pathfor "Technical"s
		Actions action = new Actions(driver);
		action.moveToElement(technical).build().perform();
		action.moveToElement(technical).perform();
		Thread.sleep(2000);
		

		WebElement Admin = driver.findElement(By.xpath(".//*[@id='nav']/li[8]/ul/li[1]/a/span"));// path for Admin
																					
		Admin.click();
		action.moveToElement(Admin).build().perform();
		

		WebElement AlarmUnit = driver.findElement(By.linkText("Survey and Certificate Settings")); // path for Surve Certificate
		AlarmUnit.click();
	
		Thread.sleep(5000);
		
	}
	//--------------------------------------ADD Add New SurveyCategory -----------------------------------------------------------//
	public void MainCategory(WebDriver driver1) throws Exception {  //(priority=1)

		WebDriver driver = driver1;
		
		
		click_element(driver, "id","__tab_ctl00_MainContent_TabPanel_tabSurveyCategory"); //Click on SurveyCategory
		Thread.sleep(2000);

		 
        WebElement iframe=driver.findElement(By.id("iframe1"));   //Switching to the frame
        driver.switchTo().frame(iframe);		          
        Thread.sleep(3000);
        
		click_element(driver, "xpath",".//*[@title='Refresh']"); //Click on Refresh
		Thread.sleep(2000);
				
		click_element(driver, "xpath",".//*[@id='ctl00_MainContent_ImgAdd']"); //Add New SurveyCategory
		Thread.sleep(1000);
		
		dropdown(driver, "id", "ctl00_MainContent_ddlCategoryType","Main Category");// Dropdown -->Category Type-->Main Category
		Thread.sleep(1000);
	
		clear_element(driver, "id", "ctl00_MainContent_txtCatName");// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtCatName", "Technical1"); //Sendkeys for Category Name-->Technical1
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
		Thread.sleep(1000);

		//Alert handling for Category is saved successfully.
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully..
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
		//  driver.switchTo().defaultContent();
	      Thread.sleep(5000);
	     
	     driver.switchTo().activeElement();
	     
	    // click_element(driver, "id","closePopupbutton"); //Click on close Popupbutton
		 Thread.sleep(1000);
			 
//-----------------------------------------------------Search ADD Add New SurveyCategory ------------------------------------------//
			 
		clear_element(driver, "id","ctl00_MainContent_txtfilter"); //Clear Category Name
        Thread.sleep(1000);
		    
	    sendkeys(driver,"id", "ctl00_MainContent_txtfilter", "Technical1");//Sendkeys for Category Name
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
		Thread.sleep(1000);
		
//------------------------------------------------- Edit ADD Add New SurveyCategory -----------------------------------------------------------//
		
		click_element(driver, "id","ctl00_MainContent_GridView_Category_ctl02_ImgUpdate"); //Click on Edit
		Thread.sleep(1000);
		
		clear_element(driver, "id","ctl00_MainContent_txtCatName"); //Clear Category Name
		Thread.sleep(1000);
		    
		sendkeys(driver,"id", "ctl00_MainContent_txtCatName", "PritiGaikar"); //Retype categary name
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Category is updated successfully.
		 Alert alert1= driver.switchTo().alert();                                         //Alert handling for Category is updated successfully.
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
  //---------------------------------------------------Delete New SurveyCategory -----------------------------------------------------------//
		 /*
			clear_element(driver, "id","ctl00_MainContent_txtfilter"); //Clear Category Name
	        Thread.sleep(1000);
			    
		    sendkeys(driver,"id", "ctl00_MainContent_txtfilter", "PritiGaikar");//Sendkeys for Category Name
			Thread.sleep(1000);
			
			click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
			Thread.sleep(1000);
	     
	     click_element(driver, "id","ctl00_MainContent_GridView_Category_ctl02_ImgDelete"); //Click on Delete
		 Thread.sleep(1000);
		 
		//Alert handling for Are you sure you want to delete
		 Alert alert2= driver.switchTo().alert();                                         //Alert handling for Are you sure you want to delete
	     String Alert2 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     */
	     click_element(driver, "xpath",".//*[@title='Refresh']"); //Click on Refresh
	     Thread.sleep(2000);
		
	}
	//--------------------------------------------------ADD  New Sub Category -----------------------------------------------------------//
	
	public void SubCategory(WebDriver driver1) throws Exception {  //(priority=2)

		WebDriver driver = driver1;
	
		click_element(driver, "xpath",".//*[@title='Refresh']"); //Click on Refresh
		Thread.sleep(2000);
				
		click_element(driver, "xpath",".//*[@id='ctl00_MainContent_ImgAdd']"); //Add New SurveyCategory
		Thread.sleep(1000);
		
		dropdown(driver, "id", "ctl00_MainContent_ddlCategoryType","Sub Category");// Dropdown -->Category Type-->Sub Category
		Thread.sleep(1000);
	
		clear_element(driver, "id", "ctl00_MainContent_txtCatName");// Clear Category Name
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtCatName", "Technical"); //Sendkeys for Category Name-->Technical1
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Main category is mandatory.
		 Alert alert = driver.switchTo().alert();                                         //Alert handling for Main category is mandatory.
	     String Alert = alert.getText();    	   
	     System.out.println("Alert msg for:"+Alert);
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	    
			
		sendkeys(driver,"id", "ctl00_MainContent_ddlMainCategory", "PritiGaikar"); //Sendkeys for Main Name-->PritiGaikar
		Thread.sleep(1000);
			
		click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Category is saved successfully
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	  
	     
	    click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
		Thread.sleep(2000);
	     
/*
	     click_element(driver, "id","ctl00_MainContent_ImgAdd"); //Click on Add
	     Thread.sleep(2000);
	*/
	    /*  driver.switchTo().activeElement();
	     Thread.sleep(1000);*/
	  /*   
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(driver.findElement(By.id("iframe0")));
         Thread.sleep(5000);*/
	}	
	//-------------------------------------------------Survey Certificate-----------------------------------------------------------//
	
		public void SurveyCertificate(WebDriver driver1) throws Exception {  //(priority=3)

			WebDriver driver = driver1;  

		click_element(driver, "xpath",".//*[@id='__tab_ctl00_MainContent_TabPanel_tabSurveyCertificate']/span"); //Click on SurveyCertificate
		System.out.println("clicked");
		Thread.sleep(1000);
				
		 
        WebElement iframe=driver.findElement(By.id("iframe0"));   //Switching to the frame
        driver.switchTo().frame(iframe);		          
        Thread.sleep(3000);	
        
		Thread.sleep(1000);
		click_element(driver, "id","ctl00_MainContent_ImgAdd"); //Click on Add Certificate
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtCertificateName", "Jibe Development"); //Sendkeys for Certificate Name "Jibe Development"
		Thread.sleep(1000);
		
		dropdown(driver, "id", "ctl00_MainContent_ddlSurvey_MainCategory","PritiGaikar");// Dropdown -->Main Category Name-->PritiGaikar
		Thread.sleep(1000);
		
		dropdown(driver, "id", "ctl00_MainContent_ddlSurvey_Category","Technical");// Dropdown -->Sub Category Name-->Technical
		Thread.sleep(1000);
		
		sendkeys(driver,"id", "ctl00_MainContent_txtTerm", "2"); //Sendkeys for Tern " 2"
		Thread.sleep(1000);

		sendkeys(driver,"id", "ctl00_MainContent_txtGraceRange", "1"); //Sendkeys for Rang "1"
		Thread.sleep(1000);
		
		radioButton(driver, "id", "ctl00_MainContent_chkAlert");//Radio button for Alert
		Thread.sleep(1000);
		
		radioButton(driver, "id", "ctl00_MainContent_chkInspectionRequired");  //Radio button for Inspection Required
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
		Thread.sleep(1000);
		

		//Alert handling for Category is saved successfully
		 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully
	     String Alert1 = alert1.getText();    	   
	     System.out.println("Alert msg for:"+Alert1);
	     alert1.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
//----------------------------------------------Saving second cerificate------------------------------------------------------------------//
	     
		click_element(driver, "id","ctl00_MainContent_ImgAdd"); //Click on Add Certificate
		Thread.sleep(1000);
				     
	    sendkeys(driver,"id", "ctl00_MainContent_txtCertificateName", "Jibe Development"); //Sendkeys for Certificate Name "Jibe Development"
		Thread.sleep(1000);
			
		dropdown(driver, "id", "ctl00_MainContent_ddlSurvey_MainCategory","PritiGaikar");// Dropdown -->Main Category Name-->PritiGaikar
		Thread.sleep(1000);
			
		dropdown(driver, "id", "ctl00_MainContent_ddlSurvey_Category","Technical1");// Dropdown -->Sub Category Name-->Technical
		Thread.sleep(1000);
			
		sendkeys(driver,"id", "ctl00_MainContent_txtTerm", "2"); //Sendkeys for Tern " 2"
		Thread.sleep(1000);

		sendkeys(driver,"id", "ctl00_MainContent_txtGraceRange", "1"); //Sendkeys for Rang "1"
		Thread.sleep(1000);
			
		radioButton(driver, "id", "ctl00_MainContent_chkAlert");//Radio button for Alert
		Thread.sleep(1000);
			
		radioButton(driver, "id", "ctl00_MainContent_chkInspectionRequired");  //Radio button for Inspection Required
		Thread.sleep(1000);
			
		click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
		Thread.sleep(1000);
			

			//Alert handling for Category name already exists in the selected category.
			 Alert alert = driver.switchTo().alert();                                         //Alert handling for Category name already exists in the selected category.
		     String Alert = alert.getText();    	   
		     System.out.println("Alert msg for:"+Alert);
		     alert.accept();
		     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		     Thread.sleep(2000);
		     
		clear_element(driver, "id","ctl00_MainContent_txtCertificateName"); //Clear Certificate Name
		Thread.sleep(1000);
			
		     
	    sendkeys(driver,"id", "ctl00_MainContent_txtCertificateName", "Jibe Development1"); //Sendkeys for Certificate Name "Jibe Development1"
		Thread.sleep(1000);
		
		click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
		Thread.sleep(1000);

		//Alert handling for Category is saved Successfully.
		 Alert alert3 = driver.switchTo().alert();                                         //Alert handling for Category is saved successfully
	     String Alert3 = alert3.getText();    	   
	     System.out.println("Alert msg for:"+Alert3);
	     alert3.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
//---------------------------------------------------------Delete cerificate------------------------------------------------------------------//	
		     
		    
	click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
	Thread.sleep(1000);
	    
    clear_element(driver, "id","ctl00_MainContent_txtfilter"); //Click on Refresh
    Thread.sleep(1000);
		
	 sendkeys(driver,"id", "ctl00_MainContent_txtfilter", "Jibe Development1"); //Send keys For Certificate Name
	 Thread.sleep(1000); 
	 
	 click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
	 Thread.sleep(1000);
	 
	 click_element(driver, "id","ctl00_MainContent_GridView_Certificate_ctl02_ImgDelete"); //Click on Delete
	 Thread.sleep(1000);
	 

		//Alert handling for delete Certificate
		 Alert alert2 = driver.switchTo().alert();                                         //Alert handling for  delete Certificate
	     String Alert2 = alert2.getText();    	   
	     System.out.println("Alert msg for:"+Alert2);
	     alert2.accept();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     Thread.sleep(2000);
	     
	 click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
	 Thread.sleep(1000);
	 
		
	dropdown(driver, "id", "ctl00_MainContent_ddlMainCategory","PritiGaikar");// Dropdown -->Main Category Name-->PritiGaikar
	Thread.sleep(1000);
	
	
	dropdown(driver, "id", "ctl00_MainContent_ddlCategoryFilter","Technical");// Dropdown -->Sub Category Name-->Technical
	Thread.sleep(1000);
	
	click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
    Thread.sleep(1000);
    

  // driver.switchTo().activeElement();
     Thread.sleep(1000);

		     
}	
//-------------------------------------------------------------Survey Vessel assignment------------------------------------------------------------------//
		
			public void SurveyAssign(WebDriver driver1) throws Exception {  //(priority=4)

				WebDriver driver = driver1;  
				
	click_element(driver, "xpath",".//*[@id='__tab_ctl00_MainContent_TabPanel_tabSurveyvesselassignment']/span"); //Click on Survey Vessel assignment
	Thread.sleep(1000);		
	
	 
    WebElement iframe=driver.findElement(By.id("iframe5"));   //Switching to the frame
    driver.switchTo().frame(iframe);		          
    Thread.sleep(3000);	
	
	
	dropdown(driver, "id", "ctl00_MainContent_ddlMainCategory","PritiGaikar");// Dropdown -->Main Category Name-->PritiGaikar
	Thread.sleep(1000);
	
	dropdown(driver, "id", "ctl00_MainContent_ddlCategoryFilter","Technical");// Dropdown -->Sub Category Name-->Technical
	Thread.sleep(1000);
	
	click_element(driver, "id","ctl00_MainContent_GridView_Certificate_ctl02_btnAssign"); //Click on Assign
	Thread.sleep(1000);	
	
	//Alert handling for Please select vesse
	 Alert alert = driver.switchTo().alert();                                         //Alert handling for Please select vesse
    String Alert = alert.getText();    	   
    System.out.println("Alert msg for:"+Alert);
    alert.accept();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(2000);
    

	dropdown(driver, "id", "ctl00_MainContent_ddlFleet","Fleet-B");// Dropdown -->Fleet
	Thread.sleep(1000);
	
	dropdown(driver, "id", "ctl00_MainContent_ddlVessel","HARUKA");// Dropdown -->Vessel---->HARUKA
	Thread.sleep(1000);
	
	click_element(driver, "id","ctl00_MainContent_GridView_Certificate_ctl02_btnAssign"); //Click on Assign
	Thread.sleep(1000);	
	
	clear_element(driver, "id","ctl00_MainContent_txtEquipmentType"); //Clear Equipment Type
	Thread.sleep(1000);	
	
	 sendkeys(driver,"id", "ctl00_MainContent_txtEquipmentType", "EquipType"); //Send keys For Equipment Type"EquipType"
	 Thread.sleep(1000); 
	 
	 click_element(driver, "id","ctl00_MainContent_btnSaveAssignment"); //Click on Assign
	 Thread.sleep(1000);
	 
	 click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
	 Thread.sleep(1000);
										
}				
//-------------------------------------------------------------Certificate Authority-----------------------------------------------------------------//
			
			public void CertificateAuthority(WebDriver driver1) throws Exception {  //(priority=5)

				WebDriver driver = driver1;  
				
	click_element(driver, "xpath",".//*[@id='__tab_ctl00_MainContent_TabPanel_tabCertificateAuthority']/span"); //Click on Certificate Authority
	Thread.sleep(1000);		
				
				 
	WebElement iframe=driver.findElement(By.id("iframe2"));   //Switching to the frame
	driver.switchTo().frame(iframe);		          
	Thread.sleep(3000);	
	
	click_element(driver, "id","ctl00_MainContent_lnkAddNewAuthority"); //Click on Add New Certificate Authority
	Thread.sleep(1000);
	
	clear_element(driver, "id","ctl00_MainContent_txtAuthority"); //Clear Authority name
	Thread.sleep(1000);	
	
	sendkeys(driver,"id", "ctl00_MainContent_txtAuthority", "My new Authority"); //Send keys For Authority "My new Authority"
	Thread.sleep(1000); 
	
	click_element(driver, "id","ctl00_MainContent_btnSaveAndAdd"); //Click on Save & Addnew
	Thread.sleep(1000);	
	
	//Alert handling for Authority saved successfuly
		 Alert alert = driver.switchTo().alert();                                         //Alert handling forAuthority saved successfuly
	    String Alert = alert.getText();    	   
	    System.out.println("Alert msg for:"+Alert);
	    alert.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
    sendkeys(driver,"id", "ctl00_MainContent_txtAuthority", "My new Authority"); //Send keys For Authority "My new Authority"
	Thread.sleep(1000); 
		
	click_element(driver, "id","ctl00_MainContent_btnSaveAndAdd"); //Click on Save &Addnew
	Thread.sleep(1000);	
	
	//Alert handling for Authority is already exists
	 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Authority is already exists
   String Alert1 = alert.getText();    	   
   System.out.println("Alert msg for:"+Alert1);
   alert1.accept();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   Thread.sleep(2000);
   
   sendkeys(driver,"id", "ctl00_MainContent_txtAuthority", "My new Authority1"); //Send keys For Authority "My new Authority1"
   Thread.sleep(1000);
   
   click_element(driver, "id","ctl00_MainContent_btnSaveAndClose"); //Click on Save &close
   Thread.sleep(1000);
   

	//Alert handling for Authority saved successfuly
		 Alert alert3 = driver.switchTo().alert();                                         //Alert handling forAuthority saved successfuly
	    String Alert3 = alert3.getText();    	   
	    System.out.println("Alert msg for:"+Alert3);
	    alert3.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(2000);
 //-------------------------------------------------------------Delete Certificate Authority-----------------------------------------------------------------//	 
   
    clear_element(driver, "id","ctl00_MainContent_txtFltrAuthority"); //ClearAuthority Name
	Thread.sleep(1000);	
	
	sendkeys(driver,"id", "ctl00_MainContent_txtFltrAuthority", "My new Authority1"); //Send keys For Authority "My new Authority1"
	Thread.sleep(1000); 
	
	click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
	 Thread.sleep(1000);
	
	 click_element(driver, "id","ctl00_MainContent_GridView_Authority_ctl02_LinkButton1del"); //Click on Delete
	 Thread.sleep(1000);
	 
	//Alert handling for Delete
	 Alert alert4 = driver.switchTo().alert();                                         //Alert handling for Delete
    String Alert4 = alert4.getText();    	   
    System.out.println("Alert msg for:"+Alert4);
    alert4.accept();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(2000);		
    
    click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
	Thread.sleep(1000);	
				
}
			
//------------------------------------------------------------- Survey Doc Type----------------------------------------------------------------//
			
			public void SurveyDocType(WebDriver driver1) throws Exception {  //(priority=6)

				WebDriver driver = driver1;  
				
	click_element(driver, "xpath",".//*[@id='__tab_ctl00_MainContent_TabPanel_tabSurveyDocType']/span"); //Click on SurveyDocType
	Thread.sleep(1000);
	
	WebElement iframe=driver.findElement(By.id("iframe3"));   //Switching to the frame
	driver.switchTo().frame(iframe);		          
	Thread.sleep(3000);	
	
	click_element(driver, "id","ctl00_MainContent_ImgAdd"); //Click on Add New SurveyDocType
	Thread.sleep(1000);
	
	click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
	Thread.sleep(1000);
	
	//Alert handling for Please enter Document Type
		 Alert alert4 = driver.switchTo().alert();                                         //Alert handling for Please enter Document Type
	    String Alert4 = alert4.getText();    	   
	    System.out.println("Alert msg for:"+Alert4);
	    alert4.accept();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(2000);	
	
	sendkeys(driver,"id", "ctl00_MainContent_txtDocumentType", "Document 1"); //Send keys ForDocument Type "Document 1"
	Thread.sleep(1000);
	
	click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
	Thread.sleep(1000);
		  
	click_element(driver, "id","ctl00_MainContent_ImgAdd"); //Click on Add New SurveyDocType
	Thread.sleep(1000);   
	
	sendkeys(driver,"id", "ctl00_MainContent_txtDocumentType", "Document 2"); //Send keys ForDocument Type "Document 2"
	Thread.sleep(1000);
	
	click_element(driver, "id","ctl00_MainContent_btnsave"); //Click on Save
	Thread.sleep(1000);
	
	
	//-------------------------------------------------------------Delete Document Type-----------------------------------------------------------------//	 
	   
    clear_element(driver, "id","ctl00_MainContent_txtfilter"); //Clear Document Type
	Thread.sleep(1000);	
	
	sendkeys(driver,"id", "ctl00_MainContent_txtfilter", "Document 2"); //Send keys For Authority "My new Authority1"
	Thread.sleep(1000); 
	
	click_element(driver, "id","ctl00_MainContent_btnFilter"); //Click on Search
	 Thread.sleep(1000);
	
	 click_element(driver, "id","ctl00_MainContent_GridView_DocumentType_ctl02_ImgDelete"); //Click on Delete
	 Thread.sleep(1000);
	 
	//Alert handling for Delete
	 Alert alert1 = driver.switchTo().alert();                                         //Alert handling for Delete
    String Alert1 = alert1.getText();    	   
    System.out.println("Alert msg for:"+Alert1);
    alert1.accept();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(2000);		
    
    click_element(driver, "id","ctl00_MainContent_btnRefresh"); //Click on Refresh
	Thread.sleep(1000);	  
	
}
			
}
