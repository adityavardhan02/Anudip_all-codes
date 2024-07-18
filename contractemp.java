package anudip;

public class ContractEmp extends Employee2 {
    int contractPeriod;
    int privillageLeaves;
    int working_days;

    void contractempInfo() {
        System.out.println("Contract employee Details: " + contractPeriod + ", " + privillageLeaves + ", " + working_days);
    }

    public static void main(String[] args) {
        ContractEmp emp = new ContractEmp();
        emp.Emp_id = 21345;
        emp.Emp_name = "Aditya";
        emp.Emp_salary = 30000;
        emp.working_days = 290;
        emp.privillageLeaves = 28;
        emp.contractPeriod = 69;

        emp.contractempInfo();
        emp.empinfo();
    }
}


		 

	


