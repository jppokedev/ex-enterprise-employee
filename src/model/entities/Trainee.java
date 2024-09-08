package model.entities;

import java.time.LocalTime;

public class Trainee extends Employee implements Worker {
	
	public Trainee (String name, Integer id, Double salary) {
		super(name, id, salary);
	}

	@Override
	public Double calculateAnnualBonus() {
		return null;
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
