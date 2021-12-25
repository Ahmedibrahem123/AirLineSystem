package AirLineSystem;

public class FLIGHT_DESCRIPTION {
    private String To, From;
    private double Arrival, Departure;
    private int Capacity ;



    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public double getArrival() {
        return Arrival;
    }

    public void setArrival(double arrival) {
        Arrival = arrival;
    }

    public double getDeparture() {
        return Departure;
    }

    public void setDeparture(double departure) {
        Departure = departure;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }
}
