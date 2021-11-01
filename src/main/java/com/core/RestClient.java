package com;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Data;

import java.util.Map;

import static io.restassured.RestAssured.port;

@Data
public class RestClient {
 
    private final String host;
    private final Map<String, ?> headers;
    private Response response;

    public RestClient(String host, Map<String, ?> headers) {
        this.headers = headers;
        this.host = host;
    }

    public final Response get(String endPoint) {
        return response = requestSpecification().get(endPoint)
                .then()
                .log()
                .all(true).extract().response();
    }

    public final Response get(String endPoint, Map<String, Object> params) {
        return response = requestSpecification().get(endPoint, params)
                .then()
                .log()
                .all(true)
                .extract().response();
    }

    public Response post(String endPoint, String requestBody) {
        return response = requestSpecification().body(requestBody)
                .post(endPoint).then()
                .log()
                .all(true)
                .extract().response();
    }

    public Response post(String endPoint, String requestBody, Map<String, Object> params) {
        return response = requestSpecification().body(requestBody)
                .post(endPoint, params).then()
                .log()
                .all(true)
                .extract().response();
    }

    public Response put(String endPoint, String requestBody, Map<String, Object> params) {
        return response = requestSpecification().body(requestBody)
                .put(endPoint, params).then()
                .log()
                .all(true)
                .extract().response();
    }

    public Response delete(String endPoint, String requestBody, Map<String, Object> params) {
        return response = requestSpecification().body(requestBody)
                .delete(endPoint, params).then()
                .log()
                .all(true)
                .extract().response();
    }

    private RequestSpecification requestSpecification() {
        return RestAssured.given()
                .baseUri(host)
                .port(port)
                .headers(headers)
                .log().all(true)
                .relaxedHTTPSValidation();
    }
}
