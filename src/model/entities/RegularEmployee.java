package model.entities;

import java.time.LocalTime;

public class RegularEmployee extends Employee implements Worker {
	
	public RegularEmployee (String name, Integer id, Double salary) {
		super(name, id, salary);
	}

	@Override
	public Double calculateAnnualBonus() {
		return super.getSalary() * 0.1;
	}

	@Override
	public LocalTime clockOut(LocalTime clockOut) {
		return clockOut;
	}

	@Override
	public LocalTime clockIn(LocalTime clockIn) {
		return clockIn;
	}

}
