package anudip;

public class rectangle extends shape {
	static int length;
	static int breadth;
	public rectangle(String name,int length,int breadth) {
	
		super();
		rectangle.length=length;
		rectangle.breadth=breadth;
	}
	
	
	void area() {
		int a =length*breadth;
		System.out.println("Area="+a);
		
	}
	
	public static void main(String[]args) {
		rectangle rectangle=new rectangle("Rectangle",30,40);
		shape.shapeInfo();
		rectangle.area();
		
	}

}
