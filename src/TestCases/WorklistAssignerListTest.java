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
import Technical.WorklistAssignerList;

public class WorklistAssignerListTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	WorklistAssignerList w=new WorklistAssignerList();
 
  @Test(priority=33)
  public void WorklistAssignerListindex() throws Exception  {
	
	  test=report.startTest("WorklistAssignerListindex");	   
 w.WorklistAssignerListindex(driver);
 Assert.assertTrue(true);
 test.log(LogStatus.PASS, "WorklistAssignerListindex");         
  }
  

  @Test(priority=34)
  public void Alert() throws Exception  {
	  test=report.startTest("Alert");	 
 w.Alert(driver);
 Assert.assertTrue(true);
 test.log(LogStatus.PASS, "Alert");    
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