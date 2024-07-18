package anudip;

public abstract class square2 implements shapes {
	int side;
	
	//Constructor with parameter side
	public square2(int side) {
		//super();
		this.side=side;
	}
	@Override
	public int area() {
		int area=side*side;
		return area;
	}
	@Override
	public int perimeter() {
		int perimeter=4*side;
		return perimeter;
	}
	

	public static void main(String[] args) {
		square2 square=new Square2(36);
		int a=square.area();
		System.out.println("Area="+a);
		System.out.println("Perimeter="+square.perimeter());
		System.out.println("Surface Area="+square.surfacearea());
		
		shapes.msg();
		

	}

}
