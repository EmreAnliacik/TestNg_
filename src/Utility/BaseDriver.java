package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseDriver {

    // public static final Logger logger4j = LogManager.getLogger();

    public static WebDriver driver; //Singleton driver method
    public static WebDriverWait wait;


    @BeforeClass
    public void beforeClass() {
        // System.out.println("BeforeClass Calisti");
        //extend yapilan kodun basinda calisir
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //ekrani max yapar

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //30 sn sayfayi yukleme muhleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        loginTest();

    }

    public void loginTest() {


        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        MyFuction.Wait(2);


        WebElement email = driver.findElement(By.cssSelector("[name='email']"));
        email.sendKeys("campus1@gamil.com");

        WebElement password = driver.findElement(By.cssSelector("[name='password']"));
        password.sendKeys("12345");

        WebElement login = driver.findElement(By.cssSelector("[value='Login']"));
        login.click();

        WebElement checkLogin = driver.findElement(By.xpath("//h2[text()='My Account']"));
        Assert.assertTrue((checkLogin.getText()).contains("My Account"), "Failed");
        System.out.println(checkLogin.getText());
    }


    @AfterClass
    public void afterClass() {
        //  System.out.println("afterClass Calisti");
        MyFuction.Wait(5);
        driver.quit();

    }


}
