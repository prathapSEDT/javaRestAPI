package testing;

import org.testng.annotations.Test;
import testing.annotations.TestNgAnnotation;

public class TC02 extends TestNgAnnotation {
    @Test(priority = 1,groups = "reg")
    public void launchApplication(){
        System.out.println("Launching Applications Reg");
    }

    @Test(priority = 2,groups = "reg")
    public void applicationLogin(){
        System.out.println("Login to the system Reg");
    }
    @Test(priority = 3,groups = "reg")
    public void registerUser(){
        System.out.println("Resgister USer Reg");
    }
    @Test(priority = 4,groups = "reg")
    public void validateSummary(){
        System.out.println("Validate Summary Reg");
    }
}
