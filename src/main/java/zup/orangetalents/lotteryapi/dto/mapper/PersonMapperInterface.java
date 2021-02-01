package zup.orangetalents.lotteryapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import zup.orangetalents.lotteryapi.dto.request.PersonDTO;
import zup.orangetalents.lotteryapi.model.Person;

@Mapper
public interface PersonMapperInterface {
    PersonMapperInterface INSTANCE = Mappers.getMapper(PersonMapperInterface.class);

    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
