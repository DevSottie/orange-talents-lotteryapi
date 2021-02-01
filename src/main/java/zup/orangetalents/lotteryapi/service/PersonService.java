package zup.orangetalents.lotteryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zup.orangetalents.lotteryapi.dto.mapper.PersonMapperInterface;
import zup.orangetalents.lotteryapi.dto.request.PersonDTO;
import zup.orangetalents.lotteryapi.dto.response.MessageResponseDTO;
import zup.orangetalents.lotteryapi.model.Person;
import zup.orangetalents.lotteryapi.repository.personrepositoryInterface;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<PersonDTO> listAll(){//salva em uma lista todos os usuarios cadastrados
        List<Person> allpeople = personrepositoryInterface.findAll();
        return allpeople.stream()
                .map(personMapperInterface::toDTO)
                .collect(Collectors.toList());
    }
}
