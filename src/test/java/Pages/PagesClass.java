package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;





public class PagesClass 
{
	WebDriver driver;
	
     
	By userName=By.name("username");
	By Password=By.name("password");
	By clickOnLogin=By.xpath("/html/body/form/input[3]");
	public PagesClass(WebDriver driver) {
		this.driver = driver;
	}
	public void enterUsername()
	{
		driver.findElement(userName).sendKeys("abcd");

	}
	public void enterPassword() {
		driver.findElement(Password).sendKeys("1234");
	}

	public void clickOnLogin() {
		driver.findElement(clickOnLogin).click();

	}
}
