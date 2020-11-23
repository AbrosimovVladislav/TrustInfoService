package ru.vakoom.trustinfo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static ru.vakoom.trustinfo.model.KeyPath.KEY_PATH_TABLE;

@Data
@Entity
@Table(name = KEY_PATH_TABLE)
public class KeyPath {
    public static final String KEY_PATH_TABLE = "keyPath";

    @Id
    @Column(length = 8, nullable = false)
    private Long keyPathId;
    private String source;
    private String targetEntity;
    private String targetParam;
    @Column(unique = true)
    private String value;
}
