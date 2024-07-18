package apjfsa;

public class Employee1 {

	//Declaration of variables
		int empid;
		String empname;
		int sal;
		//creating an constructor to get values
	public Employee1 (int empid,String empname,int sal) {
		super();//super to call parent class constructor
	this.empid=empid;//this keyword for  references to current object
	this.empname=empname;
	this.sal=sal;

		
	}
	public String toString() {
	return "Employee1[empid="+empid+",name="+empname+",sal="+sal+"]";
	}
}