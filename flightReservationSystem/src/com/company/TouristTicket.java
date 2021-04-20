package com.company;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Duration;

public class TouristTicket {
    private String seatNo;
    private String pnr;
    private String departure;
    private String destination;
    private String departureDateTime;
    private String arrivalDateTime;
    private Flight flight;
    private Passenger passenger;
    private float price;
    private boolean cancelled;
    private String hotelAddress;
    private String[] selectedTouristLocation=new String[5];

    public TouristTicket(String seatNo, String pnr, String departure,
                         String destination, String departureDateTime,
                         String arrivalDateTime, float price,
                         Flight flight,Passenger passenger, boolean cancelled,
                         String hotelAddress, String[] selectedTouristLocation) {
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

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}