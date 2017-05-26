package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Technical.AlarmUnit;
import Technical.FormTypeLibrary;




public class AlarmUnitTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	
	AlarmUnit w = new AlarmUnit();
	
	 @Test(priority=52)
	  public void AlarmUnit()throws Exception {
		 test=report.startTest("AlarmUnits");	   
	  w.AlarmUnits(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AlarmUnits"); 
	  }

	  @Test(priority=53)
	  public void PMSAlarmUnit()throws Exception {
			 test=report.startTest("PMSAlarmUnit");	  	  
	  w.PMSAlarmUnit(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "PMSAlarmUnit"); 
	  }

	 @Test(priority=54)
	  public void AddNewUnit()throws Exception {
		 test=report.startTest("AddNewUnit");	  
	  w. AddNewUnit(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "AddNewUnit"); 

	}
	 @Test(priority=55)
	 public void EditUnit()throws Exception {
		 test=report.startTest("EditUnit");	   
	 w. EditUnit(driver);
	 Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "EditUnit"); 

	}
	 @Test(priority=56)
	 public void Delete()throws Exception {
		 test=report.startTest("Delete");	  
	 w.Delete(driver);
	 Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete"); 

	}
	 

	 
	@Test(priority=57)
	 public void EditBlank()throws Exception {
		 test=report.startTest("EditBlank");	  
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
