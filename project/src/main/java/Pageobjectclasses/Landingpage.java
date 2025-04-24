package Pageobjectclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Landingpage {
	
	WebDriver driver;
	
    public Landingpage(WebDriver driver2)
    {
    	this.driver=driver2;
    	PageFactory.initElements(driver2,this);
    }
    
    @FindBy(css="#userEmail")
    WebElement email;
    @FindBy(id="userPassword")
    WebElement pass;
    @FindBy(id="login")
    WebElement log;
    
    public void gotologin() throws InterruptedException {
    	driver.get("https://rahulshettyacademy.com/client/");
    	driver.manage().window().setSize(new Dimension(1440,900));
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); 
		//wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys("srinivas.51423@gmail.com");
        pass.sendKeys("Srinivasrahul5$");  
       
        log.click();
        String g=driver.getCurrentUrl();
        System.out.println(g);
        
    }


}
