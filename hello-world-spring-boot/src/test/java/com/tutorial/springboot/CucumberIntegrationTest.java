package com.tutorial.springboot;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@SpringBootTest
@CucumberOptions(features = "src/test/resources")
public class CucumberIntegrationTest {
}

