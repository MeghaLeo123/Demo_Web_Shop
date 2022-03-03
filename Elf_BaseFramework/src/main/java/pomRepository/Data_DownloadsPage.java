package pomRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***
 * 
 * @author Meghana
 *
 */

public class Data_DownloadsPage {

	public Data_DownloadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(partialLinkText="Digital downloads") private WebElement dataDownloads;
	
	@FindBy(linkText="3rd Album") private WebElement productImage;
	
	@FindBy(linkText="Music 2") private WebElement productImage2;
	
	
	public WebElement getDataDownloads() {
		return dataDownloads;
	}
	
	public WebElement getProductImage() {
		return productImage;
	}

	public WebElement getProductImage2() {
		return productImage2;
	}
	

	
	
	
	
	
}
