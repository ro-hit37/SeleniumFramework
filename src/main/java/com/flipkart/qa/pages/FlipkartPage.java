package com.flipkart.qa.pages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.flipkart.qa.base.TestBase;

public class FlipkartPage extends TestBase{

	
	// LOCATORS FOR THE PAGE
	@FindBy(xpath = "//*[@class='_2QfC02']//*[@class='_2KpZ6l _2doB4z']")
	public WebElement loginCrossButton;

	@FindBy(xpath = "//*[@class='_1kidPb']//*[@class='_2I9KP_'][2]")
	public WebElement TVandAppliancesButton;

	@FindBy(xpath = "//*[@class='_1fwVde'][2]//*[@class='_3QN6WI'][6]")
	public WebElement WindowsACButton;
	
	@FindBy(xpath = "//*[@class='_10Ermr']")
	public WebElement WindowsACPageText;
	
	@FindBy(xpath = "//*[@class='_3FqKqJ']//*[@class='E2-pcE _3zjXRo']//*[@class='E2-pcE _1q8tSL'][2]//*[@class='_2pi5LC col-12-12'][2]//*[@class='_6Up2sF']")
	public WebElement SecondAddtoCompareCheckBox;
	
	@FindBy(xpath = "//*[@class='_3FqKqJ']//*[@class='E2-pcE _3zjXRo']//*[@class='E2-pcE _1q8tSL'][2]//*[@class='_2pi5LC col-12-12'][3]//*[@class='_6Up2sF']")
	public WebElement ThirdAddtoCompareCheckBox;

	@FindBy(xpath = "//*[@class='_3FqKqJ']//*[@class='E2-pcE _3zjXRo']//*[@class='E2-pcE _1q8tSL'][2]//*[@class='_2pi5LC col-12-12'][6]//*[@class='_6Up2sF']")
	public WebElement SixthAddtoCompareCheckBox;
	
	@FindBy(xpath = "//*[@class='_11o22n _87aCMT']//*[@class='_3D32sd']//*[@class='MxXpTK B2jtqc _3oNy-b']")
	public WebElement CompareProductCount;
	
	@FindBy(xpath = "//*[@class='_11o22n _87aCMT']")
	public WebElement CompareButton;
	

	// INITIALIZE PAGE OBJECTS
	public FlipkartPage(){
		
		PageFactory.initElements(driver, this);
		
	}

	
	// ACTIONS FOR THE PAGE
	public void CloseLoginPopup(){
		
		if(loginCrossButton.isDisplayed()){
			loginCrossButton.click();
		}
	}
	
	public void NavigateToWindowsPage(){
		
//		Actions hover = new Actions(driver);
//		hover.moveToElement(TVandAppliancesButton).build().perform();
		TVandAppliancesButton.click();
		WindowsACButton.click();
		assertEquals(WindowsACPageText.getText(), "Window Air Conditioners");
		
		}
	
	public void AddToCompare(){
		 SecondAddtoCompareCheckBox.click();
		 ThirdAddtoCompareCheckBox.click();
		 SixthAddtoCompareCheckBox.click();
		 Assert.assertEquals(CompareProductCount.getText(), "3");
		 CompareButton.click();
	}
}


