package com.example.mapstruct.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClassDo {

    private Long id;

    private Integer age;

    private LocalDate startTime;
}
