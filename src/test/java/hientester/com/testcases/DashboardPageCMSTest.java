package hientester.com.testcases;

import hientester.com.common.BaseTest;
import hientester.com.pages.DashboardPageCMS;
import hientester.com.pages.LoginPageCMS;
import org.testng.annotations.Test;

public class DashboardPageCMSTest extends BaseTest {
    LoginPageCMS loginPageCMS;
    DashboardPageCMS dashboardPageCMS;


    @Test
    public void testDashBoardCMS(){
        //Kiểm tra đăng nhập Login
        loginPageCMS = new LoginPageCMS(driver);
       dashboardPageCMS = loginPageCMS.login("seller@example.com","123456");

        //Kiếm tra menu Products click vào mở được trang
        dashboardPageCMS.verifyDashboardPageCMS();
        dashboardPageCMS.openProductPageCMS();


    }
}
