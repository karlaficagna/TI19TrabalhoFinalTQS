package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {

    static WebDriver driver;

    public LoginPages(WebDriver driver) {
        this.driver = driver;

    }


    public void submeteLogin() {
        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("SubmitLogin")).click();

    }
    public String validacaoDeMensagemDeLogin(){
        return driver.findElement(By.xpath("//li[contains(text(),'An email address required.')]")).getText();
    }

}
