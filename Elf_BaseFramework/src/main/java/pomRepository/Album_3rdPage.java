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

public class Album_3rdPage {

	public Album_3rdPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id="add-to-cart-button-53") private WebElement addToCart;
	
	@FindBy(linkText="Shopping cart") private WebElement shippingCart;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]") private WebElement clickCheckBox;
	
	@FindBy(name="updatecart") private WebElement updateCart;
	
	@FindBy(id="add-to-wishlist-button-51") private WebElement addWishList;
	
	@FindBy(xpath="//span[text()='Wishlist']") private WebElement clickWishList;




	public WebElement getAddToCart() {
		return addToCart;
	}
	

	public WebElement getShippingCart() {
		return shippingCart;
	}
	
	

	public WebElement getClickCheckBox() {
		return clickCheckBox;
	}

	public WebElement getUpdateCart() {
		return updateCart;
	}


	public WebElement getAddWishList() {
		return addWishList;
	}


	public WebElement getClickWishList() {
		return clickWishList;
	}
	
	
	

	// Business Logic or Action methods or Behavior
//	public void logout() {
//		logoutButton.click();
//	}

	
}
