package ru.vakoom.trustinfo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = Type.TYPE_TABLE)
public class Type {
    public static final String TYPE_TABLE = "type";

    @Id
    @Column(length = 8, nullable = false)
    private Long typeId;
    private String upper;
    private String medium;
    private String lower;
    private String showName;
}
