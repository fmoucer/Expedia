package Project.Expedia;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceSelect {
	public WebDriver driver;

@FindBy (xpath = "/html/body/div[2]/div[1]/div/div[2]/div[3]/div[1]/section/main/ul/li[1]/div/div/div/button")WebElement PSelect;
@FindBy (xpath = "/html/body/div[2]/div[1]/div/div[2]/div[3]/div[1]/section/main/div[6]/section/div[2]/div/div[2]/div/div/div/ul/li[1]/div/div/button")WebElement BPrice;
@FindBy (xpath = "/html/body/div[2]/div[1]/div/div[2]/div[3]/div[1]/section/main/ul/li[1]/div/div/div/button")WebElement RSelect;
@FindBy (xpath = "/html/body/div[2]/div[1]/div/div[2]/div[3]/div[1]/section/main/div[5]/section/div[2]/div/div[2]/div/div/div/ul/li/div/div/button")WebElement BPrice1;
@FindBy (xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/a[2]")WebElement CarSuggestion;
@FindBy (xpath = "//button[@data-test-id='goto-checkout-button']")WebElement ChOut;
	public  PriceSelect(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void FlightPrice() {
		PSelect.click();
		driver.manage().deleteAllCookies();
	}

	public void NoAdd() throws InterruptedException {
		BPrice.click();
		
		
	}


	public void ReturnSelect() {
		RSelect.click();
		
	}

	public void NoAdd1() {
		BPrice1.click();
		
	}

	public void CarAlert() {
		CarSuggestion.click();
		driver.manage().deleteAllCookies();
	}
	public void CheckOut() throws InterruptedException {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      
	      driver.switchTo().window(newTb.get(1));
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(8000);
		driver.manage().deleteAllCookies();
		ChOut.click();
	}
	
}
