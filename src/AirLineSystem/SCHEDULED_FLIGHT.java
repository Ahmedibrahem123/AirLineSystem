package AirLineSystem;

import java.util.Scanner;

public class SCHEDULED_FLIGHT extends FLIGHT_DESCRIPTION {
    private String  Date_of_flight;

    Scanner obj = new Scanner(System.in);
    SCHEDULED_FLIGHT()
    {
        System.out.println("Enter The Date_of_flight:");
        System.out.print("->");
        setDate_of_flight(obj.nextLine());
        System.out.println("--------------------------");

        System.out.println("Enter Departure place :");
        System.out.print("->");
        setTo(obj.nextLine());
        System.out.println("-----------------------------");
        //From
        System.out.println("Enter Arrival place:");
        System.out.print("->");
        setFrom(obj.nextLine());
        System.out.println("--------------------------------");
        //Arrival Time
        System.out.println("Enter The Arrival Time:");
        System.out.print("->");
        setArrival(obj.nextDouble());
        System.out.println("-------------------------------------");
        //Departure Time
        System.out.println("Enter The Departure Time:");
        System.out.print("->");
        setDeparture(obj.nextDouble());
        System.out.println("--------------------------------------------");
        //Capacity
        System.out.println("Enter The Capacity Of flight:");
        System.out.print("->");
        setCapacity(obj.nextInt());
        System.out.println("--------------------------------------------");


    }

    public String getDate_of_flight() {
        return Date_of_flight;
    }

    public void setDate_of_flight(String date_of_flight) {
        Date_of_flight = date_of_flight;
    }

}
