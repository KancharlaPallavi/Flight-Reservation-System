package com.company;

public class Passenger {
    int id;
    String street;
    String city;
    String state;
    String name;
    String phone;
    String email;

    Passenger(){
        System.out.println("Object for Passenger class");
    }

    public Passenger(int id, String street, String city, String state, String name, String phone, String email) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.state = state;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    Passenger(Passenger passenger){
        id=passenger.id;
        street= passenger.street;
        city= passenger.city;
        state= passenger.state;
        name= passenger.name;
        phone= passenger.phone;
        email= passenger.email;
    }
    String getAddressDetails(){
        return street+", "+city+", "+state;
    }
    String getContactDetails(){
        return name+", "+phone+", "+email;
    }
}