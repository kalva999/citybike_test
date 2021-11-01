# 1. City Bike API Test Automation Framework

City Bike API Test Automation framework provides structured and standard way of creating automated api test scripts. This is a reusable automation framework that blends with Java, TestNG, Rest Assured and Cucumber JVM (incorporating Gherkin and the BDD 'Given, When Then' format)

The framework incorporates design principle of Behavior-Driven Development (BDD) which is software development process that Cucumber was built to support. Which promotes writing acceptance tests by describing behavior of application under test in simple English language from the perspective of its stakeholders

## 2. Software Requirements ##

### JAVA 11  - Programming language ###

you should have install jdk 11 and set the path in system envronment variables

### Maven    - Build tool ###

install the maven and set the path in system envronment variables

## 3. Clone a repository ##

https://github.com/kalva999/citybike_test.git



## 4. Dependencies(libraries) ##

**JAVA 11**               - Programming language

**Cucumber-JVM**          - BDD Framework

**Cucumber Spring**       - Cucumber with Spring, it will be handy to use Spring-configured components in BDD testing.  

 
**TestNG**                - TestNG Java testing framework

**Lombok**                - Java library api, Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate                             your logging variables, and much more

**AssertJ**               - Java library that provides a rich set of assertions 

**Rest Assured**          - Rest Assured is a Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs

**Spring Framework**      - The Spring Framework provides a comprehensive programming and configuration model for modern Java-based enterprise applications


**Cucumber report plugin**- it has built in json and html report plugin

All the above dependencies are defined in pom.xml file


## 5. HTML Reports ##
HTML reports can be found in the command line logs at the end of line, like below and you need copy the url and paste in browser to view the report

View your Cucumber Report at:  
????????????????????????????????????????????????????????????????????????????
? View your Cucumber Report at:                                            ?
? https://reports.cucumber.io/reports/ebb57087-5658-4872-9b5e-72cfbf89aca1 ?
?                                                                          ?
? This report will self-destruct in 24h.                                   ?
? Keep reports forever: https://reports.cucumber.io/profile                ?                                          ?
????????????????????????????????????????????????????????????????????????????

## 8.Feature files ##

Feature files are the stored in test/resoruces/features directory which can used to define and read the tests

## 9. Clean or Build

### 9.1 Command Line ###

cd to root ot automationFramework project directory

mvn clean

mvn build

## 10. Run Tests ##

### 10.1 Command Line ###

cd to root ot automationFramework project directory

mvn clean test 




