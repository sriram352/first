package packa.Firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.quit();
    }
}
