package model.entities;

import java.time.LocalDateTime;

public class Manager extends Employee implements Worker{
	
	public Manager(String name, Integer id, Double salary) {
		super(name, id, salary);
	}

	public Manager() {
	}

	@Override
	public LocalDateTime clockin() {
		return null;
	}

	@Override
	public LocalDateTime clockOut() {
		return null;
	}

	@Override
	public Double calculateAnnualBonus() {
		return super.getSalary() * 0.2;
	}

}
