/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @author Bryan Valdez Jara <iBryan.valdez@gmail.com>
 */
@EnableConfigServer
@SpringBootApplication
public class AppInit {
    
    public static void main(String[] args) {    
        SpringApplication app = new SpringApplication(AppInit.class);
        app.run(args);
    }
    
}
