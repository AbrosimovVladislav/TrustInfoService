package ru.vakoom.trustinfo.model.dto.matcher;

import lombok.Data;

@Data
public class MatcherOffer {
    private Long id;
    private String name;
    private Long productId;
    private String shop;
    private String brand;
    private String age;
    private String link;
    private Type type;
}
