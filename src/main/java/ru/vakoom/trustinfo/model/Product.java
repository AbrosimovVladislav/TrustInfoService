package ru.vakoom.trustinfo.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Accessors(chain = true)
@Table(name = Product.PRODUCT_TABLE)
public class Product {
    public static final String PRODUCT_TABLE = "product";

    @Id
    @Column(length = 8, nullable = false)
    private Long productId;
    private String model;
    private Long brandId;
    private Long typeId;
    private String age;
    @Column(length = 4095)
    private String description;
    private String characteristics;
    private String link;
    private String imageLink;
}
