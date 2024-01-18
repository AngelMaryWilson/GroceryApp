package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class ManageProducts {

	public ManageProducts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	

	WebDriver driver;
	
	GeneralUtilities gl = new GeneralUtilities();

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/edit?edit=1175&page_ad=1&un=&ct=&sb=&Search=sr']")
	WebElement editButton;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Product/delete?del=1174&page_ad=1']")
	WebElement deleteButton;

	@FindBy(id = "tag")
	WebElement tagText;

	@FindBy(xpath = "//i[@class=' fa fa-search']")
	WebElement searchButton;
	
	@FindBy(id = "sub_id")
	WebElement subCategory;
	
	public void subCategorydropDown()
	{
		gl.dropDown(subCategory, "Egg");
	}

	public void editButton() {
		editButton.click();
	}
	
	public String textOFeditButton() {
		 return editButton.getText();
	}

	public String getTagText()

	{
		return tagText.getText();
		// tagText.getCssValue("background-color");
	}

	public String searchButtonText() {
		return searchButton.getText();
	}

	public void deleteButtonClick() {
		deleteButton.click();
	}
	
	public void alertAcceptForDelete() {
		driver.switchTo().alert().accept();
	}
}
