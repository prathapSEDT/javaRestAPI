package com.appdetails.get;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.pojos.CategoriesPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.IOException;

public class Categories {
    public void getCategories() throws IOException {
        RestAssured.baseURI="https://api.predic8.de:443";
        Response response=RestAssured.given()
                .when()
                .get("/shop/categories/")
                .then()
                .extract()
                .response();
        ObjectMapper mapper=new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        CategoriesPojo categoriesPojo= mapper.readValue( response.asInputStream(),CategoriesPojo.class);
String result=mapper.writeValueAsString(categoriesPojo);
        System.out.println(result);
    }
}
