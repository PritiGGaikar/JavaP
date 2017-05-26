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
import Technical.LOTestingLabList;
import Technical.PurchaseQuestionnaire;
import Technical.UnitPackings;

public class PurchaseQuestionnaireTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	PurchaseQuestionnaire w = new PurchaseQuestionnaire();
	

   @Test(priority=18)
   public void PurchaseQuestionnaire() throws InterruptedException {
	   test=report.startTest("PurchaseQuestionnaire");	  
	   w.PurchaseQuestionnair(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Purchase Questionnaire"); 
  }
   
   @Test(priority=19)
   public void AddNewQuestion() throws Exception {
 	   test=report.startTest("AddNewQuestion");	  
 	   w.AddNewQuestion(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Ad dNew Question"); 
   }
   
 /*  @Test(priority=20)
   public void AddNewGrade() throws Exception {
 	   test=report.startTest("AddNewGrade");	  
 	   w.AddNewGrade(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "AddNewGrade"); 
   }
   

     @Test(priority=21)
   public void DeleteQuestion() throws Exception {
 	   test=report.startTest("DeleteQuestion");	  
 	   w.DeleteQuestion(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "DeleteQuestion"); 
   }*/
   
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
