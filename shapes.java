package anudip;

public interface shapes {
	final float pi=3.14f;
	
	
	int area();
	int perimeter();
	default int surfacearea() {
		return 0;
	}
	static void msg() {
		System.out.println("static method");
	}

}
