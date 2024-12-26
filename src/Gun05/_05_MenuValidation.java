package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _05_MenuValidation extends BaseDriver {

    @Test
    public void menuValidation() {

        List<WebElement> webMenu = driver.findElements(By.cssSelector("[class='nav navbar-nav'] > li > a"));

        List<String> expectedList = new ArrayList<>();
        expectedList.add("Desktops");
        expectedList.add("Laptops & Notebooks");
        expectedList.add("Components");
        expectedList.add("Tablets");
        expectedList.add("Software");
        expectedList.add("Phones & PDAs");
        expectedList.add("Cameras");
        expectedList.add("MP3 Players");


        Assert.assertEquals(webMenu.size(), expectedList.size());

        for (int i = 0; i < webMenu.size(); i++) {
            System.out.println(webMenu.get(i).getText());
            Assert.assertTrue(webMenu.get(i).getText().equals(expectedList.get(i)));

        }


    }
}