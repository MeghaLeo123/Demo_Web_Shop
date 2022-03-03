package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Log out") private WebElement logoutButton;
	
	//@FindBy(partialLinkText="Computers") private WebElement computersModuleLink;
	
	@FindBy(partialLinkText="Digital downloads") private WebElement dataDownloads;
	
	@FindBy(xpath="(//img[@alt='Picture of 3rd Album'])[2]") private WebElement productImage;
	
	@FindBy(id="add-to-cart-button-53") private WebElement addToCart;
	
	@FindBy(linkText="Shopping cart") private WebElement shippingCart;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]") private WebElement clickCheckBox;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

//	public WebElement getComputersModuleLink() {
//		return computersModuleLink;
//	}
	public WebElement getDataDownloads() {
		return dataDownloads;
	}
	
	public WebElement getProductImage() {
		return productImage;
	}
	

	public WebElement getAddToCart() {
		return addToCart;
	}
	

	public WebElement getShippingCart() {
		return shippingCart;
	}
	
	

	public WebElement getClickCheckBox() {
		return clickCheckBox;
	}

	// Business Logic or Action methods or Behavior
	public void logout() {
		logoutButton.click();
	}

	
}
