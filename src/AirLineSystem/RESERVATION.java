package AirLineSystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RESERVATION {
    private String Date_made;
    private SCHEDULED_FLIGHT sf;
    private PASSENGERS p;

    public RESERVATION() {

        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        setDate_made( dateFormat.format(date));
        PASSENGERS p1=new PASSENGERS();
        SCHEDULED_FLIGHT s=new SCHEDULED_FLIGHT();
        this.setP(p1);
        this.setSf(s);


    }

    public SCHEDULED_FLIGHT getSf() {
        return sf;
    }

    public void setSf(SCHEDULED_FLIGHT sf) {
        this.sf = sf;
    }

    public PASSENGERS getP() {
        return p;
    }

    public void setP(PASSENGERS p) {
        this.p = p;
    }

    public String getDate_made() {
        return Date_made;
    }

    public void setDate_made(String date_made) {
        Date_made = date_made;
    }


    public void display(){
        System.out.println("\t\t\t\t  ------------------ ");
        System.out.println("\t\t\t\t ****** passenger Details ****** ");

        System.out.println("passenger number : "+p.getNum_of_passenger()+" || passenger name : "+p.getName()+" || passenger address : "+p.getAddress()
        );
        System.out.println("\t\t\t\t  ------------------ ");

        System.out.println("\t\t\t\t >>>> Your Flight Details : ");
        System.out.println(" flight Date : "+ sf.getDate_of_flight()+" \n flight From : "+ sf.getFrom()+" \n flight To :"+ sf.getTo()+"\n Number of travelers : "+ sf.getCapacity()
                +" \n flight Arrival : "+ sf.getArrival() +" \n flight Departure : "+ sf.getDeparture()+"\n");

    }



}
