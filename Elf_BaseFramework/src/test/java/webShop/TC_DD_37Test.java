package webShop;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.Album_3rdPage;
import pomRepository.Data_DownloadsPage;
/***
 * 
 * @author Meghana
 *
 */


public class TC_DD_37Test extends Base_Class {
	
	@Test
	
	public void addToWishList(){
		ExcelUtil excelutility2 = new ExcelUtil();
		
		Data_DownloadsPage data = new Data_DownloadsPage(driver);
		Album_3rdPage album1 = new Album_3rdPage(driver);
		
		//Data downloads Page is Displayed.
		
		Assert.assertEquals(driver.getTitle(),excelutility2.readStringDataFromExcel("Sheet1", 4, 0), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);
	    
		data.getDataDownloads().click();
		Reporter.log("Data Downloads Page is displyed Successfully",true);
		
		//Selected product page is Displayed.
		
		Assert.assertEquals(driver.getTitle(),excelutility2.readStringDataFromExcel("Sheet1", 7, 0), "Product Image Music2 is not displayed successfully");
		Reporter.log("Product Image Music2 is displayed successfully ", true);
	    
		data.getProductImage2().click();
		
		album1.getAddWishList().click();
		
		//WishList page is Displayed. 
		
		Assert.assertEquals(driver.getTitle(),excelutility2.readStringDataFromExcel("Sheet1", 13, 0), "WishList page is not displayed successfully");
		Reporter.log("WishList page is displayed successfully ", true);
	    
		album1.getClickWishList().click();
		Reporter.log("Product added to Wishlist successfully",true);
		
		
	
	}

}
