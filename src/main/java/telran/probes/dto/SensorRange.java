package telran.probes.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import static telran.probes.messages.ErrorMessages.*;

public record SensorRange(@Min(value = 1, message = WRONG_SENSOR_ID) long id, 
		@NotNull(message = MISSING_RANGE) Range range) {

}
