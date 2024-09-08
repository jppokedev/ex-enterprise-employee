package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {
	
	private Double manager = 0.0;
	private Double regular = 0.0;
	
	private List<Employee> listEmployee = new ArrayList<>();
	
	public Double getManager() {
			return manager;
		}

	public Double getRegular() {
			return regular;
		}
	
	public List<Employee> getListEmployee() {
		return listEmployee;
	}
	
	public void annualCalculation() {
		for(Employee obj : getListEmployee()) {
			if(obj instanceof Manager) { // o instanceof faz comparação de " classes "
				Manager manager = (Manager) obj; // aqui esta acontecendo um casting pois manager é uma instancia de employee
				Double cal = manager.calculateAnnualBonus();
				this.manager += cal + manager.getSalary();
			}else if (obj instanceof RegularEmployee){
				RegularEmployee regular = (RegularEmployee) obj;
				Double cal = regular.calculateAnnualBonus();
				this.regular += cal + regular.getSalary();
			}
		}		
	}
}
