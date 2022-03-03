package webShop;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.Data_DownloadsPage;
import pomRepository.Music_2Page;
import pomRepository.shippingCartPage;

/***
 * 
 * @author Meghana
 *
 */

public class TC_DD_35Test extends Base_Class {

	
	@Test
	public void PlaceOrder() {
		
		ExcelUtil excelutility = new ExcelUtil();
		String cardType = excelutility.readStringDataFromExcel("Sheet1",0,0);
		String cardName = excelutility.readStringDataFromExcel("Sheet1",1,0);
		String cardNumber = excelutility.readStringDataFromExcel("Sheet1",2,0);
		String code = excelutility.readStringDataFromExcel("Sheet1",3,0);



		Data_DownloadsPage data = new Data_DownloadsPage(driver);
		shippingCartPage cart = new shippingCartPage(driver);
		Music_2Page alb = new Music_2Page (driver);
		
		
	    //Data downloads page is Displayed.
		Assert.assertEquals(driver.getTitle(),excelutility.readStringDataFromExcel("Sheet1", 4, 0), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);
	    
		data.getDataDownloads().click();
		Reporter.log("Data Downloads Page is displyed Successfully",true);
		
		
		//Selected product page is Selected.
		Assert.assertEquals(driver.getTitle(),excelutility.readStringDataFromExcel("Sheet1", 7, 0), "Product Image Music2 is not displayed successfully");
		Reporter.log("Product Image Music2 is displayed successfully ", true);
	    
		data.getProductImage2().click();
		
		
		alb.getToCart().click();
		Reporter.log("Product is added to cart successfully",true);
		
		//Shipping cart Page is Displayed.
		Assert.assertEquals(driver.getTitle(), excelutility.readStringDataFromExcel("Sheet1",5,0),"Shipping cart page is not displyed Successfully");
		Reporter.log("Shipping cart page is displayed Successfully",true);
		
		cart.getShippingCart().click();
		
		
	    cart.getCheck().click();
		
		cart.getCheckout().click();
		
		//Checkout page is Displayed.
		Assert.assertEquals(driver.getTitle(),excelutility.readStringDataFromExcel("Sheet1",9,0),"Checkout page is not displayed Successfully");
		Reporter.log("Checkout page is displayed Successfully",true);
		
		cart.getNext().click();
		
		
		cart.getPayment().click();
		
        cart.getNext1().click();
        
        WebElement card = cart.getSelectCreditCartDropdown();
        
        Select select = new Select(card);
        select.isMultiple();
        select.selectByVisibleText(cardType);
        
        cart.getEnterCardholderName().sendKeys(cardName);
        cart.getEnterCardNumber().sendKeys(cardNumber);
        
        WebElement Day = cart.getEnterDayDate();
        Select select1 = new Select(Day);
        select1.isMultiple();
        select1.selectByValue("4");
        
        WebElement year = cart.getEnterYearDate();
        Select select2 = new Select(year);
        select2.isMultiple();
        select2.selectByValue("2023");
        
        cart.getEnterCode().sendKeys(code);
        cart.getClickcontinue().click();
        
        cart.getClickOncontinue().click();
        Reporter.log("Your Order has been placed Successfully",true);
        
		
		
	}
		
	

}
