package com.example.CalendarServer.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;

    @NotBlank(message="please add event name")
    private String eventName;

    @NotNull(message="please add event date")
    private Date eventDate;

    @NotBlank(message="please add event note")
    private String eventNote;

    @NotNull(message="please add event time")
    private String eventTime;

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventNote() {
        return eventNote;
    }

    public void setEventNote(String eventNote) {
        this.eventNote = eventNote;
    }
    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Event(Long eventId, String eventName, Date eventDate, String eventNote,String eventTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.eventNote = eventNote;
        this.eventDate=eventDate;
    }

    public Event() {

    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", eventNote='" + eventNote + '\'' +
                ", eventDate='" + eventDate + '\'' +

                '}';
    }



}
