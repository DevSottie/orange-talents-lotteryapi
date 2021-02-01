package zup.orangetalents.lotteryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zup.orangetalents.lotteryapi.dto.mapper.PersonMapperInterface;
import zup.orangetalents.lotteryapi.dto.request.PersonDTO;
import zup.orangetalents.lotteryapi.dto.response.MessageResponseDTO;
import zup.orangetalents.lotteryapi.exception.PersonNotFoundedException;
import zup.orangetalents.lotteryapi.model.Person;
import zup.orangetalents.lotteryapi.repository.PersonRepositoryInterface;
<<<<<<< HEAD
import zup.orangetalents.lotteryapi.repository.RaffleRepositoryInterface;

import java.util.Optional;
=======

import java.util.List;
import java.util.stream.Collectors;
>>>>>>> 5350bbfcca6550ee0f35a37c8e4c5f42b6003b09

@Service
public class PersonService {

    private PersonRepositoryInterface personrepositoryInterface;
<<<<<<< HEAD
    private RaffleRepositoryInterface raffleRepositoryInterface;
=======
>>>>>>> 5350bbfcca6550ee0f35a37c8e4c5f42b6003b09

    private final PersonMapperInterface personMapperInterface = PersonMapperInterface.INSTANCE;

    @Autowired
<<<<<<< HEAD
    public PersonService(PersonRepositoryInterface personrepositoryInterface) {
        this.personrepositoryInterface = personrepositoryInterface;
    }

    public MessageResponseDTO createPersonWithRaffle(PersonDTO personDTO) {
=======
    public PersonService(PersonRepositoryInterface personreositoryInterface) {
        this.personrepositoryInterface = personrepositoryInterface;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
>>>>>>> 5350bbfcca6550ee0f35a37c8e4c5f42b6003b09

        Person personToSave = personMapperInterface.toModel(personDTO);

        Person savedPerson = personrepositoryInterface.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Successful to create")
                .build();
    }

<<<<<<< HEAD
    public PersonDTO findById(Long id) throws PersonNotFoundedException {
        Optional<Person> optionalPerson = personrepositoryInterface.findById(id);
        if (optionalPerson.isEmpty()){
            throw new PersonNotFoundedException(id);
        }
        return personMapperInterface.toDTO(optionalPerson.get());
    }

=======
>>>>>>> 5350bbfcca6550ee0f35a37c8e4c5f42b6003b09
//    Teoricamente essa classe listaria todos os usuarios, mas n estou conseguindo fazer ela funcionar. vou seguir com o projeto
    /*public List<PersonDTO> listAll(){//salva em uma lista todos os usuarios cadastrados
        List<Person> allPeople = personrepositoryInterface.findAll();
        System.out.println(allPeople.stream()
                .map(personMapperInterface::toDTO)
                .collect(Collectors.toList()));
        return null;
    }*/
<<<<<<< HEAD
/*    public List<RaffleDTO> listRaffles(){
        List<Raffle> allRafle = raffleRepositoryInterface.findAll();
        return allRafle.stream()
                .map(raffleMapperInterface::toDTO)
                .collect(Collectors.toList());
    }*/
=======
>>>>>>> 5350bbfcca6550ee0f35a37c8e4c5f42b6003b09
}
