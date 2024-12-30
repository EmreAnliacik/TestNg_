package Gun07;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _03_WishListElements {
    public _03_WishListElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }




    @FindBy(css ="[class='caption'] a")
    public List<WebElement> productTitle;


    @FindBy(css ="[data-original-title='Add to Wish List']" )
    public List<WebElement> productWishButton;


    @FindBy(xpath ="//*[text()='wish list']" )
    public WebElement wishList;

    @FindBy(xpath ="//td[@class='text-left']/a" )
    public List<WebElement> wishListProducts;

}
