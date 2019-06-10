/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.configpackage.controller;

import com.app.configpackage.service.impl.CourseService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bryan Valdez Jara <iBryan.valdez@gmail.com>
 */
@RestController
public class CourseController {
    
    @Autowired    
    private CourseService courseService;      
    
    @GetMapping("/course")
    String partialHandler() {
        String response = "";
        try {
            response = new ObjectMapper().writeValueAsString(courseService.getList());            
        } catch (JsonProcessingException  e) {
        }
        return response;    
    }       
    
}
