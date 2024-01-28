package com.example.mapstruct.service;

import com.example.mapstruct.model.ClassDto;
import com.example.mapstruct.model.UserDo;
import com.example.mapstruct.model.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ClassMapper.class})
public interface UserMapper {

    UserMapper Instance = Mappers.getMapper(UserMapper.class);

    //基本映射与不同字段之间映射
    @Mapping(source = "userDto.specialization", target = "specialty")
    UserDo userDtoToUserDo(UserDto userDto);

    //多个类之间映射
    @Mapping(source = "userDto.specialization", target = "specialty")
    @Mapping(source = "userDto.id", target = "id")
    UserDo toUserDo(UserDto userDto, ClassDto classDto);

    //子对象映射
    @Mapping(source = "userDto.specialization", target = "specialty")
    @Mapping(source = "userDto.classDtos", target = "classDos")
    UserDo toUserDo(UserDto userDto);

    //更新实例
    @Mapping(source = "userDto.specialization", target = "specialty")
    @Mapping(source = "userDto.classDtos", target = "classDos")
    //@InheritConfiguration
    void updateDo(UserDto userDto, @MappingTarget UserDo userDo);


}
