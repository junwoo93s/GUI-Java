/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightschedulerjunwooseojzs5882;

/**
 *
 * @author junwooseo
 */
public class Flight {
    private static String flight;
    private int seats;
    
    public Flight(String flight, int seats)
    {
        this.flight = flight;
        this.seats = seats;
    }
 
    
    public static String getFlightID(){
        return flight;
    }
    
    @Override
    public String toString(){
        return flight + " seats: " + Integer.toString(seats);
    }
}
