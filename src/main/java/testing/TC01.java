package testing;

import com.appdetails.get.Categories;
import com.appdetails.post.Customer;
import com.appdetails.post.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.frameworkutils.FrameWorkUtilities;
import com.pojos.CreateCustomer;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testing.annotations.DataSets;
import testing.annotations.TestNgAnnotation;

import java.io.IOException;

public class TC01 extends TestNgAnnotation {

    @Test(priority = 1)
    public void launchApplication() throws IOException {
//        Categories categories=new Categories();
//        categories.getCategories();

        Customer customer=new Customer();
        String custID=customer.createCustomer();

        Order order=new Order();
        order.createOrder(custID);
    }

}
