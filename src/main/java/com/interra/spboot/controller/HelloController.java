/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.interra.spboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pankaj.bhatt
 */
@RestController
@ComponentScan
@EnableAutoConfiguration
public class HelloController {
    
    
@RequestMapping(value ="/hello",produces = { MediaType.APPLICATION_JSON_VALUE })
    public String sayHello(){
        return "Hello World";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}
