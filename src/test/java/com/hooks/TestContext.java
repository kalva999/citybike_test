package com.hooks;

import com.RestClient;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class TestContext {
    private RestClient restClient;
    private Response lastResponse;
    private Scenario scenario;
    private Object sessionObj;

}
