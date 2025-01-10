package telran.probes.dto;

import static telran.probes.messages.ErrorMessages.WRONG_SENSOR_ID;

import jakarta.validation.constraints.Min;

public record SensorUpdateData(@Min(value = 1, message = WRONG_SENSOR_ID) long id, Range range, String[] emails) {

}
