package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	
	public void dropDown(WebElement element, String value)
	{

		Select select = new Select(element);
		select.selectByValue(value);
		WebElement selectedValue = select.getFirstSelectedOption();
		System.out.println(selectedValue.getText());
	}
}
