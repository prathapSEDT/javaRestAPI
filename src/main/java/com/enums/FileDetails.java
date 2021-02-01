package com.enums;

public enum FileDetails {

    PROPERTIES_FILE("src/main/resources/application-properties/appdetails.properties"),
CREATE_CUSTOMER("src/main/resources/payload/CreateCustomer.json");
    public final String data;
    FileDetails(String data) {
        this.data = data;
    }
    public String getValue(){
        return data;
    }
}
