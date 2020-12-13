package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.flipkart.qa.base.TestBase;

public class MyCartPage extends TestBase{
	 
	// LOCATORS FOR PAGE
	@FindBy(xpath = "//*[@class='ibtBU6 _3t6eWY']//input")
	public WebElement PinCodeTextBox;
	
	@FindBy(xpath = "//*[@class='ibtBU6 _3t6eWY']//*[@class='UgLoKg']")
	public WebElement CheckButton;

	@FindBy(xpath = "//*[@class='_3fSRat']//*[@class='_1tBBEs']")
	public WebElement AvailabilityMessage;

	@FindBy(xpath = "//*[@class='_3gc7Vf']")
	public WebElement DeliverToBox;
	
	@FindBy(xpath = "//*[@class='ibtBU6']//input")
	public WebElement PincodeinDeliverToBox;
	
	@FindBy(xpath = "//*[@class='ibtBU6']//span")
	public WebElement CheckBtninDeliverToBox;
	
	
	// INITIALIZE PAGE OBJECTS
	public MyCartPage(){
		
		PageFactory.initElements(driver, this);
	}

	
	// ACTIONS FOR PAGE
	public void VerifyPincode(WebElement pintext,WebElement Check,String pincode){
        pintext.sendKeys(prop.getProperty(pincode));
		Check.click();		
	}	
	
	public void CheckAvailabiltyMessage(){
		try{
			if(AvailabilityMessage.isDisplayed()){
				System.out.println("AVAILBILITY -- INSIDE IF--");
				System.out.println(AvailabilityMessage.getText());
			}

		}catch (Exception e) {
			PageFactory.initElements(driver, this);
			if(AvailabilityMessage.isDisplayed()){
				System.out.println(AvailabilityMessage.getText());
			}

		}
	}
	
	public void CheckAvailability(){
		try{
			VerifyPincode(PinCodeTextBox, CheckButton, "pincode1");
		}
		catch (Exception e) {
			PageFactory.initElements(driver, this);
			VerifyPincode(PinCodeTextBox, CheckButton, "pincode1");
			CheckAvailabiltyMessage();
		}
		try{
			DeliverToBox.click();
			VerifyPincode(PincodeinDeliverToBox, CheckBtninDeliverToBox, "pincode2");
		}
		catch (Exception e) {
			PageFactory.initElements(driver, this);
			DeliverToBox.click();
			VerifyPincode(PincodeinDeliverToBox, CheckBtninDeliverToBox, "pincode2");
			CheckAvailabiltyMessage();
		}
		
	}
}



