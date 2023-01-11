package hientester.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageCMS {

    private String URL = "https://cms.anhtester.com/users/login";

    //Dùng đối tượng By trong Selenium để khai báo tên Object cùng giá trị Locator tương ứng
    By headerPage = By.xpath("//h1");
    By closeCommercial = By.xpath("//i[@class='la la-close fs-20']");
    By inputEmail = By.xpath("//input[@id='email']");
    By inputPassword = By.xpath("//input[@id='password']");
    By buttonLogin = By.xpath("//button[normalize-space()='Login']");
    By messageEmptyEmail = By.xpath("//span[@class='invalid-feedback']");


    //Hàm xây dựng để truyền driver vào
    private WebDriver driver;
    public LoginPageCMS(WebDriver _driver){
        driver = _driver;
    }

    //Viết các hàm xử lý cho trang Login
    public void verifyHeaderPage(){
        Assert.assertEquals(driver.findElement(headerPage).getText(),"Login to your account.","FAIL.Header to not match");
    }

    public void clickOnCloseButton(){
        driver.findElement(closeCommercial).click();
    }

    public void verifyErrorMessageDisplay(){
        Assert.assertTrue(driver.findElement(messageEmptyEmail).isDisplayed(),"FAIL.Error message no displays");
        Assert.assertEquals(driver.findElement(messageEmptyEmail).getText(),"The email field is required when phone is not present.", "FAIL. Content of the Error message not match.");
    }

    public void enterEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickOnLoginButton(){
        driver.findElement(buttonLogin).click();
    }

    public DashboardPageCMS login(String email, String password){
        driver.get(URL);
        clickOnCloseButton();
        verifyHeaderPage();
        enterEmail(email);
        enterPassword(password);
        clickOnLoginButton();

        return new DashboardPageCMS(driver);
    }
}
