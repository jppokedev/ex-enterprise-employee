package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Enterprise {
	
	private Double manager;
	private Double regular;
	
	private List<Employee> listEmployee = new ArrayList<>();
	
	public Double getManager() {
			return manager;
		}
	
	public void setManager(Double manager) {
			this.manager = manager;
		}
	
	public Double getRegular() {
			return regular;
		}
	
	public void setRegular(Double regular) {
			this.regular = regular;
		}
	
	public List<Employee> getListEmployee() {
		return listEmployee;
	}
	
	public void calculoAnual() {
		for(Employee obj : getListEmployee()) {
			if(obj instanceof Manager) { // o instanceof faz comparação de " classes "
				Manager manager = (Manager) obj; // aqui esta acontecendo um casting pois manager é uma instancia de employee
				this.manager = manager.calculateAnnualBonus();
				//Double cal = manager.calculateAnnualBonus();
				//this.manager += cal;
			}else if (obj instanceof RegularEmployee){
				RegularEmployee regular = (RegularEmployee) obj;
				this.regular = regular.calculateAnnualBonus();
				//Double cal = regular.calculateAnnualBonus();
				//this.regular += cal;
			}
		}
	}

}
