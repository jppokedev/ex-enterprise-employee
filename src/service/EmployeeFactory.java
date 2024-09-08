package service;

import java.util.Scanner;

import model.entities.Employee;
import model.entities.EmployeeException;
import model.entities.EmployeeType;
import model.entities.Manager;
import model.entities.RegularEmployee;
import model.entities.Trainee;

public class EmployeeFactory {
	
	Scanner sc = new Scanner(System.in);
	
	public static void validation(String fun) {
		try {
			EmployeeType.valueOf(fun.toUpperCase()); // Converte a string para o valor enum correspondente
		}catch (IllegalArgumentException e) {
			throw new EmployeeException("Non-existent employee level!");
		}
	}
	
	public static Employee createEmployee(String fun, String name, Integer id, Double salary) {
		if(fun.contentEquals("manager")) {
			return new Manager(name, id, salary);
		}else if(fun.contentEquals("regular")) {
			return new RegularEmployee(name, id, salary);
		}else if (fun.contentEquals("trainee")){
			return new Trainee(name, id, salary);
		}else {
			throw new EmployeeException("Non-existent employee level! ") ;
		}
	}
	
}
