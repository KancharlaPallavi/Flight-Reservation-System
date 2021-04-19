package com.company;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;

public class RegularTicket {
    String seatNo;
    String pnr;
    String departure;
    String destination;
    String departureDateTime;
    String arrivalDateTime;
    float price;
    boolean cancelled;
    String specialServices;

    public RegularTicket(String seatNo, String pnr, String departure,
                         String destination, String departureDateTime, String arrivalDateTime,
                         float price, boolean cancelled, String specialServices) {
        this.seatNo = seatNo;
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.price = price;
        this.cancelled = cancelled;
        this.specialServices = specialServices;
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
    public String getSpecialServices(){
        return specialServices;
    }
    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }
}