package anudip;

public class Employeee {
    protected String name;
    protected int employeeId;
    protected double baseSalary;

    public Employeee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        
    }

    public void salary() {
        System.out.println("Base Salary: " + baseSalary);
    }
}
class PermanentEmployee extends Employeee {
    private double pf;
    private double otherBenefits;

    public PermanentEmployee(String name, int employeeId, double baseSalary, double pf, double otherBenefits) {
        super(name, employeeId, baseSalary);
        this.pf = pf;
        this.otherBenefits = otherBenefits;
    }

    @Override
    public void salary() {
        double totalSalary = baseSalary + pf + otherBenefits;
        System.out.println("Total Salary (including PF and other benefits): " + totalSalary);
    }

    public void pf() {
        System.out.println("Provident Fund: " + pf);
    }

    public void otherBenefits() {
        System.out.println("Other Benefits: " + otherBenefits);
    }
}
class ContractEmployee extends Employeee {
    private int contractDuration; // in months

    public ContractEmployee(String name, int employeeId, double baseSalary, int contractDuration) {
        super(name, employeeId, baseSalary);
        this.contractDuration = contractDuration;
    }

    @Override
    public void salary() {
        System.out.println("Contract Salary: " + baseSalary);
    }

    public void showContractDuration() {
        System.out.println("Contract Duration (in months): " + contractDuration);
    }
}
class Main {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee("Aditya", 101, 50000, 5000, 2000);
        ContractEmployee contractEmployee = new ContractEmployee("Pawan Kalyan", 102, 40000, 12);

        System.out.println("Permanent Employee Details:");
        permanentEmployee.salary();
        permanentEmployee.pf();
        permanentEmployee.otherBenefits();

        System.out.println("\nContract Employee Details:");
        contractEmployee.salary();
        contractEmployee.showContractDuration();
    }
}
