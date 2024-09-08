package model.entities;

import java.time.LocalTime;

public interface Worker {
	
	Double calculateAnnualBonus();
	
	LocalTime clockOut(LocalTime clockOut);
	LocalTime clockIn(LocalTime clockIn);

	
}
