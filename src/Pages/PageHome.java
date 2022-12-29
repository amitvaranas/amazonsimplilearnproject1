package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHome {
    By search_bar = By.id("twotabsearchtextbox");
    By submit_button = By.id("nav-search-submit-button");
    
//    WebElements
    
    
    public void SearchProduct(WebDriver driver) {
    	
        String URL = "https://www.amazon.in/";
        driver.get(URL);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(search_bar).sendKeys("earpods");
        driver.findElement(submit_button).click();
        
        
        
    }
}
