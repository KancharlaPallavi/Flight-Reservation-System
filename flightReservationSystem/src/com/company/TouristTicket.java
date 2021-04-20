package com.company;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation=new String[5];

    public TouristTicket(String seatNo, String pnr, String departure,
                         String destination, String departureDateTime,
                         String arrivalDateTime, Flight flight,Passenger passenger,
                         float price, boolean cancelled,
                         String hotelAddress, String[] selectedTouristLocation) {
        super(seatNo,pnr,departure,destination,departureDateTime,arrivalDateTime,flight,passenger,price,cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
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
    }