package anudip;

public class SportsCar extends Car {
	int horsepower;
	int price;
	int no_ofgears;
	private String name;
	private int no_ofwheels;
	private int speed;
	private int horse_power;
	
	void SportsCarDetails() {
		System.out.println("SportsCar Details:"+"\nhorsepower:"+horsepower+"\ngears:"+no_ofgears++);
	}
	

	public static void main(String[] args) {
		SportsCar lamborgini=new SportsCar();
		lamborgini.name="lamborgini Car";
		lamborgini.no_ofwheels=4;
		lamborgini.speed=500;
		lamborgini.fuel="Petrol";
		lamborgini.model="x500";
		lamborgini.horse_power=400;
		lamborgini.no_ofgears=8;
		
		lamborgini.vehicleInfo();
		lamborgini.SportsCarDetails();
		
		
	}


	private void vehicleInfo() {
		// TODO Auto-generated method stub
		
	}

}
