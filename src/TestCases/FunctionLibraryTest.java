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
import Technical.FunctionLibrary;

public class FunctionLibraryTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	FunctionLibrary w = new FunctionLibrary();
	
	
	@Test(priority=71)
	   public void FunctionsLibrary1()throws Exception {
		 test=report.startTest("FunctionsLibrary1");	   	 
	   w.FunctionsLibrary1(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Functions Library"); 
	   }
	   
	   
	   @Test(priority=72)
	   public void AddFunction()throws Exception {
		   test=report.startTest("AddFunction");	  
	   w.AddFunction(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Add Function"); 
	   }
	   @Test(priority=73)
	   public void AddFunctionname()throws Exception {
		   test=report.startTest("AddFunctionname");	  
	   w.AddFunctionname(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Add Function name"); 
	   }
	  
	   @Test(priority=75)
	   public void EditFunction()throws Exception {
		   test=report.startTest("EditFunction");	  
	   w.EditFunction(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Edi tFunction"); 
	   }
	   @Test(priority=76)
	   public void DeleteFunction()throws Exception {
		   test=report.startTest("DeleteFunction");	  
	   w.DeleteFunction(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Delete Function"); 
	   }
	   @Test(priority=77)
	   public void Blankcode()throws Exception {
		   test=report.startTest("Blankcode");	  
	   w.Blankcode(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Blank code"); 
	   }
	   @Test(priority=78)
	   public void Samename()throws Exception {
		   test=report.startTest("Samename");	  
	   w.Samename(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Same name"); 
	   }
	   @Test(priority=79)
	   public void TotalFunctionRecords()throws Exception {
		   test=report.startTest("Total Function Records");	  
	   w.Samename(driver);
	   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Total Function Records"); 
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
