# SeleniumFramework
Project Highlight :

Tools and Technologies Used :-

Java                     :     Scripting Langugage
Selenium Webdriver       :     Web Automation Tool
Maven                    :     Build Generation   
TestNG                   :     Unittest Library
Extend Reports           :     For Graphical Reports


Used POM Approch with PageFactory.



Folder structure:

src/main/java/com/flipkart/qa/
	
	Base : BaseClass for all the page where basic Precondition like Creating Webdriver objects,browser initialization are kept. 
               This will be the Super class of the classes in the framework.
        
	Config: Config.properties file is kept to store some config parameters

	EXtenReportLister : Class to generate Extent Reports.

	Pages : All the Pages are Stored here.All the Locators and Actions are Defined here.

	Utils : Some Utilities like Take Screenshots are defined in this Class.

src/test/java/com/flipkart/qa/

	testcases: All the Testcases are Defined here.
