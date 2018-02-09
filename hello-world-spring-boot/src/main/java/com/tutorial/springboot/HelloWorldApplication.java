/**
 * 
 */
package com.tutorial.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author n0160500
 *
 */
@SpringBootApplication
public class HelloWorldApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);

	}
	
	@Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
