package apjfsa;

import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("Apple");
		vector.add("Mango");
		vector.add("Orange");
		
		System.out.println(vector);
		
		System.out.println(vector.firstElement());
		System.out.println(vector.lastElement());
		
		vector.add("Mango");
		vector.addElement("Banana");
		vector.add(null);
		vector.set(5, "Grapes");
		
		System.out.println(vector);
		System.out.println(vector.capacity());
		vector.setElementAt("", 4);
		System.out.println(vector);
	}

}
