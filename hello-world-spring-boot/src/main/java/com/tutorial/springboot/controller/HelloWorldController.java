/**
 * 
 */
package com.tutorial.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author n0160500
 *
 */
@RestController
public class HelloWorldController {
   @RequestMapping("/")
   public String sayHello() {
      return "Hello World";
   }
}


