package com.example.optimizelifeapp;

import java.util.Date;

public  class event {

    private String title, description, eventType, deadline;


    public event(String title, String description, String eventType, String deadline)
    {
        this.title = title;
        this.description = description;
        this.eventType = eventType;
        this.deadline = deadline;
    }
    public event(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
