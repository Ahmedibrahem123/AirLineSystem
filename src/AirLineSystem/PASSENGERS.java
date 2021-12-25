package AirLineSystem;

import java.util.Scanner;

public class PASSENGERS extends PERSON{
    private int num_of_passenger;

    Scanner obj = new Scanner(System.in);
    public PASSENGERS()
    {
        System.out.println("Enter The name_of_passenger:");
        System.out.print("->");
        this.setName(obj.nextLine());
        System.out.println("-------------------------------");
        System.out.println("Enter The address_of_passenger:");
        System.out.print("->");
        this.setAddress(obj.nextLine());
        System.out.println("----------------------------");
        System.out.println("Enter The number_of_passenger:");
        System.out.print("->");
        setNum_of_passenger(obj.nextInt());
        System.out.println("--------------------------");

    }

    public int getNum_of_passenger() {
        return num_of_passenger;
    }

    public void setNum_of_passenger(int num_of_passenger) {
        this.num_of_passenger = num_of_passenger;
    }
}
