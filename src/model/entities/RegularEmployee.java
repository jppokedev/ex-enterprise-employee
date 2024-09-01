package model.entities;

import java.time.LocalDateTime;

public class RegularEmployee extends Employee {
	
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

}
