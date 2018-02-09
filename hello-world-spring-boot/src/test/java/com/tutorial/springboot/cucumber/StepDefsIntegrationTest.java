/**
 * 
 */
package com.tutorial.springboot.cucumber;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import cucumber.api.java.en.Given;
import org.springframework.http.HttpStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author n0160500
 *
 */
public class StepDefsIntegrationTest extends SpringIntegrationTest {

    @When("^the client adds a new message$")
    public void the_client_issues_POST_hello() throws Throwable {
        executePost();
    }

    @Given("^the client retrieves message$")
    public void the_client_issues_GET_hello() throws Throwable {
        executeGet("http://localhost:8082/hello");
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        assertThat(latestResponse.getBody(), is(version));
    }
}
