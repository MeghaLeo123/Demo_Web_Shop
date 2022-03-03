package pomRepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/***

 * @author Meghana
 *
 */

public class shippingCartPage {

	public shippingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	//@FindBy(id="add-to-cart-button-53") private WebElement addToCart;
	
	@FindBy(linkText="Shopping cart") private WebElement shippingCart;
	
	@FindBy(xpath="//input[@name='removefromcart']") private WebElement clickCheckBox;
	
	@FindBy(name="updatecart") private WebElement updateCart;
	
    @FindBy(xpath="//input[@id='termsofservice']") private WebElement check;
	
	@FindBy(id="checkout") private WebElement checkout;
	
	@FindBy(xpath="//input[@onclick='Billing.save()']") private WebElement next;
	
	@FindBy(id="paymentmethod_2") private WebElement payment;
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']") private WebElement next1;
	
	@FindBy(id = "CreditCardType")private WebElement selectCreditCartDropdown;
	
	@FindBy(id = "CardholderName")private WebElement enterCardholderName;
	
	@FindBy(id = "CardNumber")private WebElement enterCardNumber;
	
	@FindBy(id = "ExpireMonth")private WebElement enterDayDate;
	
	@FindBy(id = "ExpireYear")private WebElement enterYearDate;
	
	@FindBy(id = "CardCode")private WebElement enterCode;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")private WebElement clickcontinue;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")private WebElement clickOncontinue;
	





//	public WebElement getAddToCart() {
//		return addToCart;
//	}
	

	public WebElement getClickOncontinue() {
		return clickOncontinue;
	}





	public WebElement getClickcontinue() {
		return clickcontinue;
	}





	public WebElement getEnterCode() {
		return enterCode;
	}



	

	public WebElement getEnterDayDate() {
		return enterDayDate;
	}



	public WebElement getEnterYearDate() {
		return enterYearDate;
	}



	public WebElement getSelectCreditCartDropdown() {
		return selectCreditCartDropdown;
	}



	public WebElement getEnterCardholderName() {
		return enterCardholderName;
	}



	public WebElement getEnterCardNumber() {
		return enterCardNumber;
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



	public WebElement getCheck() {
		return check;
	}



	public WebElement getCheckout() {
		return checkout;
	}



	public WebElement getNext() {
		return next;
	}



	public WebElement getPayment() {
		return payment;
	}



	public WebElement getNext1() {
		return next1;
	}



//	public WebElement getText1() {
//		return text1;
//	}
//	
	
		
	

	// Business Logic or Action methods or Behavior
//	public void logout() {
//		logoutButton.click();
//	}

	
}
