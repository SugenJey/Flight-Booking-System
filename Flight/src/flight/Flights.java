/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 *
 * @author sugen
 */
public class Flights {
        int flightNumber;
        String origin;
        String destination;
        String departureTime;
        int capacity;
        int numberOfSeatsLeft;
        double originalPrice;
    public Flights(int flightNumber,String origin,String destination,String departureTime,int capacity,double originalPrice)
    {
        this.flightNumber=flightNumber;
        this.origin=origin;
        this.capacity=capacity;
        this.departureTime=departureTime;
        this.originalPrice=originalPrice;
        this.destination=destination;
        this.numberOfSeatsLeft=capacity;
        if(destination.equals(origin))
        {
            throw new IllegalArgumentException("Destination cannot be the same as Origin!");
        }
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    public boolean bookASeat()
    {
        if(numberOfSeatsLeft>=0)
        {
            numberOfSeatsLeft--;
            return true;
        }
        return false;
    }
    @Override
    public String toString()
    {
        return "Flight "+ flightNumber+", "+origin+" to "+destination+", "+ departureTime+", Original price:"+ originalPrice+"$";
    }
}
    