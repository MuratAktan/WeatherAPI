package com.murat.weather.controller.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class CityNameValidator implements ConstraintValidator<CityNameValidation, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        value = value.replaceAll("[^A-Za-z0-9]","");
        return value.length() > 2 && !StringUtils.isAllBlank(value) && !StringUtils.isNumeric(value);
    }
}
