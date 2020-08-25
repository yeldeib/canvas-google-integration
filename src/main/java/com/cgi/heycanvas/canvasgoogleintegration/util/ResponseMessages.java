package com.cgi.heycanvas.canvasgoogleintegration.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ResponseMessages {
    //List of messages for incoming list_courses requests
    public static final List<String> courseMessages = new ArrayList<>();

    //List of messages sent as response for list_courses
    public static final List<String> followUpMessages = new ArrayList<>();

    static{
        courseMessages.add("This semester you're taking: ");

        followUpMessages.add("Would you like to if you have any assignments due for any of your classes?");
    }

    public static String getRandomCourseMessage(){
        Integer index = new Random().nextInt(courseMessages.size());
        return courseMessages.get(index);
    }

    public static String getRandomFollowUpMessage(){
        Integer index = new Random().nextInt(followUpMessages.size());
        return followUpMessages.get(index);
    }

}
