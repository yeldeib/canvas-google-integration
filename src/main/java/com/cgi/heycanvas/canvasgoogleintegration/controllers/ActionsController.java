package com.cgi.heycanvas.canvasgoogleintegration.controllers;

import com.cgi.heycanvas.canvasgoogleintegration.services.ActionService;
import com.cgi.heycanvas.canvasgoogleintegration.services.CourseService;
import com.cgi.heycanvas.canvasgoogleintegration.util.IntentUtil;
import com.google.actions.api.App;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/actions")
public class ActionsController {

    private Logger logger = LoggerFactory.getLogger(ActionsController.class);

    @Autowired
    private ActionService actionService;

    @Autowired
    private App courseService;

    @PostMapping
    public ResponseEntity<?> postAction(@RequestBody String body, @RequestHeader Map<String,String> headers) throws IOException {
        logger.info("Google Assistant executing POST");
//        String body = request.getReader().lines().collect(Collectors.joining());
        logger.info(new JSONObject(body).toString(4));
        try {
            String intent = actionService.getIntentName(body);
            logger.info("Intent name is " + intent);
            if(intent.equals(IntentUtil.LIST_COURSES)){
                //Invoking courseService -> list_courses intent
                String courseResponse = courseService.handleRequest(body, headers).get();
                return new ResponseEntity<String>(courseResponse, HttpStatus.OK);
            }
            else{
                return new ResponseEntity<String>("Request could not be found.", HttpStatus.OK);
            }
        } catch (Exception e) {
            logger.error("Error " + e.getMessage());
            return new ResponseEntity<String>("Could not process the request", HttpStatus.OK);
        }
    }

    @GetMapping
    public ResponseEntity<?> getAction(){
        return new ResponseEntity<String>("Actions controller only accepts POST request from Google Assistant", HttpStatus.OK);
    }

    // Making a map of headers that will be sent to google intents
    private Map<String, String> getHeadersMap(HttpServletRequest request){
        Map<String, String> headersMap = new HashMap<>();

        Enumeration<?> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String key = (String)headerNames.nextElement();
            String value = request.getHeader(key);
            headersMap.put(key,value);
        }
        return headersMap;
    }
}
