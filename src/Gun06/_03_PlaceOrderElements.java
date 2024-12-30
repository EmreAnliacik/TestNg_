package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
// bunun için aşağıdaki consructor eklendi ve için PageFatory ile
// driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
// Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
// anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
// aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
// gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.
// Faydaları: kod düzeni daha rahat, aynı locatorlar için tek bir tanımlama, kullanıldığı anda bulma, ve agile için
// tam kolay çalışma yani developer başlamadan veyat bitirmesini beklemeden sen kodları yazabilir, ve kolaylıkla
// değişiklik yapabilirsin.

public class _03_PlaceOrderElements {


    public _03_PlaceOrderElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(name = "search")
    public WebElement searchArea;

    @FindBy(xpath = "(//*[text()='Add to Cart'])[1]")
    public WebElement addCart;

    @FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible']/a)[2]")
    public WebElement shoppingCart;


    @FindBy(css = "[class='pull-right'] a")
    public WebElement cheackoutButton;


    @FindBy(css = "[id='button-payment-address']")
    public WebElement continue1;

    @FindBy(css = "[id='button-shipping-address']")
    public WebElement continue2;

    @FindBy(css = "[id='button-shipping-method']")
    public WebElement continue3;

    @FindBy(name = "agree")
    public WebElement agreeTerms;

    @FindBy(css = "[id='button-payment-method']")
    public WebElement continue4;

    @FindBy(css = "[id='button-confirm']")
    public WebElement confirmOrder;

    @FindBy(id = "content")
    public WebElement confirmationMessage;


}
