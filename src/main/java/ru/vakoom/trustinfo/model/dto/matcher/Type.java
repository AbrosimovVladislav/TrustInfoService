package ru.vakoom.trustinfo.model.dto.matcher;

import lombok.Data;

@Data
public class Type {
    private Long typeId;
    private String upper;
    private String medium;
    private String lower;
    private String showName;
}
