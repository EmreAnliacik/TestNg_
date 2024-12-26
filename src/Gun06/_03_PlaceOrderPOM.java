package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrderPOM extends BaseDriver {

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
    public void proceedToCheckOut() {

        _03_PlaceOrderElements elements = new _03_PlaceOrderElements();


        elements.searchArea.sendKeys("ipod" + Keys.ENTER);

        elements.addCart.click();

        elements.shoppingCart.click();

        elements.cheackoutButton.click();

        elements.continue1.click();

        elements.continue2.click();

        elements.continue3.click();

        elements.agreeTerms.click();

        elements.continue4.click();

        elements.confirmOrder.click();

        wait.until(ExpectedConditions.urlContains("success"));

        Assert.assertEquals(elements.confirmationMessage.getText(), "Your order has been placed!");


    }


}
