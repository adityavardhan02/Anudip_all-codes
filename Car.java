package anudip;

public class Car extends vehicle{
	String model;
	String fuel;
	String colour;
	Jblmusicsystem jblm;
	
	void cardetails() {
		System.out.println("Car Details:"+"Model:"+model+"\nFuel:"+fuel+"Color:"+colour+"\nMusic System details:"+jblm.model+",price "+jblm.price+",volume"+jblm.volume);
	}
	
	public static void main(String[]args) {
		Car rr=new Car();
		String n="RR";
		rr.name=n;
		rr.no_ofwheels=4;
		rr.speed=400;
		rr.colour="maroon";
		rr.model="phantom";
		rr.fuel="Petrol";
		
		
	}
	

}
