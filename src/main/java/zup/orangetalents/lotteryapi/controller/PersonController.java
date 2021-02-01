package zup.orangetalents.lotteryapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zup.orangetalents.lotteryapi.dto.request.PersonDTO;
import zup.orangetalents.lotteryapi.dto.response.MessageResponseDTO;
import zup.orangetalents.lotteryapi.exception.PersonNotFoundedException;
import zup.orangetalents.lotteryapi.service.PersonService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/lottery")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return personService.createPersonWithRaffle(personDTO);
    }

    /*@GetMapping
    public List<PersonDTO> listAll(){
        return personService.listAll();
    }*/

    @GetMapping("/{id}") //PathVariable indica que a informação está sendo passada pela requisição http
    public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundedException {
        return personService.findById(id);
    }
}
