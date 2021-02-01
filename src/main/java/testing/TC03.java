package testing;

import org.testng.annotations.Test;
import testing.annotations.TestNgAnnotation;

public class TC03 extends TestNgAnnotation {
    @Test(priority = 1,groups = "sanity")
    public void launchApplication(){
        System.out.println("Launching Applications sanity");
    }

    @Test(priority = 2,groups = "sanity")
    public void applicationLogin(){
        System.out.println("Login to the system sanity");
    }
    @Test(priority = 3,groups = "sanity")
    public void registerUser(){
        System.out.println("Resgister USer sanity");
    }
    @Test(priority = 4,groups = "sanity")
    public void validateSummary(){
        System.out.println("Validate Summary sanity");
    }
}
