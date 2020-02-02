package com.taskmaster.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmaster.controller.EventController;
import com.taskmaster.entity.Event;
import com.taskmaster.service.EventService;

public class EventControllerImpl implements EventController 
{
	
	@Autowired
	private EventService eventService;

	@Override
	public void createEvent() 
	{

	}

	@Override
	public Event getEvent(Long eventId) 
	{
		return null;
	}

	@Override
	public Event updateEvent(Long eventId) 
	{
		return null;
	}

	@Override
	public void deleteEvent(Long eventId) 
	{

	}

}
