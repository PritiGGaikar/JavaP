package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Technical.FormTypeLibrary;
import Technical.RaceAndVeteranStatus;


public class RaceAndVeteranStatusTest extends WebDriverPass {
	ExtentReports report;
	ExtentTest test;
	RaceAndVeteranStatus r = new RaceAndVeteranStatus();
	
 @Test(priority=1)
  public void UnionAndUnionBookModule() throws Exception {
	 test=report.startTest("Union And Union Branch");
	  r.RaceIndex(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Union And Union Branch"); 
  }
 
 @Test(priority=2)
 public void OilMajorModule1() throws Exception {
	  test=report.startTest("Union Book");
	  r.VeteranStatus(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Union Book"); 
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
	 report = FormTypeLibrary.getReporter("C:\\Users\\Priti\\workspace\\All Admin\\Report\\All admin.html");		
}

}

