package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {


    @Test //Annotation:metodun turunu ve calisma ozelliklerini belirler

    public void Test1() { //Test1 : test metodunun adi

        System.out.println("Test1 calisti");

    }

    @Test
    public void Test2() {
        System.out.println("Test2 calisti");
    }

    @BeforeClass //class in icindekilerden once calisir
    public void beforeclass() {System.out.println("Beforeclass calisti");}

    @AfterClass //classin icindekilerden sonra calisir
    public void afterClass() {System.out.println("Afterclass calisti");}


    @BeforeMethod //methoddan once calisir
    public void beforeMethod() {System.out.println("BeforeMethod calisti");}

    @AfterMethod //metoddan sonra calisir
    public void afterMethod() {System.out.println("AfterMethod calisti");}

/*
        @BeforeClass      -->   Class ın başında çalışacak   (driver işlemleri)

           @BeforeMethod  -->   Her metoddan(test metodları) önce çalışacak
               @Test      -->   testlerin çalıştığı metodlar
           @AfterMethod   -->   Her metoddan sonra çalışacak

           @BeforeMethod  -->   Her metoddan(test metodları) önce çalışacak
               @Test      -->   testlerin çalıştığı metodlar
           @AfterMethod   -->   Her metoddan sonra çalışacak

        @AfterClass       -->   Class ın çalışmasının sonunda çalışacak (driver kapat)

beforeClass

beforeMethod
test1
afterMethod

beforeMethod
test2
afterMethod

afterClass
     */






}
