package com.example.mapstruct.service;

import com.example.mapstruct.model.ClassDo;
import com.example.mapstruct.model.ClassDto;
import com.example.mapstruct.model.UserDo;
import com.example.mapstruct.model.UserDto;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class UserMapperTest {

    @Resource
    private ClassMapper classMapper;

    @Test
    void userDtoToUserDo() {

        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setName("张三");
        userDto.setEmail("");
        userDto.setSpecialization("test");
        UserDo userDo = UserMapper.Instance.userDtoToUserDo(userDto);
        System.out.println(userDo);
    }

    @Test
    void toUserDo() {

        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setName("张三");
        userDto.setEmail("");
        userDto.setSpecialization("test");
        ClassDto classDto = new ClassDto();
        classDto.setId(2L);
        classDto.setAge(18);
        UserDo userDo = UserMapper.Instance.toUserDo(userDto, classDto);
        System.out.println(userDo);
    }

    @Test
    void toUserDoList() {

        UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setName("张三");
        userDto.setEmail("");
        userDto.setSpecialization("test");
        ClassDto classDto = new ClassDto();
        classDto.setId(2L);
        classDto.setAge(18);
        classDto.setStartTime("2024-01-27");
        List<ClassDto> classDtoList = Lists.newArrayList(classDto);
        userDto.setClassDtos(classDtoList);
        UserDo userDo = UserMapper.Instance.toUserDo(userDto);
        System.out.println(userDo);
    }

    @Test
    void toClassDos() {
        ClassDto classDto = new ClassDto();
        classDto.setId(2L);
        classDto.setAge(18);
        classDto.setStartTime("2024-01-27");
        ClassDo classDo = classMapper.classDtoToClassDo(classDto);
        System.out.println(classDo);
    }
}