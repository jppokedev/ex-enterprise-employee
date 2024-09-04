package model.entities;

import java.time.LocalDateTime;

public interface Worker {
	
	Double calculateAnnualBonus();
	
	LocalDateTime clockOut();
	LocalDateTime clockin();
	
}
