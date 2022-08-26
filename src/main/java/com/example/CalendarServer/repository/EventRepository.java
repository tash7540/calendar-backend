package com.example.CalendarServer.repository;

import com.example.CalendarServer.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}

