package com.cgi.heycanvas.canvasgoogleintegration.models;

import java.util.Date;
import java.util.List;

public class Course {
    private int id;
    private String name;
    private int account_id;
    private String uuid;
    private Date start_at;
    private int grading_standard_id;
    private boolean is_public;
    private Date created_at;
    private String course_code;
    private String default_view;
    private int root_account_id;
    private int enrollment_term_id;
    private String license;
    private String grade_passback_setting;
    private Date end_at;
    private boolean public_syllabus;
    private boolean public_syllabus_to_auth;
    private int storage_quota_mb;
    private boolean is_public_to_auth_users;
    private Term term;
    private boolean apply_assignment_group_weights;
    private Calendar calendar;
    private String time_zone;
    private boolean blueprint;
    private List<Enrollment> enrollments;
    private boolean hide_final_grades;
    private String workflow_state;
    private boolean restrict_enrollments_to_course_dates;

    public Course() {
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

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getStart_at() {
        return start_at;
    }

    public void setStart_at(Date start_at) {
        this.start_at = start_at;
    }

    public int getGrading_standard_id() {
        return grading_standard_id;
    }

    public void setGrading_standard_id(int grading_standard_id) {
        this.grading_standard_id = grading_standard_id;
    }

    public boolean isIs_public() {
        return is_public;
    }

    public void setIs_public(boolean is_public) {
        this.is_public = is_public;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getDefault_view() {
        return default_view;
    }

    public void setDefault_view(String default_view) {
        this.default_view = default_view;
    }

    public int getRoot_account_id() {
        return root_account_id;
    }

    public void setRoot_account_id(int root_account_id) {
        this.root_account_id = root_account_id;
    }

    public int getEnrollment_term_id() {
        return enrollment_term_id;
    }

    public void setEnrollment_term_id(int enrollment_term_id) {
        this.enrollment_term_id = enrollment_term_id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getGrade_passback_setting() {
        return grade_passback_setting;
    }

    public void setGrade_passback_setting(String grade_passback_setting) {
        this.grade_passback_setting = grade_passback_setting;
    }

    public Date getEnd_at() {
        return end_at;
    }

    public void setEnd_at(Date end_at) {
        this.end_at = end_at;
    }

    public boolean isPublic_syllabus() {
        return public_syllabus;
    }

    public void setPublic_syllabus(boolean public_syllabus) {
        this.public_syllabus = public_syllabus;
    }

    public boolean isPublic_syllabus_to_auth() {
        return public_syllabus_to_auth;
    }

    public void setPublic_syllabus_to_auth(boolean public_syllabus_to_auth) {
        this.public_syllabus_to_auth = public_syllabus_to_auth;
    }

    public int getStorage_quota_mb() {
        return storage_quota_mb;
    }

    public void setStorage_quota_mb(int storage_quota_mb) {
        this.storage_quota_mb = storage_quota_mb;
    }

    public boolean isIs_public_to_auth_users() {
        return is_public_to_auth_users;
    }

    public void setIs_public_to_auth_users(boolean is_public_to_auth_users) {
        this.is_public_to_auth_users = is_public_to_auth_users;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public boolean isApply_assignment_group_weights() {
        return apply_assignment_group_weights;
    }

    public void setApply_assignment_group_weights(boolean apply_assignment_group_weights) {
        this.apply_assignment_group_weights = apply_assignment_group_weights;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public boolean isBlueprint() {
        return blueprint;
    }

    public void setBlueprint(boolean blueprint) {
        this.blueprint = blueprint;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public boolean isHide_final_grades() {
        return hide_final_grades;
    }

    public void setHide_final_grades(boolean hide_final_grades) {
        this.hide_final_grades = hide_final_grades;
    }

    public String getWorkflow_state() {
        return workflow_state;
    }

    public void setWorkflow_state(String workflow_state) {
        this.workflow_state = workflow_state;
    }

    public boolean isRestrict_enrollments_to_course_dates() {
        return restrict_enrollments_to_course_dates;
    }

    public void setRestrict_enrollments_to_course_dates(boolean restrict_enrollments_to_course_dates) {
        this.restrict_enrollments_to_course_dates = restrict_enrollments_to_course_dates;
    }
}
