package TestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.PagesClass;

public class TestCaseClass extends BaseClass
{
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		driver=getDriver();	
	}
	@Test
	public void runTheTest()
	{

		
		PagesClass pages=new PagesClass(driver);
		pages.enterUsername();
		pages.enterPassword();
		pages.clickOnLogin();
	}
}
