package makeMyTripOptions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.FlightsPage;

public class TC_Flights_01Test extends Base_Class{

	@Test
	public void flight()  {

		//***************************************************** Home page **************************************************//

		ExcelUtil excelLib = new ExcelUtil();

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 4, 2), "Home page is not displayed successfully");
		Reporter.log("Home page is displayed successfully", true);

		homePage.getcreateAccountButton().click();	
		homePage.getpopUpCancelButton().click();

		homePage.getfromCityButton().click();	
		homePage.getfromCityTextField().click();	
		homePage.getfromCityTextField().sendKeys(excelLib.readStringDataFromExcel("Sheet1", 2, 2));	
		homePage.getbengaluruButton().click();

		homePage.gettoCityButton().click();
		homePage.gettoCityTextField().click();
		homePage.gettoCityTextField().sendKeys(excelLib.readStringDataFromExcel("Sheet1", 3, 2));
		homePage.getlondonButton().click();

		homePage.getdepartureButton().click();
		homePage.getreturnButton().click();
		homePage.getreturnDateButton().click();
		homePage.getsearchButton().click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		//***************************************************** Flights page **************************************************//

		Assert.assertEquals(driver.getTitle(), excelLib.readStringDataFromExcel("Sheet1", 5, 2), "Flights page is not displayed successfully");
		Reporter.log("Flights page is displayed successfully", true);

		FlightsPage flightsPage = new FlightsPage(driver);
		int count = 0;

		for (WebElement flights : flightsPage.getallFlights()) {
			System.out.println(flights.getText());
			count ++;
		}
		System.out.println("The no of flights displayed are: " +count);
	}
}

