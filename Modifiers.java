package anudip;
//ModifiersAndEmployee.java

public class Modifiers {
 public String name;       // Public member
 private int age;          // Private member
 protected String address; // Protected member
 String phone;             // Default (package-private) member

 // Constructor
 public Modifiers(String name, int age, String address, String phone) {
     this.name = name;
     this.age = age;
     this.address = address;
     this.phone = phone;
 }

 // Public method
 public void displayPublicInfo() {
     System.out.println("Name: " + name);
 }

 // Private method
 private void displayPrivateInfo() {
     System.out.println("Age: " + age);
 }
 

 // Protected method
 protected void displayProtectedInfo() {
     System.out.println("Address: " + address);
 }

 // Default (package-private) method
 void displayDefaultInfo() {
     System.out.println("Phone: " + phone);
 }

 // Public method to access private method
 public void showAge() {
     displayPrivateInfo();
 }
}
public class Employee extends Modifiers {
	 private String employeeId;

	 public Employee(String name, int age, String address, String phone, String employeeId) {
	     super(name, age, address, phone);
	     this.employeeId = employeeId;
	 }

	 // Method to display employee details
	 public void displayEmployeeInfo() {
	     displayPublicInfo();         // Accessible
	     // displayPrivateInfo();     // Not accessible, private to Modifiers
	     displayProtectedInfo();      // Accessible, protected in Modifiers
	     displayDefaultInfo();        // Accessible, package-private in Modifiers
	     System.out.println("Employee ID: " + employeeId);
	 }
	}
	public class Main 
	{
	 public static void main(String[] args) {
	     Modifiers person = new Modifiers("Aditya", 30, "123 Main St", "555-1234");
	     Employee employee = new Employee("Sahithi", 25, "456 Elm St", "555-5678", "E123");

	     // Accessing Modifiers class members from Main class
	     person.displayPublicInfo();     // Accessible
	     // person.displayPrivateInfo(); // Not accessible, private method
	     person.showAge();               // Accessible, public method accessing private method
	     // person.displayProtectedInfo(); // Not accessible, protected method
	     person.displayDefaultInfo();    // Accessible, default method

	     System.out.println();

	     // Accessing Employee class members from Main class
	     employee.displayEmployeeInfo(); // Accessible, public method in Employee
	 }
	}
