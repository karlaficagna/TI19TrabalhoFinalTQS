package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BuscaProdutoPages {

    static WebDriver driver;

    public BuscaProdutoPages(WebDriver driver) {

        this.driver = driver;
    }

    public static void BuscaDeProduto() {

        driver.findElement(By.id("search_query_top")).sendKeys("Printed Summer Dress");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();

    }
    public String capturaDeMensagemDeQuantidadeProdutos(){
        return driver.findElement(By.xpath("//span[contains(text(),'3 results have been found.')]")).getText();
    }

}
