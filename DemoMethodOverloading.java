package anudip;

public class DemoMethodOverloading {
	
	double avg(int a,int b) {
		double avg=(a+b)/2;
		return avg;
	}
	 double avg(int a,int b,int c) {
		 double avg=(a+b+c)/3;
		 return avg;
	 }
	 double avg(int a,int b,int c,int d) {
		 double avg=(a+b+c+d)/4;
		 return avg;
	 }

	public static void main(String[] args) {
		DemoMethodOverloading dload=new DemoMethodOverloading();
		System.out.println("Average of 2 i/p="+dload.avg(23,32));
		System.out.println("Average of 3 i/p="+dload.avg(25,77,33));
		System.out.println("Average of 4 i/p="+dload.avg(23,32,90,128));

	}

}
