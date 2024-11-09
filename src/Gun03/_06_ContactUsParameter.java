package Gun03;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _06_ContactUsParameter extends BaseDriver {
    /*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

    @Test
    @Parameters("mesaj")
    public void contactUs(String mesaj) {

        WebElement contactUs = driver.findElement(By.cssSelector("ul[class='list-unstyled'] li a[href='http://opencart.abstracta.us:80/index.php?route=information/contact']"));
        contactUs.click();

        WebElement textArea = driver.findElement(By.id("input-enquiry"));
        textArea.sendKeys(mesaj);

        WebElement submitButton = driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();
    }

    @Test(dependsOnMethods = {"contactUs"})
    public void Confirmation(){

        WebElement confirmationMessage = driver.findElement(By.id("content"));

        Assert.assertTrue(confirmationMessage.getText().toLowerCase().contains("contact"));


    }


}
