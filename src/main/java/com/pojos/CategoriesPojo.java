package com.pojos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "category_url"
})
public class CategoriesPojo {
    @JsonProperty("name")
    private String name;
    @JsonProperty("category_url")
    private String categoryUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @Override
    public String toString() {
        return "CategoriesPojo{" +
                "name='" + name + '\'' +
                ", categoryUrl='" + categoryUrl + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("category_url")
    public String getCategoryUrl() {
        return categoryUrl;
    }

    @JsonProperty("category_url")
    public void setCategoryUrl(String categoryUrl) {
        this.categoryUrl = categoryUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
