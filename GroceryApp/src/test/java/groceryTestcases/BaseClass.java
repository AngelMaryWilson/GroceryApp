package groceryTestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenShotCapture;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
	WebDriver driver;
   public static Properties property;//Reference variable for property class, which is used to call the key values from property file.
    //it will store the details as a Key=value pair.
   
   
  public static void callPropertyValues() throws IOException {
	  property =new Properties();
	  FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//config.properties");
	  property.load(ip);
	  
  }
  
	
  @BeforeMethod 
  @Parameters("browser")
  public void beforeMethod(String browser) throws IOException {
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  else
	  {
		  driver = new EdgeDriver();
	  }
	    callPropertyValues();
	    
	    driver.get(property.getProperty("BaseUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
  }

  @AfterMethod(alwaysRun = true)
 
	  
	  public void afterMethod(ITestResult itestResult) throws IOException {
			if (itestResult.getStatus() == ITestResult.FAILURE) {
				ScreenShotCapture sc = new ScreenShotCapture();
				sc.captureFailureScreenShot(driver, itestResult.getName());
			}
	  
	  driver.close();
	  
  }
  
}
