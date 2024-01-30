package com.example.mapstruct.service;

import com.example.mapstruct.model.ClassDo;
import com.example.mapstruct.model.ClassDto;
import com.example.mapstruct.valid.Validator;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import javax.xml.bind.ValidationException;
import java.util.List;
import java.util.Set;

@Mapper(uses = {Validator.class},componentModel = "spring")
public interface ClassMapper {

    //ClassMapper INSTANCE = Mappers.getMapper(ClassMapper.class);

    //默认值
    //@Mapping(target = "id", constant = "-1L")
    ClassDo classDtoToClassDo(ClassDto classDto) throws ValidationException;

    //数据类型转换
    @Mapping(source = "startTime", target = "startTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
    void updateDo(ClassDto classDto, @MappingTarget ClassDo classDo);

    //转换List
    List<ClassDo> toListDos(List<ClassDto> classDtos);

    //转换Set
    Set<ClassDo> toSetDos(Set<ClassDto> classDtos);
}
