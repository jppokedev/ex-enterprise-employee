package model.entities;

import java.time.LocalDateTime;

public interface Worker {
	
	LocalDateTime clockOut();
	LocalDateTime clockin();
	
}
