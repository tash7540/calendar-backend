package com.example.CalendarServer.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eventId;
    private String eventName;
    private String eventTime;
    private String eventNote;

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

    public Event(Long eventId, String eventName, String eventTime, String eventNote) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventTime = eventTime;
        this.eventNote = eventNote;
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
                '}';
    }
}
