package Project.Expedia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PassengerInformation {
	public WebDriver driver;

	@FindBy(name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].firstName") WebElement FName;
	@FindBy(name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].lastName") WebElement LName;
	@FindBy(name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].phoneNumber") WebElement PhNumber;
	@FindBy(xpath = "//*[@id='gender_male[0]']") WebElement GeSelect;
	@FindBy(name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].dateOfBirth.month")WebElement MoSelect;
	@FindBy(name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].dateOfBirth.day") WebElement DySelect;
	@FindBy(name = "tripPreferencesRequest.airTripPreferencesRequest.travelerPreferences[0].dateOfBirth.year") WebElement YeSelect;
	@FindBy(xpath = "//*[@id='no_insurance']") WebElement NoInsurance;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[12]/section[2]/article[5]/fieldset/div/div[2]/div[2]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[1]/input") WebElement CaName;
	@FindBy(xpath = "//*[@id='creditCardInput']") WebElement CaNumber;
	@FindBy(name = "creditCards[0].expiration_month") WebElement ExMonth;
	@FindBy(xpath = "creditCards[0].expiration_year") WebElement ExYear;
	@FindBy(id = "new_cc_security_code") WebElement SeCode;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[12]/section[2]/article[5]/fieldset/div/div[2]/div[2]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[1]/input") WebElement StreetInput;
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[12]/section[2]/article[5]/fieldset/div/div[2]/div[2]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[3]/input") WebElement CityInput;
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[12]/section[2]/article[5]/fieldset/div/div[2]/div[2]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[4]/select") WebElement StateInput;
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[12]/section[2]/article[5]/fieldset/div/div[2]/div[2]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[5]/input") WebElement ZipInput;
	
	@FindBy(xpath = "//*[@id='complete-booking']") WebElement BookingSubmit;


	public PassengerInformation(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void FirstName() {
	FName.sendKeys("qwert");
}
public void LastName() {
	LName.sendKeys("yuiop");
}
public void PhoneNumber() {
	PhNumber.sendKeys("61452899654");;
}
public void GenderSelect() {
	GeSelect.click();
}
public void BirthMonth() {
	Select selectMonth=new Select(MoSelect);
	selectMonth.selectByVisibleText("07 - Jul");
}
public void BirthDay() {
	Select selectDay=new Select(DySelect);
	selectDay.selectByVisibleText("09");
	
}
public void BirthYear() {
	Select selectYear=new Select(YeSelect);
	selectYear.selectByVisibleText("1988");
}
public void CardNameHolder() {
	CaName.sendKeys("qwerty wregert");;
}
public void CardNumber() {
	CaNumber.sendKeys("5464654654546584");;
}
public void CardExMonth() {
	Select ExperationMonth=new Select(ExMonth);
	ExperationMonth.selectByVisibleText("07 - Jul");
	
}
public void CardExYear() {
	Select ExperationYear=new Select(ExYear);
	ExperationYear.selectByVisibleText("2023");
	
}
public void SecurityCode() {
	SeCode.sendKeys("535");
}
public void BilligAddress() {
	StreetInput.sendKeys("528 n high street");;
}
public void City() {
	CityInput.sendKeys("columbus");;
}
public void State(){
	Select SelectState=new Select(StateInput);
	SelectState.selectByVisibleText("OH");
	
}


public void ZipCode() {
	ZipInput.sendKeys("43204");
}
public void CompleteButton() {
	BookingSubmit.click();
}
}


