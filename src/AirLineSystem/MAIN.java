package AirLineSystem;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        RESERVATION r = null;
        int choice=0;
        boolean test=true;
        System.out.println("\t\t\t\t  WELCOME ,CHOOSE WHAT YOU WANT!!: ");
        do{
            do{
                System.out.println(" ---------------------------------------------");
                System.out.println(" \n1-Book a Flight \n2-Display your flight details\n3-Exit");
                System.out.print("->");
                choice=Integer.parseInt(scanner.nextLine());
                if(choice!=1&&choice!=2&&choice!=3)
                    System.out.println("\t\t\t\tEnter a valid number, Please!! ");

            }while(choice!=1 &&choice!=2&&choice!=3);
            switch(choice)
            {
                case 1:
                {
                    r=new RESERVATION();
                    System.out.println("\t\t\t\t  Booked Successfully ,Thanks  ");
                }break;
                case 2:
                {
                    r.display();

                }break;
                case 3:
                {
                    System.out.println("\t\t\t\t ------------------------------------");
                    System.out.println("\t\t\t\t  *** Thanks ****  ");

                    test=false;
                }break;
            }

        }while(test==true);
    }
    }



