package com.example.mapstruct.valid;

import org.springframework.stereotype.Component;
import sun.security.validator.ValidatorException;

import javax.xml.bind.ValidationException;

/**
 * @author TY
 * @ClassName Validator.java
 * @Description TODO
 * @createTime 2024年01月30日 11:32:00
 */
@Component
public class Validator {

    public Long validateId(Long id) throws ValidationException {
        if(id == -1L){
            throw new ValidationException("Invalid value in ID");
        }
        return id;
    }
}
