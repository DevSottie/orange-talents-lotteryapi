package zup.orangetalents.lotteryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zup.orangetalents.lotteryapi.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
