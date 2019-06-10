/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.configpackage.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author Bryan Valdez Jara <iBryan.valdez@gmail.com>
 */
@Mapper
public interface CourseMapper {

    @Select("select * from course")
    ArrayList<HashMap<String, Object>> getList();

}
