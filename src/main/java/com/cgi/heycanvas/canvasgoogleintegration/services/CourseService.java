package com.cgi.heycanvas.canvasgoogleintegration.services;

import com.cgi.heycanvas.canvasgoogleintegration.models.Course;
import com.cgi.heycanvas.canvasgoogleintegration.models.Term;
import com.cgi.heycanvas.canvasgoogleintegration.util.IntentUtil;
import com.cgi.heycanvas.canvasgoogleintegration.util.ResponseMessages;
import com.google.actions.api.ActionRequest;
import com.google.actions.api.ActionResponse;
import com.google.actions.api.DialogflowApp;
import com.google.actions.api.ForIntent;
import com.google.actions.api.response.ResponseBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@Service
public class CourseService extends DialogflowApp {
    private Logger logger = LoggerFactory.getLogger(CourseService.class);

    public List<Course> getCourses(){
        RestTemplate restTemplate = new RestTemplate();
        Course[] courses = restTemplate.getForObject("https://ufl.instructure.com/api/v1/courses/?include=term&access_token=1016~YlEwEpaHo2wBsCkdXu82N9B8d6hU4Ttn4Bmdwv5DrjnlCMz5G2ZZi302J33FCGpJ", Course[].class);
        List<Course> courseList = new ArrayList<>();
        for(int i=0;i<courses.length;i++){
            Course currCourse = courses[i];
            Term currTerm = currCourse.getTerm();
            if(currTerm!=null)
            if(currTerm.getName().equals("Spring 2020")){
                courseList.add(currCourse);
            }
        }
        return courseList;
    }

    @ForIntent(IntentUtil.LIST_COURSES)
    public ActionResponse getCoursesIntent(ActionRequest request){
        logger.info("Executing intent: " + IntentUtil.LIST_COURSES);
        List<Course> courses = this.getCourses();
        StringBuilder response = new StringBuilder(ResponseMessages.getRandomCourseMessage());
        //Using StringJoiner to join courses and separating them by commas
        StringJoiner sj = new StringJoiner(", ");
        courses.forEach(course -> sj.add(course.getCourse_code()));
        response.append(sj);
        response.append(". ");

        response.append(ResponseMessages.getRandomFollowUpMessage());

        //Building ActionResponse object and response to it
        ResponseBuilder responseBuilder = getResponseBuilder(request).add(response.toString());
        ActionResponse actionResponse = responseBuilder.build();
        logger.info(actionResponse.toJson());
        return actionResponse;

    }

}
