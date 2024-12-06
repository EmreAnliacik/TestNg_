package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {
    @Test(dataProvider = "datalarim")
    public void Test(String aranacaklar){

        System.out.println("aranacakText = "+aranacaklar);


    }

    @DataProvider
    Object[] datalarim(){
        Object[] aranacaklar = {"mac","samsung","laptop"};

        return aranacaklar;
    }


    @Test(dataProvider = "datas")
    public void test2(int number){
        System.out.println("number = "+number);
    }

    @DataProvider(name = "datas")
    Object[] getData(){
        Object[] data = {1,2,3,4,5,6,7};
        return data;
    }



}
