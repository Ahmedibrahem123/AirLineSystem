package AirLineSystem;

public class SCHEDULED_FLIGHT extends FLIGHT_DESCRIPTION {
    private String  Date_of_flight;

    public SCHEDULED_FLIGHT(String To, String From, double Arrival, double Departure, int Capacity, String Date_of_flight) {
        super(To, From, Arrival, Departure, Capacity);
        this.Date_of_flight = Date_of_flight;
    }

    public String getDate_of_flight() {
        return Date_of_flight;
    }

    public void setDate_of_flight(String date_of_flight) {
        Date_of_flight = date_of_flight;
    }
    public void display_Scheduled_Flight_details(){

        System.out.println("\t\t\t\t ****** The Details of Booked Flight ****** ");
        System.out.println("flight Date : "+this.getDate_of_flight()+" || flight From : "+this.getFrom()+" || flight To :"+this.getTo()+"|| Number of travelers : "+this.getCapacity()
                +" || flight Arrival : "+this.getArrival() +" || flight Departure : "+this.getDeparture()+"\n"
        );
    }
}
