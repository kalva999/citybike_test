package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

    @CucumberOptions(
            features = {"classpath:features"},
            glue = {"com.hooks","com.steps"}, monochrome = true, tags = "not @ignored",
            publish = true)
    public class TestRunner extends AbstractTestNGCucumberTests {



        @BeforeSuite
        public void beforeTest(ITestContext context) {
            System.out.println("");
            System.out.println(" _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____  ");
            System.out.println("|_   _| ____/ ___|_   _| / ___|_   _|/ \\  |  _ \\_   _| ____|  _ \\");
            System.out.println("  | | |  _| \\___ \\ | |   \\___ \\ | | / _ \\ | |_) || | |  _| | | | |");
            System.out.println("  | | | |___ ___) || |    ___) || |/ ___ \\|  _ < | | | |___| |_| |");
            System.out.println("  |_| |_____|____/ |_|   |____/ |_/_/   \\_\\_| \\_\\|_| |_____|____/");
            System.out.println("");
        }
}
