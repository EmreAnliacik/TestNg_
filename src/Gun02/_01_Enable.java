package Gun02;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _01_Enable {

    @Test
    public void test1(){System.out.println("Test1 calisti");}

    @Test(enabled = false)
    public void test2(){System.out.println("Test2 calisti");}

    @Test
    public void test3(){System.out.println("Test3 calisti");}





}
