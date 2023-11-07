package com.mindgate.main.domain;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Time;

public class Bookings {
	
	private Travel_Requests travel_Requests;
	private int bookingId;
	private String hotelName;
	private Clob hotelLocation;
	private Time checkInTime;
	private Time checkOutTime;
	private String transportationMode;
	private String flightTicket;
	private String busTicket;
	private String trainTicket;
	private Blob ticket;
	private double forex;
	
	public Bookings() {
		// TODO Auto-generated constructor stub
	}

	public Bookings(int bookingId, String hotelName, Clob hotelLocation, Time checkInTime, Time checkOutTime,
			String transportationMode, String flightTicket, String busTicket, String trainTicket, Blob ticket,
			double forex, Travel_Requests travel_Requests) {
		super();
		this.bookingId = bookingId;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.transportationMode = transportationMode;
		this.flightTicket = flightTicket;
		this.busTicket = busTicket;
		this.trainTicket = trainTicket;
		this.ticket = ticket;
		this.forex = forex;
		this.travel_Requests = travel_Requests;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Clob getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(Clob hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public Time getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Time checkInTime) {
		this.checkInTime = checkInTime;
	}

	public Time getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(Time checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public String getTransportationMode() {
		return transportationMode;
	}

	public void setTransportationMode(String transportationMode) {
		this.transportationMode = transportationMode;
	}

	public String getFlightTicket() {
		return flightTicket;
	}

	public void setFlightTicket(String flightTicket) {
		this.flightTicket = flightTicket;
	}

	public String getBusTicket() {
		return busTicket;
	}

	public void setBusTicket(String busTicket) {
		this.busTicket = busTicket;
	}

	public String getTrainTicket() {
		return trainTicket;
	}

	public void setTrainTicket(String trainTicket) {
		this.trainTicket = trainTicket;
	}

	public Blob getTicket() {
		return ticket;
	}

	public void setTicket(Blob ticket) {
		this.ticket = ticket;
	}

	public double getForex() {
		return forex;
	}

	public void setForex(double forex) {
		this.forex = forex;
	}

	public Travel_Requests getTravel_Requests() {
		return travel_Requests;
	}

	public void setTravel_Requests(Travel_Requests travel_Requests) {
		this.travel_Requests = travel_Requests;
	}

	@Override
	public String toString() {
		return "Bookings [bookingId=" + bookingId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
				+ ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + ", transportationMode="
				+ transportationMode + ", flightTicket=" + flightTicket + ", busTicket=" + busTicket + ", trainTicket="
				+ trainTicket + ", ticket=" + ticket + ", forex=" + forex + ", travel_Requests=" + travel_Requests
				+ "]";
	}

	
	
	
}
