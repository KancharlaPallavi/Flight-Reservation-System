package com.company;

public class RegularTicket extends Ticket{
    private String specialServices;

    public RegularTicket(String seatNo, String pnr, String departure,
                         String destination, String departureDateTime,
                         String arrivalDateTime, Flight flight, Passenger passenger,
                         float price, boolean cancelled, String specialServices) {
        super(seatNo,pnr,departure,destination,departureDateTime,arrivalDateTime,flight,passenger,price,cancelled);
        this.specialServices = specialServices;
    }
    public String getSpecialServices(){
        return specialServices;
    }
    public void updateSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }

    }