package com.example.validator;

import com.example.validator.validator.IdValidator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class SampleRequestBody implements Serializable {
    @IdValidator
    private String id;
}
