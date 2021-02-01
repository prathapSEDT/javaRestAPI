package testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
    public SoftAssert softAssert=new SoftAssert();


    @Test(priority = 1)
    public void TestCase(){
        String actual="A";
        String expected="B";
        System.out.println("Hello");
        softAssert.assertEquals(actual,expected,"A is not equal to B");
        //hard assertion
    }
    @Test(priority = 2)
    public void checkRouting(){
        boolean actual=true;
        boolean expected=false;
        System.out.println("test execution done");
        softAssert.assertAll();
        softAssert.assertAll("Failure observed");
    }
}
