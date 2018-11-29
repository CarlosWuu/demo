package com.example.demo.context;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by carloswuu on 2018/8/9.
 */
@Component
@ConfigurationProperties(prefix = "cls")
public class PropertiesBean {
    private String address;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
