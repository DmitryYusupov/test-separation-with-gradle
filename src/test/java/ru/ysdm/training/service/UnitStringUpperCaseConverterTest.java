package ru.ysdm.training.service;

import org.junit.Test;
import ru.ysdm.training.service.UnitStringUpperCaseConverter;

import static org.junit.Assert.assertEquals;

public class UnitStringUpperCaseConverterTest {

    @Test
    public void testConversion() {
        UnitStringUpperCaseConverter converter = new UnitStringUpperCaseConverter();
        String conversionResult = converter.convert("test");

        assertEquals("TEST", conversionResult);
    }
}
