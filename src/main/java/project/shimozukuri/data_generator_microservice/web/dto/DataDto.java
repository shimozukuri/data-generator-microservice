package project.shimozukuri.data_generator_microservice.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.shimozukuri.data_generator_microservice.model.Data;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
public class DataDto {

    private Long sensorId;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime timestamp;

    private double measurement;
    private Data.MeasurementType measurementType;
}
