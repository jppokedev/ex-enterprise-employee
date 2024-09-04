package model.entities;

import java.time.LocalDateTime;

public class Trainee extends Employee implements Worker {
	
	public Trainee (String name, Integer id, Double salary) {
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
		return null;
	}

}
