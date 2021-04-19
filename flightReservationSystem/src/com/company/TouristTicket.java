package com.company;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Duration;

public class TouristTicket {
    String seatNo;
    String pnr;
    String departure;
    String destination;
    String departureDateTime;
    String arrivalDateTime;
    float price;
    boolean cancelled;
    String hotelAddress;
    String[] selectedTouristLocation=new String[5];

    public TouristTicket(String seatNo, String pnr, String departure,
                         String destination, String departureDateTime,
                         String arrivalDateTime, float price, boolean cancelled,
                         String hotelAddress, String[] selectedTouristLocation) {
        this.seatNo = seatNo;
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
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
    public String getHotelAddress(){
        return hotelAddress;
    }
    public  String[] getSelectedTouristLocation(){
        return selectedTouristLocation;
    }
    public void removeTouristLocation(String location){
        int index=0;
        for(int i=0; i<selectedTouristLocation.length; i++){
            if(selectedTouristLocation[i]==location){
                index=i;
            }
        }
       for(int j=index; j<selectedTouristLocation.length;j++){
           selectedTouristLocation[j]=selectedTouristLocation[j+1];
       }
    }
    public void addTouristLocation(String location){
        int range=selectedTouristLocation.length;
        selectedTouristLocation[range-1]=location;
    }
}