package ru.vakoom.trustinfo.model.dto.aggregator;

import lombok.Data;

@Data
public class Product {
    private Long productId;
    private String model;
    private Brand brand;
    private Type type;
    private Age age;
    private String description;
    private String characteristics;
    private String link;
    private String srcImageLink;
    private String imageLink;
}
