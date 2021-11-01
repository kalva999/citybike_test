package com.steps;

import com.hooks.Screenshot;
import com.hooks.TestContext;
import enums.Country;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.java.Log;
import model.Location;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

@Log
public class LocationSteps {

    private Location location;
    @Autowired
    TestContext context;
    @Autowired
    Screenshot screenshot;
    @Given("the {word}")
    public void cityName(String cityName) {
    }

    @When("user get {word}")
    public void userGet(String endPoint) {
        context.setLastResponse(context.getRestClient().get(endPoint));
    }

    @Then("user should see http status code as {int} Ok")
    public void userShouldSeeHttpStatusCodeAsOk(int arg0) {
        assertThat(context.getLastResponse().getStatusCode()).isEqualTo(HttpStatus.SC_OK);
    }

    @Then("user should see {word} in {word}")
    public void userShouldSeeCityInCountry(String city, String country) {
        location = context.getLastResponse()
                .jsonPath()
                .getList("networks.location.findAll{it.city=='" + city + "'}", Location.class)
                .stream().findFirst()
                .orElseThrow(() -> new RuntimeException(String
                        .format("%s does not contains this city %s", country, city)));
        assertThat(location.getCountry()).isEqualTo(Country.valueOf(country).getCode());
        screenshot.write("Country :"+location.getCountry());
        screenshot.write("City :"+city);
    }

    @And("location details contains latitude and longitude")
    public void cityDetailsContainsLatitudeAndLongitude() {
        log.info(String.format("Latitude %s and Longitude %s details for %s city", location.getLatitude(),
                location.getLongitude(), location.getCity()));
        assertThat(location.getLatitude()).isBetween(-90d, 90d);
        assertThat(location.getLongitude()).isBetween(-180d, 180d);
        screenshot.write("latitude "+location.getLatitude());
        screenshot.write("longitude "+location.getLongitude());


    }

}
