package Project.Expedia;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class FlightSelect {
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='?pwaLob=wizard-flight-pwa']") WebElement FlightClick;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[4]/div[1]/div/div/div/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/button") WebElement FromInput;
	@FindBy(xpath = "//*[@data-stid='location-field-leg1-destination-menu-trigger']") WebElement GoingTo;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[4]/div[1]/div/div/div/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div") WebElement DepartDateLocation;
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[4]/div[1]/div/div/div/div/div/div/div[2]/div/form/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[3]/button")WebElement Done;
	
	@FindBy(xpath = "//button[@aria-label='Feb 9, 2022']") WebElement GoingDate;
	@FindBy(xpath = "//button[@aria-label='Feb 18, 2022']") WebElement RtnDate;
	@FindBy(xpath = "//button[@data-testid='submit-button']") WebElement SearchClick;


	public FlightSelect(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void Flights() {
	FlightClick.click();
}
public void DeparturePlace() throws InterruptedException {
	
	FromInput.click();
	Thread.sleep(4000);
	driver.manage().deleteAllCookies();
	FromInput.sendKeys("Columbus (CMH - John Glenn Columbus Intl.)");
	Thread.sleep(4000);
	List<WebElement> list=driver.findElements(By.xpath("//*[@data-stid='location-field-leg1-origin-results']"));
	list.get(0).getText().contains("Columbus (CMH - John Glenn Columbus Intl.)");
	list.get(0).click();
	//Select Airport = new Select((WebElement) driver);  
	//Airport.selectByVisibleText("Columbus (CMH - John Glenn Columbus Intl.)");
	//Thread.sleep(4000);
	//FromInput.sendKeys(Keys.ENTER);
}

public void Destination() throws InterruptedException {
	GoingTo.click();
	Thread.sleep(4000);
	driver.manage().deleteAllCookies();
	GoingTo.sendKeys("Indianapolis (IND - Indianapolis Intl.)");
	Thread.sleep(4000);
	List<WebElement> list=driver.findElements(By.xpath("//*[@data-stid='location-field-leg1-destination-result-item']"));
	list.get(0).getText().contains("Indianapolis (IND - Indianapolis Intl.)");
	list.get(0).click();
	//GoingTo.getText().indexOf(0);
	//WebElement SearchClick1=driver.findElement(By.linkText("Indiana, United States"));
	//SearchClick1.click();
	//Thread.sleep(4000);
	//GoingTo.sendKeys(Keys.ENTER);
}
public void DepartClick(){
	
	DepartDateLocation.click();
}

public void DepartureDate() {
	GoingDate.click();
}
public void ReturnDate() {
	RtnDate.click();
}
public void DoneButton() {
	Done.click();
	driver.manage().deleteAllCookies();
}
public void SearchButton() throws InterruptedException {
	SearchClick.click();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	Thread.sleep(6000);
}
}
