package anudip;

public class employee2 {
    int Emp_id;
    String Emp_name;
    int Emp_salary;

    // Constructor with no arguments
    employee2() {
        System.out.println("Employee object created");
    }

    // Constructor with arguments
    employee2(int id, String name, int salary) {
        Emp_id = id;
        Emp_name = name;
        Emp_salary = salary;
    }

    void empinfo() {
        System.out.println("Employee details are:\n" + "ID:" + Emp_id + "\n Name:" + Emp_name +
                "\n Salary:" + Emp_salary);
    }

    public static void main(String[] args) {
        employee2 emp = new employee2();
        emp.Emp_id = 101;
        emp.Emp_name = "Aditya";
        emp.Emp_salary = 78000;
        emp.empinfo();

        employee2 emp2 = new employee2(102, "Aditya", 67000);
        emp2.empinfo();
    }
}
