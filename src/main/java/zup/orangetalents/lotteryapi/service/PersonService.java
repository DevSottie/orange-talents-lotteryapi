package zup.orangetalents.lotteryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zup.orangetalents.lotteryapi.dto.mapper.PersonMapperInterface;
import zup.orangetalents.lotteryapi.dto.request.PersonDTO;
import zup.orangetalents.lotteryapi.dto.response.MessageResponseDTO;
import zup.orangetalents.lotteryapi.model.Person;
import zup.orangetalents.lotteryapi.repository.personrepositoryInterface;

@Service
public class PersonService {

    private personrepositoryInterface personrepositoryInterface;

    private final PersonMapperInterface personMapperInterface = PersonMapperInterface.INSTANCE;

    @Autowired
    public PersonService(personrepositoryInterface personrepositoryInterface) {
        this.personrepositoryInterface = personrepositoryInterface;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {

        Person personToSave = personMapperInterface.toModel(personDTO);

        Person savedPerson = personrepositoryInterface.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Successful to create")
                .build();
    }
}
