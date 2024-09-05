package com.example;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class FormValidatorTest {

    private FormValidator formValidator;

    @Before
    public void setUp() {
        formValidator = new FormValidator();
        // Configura o campo `thisProperty` diretamente
        ReflectionTestUtils.setField(formValidator, "thisProperty", "testValue");
    }

    @Test
    public void testValidateWithValue() {
        assertTrue(formValidator.validate());
    }

    @Test
    public void testValidateWithEmptyValue() {
        ReflectionTestUtils.setField(formValidator, "thisProperty", "");
        assertFalse(formValidator.validate());
    }
}
