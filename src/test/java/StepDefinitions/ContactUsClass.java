package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;

public class ContactUsClass {
	
	WebDriver driver = new ChromeDriver();
	Actions action = new Actions(driver);
    
  @Given("^I log into \"([^\"]*)\"$")
  public void LogintoMortgageAdviceBurueaPage(String websitename) throws Throwable {
	 driver.get(websitename);
	    if(driver.findElement(By.xpath("//div[@class='cookie-notification__buttons']/a[@class='btn btn--no-chevron btn--secondary js-allow-all-cookies']")).isDisplayed()) {
               
		driver.findElement(By.xpath("//div[@class='cookie-notification__buttons']/a[@class='btn btn--no-chevron btn--secondary js-allow-all-cookies']")).click();
 
	}
	  
  }

  @And("^I swipe down$")
  public void PageDown() throws Throwable {
	//SCROLL DOWN
      action.sendKeys(Keys.PAGE_DOWN).build().perform();

  
  }

  @Then("^I put first name as \"([^\"]*)\"$")
  public void FirstName(String firstName) throws Throwable {
	   driver.findElement(By.id("18168558-ba48-41fb-b513-4e7134dfab02")).sendKeys(firstName);
 
  }
  
  @And("^I put last name as \"([^\"]*)\"$")
  public void LastName(String lastName) throws Throwable {
       driver.findElement(By.id("80fc4352-5c11-49c4-9dac-0263a837c47a")).sendKeys(lastName);
 
  }
  
  @And("^I put email address as \"([^\"]*)\"$")
  public void EmailAddress(String emailAddress) throws Throwable {
       driver.findElement(By.id("fd8b5a2d-af93-4e14-968a-6c4556ddf499")).sendKeys(emailAddress);
 
  }
  
  @And("^I put Post Code as \"([^\"]*)\"$")
  public void PostCode(String postCode) throws Throwable {
  
	  driver.findElement(By.id("597b46f2-68bb-4a32-bd1b-00ace2eda5f1")).sendKeys(postCode);
  
  }
  
  @And("^I put mobile number as \"([^\"]*)\"$")
  public void mobileNumber(String mobileNumber) throws Throwable {
      driver.findElement(By.id("37c67a56-17a5-478c-8a7e-122d22919cc6")).sendKeys(mobileNumber);
  
  }
  
  @And("^I leave a message as \"([^\"]*)\"$")
  public void message(String message) throws Throwable {

	   driver.findElement(By.id("811d55de-6e29-404f-8d6a-66375be202ae")).sendKeys(message);
      
  }
  
  @And("^I select marking email options$")
  public void marketingemailoption() throws Throwable {
	    driver.findElement(By.id("9d4c02eb-0cf8-449f-a672-9a8cadc3fd53")).click();
	    
  }
  
 

	 @After
	 public void doSomethingAfter(Scenario scenario) {
		  driver.quit();
	 }
	 
}
