package zup.orangetalents.lotteryapi.service;

import zup.orangetalents.lotteryapi.model.Person;
import zup.orangetalents.lotteryapi.model.Raffle;

import java.util.List;

public interface PersonServiceInterface {
    List<Raffle> findAll();
    Raffle findByEmail(String email);

    Person save(Person person);
    Raffle save(Raffle raffle);
}
