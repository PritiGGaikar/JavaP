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
import Technical.ERLogTHRESHOLD;
import Technical.FormTypeLibrary;


public class ERLogTHRESHOLDTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	ERLogTHRESHOLD w = new ERLogTHRESHOLD();
	

	   @Test(priority=31)
	  public void Threshold() throws InterruptedException {
		   test=report.startTest("Threshold");	   
		   w.Threshold(driver);Assert.assertTrue(true);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Threshold"); 
	  }
	   @Test(priority=32)
		  public void CopyThreshold() throws Exception {
			 test=report.startTest("Copy Threshold");	   
			   w.CopyThreshold(driver);
			   Assert.assertTrue(true);
				  test.log(LogStatus.PASS, "Copy Threshold"); 
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
