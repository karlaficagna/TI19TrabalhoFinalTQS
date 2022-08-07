package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPages;

import static org.junit.Assert.assertEquals;


public class LoginTest {

    static WebDriver driver;
    static LoginPages paginaLogin;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("Webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" http://automationpractice.com/index.php");
        paginaLogin = new LoginPages(driver);
    }

    @AfterClass
    public static void AfterClass() throws Exception {

    }

    @Test
    public void test() {
        paginaLogin.submeteLogin();
        assertEquals(paginaLogin.validacaoDeMensagemDeLogin(), "An email address required.");


    }
}
