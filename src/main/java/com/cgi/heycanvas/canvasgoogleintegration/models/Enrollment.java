package com.cgi.heycanvas.canvasgoogleintegration.models;

public class Enrollment {
    private String type;
    private String role;
    private int role_id;
    private int user_id;
    private String enrollment_state;
    private boolean limit_privileges_to_course_section;

    public Enrollment() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getEnrollment_state() {
        return enrollment_state;
    }

    public void setEnrollment_state(String enrollment_state) {
        this.enrollment_state = enrollment_state;
    }

    public boolean isLimit_privileges_to_course_section() {
        return limit_privileges_to_course_section;
    }

    public void setLimit_privileges_to_course_section(boolean limit_privileges_to_course_section) {
        this.limit_privileges_to_course_section = limit_privileges_to_course_section;
    }
}
