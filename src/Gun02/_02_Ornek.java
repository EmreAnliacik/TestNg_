package Gun02;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class _02_Ornek extends BaseDriver {

    @Test
    public void test1(){System.out.println("Test1 calisti");}

    @Test(enabled = false)
    public void test2(){System.out.println("Test2 calisti");}

    @Test
    public void test3(){System.out.println("Test3 calisti");}

}
