package TestCases;



import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Technical.AlarmEffect;
import Technical.FormTypeLibrary;
import Technical.WorklistAccessRights;

//import Technical.Worklist;



public class WorklistAccessRightsTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	
	WorklistAccessRights w = new WorklistAccessRights();
	
	
	
	  @Test(priority=35)
	  public void WokrlistModule() throws Exception {
		  test=report.startTest("WokrlistModule");  
		  w.worklistindex(driver);
		  Assert.assertTrue(true);
		  System.out.println("WokrlistModule");
	 	  test.log(LogStatus.PASS, "WokrlistModule"); 
	  }
		  @Test(priority=36)
		
		  public void search() throws Exception {
			  test=report.startTest("search"); 	  	  
			  w.search(driver);
			  Assert.assertTrue(true);
			  System.out.println("search");
		 	  test.log(LogStatus.PASS, "search");
		   	 
		  }
		 @Test(priority=37)
		
		  public void delete() throws Exception {
			 test=report.startTest("delete"); 		  		  
			 w.delete(driver);
			 Assert.assertTrue(true);
			 System.out.println("delete");
	 		 test.log(LogStatus.PASS, "delete");
		 
		 }
		 @Test(priority=38)
	
		  public void alertuserName() throws Exception {
			 test=report.startTest("alertuserName");   	  
			 w.alertuserName(driver);
			 Assert.assertTrue(true);
			 System.out.println("alertuserName");
	 		 test.log(LogStatus.PASS, "alertuserName");
	 
		 }
		 
		 @Test(priority=39)
			
		  public void editrecord() throws Exception {
			 test=report.startTest("editrecord"); 	 
			  
			 w.editrecord(driver);
			 Assert.assertTrue(true);
			 System.out.println("editrecord");
	 		 test.log(LogStatus.PASS, "editrecord");
	 
	 		// throw new SkipException("message1");
	 		 
		 }

		   @AfterMethod
			public void afterMethod(ITestResult result) {
			    if (result.getStatus() == ITestResult.FAILURE) {
			        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
			    } else if (result.getStatus() == ITestResult.SKIP) {
			        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
			    } else {
			        test.log(LogStatus.PASS, "Test passed");
			    }
			    report.endTest(test);
			    report.flush();
		}
		 @BeforeSuite
		 public void beforeSu() {
			 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\All Admin\\Report\\All admin.html");		  }
		 
		/* @AfterSuite
		public void afterSu() {
		     report.close();
		 }*/
		  }
		 	 
		 
  

