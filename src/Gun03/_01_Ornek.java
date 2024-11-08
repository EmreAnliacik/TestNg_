package Gun03;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Ornek extends BaseDriver {

/*                 Senaryo
                1- Siteyi açınız.
                2- Edit Account sayfasına ulaşınız.
                3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
*/

    @Test
    public void editAccount(){

        WebElement editAcoount = driver.findElement(By.cssSelector("div ul a[href='https://opencart.abstracta.us:443/index.php?route=account/edit']"));
        editAcoount.click();

        WebElement fisrtName = driver.findElement(By.id("input-firstname"));
        WebElement lastName = driver.findElement(By.id("input-lastname"));

        fisrtName.clear();
        lastName.clear();
        fisrtName.sendKeys("Ali");
        lastName.sendKeys("Emir");

        WebElement continu = driver.findElement(By.cssSelector("[value='Continue']"));
        continu.click();
    }

    @Test(dependsOnMethods = {"editAccount"})
    public void checkMessage(){
        WebElement message = driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']"));

        Assert.assertTrue(message.getText().toLowerCase().contains("success"));
    }





}
