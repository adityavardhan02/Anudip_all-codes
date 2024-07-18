package anudip;
public class permanentEmployee extends employee2 {
	int leaves;
	int bonus;
	int pf;
	
	void per_emp(){
		System.out.println("Permanent Employee Details:"+"\nleaves:"+leaves+
				"\nbonus:"+bonus+"\npf:"+pf);
		
	}
	public static void main(String args[])
	{
		permanent_employee pem=new permanent_employee();
		pem.leaves=29;
		pem.bonus=5000;
		pem.pf=20000;
		pem.Emp_name="ADITYA";
		pem.Emp_id=101;
		pem.Emp_salary=20000;
		
		pem.per_emp();
		pem.empinfo();
	}
}

