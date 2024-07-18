package anudip;

public class Employee {
	int empId;
	String empName;
	int salary;
     int emp_salary;
	//No_args Constructor
	Employee()
	{
		System.out.println("Employee Object Created");
	}
	//Constructor 

	void empInfo() {
		System.out.println("Employee Details:"+empId+"\n Name:"+empName+"\n Salary"+salary);
	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId=1232;
		emp.empName="Ravan";
		emp.salary=60000;
		emp.empInfo();

	}

}
