package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        //Object for Passenger class
        Passenger passenger = new Passenger(1, "Menamkulam", "Trivandrum",
                "Kerela", "Pallavi", "9110567302",
                "pallavikancharla158@gmail.com");

        // Array for selectedTouristLocations
        String[] touristPlaces = {"Munnar", "Kochi", "Allaphez"};

        //Object for touristTicket
        TouristTicket touristTicket = new TouristTicket("1A", "sdr432", "hyderabad",
                "Trivandrum", "2021-04-19T15:14",
                "2021-04-19T17:04", 4000.0f, false,
                "Menamkulam", touristPlaces);

        //Object for RegularTicket
        RegularTicket regularTicket = new RegularTicket("1A", "sdr432", "hyderabad",
                "Trivandrum", "2021-04-19T15:14",
                "2021-04-19T15:14", 4000.0f, false, "breakfast");

        //Object for flight
        Flight flight=new Flight("6E345","Indigo",80,50);

        System.out.println("Airline: "+flight.airline);
        System.out.println("Passenger Address Details: "+passenger.getAddressDetails());
        System.out.println("Duration in minutes: "+touristTicket.getFlightDuration());
    }
}
