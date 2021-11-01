package com.hooks;

import io.cucumber.java.Scenario;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
@Data
@Configuration
public class Screenshot {

    private Scenario scenario;

    public void write(String text){
        scenario.log(text);
    }
}
