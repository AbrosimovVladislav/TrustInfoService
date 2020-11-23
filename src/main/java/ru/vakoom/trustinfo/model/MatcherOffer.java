package ru.vakoom.trustinfo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static ru.vakoom.trustinfo.model.MatcherOffer.MATCHER_OFFER_TABLE;


@Data
@Entity
@Accessors(chain = true)
@Table(name = MATCHER_OFFER_TABLE)
public class MatcherOffer {
    public static final String MATCHER_OFFER_TABLE = "matcherOffer";

    @Id
    @Column(length = 8, nullable = false)
    private Long id;
    private String name;
    private Long productId;
    private String shop;
    private String brand;
    private String age;
    private String link;
    private Long typeId;
}
