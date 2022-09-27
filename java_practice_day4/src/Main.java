public class Main {

    public static void main(String[] args) {
        Employee EmployeeOne = new Employee("abhishek","calicut",24,25000);
        Employee EmployeeTwo = new Employee("sanju","ekm",23,1000);

        EmployeeOne.raiseSalary();

        System.out.println(EmployeeOne.salary);
        System.out.println(EmployeeTwo.salary);
    }
}
