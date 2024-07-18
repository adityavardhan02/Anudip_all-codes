package apjfsa;

public class Employee1Details {
	public static void main(String[] args) {
		// Declaring an array for storing employee details
		Employee1[] employee = new Employee1[5];
		employee[0] = new Employee1(123, "Aditya", 170000);
		employee[1] = new Employee1(124, "Sriman", 140000);
		employee[2] = new Employee1(125, "Uday", 150000);
		employee[3] = new Employee1(126, "Teja", 160000);
		employee[4] = new Employee1(127, "Charan", 180000);
//intializing i value printing employee details
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println(employee[i]);
		}
	}
}