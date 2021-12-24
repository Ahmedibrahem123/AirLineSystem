package AirLineSystem;

public class PASSENGERS extends PERSON{
    private int num_of_passenger;
    public  PASSENGERS(int num_of_passenger,String name_of_passenger,String address_of_passenger){
        super(name_of_passenger,address_of_passenger);
        this.num_of_passenger = num_of_passenger;
    }

    public int getNum_of_passenger() {
        return num_of_passenger;
    }

    public void setNum_of_passenger(int num_of_passenger) {
        this.num_of_passenger = num_of_passenger;
    }
    public void display_Passenger_details() {

        System.out.println("\t\t\t\t ****** The Details of Passenger  ****** ");
        System.out.println("Passenger Numbmer : " + this.getNum_of_passenger() + " || Passenger Name : " + this.getName() + " || passenger address : " + this.getAddress() );
    }
}
