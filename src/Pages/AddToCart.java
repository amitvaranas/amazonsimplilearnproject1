package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart {
	
	public void addintocart(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("add-to-cart-button")).click();
//		driver.findElement(By.xpath("//*[@id=\"attach-close_sideSheet-link\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"attach-view-cart-button-form\"]")).click();
		
		
		
		
	}


}
