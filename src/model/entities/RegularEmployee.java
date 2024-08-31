package model.entities;

import java.time.LocalDateTime;

public class RegularEmployee extends Employee {

	@Override
	public LocalDateTime clockOut() {
		return null;
	}

	@Override
	public LocalDateTime clockin() {
		return null;
	}

}
