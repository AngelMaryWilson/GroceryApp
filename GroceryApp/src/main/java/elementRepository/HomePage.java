package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;
	
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement user;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-tasks']")
	WebElement manageProducts;
	
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-fas fa-bell']")
	WebElement pushNotification;
	
	
	public String userDetails()
	{
		return user.getText();
	}
	
	public void manageProduct()
	{
		gu.buttonclicks(manageProducts);
		
	}
	
	public void pushNotifications() {
		gu.buttonclicks(pushNotification);
	}
	
	

}
