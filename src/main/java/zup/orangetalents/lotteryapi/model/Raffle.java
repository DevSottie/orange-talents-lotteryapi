package zup.orangetalents.lotteryapi.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "raffle")
public class Raffle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime birth_date;

    private Integer raffle;

}
