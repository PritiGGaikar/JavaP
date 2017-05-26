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
import Technical.InspectionType;




public class InspectionTypeTest extends WebDriverPass{
	protected ExtentReports report;
	protected ExtentTest test;
	
	InspectionType w = new InspectionType();
	
	
  @Test(priority=40)
  
private void InspectionType() throws InterruptedException {
	  test=report.startTest("InspectionType");	  
	 w.InspectionTypes(driver);
	 Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Inspection Type"); 
	
}

  @Test(priority=41)
  public void AddInspection() throws InterruptedException {
	  test=report.startTest("Add Inspection");	  
	  
	  w.AddInspection(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Add Inspection"); 
  }
  
  
  @Test(priority=42)
  public void Searchandedit() throws InterruptedException {
	  test=report.startTest("Searchandedit");	  
	  
	  w.Searchandedit(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Search and edit"); 
  }
  @Test(priority=43)
  public void EditName() throws Exception {
	  	  
	  test=report.startTest("EditName");	  
	  w.EditName(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Edit name"); 
  }
  @Test(priority=44)
  public void Blankname() throws InterruptedException {
	  	  
	  test=report.startTest("Blankname");	  
	  w.Blankname(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Blank name"); 
  }
  
  @Test(priority=45)
  public void Delete() throws Exception {
	  	  
	  test=report.startTest("Delete");	  
	  w.Delete(driver);
	  Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Delete"); 
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
  
  
  
  

