package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_LoginTest extends BaseDriver {

    @Test
    public void loginTest(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email =driver.findElement(By.id("input-email"));
        email.sendKeys("campus1@gamil.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("12345");

        WebElement loginButton = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        loginButton.click();

        Assert.assertEquals(driver.getTitle(),"My Account");





    }






}
