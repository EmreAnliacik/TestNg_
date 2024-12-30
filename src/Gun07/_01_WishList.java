package Gun07;

import Utility.BaseDriver;
import Utility.MyFuction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Scenario ;
 * 1- Go to the site...
 * 2- Search "ipod" product, send "ipod" from xml
 * 3- Click on the Add Wish button of a random element among the resulting elements.
 * 4- Then click on WishList
 * 5- Verify whether the name of the product that appears here is the same as the product that was clicked.
 * <p>
 * ========================================================================================================
 * <p>
 * Senaryo ;
 * 1- Siteye gidiniz.
 * 2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
 * 3- Çıkan elemanlardan random bir elemanın Add Wish butonuna tıklayınız.
 * 4- Daha sonra WishList e tıklatınız
 * 5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */


public class _01_WishList extends BaseDriver {

    @Parameters("product")
    @Test
    public void Test(String product) {
        WebElement searchArea = driver.findElement(By.name("search"));
        searchArea.sendKeys(product + Keys.ENTER);


        List<WebElement> productTitle = driver.findElements(By.cssSelector("[class='caption'] a"));
        List<WebElement> productWishButton = driver.findElements(By.cssSelector("[data-original-title='Add to Wish List']"));

        int randomNumber = MyFuction.randomGenerator(productWishButton.size());

        String wishItemText = productTitle.get(randomNumber).getText();
        System.out.println("Choosen Product : "+productTitle.get(randomNumber).getText());


        productWishButton.get(randomNumber).click();


        WebElement wishList = driver.findElement(By.xpath("//*[text()='wish list']"));
        wait.until(ExpectedConditions.elementToBeClickable(wishList));
        wishList.click();


        List<WebElement> wishListProducts = driver.findElements(By.xpath("//td[@class='text-left']/a"));

        boolean found = MyFuction.listContainsString(wishListProducts,wishItemText);

        Assert.assertTrue(found, "The product assigned to the Wish List could not be found.");







    }




}
