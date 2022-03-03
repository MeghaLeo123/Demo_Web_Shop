package webShop;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.Album_3rdPage;
import pomRepository.Data_DownloadsPage;
import pomRepository.shippingCartPage;
/***
 * 
 * @author Meghana
 *
 */

public class TC_DD_36Test extends Base_Class{
	
	@Test
	public void removeProduct() {
		
		ExcelUtil excelutility1 = new ExcelUtil();
		
		Data_DownloadsPage dataDownloads = new Data_DownloadsPage(driver);
		Album_3rdPage album = new Album_3rdPage(driver);
		shippingCartPage cart = new shippingCartPage(driver);
		
		//Data downloads Page is Displayed.
		
		Assert.assertEquals(driver.getTitle(),excelutility1.readStringDataFromExcel("Sheet1", 4, 0), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);
	    
		dataDownloads.getDataDownloads().click();
		Reporter.log("Data Downloads Page is displyed Successfully",true);
		
		//Selected product Page is Displayed.
		
		Assert.assertEquals(driver.getTitle(),excelutility1.readStringDataFromExcel("Sheet1", 7, 0), "Product Image Music2 is not displayed successfully");
		Reporter.log("Product Image Album3rd is displayed successfully ", true);
	    
		dataDownloads.getProductImage().click();
		Reporter.log("Product is displayed Successfully",true);
		
		album.getAddToCart().click();
		Reporter.log("Producted is added to cart successfully",true);
		
		//Shipping cart page is Displayed.
		
		Assert.assertEquals(driver.getTitle(), excelutility1.readStringDataFromExcel("Sheet1",11,0),"Shipping cart page is not displyed Successfully");
		Reporter.log("Shipping cart page is displayed Successfully",true);
		
		cart.getShippingCart().click();
		//Reporter.log("Product is added to  successfully",true);
		
		cart.getClickCheckBox().click();
		
		cart.getUpdateCart().click();
		Reporter.log("Product is Removed from Shipping Cart successfully");
	}

}
