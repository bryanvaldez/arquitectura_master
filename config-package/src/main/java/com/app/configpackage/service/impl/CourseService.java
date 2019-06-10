/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.configpackage.service.impl;

import com.app.configpackage.mapper.CourseMapper;
import com.app.configpackage.service.iface.ICourseService;
import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bryan Valdez Jara <iBryan.valdez@gmail.com>
 */
@Service
public class CourseService implements ICourseService{
    
    @Autowired
    CourseMapper courseMapper;      

    @Override
    public ArrayList<HashMap<String, Object>> getList() {
        return courseMapper.getList();
    }
    
}
