package zup.orangetalents.lotteryapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private Long id;

    @NotEmpty
    @Email
    private String email;

    @Valid
    private List<RaffleDTO> raffles;
}
