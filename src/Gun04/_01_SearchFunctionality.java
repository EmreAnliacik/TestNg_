package Gun04;


/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */


import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _01_SearchFunctionality extends BaseDriver {

    @Test
    @Parameters("product")
    public void Search(String product){

        WebElement searchArea = driver.findElement(By.name("search"));
        searchArea.sendKeys(product+ Keys.ENTER);

        List<WebElement> productNames = driver.findElements(By.cssSelector("div[class='caption'] h4"));

        for (WebElement name:productNames){
            System.out.println(name.getText());
            Assert.assertTrue(name.getText().toLowerCase().contains(product));

        }









    }














}
