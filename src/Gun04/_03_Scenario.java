package Gun04;

/*
   bu örneği istediğin aşamada sorabilirsin, ister burda ister paralel testten sonra
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun lerde (bütün ürünlerde indirim var mı, eski fiyat yeni fiyat var mı)
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
   5- Yukarıdaki işlemi 2 farklı browserda ve paralel şekilde test ediniz.
*/


import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _03_Scenario extends BaseDriverParameter {

    @Test
    public void Test(){


        WebElement specialsLink = driver.findElement(By.cssSelector("[href='http://opencart.abstracta.us:80/index.php?route=product/special']"));
        specialsLink.click();

        List<WebElement> products = driver.findElements(By.cssSelector("[class='caption'] "));


        for (WebElement product:products){
            WebElement newPrice = product.findElement(By.cssSelector("span[class='price-new']"));
            WebElement oldPrice = product.findElement(By.cssSelector("span[class='price-old']"));

            double newPrice1 = Double.parseDouble(newPrice.getText().replaceAll("[^0-9.,]", ""));
            double oldPrice1 = Double.parseDouble(oldPrice.getText().replaceAll("[^0-9.,]", ""));

            System.out.println(oldPrice1+" "+newPrice1);
            Assert.assertTrue(newPrice1<oldPrice1);





        }




    }








}
