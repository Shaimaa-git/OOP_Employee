import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of employee:");
        String employeeName= scanner.nextLine();

        System.out.println("Enter the position of employee:");
        String employeePosition= scanner.nextLine();

        System.out.println("Enter the salary:");
        Double employeeSalary= scanner.nextDouble();

        Employee employeeDetails=new Employee(employeeName,employeePosition,employeeSalary);
        System.out.println("Employee details: ");
        System.out.println("Employee name: "+employeeDetails.getName());
        System.out.println("Employee position: "+employeeDetails.getPosition());
        System.out.println("Employee salary: "+employeeDetails.getSalary());
    }
}