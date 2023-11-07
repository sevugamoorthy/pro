package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Bookings;
import com.mindgate.main.service.BookingsServiceInterface;

@RestController
@RequestMapping("bookingsapi")
public class BookingsCRUD_Controller {
	
	@Autowired
	private BookingsServiceInterface bookingsServiceInterface;
		
	@RequestMapping(value="bookings" , method=RequestMethod.POST)
	public boolean addNewBooking(@RequestBody Bookings bookings ) {
		return bookingsServiceInterface.addNewBooking(bookings);
	}
	@RequestMapping(value="bookings",method = RequestMethod.PUT)
	public Bookings updateBooking(@RequestBody Bookings bookings) {
		return bookingsServiceInterface.updateBooking(bookings);
	}
	
	@RequestMapping(value="bookings/{bookingId}",method = RequestMethod.DELETE)
	public boolean deleteBookingByBookingId(@PathVariable int bookingId) {
		return bookingsServiceInterface.deleteBookingByBookingId(bookingId);
	}
	
	@RequestMapping(value="bookings/{bookingId}",method = RequestMethod.GET)
	public Bookings getBookingByBookingId(@PathVariable int bookingId) {
		return bookingsServiceInterface.getBookingByBookingId(bookingId);
	}
	
	@RequestMapping(value="bookings",method = RequestMethod.GET)
	public List<Bookings> getAllBookings(){
		return bookingsServiceInterface.getAllBookings();
	}
}
