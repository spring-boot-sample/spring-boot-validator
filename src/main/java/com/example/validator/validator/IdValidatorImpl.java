package com.example.validator.validator;


import org.omg.CORBA.portable.ApplicationException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class IdValidatorImpl implements ConstraintValidator<IdValidator,Integer > {

    private int min;

    private int max;

    @Override
    public void initialize(IdValidator constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if(value < min || value > max){
            return false;
        }
        return true;
    }
}
