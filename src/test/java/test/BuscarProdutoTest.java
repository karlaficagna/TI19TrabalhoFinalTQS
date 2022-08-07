package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BuscaProdutoPages;

import static org.junit.Assert.assertEquals;


public class BuscarProdutoTest {

    static WebDriver driver;
    static BuscaProdutoPages buscaProdutoPages;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("Webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" http://automationpractice.com/index.php");
        buscaProdutoPages = new BuscaProdutoPages(driver);


    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {


    }

    @Test
    public void testarBuscaDeProduto() {
        buscaProdutoPages.BuscaDeProduto();
        assertEquals(buscaProdutoPages.capturaDeMensagemDeQuantidadeProdutos(), "3 results have been found.");



    }
}
