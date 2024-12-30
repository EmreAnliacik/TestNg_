package Gun07;

import Gun06._03_PlaceOrderElements;
import Utility.BaseDriver;
import Utility.MyFuction;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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


public class _02_WishListPOM extends BaseDriver {



    @Parameters("products")
    @Test
    public void Test(String product) {

        _03_PlaceOrderElements poe = new _03_PlaceOrderElements();
        _03_WishListElements wle = new _03_WishListElements();

        poe.searchArea.sendKeys(product + Keys.ENTER);




        int randomNumber = MyFuction.randomGenerator(wle.productWishButton.size());

        String wishItemText = wle.productTitle.get(randomNumber).getText();
        System.out.println("Choosen Product : "+wle.productTitle.get(randomNumber).getText());


        wle.productWishButton.get(randomNumber).click();


        wait.until(ExpectedConditions.elementToBeClickable(wle.wishList));
        wle.wishList.click();



        boolean found = MyFuction.listContainsString(wle.wishListProducts,wishItemText);

        Assert.assertTrue(found, "The product assigned to the Wish List could not be found.");







    }




}
