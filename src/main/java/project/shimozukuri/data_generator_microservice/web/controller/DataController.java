package project.shimozukuri.data_generator_microservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.shimozukuri.data_generator_microservice.model.Data;
import project.shimozukuri.data_generator_microservice.service.KafkaDataService;
import project.shimozukuri.data_generator_microservice.web.dto.DataDto;
import project.shimozukuri.data_generator_microservice.web.dto.DataTestOptionsDto;
import project.shimozukuri.data_generator_microservice.web.mapper.DataMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {

    }
}
