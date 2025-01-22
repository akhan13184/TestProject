import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumclass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mortgageadvicebureau.com/contact-us");
		Actions action = new Actions(driver);
        //open SoftwareTestingMaterial.com
	    if(driver.findElement(By.xpath("//div[@class='cookie-notification__buttons']/a[@class='btn btn--no-chevron btn--secondary js-allow-all-cookies']")).isDisplayed()) {
               
		driver.findElement(By.xpath("//div[@class='cookie-notification__buttons']/a[@class='btn btn--no-chevron btn--secondary js-allow-all-cookies']")).click();
 
	}
		//SCROLL DOWN
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
 
        driver.findElement(By.id("18168558-ba48-41fb-b513-4e7134dfab02")).sendKeys("Ammar");
        driver.findElement(By.id("80fc4352-5c11-49c4-9dac-0263a837c47a")).sendKeys("Khan");
        driver.findElement(By.id("fd8b5a2d-af93-4e14-968a-6c4556ddf499")).sendKeys("ammar88@hotmail.co.uk");
        driver.findElement(By.id("597b46f2-68bb-4a32-bd1b-00ace2eda5f1")).sendKeys("LE2 2BJ");
        
      //SCROLL DOWN
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        
        driver.findElement(By.id("37c67a56-17a5-478c-8a7e-122d22919cc6")).sendKeys("07868155174");
        driver.findElement(By.id("811d55de-6e29-404f-8d6a-66375be202ae")).sendKeys("I am in a interview");
        driver.findElement(By.id("9d4c02eb-0cf8-449f-a672-9a8cadc3fd53")).click();
         
        //SCROLL DOWN
        action.sendKeys(Keys.PAGE_DOWN).build().perform();   
        
		//driver.quit();
		

	}

}
