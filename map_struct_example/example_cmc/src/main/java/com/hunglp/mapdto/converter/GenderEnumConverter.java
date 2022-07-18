package com.hunglp.mapdto.converter;

import com.hunglp.mapdto.entity.Gender;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Converter
public class GenderEnumConverter implements AttributeConverter<Gender,String> {
    @Override
    public String convertToDatabaseColumn(Gender attribute) {
        return attribute.getValue();
    }

    @Override
    public Gender convertToEntityAttribute(String dbData) {
        return Gender.of(dbData);
    }
}
