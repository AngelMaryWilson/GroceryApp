package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class PushNotification {
	
	public PushNotification(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	GeneralUtilities gu = new GeneralUtilities();
	WebDriver driver;
	
	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	WebElement tittleText;
	
	@FindBy(id = "description")
	WebElement descriptionText;
	
	@FindBy(xpath = "//h3[@class='card-title']")
	WebElement h3Tag;
	
	public String textOfTittletag() {
		return tittleText.getText();
	} 
	
	public String textOfDescription() {
		return descriptionText.getText();
	}
	
	public String bgColorOfH3Tag() {
		
		return gu.backgroundColor(h3Tag, "background-color");
		
		
	}

}
