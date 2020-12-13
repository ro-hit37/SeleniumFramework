package com.flipkart.qa.testcases;

import java.io.IOException;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.ComparePage;
import com.flipkart.qa.pages.FlipkartPage;
import com.flipkart.qa.pages.GoogleSearchPage;
import com.flipkart.qa.pages.MyCartPage;
import com.flipkart.qa.utils.TestUtils;

public class FlipkartTestcases extends TestBase{

	public GoogleSearchPage googlepage;
	public FlipkartPage flipkartmainpage;
	public ComparePage comparepage;
	public MyCartPage checkpage;
	
	public FlipkartTestcases(){
		super();
	} 
	
	@BeforeMethod
	public void setup(){
		initialization();
		googlepage = new GoogleSearchPage();
		flipkartmainpage = new FlipkartPage();
		comparepage = new ComparePage();
		checkpage = new MyCartPage();
	}
	
	@Test
	public void FlipkartCases() throws Exception{
	
		googlepage.SearchAndPrintSuggestion("Flipkart");
		googlepage.flipkartLink.click();
		
		flipkartmainpage.CloseLoginPopup();
		flipkartmainpage.NavigateToWindowsPage();
		flipkartmainpage.AddToCompare();
		
		comparepage.GetProductNameandPrice();
		comparepage.AddProductToCart();
		checkpage.CheckAvailability();		
	}
	
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException{
		if(ITestResult.FAILURE==result.getStatus()){
			TestUtils.takeScreenshot();
		}
		driver.quit();
		
	}
}
