package Bus_Reservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Booking {
	String passenger_name;
	int busno;
	Date date;
	Booking(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passenger_name=scanner.next();
		System.out.println("Enter bus no: ");
		busno=scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus_Details> buses) {
		int capacity=0;
		for(Bus_Details bus:buses) {
			if(bus.getBusNo()==busno)
				capacity=bus.getCapacity();
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busno==busno && b.date.equals(date)) {
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
}
