package com.cgi.heycanvas.canvasgoogleintegration.services;
import com.cgi.heycanvas.canvasgoogleintegration.models.Assignment;
import com.cgi.heycanvas.canvasgoogleintegration.models.Course;
import com.google.actions.api.DialogflowApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignmentService extends DialogflowApp {
    private Logger logger = LoggerFactory.getLogger(AssignmentService.class);

    @Autowired
    private CourseService courseService;

    public List<Assignment> getAssignments() {
        List<Course> courseList = courseService.getCourses();
        List<Assignment> assignmentList = new ArrayList<>();
        for (Course course : courseList) {
            RestTemplate restTemplate = new RestTemplate();
            Assignment[] assignments = restTemplate.getForObject("https://ufl.instructure.com/api/v1/courses/" + course.getId() + "/assignments/?access_token=1016~YlEwEpaHo2wBsCkdXu82N9B8d6hU4Ttn4Bmdwv5DrjnlCMz5G2ZZi302J33FCGpJ", Assignment[].class);
            for (int i = 0; i < assignments.length; i++) {
                assignmentList.add(assignments[i]);
            }
        }
        return assignmentList;
    }
}