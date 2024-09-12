package Bus_Reservation;

public class Bus_Details {
	private int bus_no;
	private int capacity;
	private boolean ac;
	Bus_Details(int n,boolean ac,int cap){
		this.bus_no=n;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getCapacity() {//accessor method
		return capacity;
	}
	public void setCapacity(int cap) {//mutator
		capacity=cap;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean v) {//mutator
		ac=v;
	}
	public int getBusNo() {
		return bus_no;
	}
	public void display() {
		System.out.println("Bus no: "+bus_no+" Ac: "+ac+"  Total capacity: "+capacity);
	}
}
