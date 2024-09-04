package model.entities;

import java.time.LocalDateTime;

public class RegularEmployee extends Employee implements Worker {
	
	public RegularEmployee (String name, Integer id, Double salary) {
		super(name, id, salary);
	}

	@Override
	public LocalDateTime clockOut() {
		return null;
	}

	@Override
	public LocalDateTime clockin() {
		return null;
	}

	@Override
	public Double calculateAnnualBonus() {
		return super.getSalary() * 0.1;
	}

}
