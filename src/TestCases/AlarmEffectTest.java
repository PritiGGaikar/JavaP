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



public class AlarmEffectTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	AlarmEffect w = new AlarmEffect();
	

	 @Test(priority=58)
	 public void AlarmEffects()throws Exception {
		 test=report.startTest("AlarmEffects");	  
	 w.AlarmEffects(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AlarmEffects"); 
	}
	 
	 @Test(priority=59)
	 public void AddNewEffect()throws Exception {
		 test=report.startTest("AddNewEffect");	 
	 w.AddNewEffect(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AddNewEffect"); 
	}
	 @Test(priority=60)
	 public void EditEffect()throws Exception {
		 test=report.startTest("EditEffect");	 
	 w.EditEffect(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "EditEffect"); 
	}
	 @Test(priority=61)
	 public void Delete()throws Exception {
		 test=report.startTest("Delete");	  
	 w.Delete(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete"); 
	}
	 @Test(priority=62)
	 public void EditBlank()throws Exception {
		 test=report.startTest("EditBlank1");	  
	 w.EditBlank(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "EditBlank"); 
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
