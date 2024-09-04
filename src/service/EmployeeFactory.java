package service;

import model.entities.Employee;
import model.entities.Manager;
import model.entities.RegularEmployee;
import model.entities.Trainee;

public class EmployeeFactory {
	
	public static Employee createEmployee(String fun, String name, Integer id, Double Salary) {
		if(fun.contentEquals("manager")) {
			return new Manager(name, id, Salary);
		}else if(fun.contentEquals("regular")) {
			return new RegularEmployee(name, id, Salary);
		}else {
			return new Trainee(name, id, Salary);
		}
	}
	
}
