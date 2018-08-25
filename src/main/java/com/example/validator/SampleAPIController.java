package com.example.validator;


import com.example.validator.validator.IdValidator;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Validated
public class SampleAPIController {


    @PostMapping(value = "/test")
    public int test(@RequestBody  @Validated SampleRequestBody requestBody){
        return requestBody.getId();
    }
}
