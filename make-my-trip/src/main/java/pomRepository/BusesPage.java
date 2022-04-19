package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusesPage {
	
	public BusesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="fromCity") private WebElement fromBusCityButton;

	public WebElement getFromBusCityButton() {
		return fromBusCityButton;
	}

	@FindBy(xpath="//input[@placeholder='From']") private WebElement fromBusCityTextField;

	public WebElement getfromBusCityTextField() {
		return fromBusCityTextField;
	}

	@FindBy(xpath="//input[@placeholder='From']") private WebElement fromBusCitySelect;

	public WebElement getfromBusCitySelect() {
		return fromBusCitySelect;
	}
	
	@FindBy(xpath="//span[text()='Bangalore Package, Karnataka']") private WebElement fromBusCityPlace;

	public WebElement getfromBusCityPlace() {
		return fromBusCityPlace;
	}
	
	@FindBy(xpath="//input[@placeholder='To']") private WebElement toBusCityTextField;

	public WebElement getToBusCityTextField() {
		return toBusCityTextField;
	}
	
	@FindBy(xpath="//span[text()='Goa Package, Goa']") private WebElement toBusCitySelect;

	public WebElement getToBusCitySelect() {
		return toBusCitySelect;
	}
	
	@FindBy(xpath="//div[text()='May 2022']/../..//div[text()='21']") private WebElement travelDateButton;

	public WebElement getTravelDateButton() {
		return travelDateButton;
	}
	
	@FindBy(xpath="//button[@data-cy='submit']") private WebElement searchButton;

	public WebElement getsearchButton() {
		return searchButton;
	}
	
	@FindBy(xpath="//div[text()='Bangalore -> Goa']") private WebElement viewBusesButton;

	public WebElement getviewBusesButton() {
		return viewBusesButton;
	}
	
	@FindBy(xpath="//span[text()='3.9']/../../../../..//a[text()='Select Seats']") private WebElement selectSeatButton;

	public WebElement getSelectSeatButton() {
		return selectSeatButton;
	}
	
	@FindBy(xpath="(//img[@class='seat-icon'])[1]") private WebElement selectSeatImgButton;

	public WebElement getSelectSeatImgButton() {
		return selectSeatImgButton;
	}
	
	@FindBy(xpath="(//img[@class='seat-icon'])[16]") private WebElement bookSeatButton;

	public WebElement getBookSeatButton() {
		return bookSeatButton;
	}
	
	@FindBy(xpath="//input[@id='fname']") private WebElement nameTextField;

	public WebElement getnameTextField() {
		return nameTextField;
	}
	
	@FindBy(id="age") private WebElement ageTextField;

	public WebElement getAgeTextField() {
		return ageTextField;
	}
}
