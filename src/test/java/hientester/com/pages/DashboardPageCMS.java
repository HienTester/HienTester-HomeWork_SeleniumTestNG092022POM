package hientester.com.pages;

import hientester.com.WebUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPageCMS {
    //Data trong nội bộ trang Dashboard
    private String PAGE_URLCMS = "https://cms.anhtester.com/seller/dashboard";
    private String PAGE_TEXTCMS = "Dashboard";

    //Các Objects
    By menuProducts = By.xpath("//a[@href='#']//span[normalize-space()='Products']");
    By productsChild = By.xpath("//a[@href='https://cms.anhtester.com/seller/products']//span[text()='Products']");
    //By checkNowbutton = By.xpath("//a[normalize-space()='Verify Now']");
    By dashBoard = By.xpath("//h1");

    //Hàm xây dựng
    private WebDriver driver;
    public DashboardPageCMS(WebDriver _driver){
        driver = _driver;
    }

    public void verifyDashboardPageCMS() {
        //Kiểm tra URL chứa phần tử thuộc trang DB
        Assert.assertEquals(driver.getCurrentUrl(), PAGE_URLCMS, "URL chưa đúng trang Dashboard");

        //Kiểm tra Text hoặc Object có trong DB
        Assert.assertEquals(driver.findElement(dashBoard).getText(), PAGE_TEXTCMS, "Dashboard not existing");
    }

    //Hàm xử lý
    public ProductsPageCMS openProductPageCMS(){
        driver.findElement(menuProducts).click();
        driver.findElement(productsChild).click();
        System.out.println(driver.findElement(productsChild).isEnabled());

        return new ProductsPageCMS(driver);
    }
}
