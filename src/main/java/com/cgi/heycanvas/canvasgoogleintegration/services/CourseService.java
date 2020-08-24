package com.cgi.heycanvas.canvasgoogleintegration.services;

import com.cgi.heycanvas.canvasgoogleintegration.models.Course;
import com.cgi.heycanvas.canvasgoogleintegration.models.Term;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseService {

    public List<Course> getCourses(){
        RestTemplate restTemplate = new RestTemplate();
        Course[] courses = restTemplate.getForObject("https://ufl.instructure.com/api/v1/courses/?include=term&access_token=1016~YlEwEpaHo2wBsCkdXu82N9B8d6hU4Ttn4Bmdwv5DrjnlCMz5G2ZZi302J33FCGpJ", Course[].class);
        List<Course> courseList = new ArrayList<>();
        for(int i=0;i<courses.length;i++){
            Course currCourse = courses[i];
            Term currTerm = currCourse.getTerm();
            if(currTerm.getName().equals("Spring 2020")){
                courseList.add(currCourse);
            }
        }
        return courseList;
    }

}
