package com.taskmaster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taskmaster.entity.Event;

/**
 * This is the REST controller for CRUD operations surrounding events.
 * It also uses the event service for more layered operations outside
 * the controller scope.
 * 
 * @author CPerry26
 */
@Controller
public interface EventController 
{

	/**
	 * Create a new event in the system. This will be persisted.
	 */
	@RequestMapping(value = "/events/", method = RequestMethod.POST)
	public void createEvent();
	
	/**
	 * Get the event associated with the given event ID.
	 * 
	 * @param eventId : The ID of the event to get.
	 * 
	 * @return The associated event if it exists, null otherwise.
	 */
	@RequestMapping(value = "/events/{eventId}", method = RequestMethod.GET)
	public Event getEvent(@PathVariable Long eventId);
	
	/**
	 * Update the event associated with the given event ID. This will overwrite
	 * the previously persisted version.
	 * 
	 * @param eventId : The ID of the event to update.
	 * 
	 * @return The updated event (an exception will occur if the event didn't exist).
	 */
	@RequestMapping(value = "/events/{eventId}", method = RequestMethod.PUT)
	public Event updateEvent(@PathVariable Long eventId);
	
	/**
	 * Delete the event with the given event ID.
	 * 
	 * @param eventId : The ID of the event to delete.
	 * 
	 * NOTE: This function will throw an exception if the event doesn't exist.
	 */
	@RequestMapping(value = "/events/{eventId}", method = RequestMethod.DELETE)
	public void deleteEvent(@PathVariable Long eventId);
}
