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
import Technical.InspVesselAssignment;
import Technical.SAttendingVessel;

public class InspVesselAssignmentTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	InspVesselAssignment w = new InspVesselAssignment();
	
	  @Test(priority=49)
	  public void VesselAssignment() throws Exception {
		  test=report.startTest("VesselAssignment");	  
		   w.VesselAssignment(driver);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Vessel Assignment"); 
	  }

	  @Test(priority=50)
	  public void SaveVesselAssignment() throws Exception {
		  test=report.startTest("SaveVesselAssignment");	  
		   w.SaveVesselAssignment(driver);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Save Vessel Assignment");   
	  }

	  @Test(priority=51)
	  public void SaveVesselAssignment1() throws Exception {
		  test=report.startTest("SaveVesselAssignment1");	  
		   w.SaveVesselAssignment1(driver);
		   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Save Vessel Assignment1");  
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
