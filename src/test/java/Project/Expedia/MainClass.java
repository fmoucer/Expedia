package Project.Expedia;

import org.testng.annotations.Test; 
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MainClass  {
	public static WebDriver driver;
  @Test  (priority =1)
  public void f() throws InterruptedException {
  FlightSelect fl=new FlightSelect(driver);
  fl.Flights();
  Thread.sleep(2000);
  fl.DeparturePlace();
  Thread.sleep(2000);
  fl.Destination();
  Thread.sleep(2000);
  fl.DepartClick();
  Thread.sleep(2000);
  fl.DepartureDate();
  Thread.sleep(2000);
  fl.ReturnDate();
  Thread.sleep(2000);
  fl.DoneButton();
  Thread.sleep(2000);
  fl.SearchButton();
  Thread.sleep(10000);
  PriceSelect ps=new PriceSelect(driver);
  ps.FlightPrice();
  Thread.sleep(2000);
  ps.NoAdd();
  Thread.sleep(10000);
  ps.ReturnSelect();
  Thread.sleep(2000);
  ps.NoAdd1();
  Thread.sleep(2000);
  ps.CarAlert();
  Thread.sleep(2000);
  ps.CheckOut();
  
  PassengerInformation pi=new PassengerInformation(driver);
  pi.FirstName();
  Thread.sleep(2000);
  pi.LastName();
  Thread.sleep(2000);
  pi.PhoneNumber();
  Thread.sleep(2000);
  pi.GenderSelect();
  Thread.sleep(2000);
  pi.BirthMonth();
  Thread.sleep(2000);
  pi.BirthDay();
  Thread.sleep(2000);
  pi.BirthYear();
  Thread.sleep(2000);
  pi.CardNameHolder();
  Thread.sleep(2000);
  pi.CardNumber();
  Thread.sleep(2000);
  pi.CardExMonth();
  Thread.sleep(2000);
  pi.CardExYear();
  Thread.sleep(2000);
  pi.SecurityCode();
  Thread.sleep(2000);
  pi.BilligAddress();
  Thread.sleep(2000);
  pi.City();
  Thread.sleep(2000);
  pi.State();
  Thread.sleep(2000);
  pi.ZipCode();
  Thread.sleep(2000);
  pi.CompleteButton();
  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ferha\\eclipse-workspace\\Expedia\\src\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.expedia.com/");  
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.manage().deleteAllCookies();
			Thread.sleep(4000);	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 
  }

}
