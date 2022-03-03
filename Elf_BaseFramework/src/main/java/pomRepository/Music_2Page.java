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



public class Music_2Page{
	public Music_2Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		// TODO Auto-generated constructor stub
		
	@FindBy(id="add-to-cart-button-51") private WebElement toCart;
	
//	@FindBy(id="termsofservice") private WebElement check;
//	
//	@FindBy(id="checkout") private WebElement checkout;
//	
//	@FindBy(xpath="//input[@onclick='Billing.save()']") private WebElement next;
//	
//	@FindBy(id="paymentmethod_2") private WebElement payment;
//	
//	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']") private WebElement next1;

	public WebElement getToCart() {
		return toCart;
	}

//	public WebElement getCheck() {
//		return check;
//	}
//
//	public WebElement getCheckout() {
//		return checkout;
//	}
//
//	public WebElement getNext() {
//		return next;
//	}
//
//	public WebElement getPayment() {
//		return payment;
//	}
//
//	public WebElement getNext1() {
//		return next1;
//	}
	

	
	
	
	
	
	
	
	

	
	

}
