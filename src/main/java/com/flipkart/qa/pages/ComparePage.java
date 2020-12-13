package com.flipkart.qa.pages;


import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.flipkart.qa.base.TestBase;

public class ComparePage extends TestBase{
	
	FlipkartPage page;
	
	
	// LOCATORS FOR PAGE
	@FindBy(xpath = "//*[@class='col-4-5']//*[@class='row'][1]")
	public WebElement ProductName;
	
	@FindBy(xpath = "//*[@class='col-4-5']//*[@class='row'][2]//*[@class='_30jeq3']")
	public List<WebElement> ProductPrice;
	
	@FindBy(xpath = "//*[@class='_2eCJrS']//*[@class='row'][5]//*[@class='col col-1-5 _13lGXD'][2]//*[@class='_2KpZ6l _2U9uOA _3v1-ww vsi37q']")
    public WebElement AddFirstProduct;

	@FindBy(xpath = "//*[@class='_2eCJrS']//*[@class='row'][5]//*[@class='col col-1-5 _13lGXD'][3]//*[@class='_2KpZ6l _2U9uOA _3v1-ww vsi37q']")
    public WebElement AddSecondProduct;
	
	@FindBy(xpath = "//*[@class='_2eCJrS']//*[@class='row'][5]//*[@class='col col-1-5 _13lGXD'][4]//*[@class='_2KpZ6l _2U9uOA _3v1-ww vsi37q']")
    public WebElement AddThirdProduct;

	@FindBy(xpath = "//*[@class='_2KpZ6l _2ObVJD _3AWRsL']")
    public WebElement PlaceAnOrderButton;
	
	
	// INITIALIZE PAGE OBJECTS
	public ComparePage(){
		
		PageFactory.initElements(driver, this);
		page = new FlipkartPage();
	}

	
	// ACTIONS FOR PAGE
	public void GetProductNameandPrice(){
		
		System.out.println(ProductName.getText());
		for(WebElement price : ProductPrice){
			System.out.println(price.getText());
		}
	}
	
	public void AddProductToCart(){

		AddFirstProduct.click();
		driver.navigate().refresh();
		driver.navigate().back();
		page.CompareButton.click();
		AddSecondProduct.click();	
		driver.navigate().refresh();
		driver.navigate().back();
		page.CompareButton.click();
		AddThirdProduct.click();	

	}
}

