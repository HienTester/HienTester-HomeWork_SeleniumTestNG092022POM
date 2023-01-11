package hientester.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductsPageCMS {

    private String PAGE_URL = "https://cms.anhtester.com/seller/products";
    private String PAGE_TEXT = "Products";

    //Các Objects
    By menuProducts = By.xpath("//a[@href='#']//span[normalize-space()='Products']");
    By textdigitalProducts = By.xpath("//h1");
    By digitalProducts = By.xpath("//a[@href='https://cms.anhtester.com/seller/digitalproducts']//span[normalize-space()='Digital Products']");
    By productReviews = By.xpath("//a[@href='https://cms.anhtester.com/seller/reviews']//span[normalize-space()='Product Reviews']");

    //Hàm xây dựng
    private WebDriver driver;
    public ProductsPageCMS(WebDriver _driver) {
        driver = _driver;
    }

    //Hàm xử lý
    public void openDigitalProducts() {
        driver.findElement(menuProducts).click();
        driver.findElement(digitalProducts).click();
        //Kiểm tra text có trong DigitalProducts
        Assert.assertEquals(driver.findElement(textdigitalProducts).getText(),PAGE_TEXT,"Digital Products not existing.");

    }

}
