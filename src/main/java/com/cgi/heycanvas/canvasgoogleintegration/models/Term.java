package com.cgi.heycanvas.canvasgoogleintegration.models;

import java.util.Date;

public class Term {
    private int id;
    private String name;
    private Date start_at;
    private Date end_at;
    private Date created_at;
    private String workflow_state;
    private String grading_period_group_id;

    public Term() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_at() {
        return start_at;
    }

    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public Date getEnd_at() {
        return end_at;
    }

    public void setEnd_at(Date end_at) {
        this.end_at = end_at;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getWorkflow_state() {
        return workflow_state;
    }

    public void setWorkflow_state(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public String getGrading_period_group_id() {
        return grading_period_group_id;
    }

    public void setGrading_period_group_id(String grading_period_group_id) {
        this.grading_period_group_id = grading_period_group_id;
    }

    @Override
    public String toString() {
        return "Term{" +
                "name='" + name + '\'' +
                '}';
    }
}
