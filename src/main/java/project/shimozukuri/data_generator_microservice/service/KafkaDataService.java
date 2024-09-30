package project.shimozukuri.data_generator_microservice.service;

import project.shimozukuri.data_generator_microservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
