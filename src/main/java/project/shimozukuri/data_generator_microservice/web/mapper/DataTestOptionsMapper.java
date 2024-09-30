package project.shimozukuri.data_generator_microservice.web.mapper;

import org.mapstruct.Mapper;
import project.shimozukuri.data_generator_microservice.model.test.DataTestOptions;
import project.shimozukuri.data_generator_microservice.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
