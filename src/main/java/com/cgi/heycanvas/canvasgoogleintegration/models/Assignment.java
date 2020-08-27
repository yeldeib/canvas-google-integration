package com.cgi.heycanvas.canvasgoogleintegration.models;

import java.util.Date;
import java.util.List;

public class Assignment {
    private int id;
    private Date due_at;
    private Date unlock_at;
    private Date lock_at;
    private double points_possible;
    private int allowed_attempts;
    private int course_id;
    private String name;
    private boolean has_submitted_submissions;
    private boolean due_date_required;

    public Assignment() {
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Date getDue_at() { return due_at; }

    public void setDue_at(Date due_at) { this.due_at = due_at; }

    public Date getUnlock_at() { return unlock_at; }

    public void setUnlock_at(Date unlock_at) { this.unlock_at = unlock_at; }

    public Date getLock_at() { return lock_at; }

    public void setLock_at(Date lock_at) { this.lock_at = lock_at; }

    public double getPoints_possible() { return  points_possible; }

    public void setPoints_possible(double points_possible) { this.points_possible = points_possible; }

    public int getAllowed_attempts() { return allowed_attempts; }

    public void setAllowed_attempts(int allowed_attempts) { this.allowed_attempts = allowed_attempts; }

    public int getCourse_id() { return course_id; }

    public void setCourse_id(int course_id) { this.course_id = course_id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public boolean getHas_submitted_submissions() { return has_submitted_submissions; }

    public void setHas_submitted_submissions(boolean has_submitted_submissions) { this.has_submitted_submissions = has_submitted_submissions; }

    public boolean getDue_date_required() { return  due_date_required; }

    public void setDue_date_required(boolean due_date_required) { this.due_date_required = due_date_required; }
}
