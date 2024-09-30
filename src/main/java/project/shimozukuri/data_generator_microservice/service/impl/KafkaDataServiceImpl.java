package project.shimozukuri.data_generator_microservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.shimozukuri.data_generator_microservice.model.Data;
import project.shimozukuri.data_generator_microservice.service.KafkaDataService;
import reactor.core.publisher.Mono;
import reactor.kafka.sender.KafkaSender;
import reactor.kafka.sender.SenderRecord;

@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {

    private final KafkaSender<String, Object> sender;

    @Override
    public void send(Data data) {
        String topic = switch (data.getMeasurementType()) {
            case TEMPERATURE -> "data-tamperature";
            case VOLTAGE -> "data-voltage";
            case POWER -> "data-power";
        };

        sender.send(
                Mono.just(
                        SenderRecord.create(
                                topic,
                                0,
                                System.currentTimeMillis(),
                                String.valueOf(data.hashCode()),
                                data,
                                null
                        )
                )
        ).subscribe();
    }
}
