/**
 * 
 */
package com.tutorial.springboot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tutorial.springboot.controller.HelloWorldController;

/**
 * @author n0160500
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTest {

	@Autowired
    private HelloWorldController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

}
