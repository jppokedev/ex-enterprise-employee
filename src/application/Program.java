package application;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;
import model.entities.EmployeeException;
import model.entities.Enterprise;
import service.EmployeeFactory;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 

		Enterprise enterprise = new Enterprise();
		
		char validation = 'y';
		
		System.out.println("Enter the employee data");
		
		try {
			while(validation == 'y') {
				System.out.print("What is the employee's position? (manager, regular or trainee): " );
				String fun = sc.next();
				sc.nextLine();
				EmployeeFactory.validation(fun);
				System.out.print("inform the entry time: ");
				LocalTime clockIn = LocalTime.parse(sc.nextLine());				
				System.out.print("inform the departure time: ");
				LocalTime clockOut = LocalTime.parse(sc.nextLine());
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Id: ");
				Integer id = sc.nextInt();
				System.out.print("Salary: ");
				Double salary = sc.nextDouble();
				
				Employee employee = EmployeeFactory.createEmployee(fun, name, id, salary);
				enterprise.getListEmployee().add(employee);
				
				employee.clockIn(clockIn);
				employee.clockOut(clockOut);
				
				System.out.print("More employee to be added? (y/n) ");
				validation = sc.next().charAt(0);
				System.out.println();
	
			}
		}	
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
		}
		
		System.out.println("EMPLOYEE'S: ");
		for(Employee employee : enterprise.getListEmployee()) {
			System.out.println(employee);
		}
		System.out.println();
		System.out.print("The manager's annual bonus is: ");
		enterprise.annualCalculation();		
		System.out.printf("%.2f", enterprise.getManager());
		System.out.println();
		System.out.println();
		System.out.print("The annual bonus for regular employees is: ");
		System.out.printf("%.2f", enterprise.getRegular());
 
		sc.close();

	}
}
