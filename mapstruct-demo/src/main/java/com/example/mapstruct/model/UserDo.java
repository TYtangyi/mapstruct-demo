package com.example.mapstruct.model;

import lombok.Data;

import java.util.List;

@Data
public class UserDo {

    private Long id;

    private String name;

    private String email;

    private String password;

    private String phone;

    private String specialty;

    private Integer age;

    private List<ClassDo> classDos;
}
