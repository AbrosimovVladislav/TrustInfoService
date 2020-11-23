package ru.vakoom.trustinfo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static ru.vakoom.trustinfo.model.Brand.BRAND_TABLE;

@Data
@Entity
@Table(name = BRAND_TABLE)
public class Brand {
    public static final String BRAND_TABLE = "brand";

    @Id
    @Column(length = 8, nullable = false)
    private Long brandId;
    private String shortName;
    private String fullName;
}
