package com.hooks;

import com.RestClient;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import java.util.Collections;

@CucumberContextConfiguration
@ContextConfiguration("classpath:cucumber.xml")
public class Hooks {

    @Autowired
    Environment environment;
    @Autowired
    TestContext testContext;
    @Autowired
    Screenshot screenShot;
    @Before("@api")
    public void initializeRestClient(Scenario scenario) {
        screenShot.setScenario(scenario);
        testContext.setScenario(scenario);
        testContext.setRestClient(new RestClient(environment.getHost(),Collections.singletonMap("Accept","*")));
    }

    @After("@api")
    public void teardown(Scenario scenario){

        if(scenario.isFailed()){
            System.out.println("          __  _____ _____ ____ _____   _____ _    ___ _     _____ ____  ");
            System.out.println(" _       / / |_   _| ____/ ___|_   _| |  ___/ \\  |_ _| |   | ____|  _ \\");
            System.out.println(" (_)_____| |    | | |  _| \\___ \\ | |   | |_ / _ \\  | || |   |  _| | | | |");
            System.out.println("  _|_____| |    | | | |___ ___) || |   |  _/ ___ \\ | || |___| |___| |_| |");
            System.out.println(" (_)     | |    |_| |_____|____/ |_|   |_|/_/   \\_\\___|_____|_____|____/");
            System.out.println("          \\_\\   ");
        }
    }

}
