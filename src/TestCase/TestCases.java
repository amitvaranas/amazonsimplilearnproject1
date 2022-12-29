package TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddToCart;
import Pages.PageHome;
import Pages.ProductListPage;

public class TestCases {
    
    public void TestPrintListOfProducts() {
    	
        
//        deiver
        ProductListPage listPage = new ProductListPage();
        PageHome home = new PageHome();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        home.SearchProduct(driver);
        listPage.PrintFirst4Products_Name(driver);
        listPage.PrintFirst4Products_Price(driver);
        
        driver.close();
        
        
        
    }
    
    
public void ValidateListOfProducts() {
        
//        deiver
        ProductListPage listPage = new ProductListPage();
        PageHome home = new PageHome();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        home.SearchProduct(driver);
        listPage.ValidateListofProducts(driver, listPage.PrintFirst4Products_Name(driver), listPage.PrintFirst4Products_Price(driver));
//        listPage.ClickOnProduct(driver);
//        AddtoCart
        
        driver.close();
        
        
        
    }


public void clickonproducts() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	PageHome home =new PageHome();
	ProductListPage listpage = new ProductListPage();
	AddToCart cart = new AddToCart();
	
	home.SearchProduct(driver);
	listpage.ClickOnProduct(driver);
	cart.addintocart(driver);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	cart.viewCart(driver);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}