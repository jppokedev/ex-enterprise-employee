package model.entities;

import java.time.LocalDateTime;

public class Manager extends Employee{
	
	public Manager(String name, Integer id, Double salary) {
		super(name, id, salary);
	}

	@Override
	public LocalDateTime clockin() {
		return null;
	}

	@Override
	public LocalDateTime clockOut() {
		return null;
	}

}
