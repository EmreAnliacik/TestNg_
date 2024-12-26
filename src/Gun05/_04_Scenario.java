package Gun05;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Scenario extends BaseDriverParameter {
    @Test(dataProvider = "data")
    public void Search(String product) {

        WebElement searchArea = driver.findElement(By.cssSelector("[placeholder='Search']"));
        searchArea.clear();
        searchArea.sendKeys(product + Keys.ENTER);

//        WebElement searchAreaNew = driver.findElement(By.cssSelector("[placeholder='Search']"));
//        searchAreaNew.clear();


        List<WebElement> productNames = driver.findElements(By.cssSelector("div[class='caption'] h4"));

        for (WebElement name : productNames) {
            System.out.println(name.getText());
            Assert.assertTrue(name.getText().toLowerCase().contains(product));


        }


    }

    @DataProvider
    Object[] data(){

        Object[] searchQueries = {"samsung","mac","laptop"};
        return searchQueries;

    }
}
