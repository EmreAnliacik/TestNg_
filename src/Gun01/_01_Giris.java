package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

    //default olarak alfabetik siraya gore calisir.


    @Test(priority = 1)
    public void driverIslemleriniYap() {
        System.out.println("Driver Islemleri yapildi");

    }

    @Test(priority = 2)
    public void WebSitesiniAc() {
        System.out.println("Web sitesi acildi");

    }

    @Test(priority = 3)
    public void loginTestiYap() {
        System.out.println("Login Testi yapildi");

    }

    @Test(priority = 4)
    public void driverKapat() {
        System.out.println("Driver Kapatildi");

    }


}
