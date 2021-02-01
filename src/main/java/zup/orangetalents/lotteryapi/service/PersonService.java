package zup.orangetalents.lotteryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zup.orangetalents.lotteryapi.dto.mapper.PersonMapperInterface;
import zup.orangetalents.lotteryapi.dto.request.PersonDTO;
import zup.orangetalents.lotteryapi.dto.response.MessageResponseDTO;
import zup.orangetalents.lotteryapi.model.Person;
import zup.orangetalents.lotteryapi.repository.PersonRepositoryInterface;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private PersonRepositoryInterface personrepositoryInterface;

    private final PersonMapperInterface personMapperInterface = PersonMapperInterface.INSTANCE;

    @Autowired
    public PersonService(PersonRepositoryInterface personreositoryInterface) {
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

//    Teoricamente essa classe listaria todos os usuarios, mas n estou conseguindo fazer ela funcionar. vou seguir com o projeto
    /*public List<PersonDTO> listAll(){//salva em uma lista todos os usuarios cadastrados
        List<Person> allPeople = personrepositoryInterface.findAll();
        System.out.println(allPeople.stream()
                .map(personMapperInterface::toDTO)
                .collect(Collectors.toList()));
        return null;
    }*/
}
