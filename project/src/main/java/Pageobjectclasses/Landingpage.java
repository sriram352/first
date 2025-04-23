package Pageobjectclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {
	
	WebDriver driver;
	
    public Landingpage(WebDriver driver2)
    {
    	this.driver=driver2;
    	PageFactory.initElements(driver2,this);
    }
    
    @FindBy(id="userEmail")
    WebElement email;
    @FindBy(id="userPassword")
    WebElement pass;
    @FindBy(id="login")
    WebElement log;
    
    public void gotologin() throws InterruptedException {
    	driver.get("https://rahulshettyacademy.com/client/");
    	driver.manage().window().maximize();
        email.sendKeys("srinivas.51423@gmail.com");
        pass.sendKeys("Srinivasrahul5$");  
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(5000);
        log.click();
        
        
    }


}
