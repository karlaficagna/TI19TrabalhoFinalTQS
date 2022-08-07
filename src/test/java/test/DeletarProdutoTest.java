package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BuscaProdutoPages;
import pages.DeletarProdutoPages;

import static org.junit.Assert.assertEquals;

public class DeletarProdutoTest {


    static WebDriver driver;
    static DeletarProdutoPages deletarProdutoPages;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("Webdriver.chrome.driver", "C:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(" http://automationpractice.com/index.php");
        deletarProdutoPages = new DeletarProdutoPages(driver);


    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {


    }

    @Test
    public void pesquisarIncluirExcluirProdutoDoCarrinho() {
        deletarProdutoPages.pesquisarIncluirExcluirProdutoDoCarrinho();
        assertEquals(deletarProdutoPages.capturaDeMensagemDeCarrinhoVazio(), "Your shopping cart is empty.");
    }
}