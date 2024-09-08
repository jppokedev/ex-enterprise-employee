package model.entities;

import java.time.LocalTime;

public class Manager extends Employee implements Worker {

	public Manager(String name, Integer id, Double salary) {
		super(name, id, salary);
	}

	public Manager() {
	}

	@Override
	public Double calculateAnnualBonus() {
		return super.getSalary() * 0.2;
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
