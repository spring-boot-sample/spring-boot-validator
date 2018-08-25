package com.example.validator.validator;


import org.omg.CORBA.portable.ApplicationException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class IdValidatorImpl implements ConstraintValidator<IdValidator,String > {

    private int min;

    private int max;

    @Override
    public void initialize(IdValidator constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        final int length = value.length();
        if(length < min || length > max){
            return false;
        }
        return true;
    }
}
