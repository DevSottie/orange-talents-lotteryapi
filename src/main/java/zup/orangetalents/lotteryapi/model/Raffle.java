package zup.orangetalents.lotteryapi.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Random;

@Entity
@Data
@Table(name = "raffle")
public class Raffle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime birth_date = LocalDateTime.now();

    private Integer raffle = new Random().nextInt(99999999);

}
