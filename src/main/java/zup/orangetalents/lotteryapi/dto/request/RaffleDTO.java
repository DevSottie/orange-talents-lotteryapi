package zup.orangetalents.lotteryapi.dto.request;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Random;

@Data
public class RaffleDTO {

    private Long id;

    private LocalDateTime birth_date = LocalDateTime.now();

    private Integer codeDraw(){
        Random raffle = new Random();
        return raffle.nextInt(99999999);
    }
}
