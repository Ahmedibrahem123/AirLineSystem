package AirLineSystem;

public class RESERVATION {
    private String Date_made;
    private SCHEDULED_FLIGHT sf;
    private PASSENGERS p;

    public RESERVATION(String Date_made,int num_of_passenger,String name_of_passenger,String address_of_passenger,String Date_of_flight,String To, String From, double Arrival, double Departure, int Capacity) {
        sf=new SCHEDULED_FLIGHT( To, From, Arrival, Departure, Capacity,Date_of_flight);
        p=new PASSENGERS(num_of_passenger, name_of_passenger, address_of_passenger);
        this.Date_made = Date_made;
    }

    public String getDate_made() {
        return Date_made;
    }

    public void setDate_made(String date_made) {
        Date_made = date_made;
    }

    public void display_Reservations_details(){
        System.out.println("\t\t\t\t ****** ------------------ ******");
        p.display_Passenger_details();
        System.out.println("\t\t\t\t ****** ------------------ ******");
        sf.display_Scheduled_Flight_details();
        System.out.println("\t\t\t\t ****** ------------------ ******");
    }
}
