package zup.orangetalents.lotteryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zup.orangetalents.lotteryapi.model.Raffle;

public interface RaffleRepository extends JpaRepository<Raffle, Long> {
}
