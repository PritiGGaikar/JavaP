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
import Technical.PMSAccess;



public class PMSAccessTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	

	PMSAccess w = new PMSAccess();
	
	
	
	@Test(priority=63) 
	 public void PMSAccess1()throws Exception {
		 test=report.startTest("PMSAccess1");	  
	 w.PMSAccess1(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "PMSAccess1"); 
	}
	 @Test(priority=64)
	public void AddPMSAccess()throws Exception {
		 test=report.startTest("AddPMSAccess");	  
	w.AddPMSAccess(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AddPMSAccess"); 
	}
	 
	 @Test(priority=65)
	 public void EditPMSAccess()throws Exception {
		 test=report.startTest("EditPMSAccess");	  
	 w.EditPMSAccess(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "EditPMSAccess"); 
	 }
	 @Test(priority=66)
	 public void AddPMSAccessD()throws Exception {
		 test=report.startTest("AddPMSAccessD");	  
	 w.AddPMSAccessD(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AddPMSAccessD"); 
	 }
	 @Test(priority=67)
	 public void Add1()throws Exception {
		 test=report.startTest("Add1");	  
	 w.Add1(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add1"); 
	 }
	 
	 @Test(priority=68)
	 public void ActionTypeDelete()throws Exception {
		 test=report.startTest("ActionTypeDelete");	   
	 w.ActionTypeDelete(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "ActionTypeDelete"); 
	 }
	   @Test(priority=69)
	 public void ActionTypeVerify()throws Exception {
		   test=report.startTest("ActionTypeVerify");	  
	 w.ActionTypeVerify(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "ActionTypeVerify"); 
	 }
	   @Test(priority=70)
		 public void Delete()throws Exception {
			 test=report.startTest("Delete");	   
		 w.ActionTypeDelete(driver);
		  Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Delete"); 
		 }
	   @Test(priority=71)
	   public void TotalRecords()throws Exception {
		   test=report.startTest("TotalRecords");	   
	   w.TotalRecords(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "TotalRecords"); 
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
		 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\All Admin\\Report\\All admin.html");			  }
	 
	/* @AfterSuite
	public void afterSu() {
	     report.close();
	 }*/
}
