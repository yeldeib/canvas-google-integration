package com.cgi.heycanvas.canvasgoogleintegration.controllers;

import com.cgi.heycanvas.canvasgoogleintegration.models.Assignment;
import com.cgi.heycanvas.canvasgoogleintegration.services.AssignmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AssignmentController {
    @Autowired
    private AssignmentService service;

    @RequestMapping("/assignments")
    public List<Assignment> getAssignments(){

        return service.getAssignments();
    }
}
