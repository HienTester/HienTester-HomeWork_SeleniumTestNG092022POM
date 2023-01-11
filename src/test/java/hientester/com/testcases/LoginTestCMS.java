package hientester.com.testcases;

import hientester.com.common.BaseTest;
import hientester.com.pages.LoginPageCMS;
import org.testng.annotations.Test;

public class LoginTestCMS extends BaseTest {
    LoginPageCMS loginPageCMS;

    @Test
    public void loginTestCMSSuccess() {
        //Khởi tạo đối tượng trong LoginPageCMS
        //Truyền driver từ BaseTest
        loginPageCMS = new LoginPageCMS(driver);

        //Gọi hàm "login" từ LoginPageCMS để dùng
        loginPageCMS.login("seller@example.com","123456");
    }
}
