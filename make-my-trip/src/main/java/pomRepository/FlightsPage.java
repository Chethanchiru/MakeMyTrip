package pomRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

	public FlightsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[@class='intlRtAirlineInfo']") private List<WebElement> allFlights;
	
	public List<WebElement> getallFlights() {
		return allFlights;
	}
}
