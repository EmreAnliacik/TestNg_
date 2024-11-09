package Gun03;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class _04_Groups {

    @Test(groups = {"Smoke Test"})
    public void Test1(){
        System.out.println("Test1");
    }

    @Test(groups = {"Smoke Test"})
    public void Test3(){
        System.out.println("Test3");
    }

    @Test(groups = {"Smoke Test"})
    public void Test5(){
        System.out.println("Test5");
    }

    @Test(groups = {"Regression"})
    public void Test2(){
        System.out.println("Test2");
    }

    @Test(groups = {"Regression"})
    public void Test4(){
        System.out.println("Test4");
    }

    @Test(groups = {"Regression"})
    public void Test6(){
        System.out.println("Test6");
    }

    @Test
    public void Test7(){
        System.out.println("Test7");
    }

    @BeforeGroups(groups = {"Smoke Test"})
    public void bGroup() {
        System.out.println("Before Grouo");
    }

    @AfterGroups(groups = {"Smoke Test"})
    public void aGroup() {
        System.out.println("After Group");
    }



}
