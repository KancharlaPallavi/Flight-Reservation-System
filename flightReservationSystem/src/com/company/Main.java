package com.company;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        //Object for Passenger class
        Passenger passenger = new Passenger("Menamkulam", "Trivandrum",
                "Kerela", "Pallavi", "9110567302",
                "pallavikancharla158@gmail.com");

        Passenger passenger1 = new Passenger("Manikonda", "Hyderabad",
                "Telangana", "Xyz", "1234567890",
                "Xyz@gmail.com");

        // Array for selectedTouristLocations
        String[] touristPlaces = {"Munnar", "Kochi", "Allaphez"};

        //Object for flight
        Flight flight = new Flight("6E345", "Indigo", 80, 50);

        //Object for touristTicket
        TouristTicket touristTicket = new TouristTicket("1A", "sdr432", "hyderabad",
                "Trivandrum", "2021-04-19T15:14",
                "2021-04-19T17:04", 4000.0f, flight, passenger, false,
                "Menamkulam", touristPlaces);

        //Object for RegularTicket
        RegularTicket regularTicket = new RegularTicket("1A", "sdr433", "hyderabad",
                "Trivandrum", "2021-04-19T15:14",
                "2021-04-19T15:14", flight, passenger, 4000.0f, false, "breakfast");

        System.out.println("Airline: " + flight.getAirline());
        System.out.println("Passenger Address Details: " + passenger.getAddressDetails());
        System.out.println("Duration in minutes: " + touristTicket.getFlightDuration());
        System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("No of passengers: " + passenger.getPassengerDetails());

    }

}
