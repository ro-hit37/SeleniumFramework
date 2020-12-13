package com.flipkart.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


import com.flipkart.qa.base.TestBase;

public class GoogleSearchPage extends TestBase{

	// LOCATORS FOR THE PAGE
	@FindBy(xpath = "//*[@class='gLFyf gsfi']")
	public WebElement Searchbar;
	
	@FindBy(xpath = "//*[@class='aajZCb']")
	public WebElement suggestiondropdown;
	
	@FindBy(xpath = "//ul[@role='listbox']//li")
    public List<WebElement> suggestionitems;

	@FindBy(xpath = "//*[@class='yuRUbf']//a[@href='https://www.flipkart.com/']")
	public WebElement flipkartLink;
	
	
	
	// INITIALIZE PAGE OBJECTS
	public GoogleSearchPage(){
		
		PageFactory.initElements(driver, this);
	}

	
	// ACTIONS FOR THE PAGE
	public void SearchAndPrintSuggestion(String text){

		Searchbar.sendKeys(text);

		for(WebElement item: suggestionitems){
			System.out.println(item.getText());	
		}
		
		Actions press = new Actions(driver);
		press.sendKeys(Keys.RETURN).perform();
	}

	
}
