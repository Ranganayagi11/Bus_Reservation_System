package Bus_Reservation;
import java.util.*;
public class Busmain {
	public static void main(String[] args) {
		ArrayList<Bus_Details> buses=new ArrayList<Bus_Details>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus_Details(1,true,2));
		buses.add(new Bus_Details(2,false,50));
		buses.add(new Bus_Details(3,true,47));
		int userOption=1;
		Scanner s=new Scanner(System.in);
		for(Bus_Details b:buses) {
			b.display();
		}
		while(userOption==1) {
			System.out.print("Enter 1 to book and 2 to exit");
			userOption=s.nextInt();
			if(userOption==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else 
					System.out.println("Sorry bus is full.Try another date.");
			}
			}
	}
}
