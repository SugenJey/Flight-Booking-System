/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author sugen
 */
public class Manager {
    public ArrayList<Flights> aFlights=new ArrayList<>();;
    
   public void createFlights()
   {
        int flightNumber;
        String origin;
        String destination;
        String departureTime;
        int capacity;
        int numberOfSeatsLeft;
        double originalPrice;
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter Flight Number:");
      flightNumber=Integer.parseInt(myObj.nextLine());
      System.out.println("Enter Origin:");
      origin=myObj.nextLine();
      System.out.println("Enter Destination:");
      destination=myObj.nextLine();
      System.out.println("Enter Departure Time:");
      departureTime=myObj.nextLine();
      System.out.println("Enter Capacity:");
      capacity=Integer.parseInt(myObj.nextLine());
      System.out.println("Enter Number of Original Price:");
      originalPrice=Double.parseDouble(myObj.nextLine());
      Flights newF= new Flights(flightNumber,origin,destination,departureTime,capacity,originalPrice);
      aFlights.add(newF);
      System.out.println(newF.toString());
      
      
   }
   public void displayAvailableFlights(String origin, String destination)
   {
       for(Flights i:aFlights)
       {
           //System.out.println(i.toString());
           if(i.getOrigin().equals(origin)&&i.getDestination().equals(destination)&&i.getNumberOfSeatsLeft()>=0)
           {
               System.out.println(i.toString());
           }
       }
   }
   public void bookSeat(int flightNumber, Passenger p)
   {
       boolean fExists=true;
      for(Flights i:aFlights)
       {
           
           if(flightNumber==i.getFlightNumber())
           {
               fExists=false;
               if(i.bookASeat())
               {
                   Ticket newTicket= new Ticket(p,i,p.applyDiscount(i.getOriginalPrice()));
                   System.out.println(newTicket.toString());
                   
               }
               else
               {
                   
                   System.out.println("No more seats left.");
               }
           }
           
       }
      if(fExists)
      {
          System.out.println(" This flight doesnt exist.");
      }
      
      if(aFlights.isEmpty())
      {
      System.out.println(" No flights right Now");
      }
   }
   public static void main(String[] args)
   {
       Scanner myObj = new Scanner(System.in);
       Manager sugen= new Manager();
       int userInput=-1;
   
       while(userInput!=0)
       {
        System.out.println("0.Exit\n 1.Book a Seat\n 2.Display Flights\n 3.Create a Flight");
        userInput=Integer.parseInt(myObj.nextLine());
        if(userInput==1)
        {
            Passenger m;
            int flightNumber,age,memL;
            String name;
            System.out.println("What is your flight number?");
            flightNumber=Integer.parseInt(myObj.nextLine());
            
            System.out.println("What is passengers name");
            name=myObj.nextLine();
          
            System.out.println("What is passengers age");
            age=Integer.parseInt(myObj.nextLine());
            
            System.out.println("Are you a member?(y/n)");
            if(myObj.nextLine().equals("y"))
            {
                System.out.println("How long have you been a member");
                memL=Integer.parseInt(myObj.nextLine());
                 m=new Member(name,age,memL);
            }
            else
            {
                m=new NonMember(name,age);
            }
            
             
            sugen.bookSeat(flightNumber,m);
        }
        else if(userInput==2)
        {
            System.out.println("What is the origin");
            String origin=myObj.nextLine();
            
            System.out.println("What is the Destination");
            String destination=myObj.nextLine();
            sugen.displayAvailableFlights(origin, destination);
        }
        else if(userInput==3)
        {
            sugen.createFlights();
        }
       }
   }
}
