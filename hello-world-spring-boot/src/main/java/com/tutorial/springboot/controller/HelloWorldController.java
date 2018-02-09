/**
 * 
 */
package com.tutorial.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author n0160500
 *
 */
@RestController
public class HelloWorldController {
   @RequestMapping(method={RequestMethod.GET},value={"/hello"})
   public String sayHello() {
      return "Hello World";
   }
   
   @RequestMapping(method={RequestMethod.POST},value={"/hello"})
   public String postHello() {
      return "Hello World";
   }
}


