import java.util.*;
class Flight
{
    private int flight_no;
    private String sourse;
    private String destination;
    private int ticket_price;
    Flight(int flight_no,String sourse,String destination,int price)
    {
        this.flight_no = flight_no;
        this.sourse = sourse;
        this.destination = destination;
        this.ticket_price = price;
    }
    public int getFlight_no() {
    return flight_no;
}
public void setFlight_no(int flight_no) {
    this.flight_no = flight_no;
}
public String getSourse() {
    return sourse;
}
public void setSourse(String sourse) {
    this.sourse = sourse;
}
public String getDestination() {
    return destination;
}
public void setDestination(String destination) {
    this.destination = destination;
}
public int getticketPrice() {
    return ticket_price;
}
public void setticketPrice(int price) {
    this.ticket_price = price;
}
    
    public String toString()
    {
        return "Flight Number : " + flight_no + " Sourse : " + sourse + " Destination :" + destination + " Ticket price: " + ticket_price;
    }
}
class AirIndia{
    private int fno;
    private String s;
    private String d;
    private int tp;
    Scanner scan = new Scanner(System.in);
    public List<Flight> getFlightsList()
    {
        ArrayList<Flight> flight = new ArrayList<>();
        System.out.print("eneter the no of flight: ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("Flight number: ");
            int fno = scan.nextInt();
            scan.nextLine();
            System.out.print("Source: ");
            String s = scan.nextLine();
            System.out.print("Destination: ");
            String d = scan.nextLine();
            System.out.print("Price: ");
            int tp = scan.nextInt();
            scan.nextLine(); 
            flight.add(new Flight(fno,s,d,tp));
        }
        return Collections.unmodifiableList(flight);
    }
}
public class MakeMyTrip{
    public static void main(String args[])
    {
        AirIndia a = new AirIndia();
        List<Flight> list = a.getFlightsList();
        for(Flight f:list)
        {
            System.out.println(f);
        }
    }
}