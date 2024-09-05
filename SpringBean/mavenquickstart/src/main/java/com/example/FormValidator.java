package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FormValidator {

    @Value("${this.property.value}")
    private String thisProperty;

    public boolean validate() {
        return thisProperty != null && !thisProperty.isEmpty();
    }
}
