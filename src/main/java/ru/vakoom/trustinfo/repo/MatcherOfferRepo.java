package ru.vakoom.trustinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vakoom.trustinfo.model.MatcherOffer;

@Repository
public interface MatcherOfferRepo extends JpaRepository<MatcherOffer, Long> {
}
