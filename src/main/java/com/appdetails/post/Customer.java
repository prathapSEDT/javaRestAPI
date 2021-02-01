package com.appdetails.post;

import com.enums.FileDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.frameworkutils.FrameWorkUtilities;
import com.pojo.response.CreateCustomerResponse;
import com.pojos.CategoriesPojo;
import com.pojos.CreateCustomer;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Customer extends FrameWorkUtilities {
    public String createCustomer() throws IOException {
        RestAssured.baseURI=getConfigDetails("BASE_URL");
        ObjectMapper mapper=new ObjectMapper();
        File payload=new File(FileDetails.CREATE_CUSTOMER.getValue());
        CreateCustomer createCustomer=mapper.readValue(payload,CreateCustomer.class);
        Response response=RestAssured.given().contentType(ContentType.JSON).body(createCustomer)
                .when()
                .post(getConfigDetails("CREATE_CUSTOMER"))
                .then()
                .extract()
                .response();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(response.asString());

        Assert.assertEquals(response.getStatusCode(),201);

        CreateCustomerResponse createCustomerResponse=mapper.readValue(response.asString(), CreateCustomerResponse.class);

        String custID=createCustomerResponse.getCustomerUrl().replaceAll("[^0-9]","");

        System.out.println(custID);

        return custID;
    }
}
