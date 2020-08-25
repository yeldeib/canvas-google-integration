package com.cgi.heycanvas.canvasgoogleintegration.controllers;

import com.cgi.heycanvas.canvasgoogleintegration.models.Course;
import com.cgi.heycanvas.canvasgoogleintegration.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService service;

    @RequestMapping("/courses")
    public List<Course> getCourses(){

        return service.getCourses();
    }
}
