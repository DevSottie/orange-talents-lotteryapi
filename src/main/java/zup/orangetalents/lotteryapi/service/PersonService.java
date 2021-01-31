package zup.orangetalents.lotteryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import zup.orangetalents.lotteryapi.dto.response.MessageResponseDTO;
import zup.orangetalents.lotteryapi.model.Person;
import zup.orangetalents.lotteryapi.repository.PersonRepository;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Successful to create")
                .build();
    }
}
