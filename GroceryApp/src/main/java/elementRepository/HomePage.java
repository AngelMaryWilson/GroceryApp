package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement user;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-tasks']")
	WebElement manageProducts;
	
	public String userDetails()
	{
		return user.getText();
	}
	
	public void manageProduct()
	{
		manageProducts.click();
	}
	
	

}
