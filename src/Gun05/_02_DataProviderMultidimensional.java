package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProviderMultidimensional {


    @Test(dataProvider = "userData")
    public void userTest(String username,String password) {
        //username,password
        System.out.println(username+" "+password);


    }

    @DataProvider
    Object[][] userData() {
        Object[][] data = {
                {"heyo", "1234"},
                {"ali", "mypass"},
                {"veli", "password11"}
};

        return data;
    }


}
