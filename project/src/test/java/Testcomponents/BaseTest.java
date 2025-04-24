package Testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjectclasses.Landingpage;

public class BaseTest {
	WebDriver driver;
	public Landingpage Lp;
public void driverinit() throws IOException {
	Properties ab=new Properties();
	FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/globalproperties/globalproperties.properties");
	ab.load(fs);
    String browser=System.getProperty("browser")!=null?System.getProperty("browser"):ab.getProperty("browser");
    if(browser.contains("chrome")) {
    	  ChromeOptions options=new ChromeOptions();
    	  if(browser.contains("headless")) {
    		driver=new ChromeDriver(options);
    		options.addArguments("headless");
    	}
        driver=new ChromeDriver();
    }
    else if(browser.equalsIgnoreCase("firefox")) {
    	driver=new FirefoxDriver();
    }
    else if(browser.equalsIgnoreCase("edge")) {
    	driver=new EdgeDriver();
    }
}
@BeforeTest
public Landingpage start() throws IOException, InterruptedException {
	driverinit();
	Lp =new Landingpage(driver);
	Lp.gotologin(); 
	return Lp;
}
@AfterTest
public void wsait() {
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

}
