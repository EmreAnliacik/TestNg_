package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftvsHardAssert {


    @Test
    public void HardAssert(){
        String s1 ="Merhaba";


        System.out.println("Asser Oncesi");
        Assert.assertEquals("Merhaba123",s1,"Olusanla Beklenen Ayni Degil");
        System.out.println("Asser Sonrasi");

    }


    @Test
    public void softAssert(){


        SoftAssert _softAssert = new SoftAssert();


        String strHomePage = "merhaba1";
        String strHomePage2 = "merhaba2";
        String strHomePage3 = "merhaba3";

        _softAssert.assertEquals("merhaba1",strHomePage); //pass
        System.out.println("assert1");


        _softAssert.assertEquals("dksakdaskm",strHomePage2); //fail
        System.out.println("assert2");


        _softAssert.assertEquals("merhaba3",strHomePage3); //pass
        System.out.println("Assert3");

        _softAssert.assertAll(); // Butun assert sonuclarini isleme koyuor
        System.out.println("Softassert aktiflik sonrasi");
        //bu bolum assertAll dan sonra oldugu ve oncesinde hata olustugu icin ekrana vermeyecek




    }





}
