package ru.vakoom.trustinfo.service.mapper;

import org.springframework.stereotype.Component;
import ru.vakoom.trustinfo.model.MatcherOffer;

@Component
public class MatcherOfferMapper {

    public MatcherOffer map(ru.vakoom.trustinfo.model.dto.matcher.MatcherOffer matcherOfferDto) {
        return new MatcherOffer()
                .setId(matcherOfferDto.getId())
                .setAge(matcherOfferDto.getAge())
                .setBrand(matcherOfferDto.getBrand())
                .setLink(matcherOfferDto.getLink())
                .setName(matcherOfferDto.getName())
                .setProductId(matcherOfferDto.getProductId())
                .setShop(matcherOfferDto.getShop())
                .setTypeId(matcherOfferDto.getType().getTypeId());
    }

}
