package telran.probes.dto;

import static telran.probes.messages.ErrorMessages.*;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record SensorEmails(@Min(value = 1, message = WRONG_SENSOR_ID) long id, 
		@NotNull(message = MISSING_EMAILS) String[] emails) {

}
