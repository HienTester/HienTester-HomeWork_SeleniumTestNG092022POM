package hientester.com.testcases;

import hientester.com.common.BaseTest;
import hientester.com.pages.DashboardPageCMS;
import hientester.com.pages.LoginPageCMS;
import hientester.com.pages.ProductsPageCMS;
import org.testng.annotations.Test;

public class ProductsPageCMSTest extends BaseTest {

    LoginPageCMS loginPageCMS;
    DashboardPageCMS dashboardPageCMS;
    ProductsPageCMS productsPageCMS;

    @Test
    public void testProductsCMS(){
    loginPageCMS = new LoginPageCMS(driver);
    dashboardPageCMS = loginPageCMS.login("seller@example.com","123456");
    productsPageCMS.openDigitalProducts();

    }
}
