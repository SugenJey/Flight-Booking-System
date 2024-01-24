/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 *
 * @author sugen
 */
public class Ticket {
    Passenger p;
    Flights flight;
    double price;
    int number;

    public Ticket(Passenger p, Flights flight, double price) {
        this.p = p;
        this.flight = flight;
        this.price = price;
        this.number = flight.getCapacity()-flight.getNumberOfSeatsLeft();
        flight.setNumberOfSeatsLeft(flight.getNumberOfSeatsLeft()-1);
    }

    public Passenger getP() {
        return p;
    }

    public void setP(Passenger p) {
        this.p = p;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString()
    {
       return p.getName()+", "+flight.toString()+", ticket price: $"+price;
    }
}
