package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;
import model.entities.Enterprise;
import model.entities.Manager;
import model.entities.RegularEmployee;
import model.entities.Trainee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Enterprise enterprise = new Enterprise();
		
		char validation = 'y';
		
		System.out.println("Enter the employee data");
		System.out.println();
		
		while(validation == 'y') {
			System.out.print("What is the employee's position? (manager, regular or trainee): " );
			String fun = sc.next();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			if(fun.contentEquals("manager")) {
				Manager manager = new Manager(name, id, salary);
				enterprise.getListEmployee().add(manager);
				
			}else if(fun.contentEquals("regular")) {
				RegularEmployee regular = new RegularEmployee(name, id, salary);
				enterprise.getListEmployee().add(regular);
				
			}else {
				Trainee trainee = new Trainee(name, id, salary);
				enterprise.getListEmployee().add(trainee);
			}
			
			System.out.print("More employee to be added? (y/n) ");
			validation = sc.next().charAt(0);
		}
		
		for(Employee employee : enterprise.getListEmployee()) {
			System.out.println(employee);
		}
				
		
		sc.close();

	}
}
