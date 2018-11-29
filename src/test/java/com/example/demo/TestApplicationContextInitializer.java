package com.example.demo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.web.context.support.GenericWebApplicationContext;

import java.util.Properties;

/**
 * Created by carloswuu on 2018/8/15.
 */
public class TestApplicationContextInitializer implements ApplicationContextInitializer<GenericWebApplicationContext>{
    @Override
    public void initialize(GenericWebApplicationContext genericWebApplicationContext) {
//        Properties prop =
        MutablePropertySources propertySources = genericWebApplicationContext.getEnvironment().getPropertySources();

    }
}
