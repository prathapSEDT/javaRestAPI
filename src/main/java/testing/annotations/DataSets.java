package testing.annotations;

import org.testng.annotations.DataProvider;

public class DataSets {
    @DataProvider(name = "devCredentials")
    public Object[][] getTestData(){
        Object[][] arr=new Object[2][2];
        //0
        arr[0][0]="User01";
        arr[0][1]="Pass1234";

        //1
        arr[1][0]="User02";
        arr[1][1]="Pass1234";

        return arr;
    }
}
