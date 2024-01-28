package com.example.mapstruct.model;

import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String email;

    private String password;

    private String phone;

    private String specialization;

    private List<ClassDto> classDtos;
}
