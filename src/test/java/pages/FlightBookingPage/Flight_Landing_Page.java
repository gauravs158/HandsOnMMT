package pages.FlightBookingPage;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flight_Landing_Page {
	
	
	
	@FindBy(xpath="//span[@class='commonModal__close']")
	WebElement signInPopUpCloseBtn;
	
	@FindBy(xpath="//a[@class='headerIcons makeFlex hrtlCenter column active']")
	WebElement Hotels;
	
	@FindBy(xpath="//a[@href='https://www.makemytrip.com/homestays/']")
	WebElement HomestaysVillas;
	
	@FindBy(xpath="//a[@href='https://www.makemytrip.com/holidays-india/']")
	WebElement HolidayPackages;
	
	@FindBy(xpath="//a[@href='https://www.makemytrip.com/bus-tickets/']")
	WebElement Buses;
	
	@FindBy(xpath="//a[@href='https://www.makemytrip.com/flights/']")
	WebElement Flights;
	
	@FindBy(xpath="//li[@data-cy='oneWayTrip']")
	WebElement oneWayTripRdBtn;
	
	@FindBy(xpath="//li[@data-cy='roundTrip']")
	WebElement roundTripRdBtn;
	
	@FindBy(xpath="//span[@class='fltReturnCross flightsSprite']")
	WebElement returnCrossBtn;
	
	@FindBy(xpath="//li[@data-cy='mulitiCityTrip']")
	WebElement mulitiCityTripRdBtn;
	
	@FindBy(xpath="//label[@for='fromCity']")
	WebElement fromCityDropdownField;
	
	@FindBy(xpath="//label[@for='toCity']")
	WebElement toCityDropdownField;
	
	@FindBy(xpath="//label[@for='departure']")
	WebElement departureDatePicker;
	
	@FindBy(xpath="//label[@for='return']")
	WebElement returnDatePicker;
	
	@FindBy(xpath="//label[@for='travellers']")
	WebElement travellersTotal;
	
	@FindBy(id="fromCity")
	WebElement fromCityTextField;
	
	@FindBy(id="toCity")
	WebElement toCityTextField;
	
	@FindBy(xpath="//p[@data-cy='departureDate']")
	WebElement departureDateTextField;
	
	@FindBy(xpath="//p[@data-cy='returnDate']")
	WebElement returnDateTextField;
	
	@FindBy(xpath="//span[@data-cy='travellerText']")
	WebElement travellerTotalTextField;
	
	@FindBy(xpath="//div[contains(text(),'Regular')]/parent::div")
	WebElement regularTravellerRdBtn;
	
	@FindBy(xpath="//div[contains(text(),'Student')]/parent::div")
	WebElement studentTravellerRdBtn;
	
	@FindBy(xpath="//div[contains(text(),'Senior Citizen')]/parent::div")
	WebElement seniorCitizenTravellerRdBtn;
	
	@FindBy(xpath="//div[contains(text(),'Armed Forces')]/parent::div")
	WebElement armedForcesTravellerRdBtn;
	
	@FindBy(xpath="//div[contains(text(),'Doctor and Nurses')]/parent::div")
	WebElement doctorsAndNursesTravellerRdBtn;
	
	@FindBy(xpath="//a[contains(text(),'Search')]")
	WebElement searchBtn;
	
	@FindBy(xpath="//input[@placeholder='From']")
	WebElement autoSuggestiveDropdownFromTextField;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement autoSuggestiveDropdownToTextField;
	
	@FindBy(id="react-autowhatever-1")
	Set<WebElement> suggestedDropdownElementsList;
	
	@FindBy(xpath="//span[@aria-label='Next Month']")
	WebElement datePickerNextArrowBtn;
	
	@FindBy(xpath="//span[@aria-label='Previous Month']")
	WebElement datePickerPreviousArrowBtn;
	
	
	//Departure Dates
	//September Month
	//div[@class='DayPicker-Month']//div[contains(text(),'September')]
	
	//pick departure date as September 26
	//div[contains(text(),'September')]/parent::div/parent::div//div[@class='dateInnerCell']//p[normalize-space()='26']
	
	
	//Return Dates
	//October Month
	//div[@class='DayPicker-Month']//div[contains(text(),'September')]
	//pick departure date as October 12
	//div[contains(text(),'October')]/parent::div/parent::div//div[@class='dateInnerCell']//p[normalize-space()='12']
	
	public void closeSignInPopUp() {
		signInPopUpCloseBtn.click();
	}
	public void selectFlightsPage() {
		if(!(Flights.isSelected())) {
			Flights.click();
		}
	}
	public void selectHotelsPage() {
		if(!(Hotels.isSelected())) {
			Hotels.click();
		}
	}
	public void selectHomeStaysAndVillasPage() {
		if(!(HomestaysVillas.isSelected())) {
			HomestaysVillas.click();
		}
	}
	public void selectHolidayPackagesPage() {
		if(!(HolidayPackages.isSelected())) {
			HolidayPackages.click();
		}
	}
	public void selectBusBookingPage() {
		if(!(Buses.isSelected())) {
			Buses.click();
		}
	}
}
