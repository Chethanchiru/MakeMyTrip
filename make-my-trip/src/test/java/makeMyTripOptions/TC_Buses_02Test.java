package makeMyTripOptions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.BusesPage;

public class TC_Buses_02Test extends Base_Class{

	@Test
	public void buses()  {

		//***************************************************** Home page **************************************************//

		ExcelUtil excelLib = new ExcelUtil();

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 8, 2), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);

		homePage.getcreateAccountButton().click();	
		homePage.getpopUpCancelButton().click();

		homePage.getbusesLinkText().click();
		
		//***************************************************** Home page **************************************************//
		
		BusesPage busesPage = new BusesPage(driver);
		busesPage.getFromBusCityButton().click();
		busesPage.getfromBusCityTextField().click();
		busesPage.getfromBusCityTextField().sendKeys(excelLib.readStringDataFromExcel("Sheet1", 6, 2));
		busesPage.getfromBusCityPlace().click();
		
		busesPage.getToBusCityTextField().click();
		busesPage.getToBusCityTextField().sendKeys(excelLib.readStringDataFromExcel("Sheet1", 7, 2));
		busesPage.getToBusCitySelect().click();
		busesPage.getTravelDateButton().click();
		busesPage.getsearchButton().click();
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		busesPage.getviewBusesButton().click();
		busesPage.getSelectSeatButton().click();
		busesPage.getSelectSeatImgButton().click();
		
		JavascriptExecutor javaScript = (JavascriptExecutor) driver;
		
//		public void jsScrollBy(int X,int Y) {
//			javaScript.executeScript("window.scrollBy("+X+","+Y+")");
//		}
		
		busesPage.getBookSeatButton().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		busesPage.getnameTextField().sendKeys(excelLib.readStringDataFromExcel("Sheet1", 10, 2));
		busesPage.getAgeTextField().sendKeys(excelLib.readStringDataFromExcel("Sheet1", 11, 2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}

