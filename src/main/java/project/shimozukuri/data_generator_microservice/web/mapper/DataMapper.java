package project.shimozukuri.data_generator_microservice.web.mapper;

import org.mapstruct.Mapper;
import project.shimozukuri.data_generator_microservice.model.Data;
import project.shimozukuri.data_generator_microservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
