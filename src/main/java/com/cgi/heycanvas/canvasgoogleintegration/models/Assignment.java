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
    private String name;

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

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
