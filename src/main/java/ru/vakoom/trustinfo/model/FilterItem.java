package ru.vakoom.trustinfo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static ru.vakoom.trustinfo.model.FilterItem.FILTER_ITEM_TABLE;

@Data
@Entity
@Table(name = FILTER_ITEM_TABLE)
public class FilterItem {
    public static final String FILTER_ITEM_TABLE = "filterItem";

    @Id
    @Column(length = 8, nullable = false)
    private Long filterItemId;
    private String name;
    private Long keyPathId;
    private String type;
    private String menuItem;
    private int rank;
}
