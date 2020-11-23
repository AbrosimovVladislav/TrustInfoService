package ru.vakoom.trustinfo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.vakoom.trustinfo.model.MatcherOffer;
import ru.vakoom.trustinfo.repo.MatcherOfferRepo;
import ru.vakoom.trustinfo.service.mapper.MatcherOfferMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MatcherOfferController {

    private final MatcherOfferRepo matcherOfferRepo;
    private final MatcherOfferMapper matcherOfferMapper;

    @GetMapping("/matcherOffer")
    public List<MatcherOffer> getAll() {
        return matcherOfferRepo.findAll();
    }

    @PostMapping("/matcherOffer")
    public MatcherOffer save(@RequestBody ru.vakoom.trustinfo.model.dto.matcher.MatcherOffer matcherOfferDto) {
        MatcherOffer matcherOffer = matcherOfferMapper.map(matcherOfferDto);
        return matcherOfferRepo.save(matcherOffer);
    }

}
