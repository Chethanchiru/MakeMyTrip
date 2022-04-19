package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//***************************************************** Flights **************************************************//

	@FindBy(xpath="//li[@data-cy='account']") private WebElement createAccountButton;

	public WebElement getcreateAccountButton() {
		return createAccountButton;
	}

	@FindBy(xpath="//span[@class='langCardClose']") private WebElement popUpCancelButton;

	public WebElement getpopUpCancelButton() {
		return popUpCancelButton;
	}

	@FindBy(xpath="//label[@for='fromCity']") private WebElement fromCityButton;

	public WebElement getfromCityButton() {
		return fromCityButton;
	}

	@FindBy(xpath="//input[@placeholder='From']") private WebElement fromCityTextField;

	public WebElement getfromCityTextField() {
		return fromCityTextField;
	}

	@FindBy(xpath="//p[text()='Bengaluru, India']") private WebElement bengaluruButton;

	public WebElement getbengaluruButton() {
		return bengaluruButton;
	}

	@FindBy(xpath="//label[@for='toCity']") private WebElement toCityButton;

	public WebElement gettoCityButton() {
		return toCityButton;
	}

	@FindBy(xpath="//input[@type='text' and @placeholder='To']") private WebElement toCityTextField;

	public WebElement gettoCityTextField() {
		return toCityTextField;
	}

	@FindBy(xpath="//p[text()='London, United Kingdom']") private WebElement londonButton;

	public WebElement getlondonButton() {
		return londonButton;
	}

	@FindBy(xpath="//div[text()='April 2022']/../..//p[text()='23']") private WebElement departureButton;

	public WebElement getdepartureButton() {
		return departureButton;
	}

	@FindBy(xpath="//span[contains(text(),'RETURN')]") private WebElement returnButton;

	public WebElement getreturnButton() {
		return returnButton;
	}

	@FindBy(xpath="//div[text()='May']/./../..//p[text()='21']") private WebElement returnDateButton;

	public WebElement getreturnDateButton() {
		return returnDateButton;
	}

	@FindBy(xpath="//a[text()='Search']") private WebElement searchButton;

	public WebElement getsearchButton() {
		return searchButton;
	}

	//***************************************************** Buses **************************************************//

	@FindBy(xpath="//li[@class='menu_Buses']") private WebElement busesLinkText;

	public WebElement getbusesLinkText() {
		return busesLinkText;
	}

	





}
