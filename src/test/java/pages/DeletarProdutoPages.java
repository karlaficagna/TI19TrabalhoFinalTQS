package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DeletarProdutoPages {
    static WebDriver driver;

    public DeletarProdutoPages(WebDriver driver) {

        this.driver = driver;
    }

    public static void pesquisarIncluirExcluirProdutoDoCarrinho() {

        driver.findElement(By.id("search_query_top")).sendKeys("Printed Summer Dress");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();
        driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
        driver.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[@id='product_5_19_0_0']/td[7]/div[1]/a[1]/i[1]")).click();

    }

    public String capturaDeMensagemDeCarrinhoVazio(){
        return driver.findElement(By.xpath("//p[contains(text(),'Your shopping cart is empty.')]")).getText();
    }
}
