package com.cgi.heycanvas.canvasgoogleintegration.controllers;

import com.cgi.heycanvas.canvasgoogleintegration.models.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public Course getCourses(){
        RestTemplate restTemplate = new RestTemplate();
        Course courses = restTemplate.getForObject("https://ufl.instructure.com/api/v1/courses/351105/?include=term&access_token=1016~YlEwEpaHo2wBsCkdXu82N9B8d6hU4Ttn4Bmdwv5DrjnlCMz5G2ZZi302J33FCGpJ", Course.class);

        return courses;
    }
}
