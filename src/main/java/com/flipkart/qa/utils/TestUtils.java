package com.flipkart.qa.utils;

import java.io.File;
import java.io.IOException;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.flipkart.qa.base.TestBase;

public class TestUtils extends TestBase{
	
	
	public static void takeScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileHandler.copy(scrFile, new File(currentDir + "/screenshots/FlipkartFailedSS.png"));
	}
	

}
