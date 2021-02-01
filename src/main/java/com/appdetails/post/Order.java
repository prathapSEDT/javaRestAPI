package com.appdetails.post;

import com.enums.FileDetails;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.frameworkutils.FrameWorkUtilities;
import com.pojo.response.CreateCustomerResponse;
import com.pojo.response.orders.CreateOrderResponse;
import com.pojos.CreateCustomer;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;

public class Order extends FrameWorkUtilities {
    public String createOrder(String custid) throws IOException {
        RestAssured.baseURI=getConfigDetails("BASE_URL");
        ObjectMapper mapper=new ObjectMapper();
        String resources=getConfigDetails("CREATE_ORDER").replace("{custid}",custid);
        Response response=RestAssured.given().contentType(ContentType.JSON)
                .when()
                .post(resources)
                .then()
                .extract()
                .response();

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        System.out.println(response.asString());

        Assert.assertEquals(response.getStatusCode(),201);

        CreateOrderResponse createOrderResponse=mapper.readValue(response.asString(), CreateOrderResponse.class);

        String orderID=createOrderResponse.getItemsUrl().replaceAll("[^0-9]","");


        System.out.println(orderID);

        return orderID;
    }
}
