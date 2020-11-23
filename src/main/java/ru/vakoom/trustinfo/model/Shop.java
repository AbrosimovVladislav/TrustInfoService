package ru.vakoom.trustinfo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static ru.vakoom.trustinfo.model.Shop.SHOP_TABLE;

@Data
@Entity
@Table(name = SHOP_TABLE)
public class Shop {
    public static final String SHOP_TABLE = "shop";

    @Id
    @Column(length = 8, nullable = false)
    private Long shopId;
    @Column(nullable = false)
    private String name;
    @Column(unique = true)
    private String website;
    @Column(length = 2000)
    private String shopInfo;
}
