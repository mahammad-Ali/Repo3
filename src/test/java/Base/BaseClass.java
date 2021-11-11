package Base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;



public class BaseClass 
{
	
	static WebDriver driver;
	static String driverPath = "C:\\Users\\Mahammad.Ali\\eclipse-workspace\\PageObectModel\\src\\test\\resources\\drivers\\";
	static String Url ="https://www.stealmylogin.com/demo.html";
	static String browser= "chrome"; //set the browser using

	public WebDriver getDriver()
	{
		return driver;
	}

	public void setDriver(String browserType, String URL)
	{
		switch(browserType)
		{
		case "chrome":
			driver = initChromeDriver("https://www.stealmylogin.com/demo.html");
			break;
		case "firefox":
			driver = initIE("https://www.stealmylogin.com/demo.html");
			break;
		default:
			System.out.println("browser:"+browserType+"is invalid,");
		}
	}

	public static WebDriver initChromeDriver(String URL)
	{
		System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(Url);
		return driver;
	}

	public static WebDriver initIE(String URL)
	{
		System.setProperty("webdriver.chrome.driver",driverPath+"chromedriver.exe");
		driver = new InternetExplorerDriver();
		driver.navigate().to(Url);
		return driver;
	}
	@BeforeSuite
	public void initializeTestBaseSetup() {
		try {
			setDriver(browser,Url);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
