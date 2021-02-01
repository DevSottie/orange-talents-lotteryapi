package zup.orangetalents.lotteryapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import zup.orangetalents.lotteryapi.dto.request.RaffleDTO;
import zup.orangetalents.lotteryapi.model.Raffle;

@Mapper
public interface RaffleMapperInterface {
    RaffleMapperInterface INSTANCE = Mappers.getMapper(RaffleMapperInterface.class);

    Raffle toModel(RaffleDTO raffleDTO);

    RaffleDTO toDTO(Raffle raffle);
}
