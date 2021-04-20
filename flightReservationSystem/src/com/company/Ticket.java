package com.company;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Ticket {
    private String seatNo;
    private String pnr;
    private String departure;
    private String destination;
    private String departureDateTime;
    private String arrivalDateTime;
    private float price;
    private Flight flight;
    private Passenger passenger;
    private boolean cancelled;
    public Ticket(String seatNo, String pnr, String departure,
                         String destination, String departureDateTime,
                         String arrivalDateTime, Flight flight, Passenger passenger,
                         float price, boolean cancelled){
        this.seatNo = seatNo;
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.flight=flight;
        this.passenger=passenger;
        this.price = price;
        this.cancelled = cancelled;
    }
    public String checkStatus(){
        if(cancelled==false){
            return "Ticket booked";
        }
        else{
            return "Ticket cancelled";
        }
    }
    public int getFlightDuration() throws ParseException {
        LocalDateTime d1=LocalDateTime.parse(departureDateTime);
        LocalDateTime d2=LocalDateTime.parse(arrivalDateTime);
        Duration duration =Duration.between(d1,d2);
        return (int)duration.toMinutes();
    }
    public void cancel(){
        this.cancelled=true;
    }
    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
