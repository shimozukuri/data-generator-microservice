package project.shimozukuri.data_generator_microservice.service;

import project.shimozukuri.data_generator_microservice.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessage(DataTestOptions testOptions);
}
