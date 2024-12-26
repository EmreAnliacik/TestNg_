package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_PlaceOrder extends BaseDriver {

    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

    @Test
    public void proceedToCheckOut(){


        WebElement searchArea = driver.findElement(By.name("search"));
        searchArea.sendKeys("ipod" + Keys.ENTER);

        WebElement addCart = driver.findElement(By.xpath("(//*[text()='Add to Cart'])[1]"));
        addCart.click();

        WebElement shoppingCart = driver.findElement(By.xpath("(//div[@class='alert alert-success alert-dismissible']/a)[2]"));
        shoppingCart.click();


        WebElement cheackoutButton = driver.findElement(By.cssSelector("[class='pull-right'] a"));
        cheackoutButton.click();



        WebElement continue1 = driver.findElement(By.cssSelector("[id='button-payment-address']"));
        continue1.click();

        WebElement continue2 = driver.findElement(By.cssSelector("[id='button-shipping-address']"));
        continue2.click();


        WebElement continue3 = driver.findElement(By.cssSelector("[id='button-shipping-method']"));
        continue3.click();

        WebElement agreeTerms = driver.findElement(By.name("agree"));
        agreeTerms.click();


        WebElement continue4 = driver.findElement(By.cssSelector("[id='button-payment-method']"));
        continue4.click();


        WebElement confirmOrder = driver.findElement(By.cssSelector("[id='button-confirm']"));
        confirmOrder.click();


        wait.until(ExpectedConditions.urlContains("success"));

        WebElement confirmationMessage = driver.findElement(By.cssSelector("[id='content'] h1"));



        Assert.assertEquals(confirmationMessage.getText(),"Your order has been placed!");

























    }




}
