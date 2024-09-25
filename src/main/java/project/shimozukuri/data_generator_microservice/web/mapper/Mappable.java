package project.shimozukuri.data_generator_microservice.web.mapper;

public interface Mappable<E, D> {

    E toEntity(D dto);

    D toDto(E entity);

}
