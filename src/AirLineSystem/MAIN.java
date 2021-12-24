package AirLineSystem;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String date_made = null,Name_Of_Passenger = null,Address_Of_Passenger = null,date_Of_Flight = null,To = null,From = null;
        int Num_Of_Passenger = 0,Capacity = 0;
        double Arrival = 0,Departure = 0;
        int choice=0;
        RESERVATION reservation = new RESERVATION(date_made,Num_Of_Passenger,Name_Of_Passenger
                ,Address_Of_Passenger,date_Of_Flight,To,From,Arrival,Departure,Capacity);
        boolean test=true;
        System.out.println("\t\t\t\t ****** Welcome To Our Program ******");
        do{
            do{
                System.out.println(" ---------------------------------------------------------------------------------------------");
                System.out.println(" Choose what you want and Enter its number:\n1-Reservations The Flight \n2-Display_Reservations_details that found\n3-Exit");
                System.out.print("->");
                choice=Integer.parseInt(scanner.nextLine());
                if(choice!=1&&choice!=2&&choice!=3)
                    System.out.println("\t\t\t\t ****** !!Please Enter The Number Again!! ******");

            }
            while(choice!=1 &&choice!=2&&choice!=3);
            switch(choice)
            {
                case 1:
                {
                    reservation=Display();
                }break;
                case 2:
                {
                    reservation.display_Reservations_details();
                }break;
                case 3:
                {
                    System.out.println("\t\t\t\t ------------------------------------");
                    System.out.println("\t\t\t\t ****** Thanks For booking via us ******");
                    System.out.println("\t\t\t\t ------------------------------------");
                    test=false;
                }
                break;
            }

        }
        while(test==true);
    }

    public static RESERVATION Display() {
        Scanner scanner = new Scanner(System.in);
        String date_made, Name_Of_Passenger, Address_Of_Passenger, date_Of_Flight, To, From;
        int Num_Of_Passenger, Capacity;
        double Arrival, Departure;


        //Date_made
        System.out.println("Enter The Date Made:");
        System.out.print("->");
        date_made=scanner.nextLine();
        System.out.println("-----------------------------");
        // name_of_passenger
        System.out.println("Enter The name of passenger:");
        System.out.print("->");
        Name_Of_Passenger=scanner.nextLine();
        System.out.println("------------------------------");
        //address_of_passenger
        System.out.println("Enter The address of passenger:");
        System.out.print("->");
        Address_Of_Passenger=scanner.nextLine();
        System.out.println("------------------------------");
        //Date_of_flight
        System.out.println("Enter The Date of flight:");
        System.out.print("->");
        date_Of_Flight=scanner.nextLine();
        System.out.println("------------------------------");
        //To
        System.out.println("Enter The Departure Place:");
        System.out.print("->");
        To=scanner.nextLine();
        System.out.println("------------------------------");
        //From
        System.out.println("Enter The Arrival place:");
        System.out.print("->");
        From=scanner.nextLine();
        System.out.println("-------------------------------");
        //Arrival Time
        System.out.println("Enter The Arrival Time:");
        System.out.print("->");
        Arrival=scanner.nextDouble();
        System.out.println("---------------------------");
        //Departure Time
        System.out.println("Enter The Departure Time:");
        System.out.print("->");
        Departure=scanner.nextDouble();
        System.out.println("-----------------------------");
        //Capacity
        System.out.println("Enter The Capacity Of AirAirplane:");
        System.out.print("->");
        Capacity=scanner.nextInt();
        System.out.println("------------------------------------");
        //num_of_passenger
        System.out.println("Enter The number_of_passenger:");
        System.out.print("->");
        Num_Of_Passenger=scanner.nextInt()
        ;System.out.println("---------------------------------");

        RESERVATION r=new RESERVATION(date_made,Num_Of_Passenger,Name_Of_Passenger
                ,Address_Of_Passenger,date_Of_Flight,To,From,Arrival,Departure,Capacity);
        return r;
    }
}
