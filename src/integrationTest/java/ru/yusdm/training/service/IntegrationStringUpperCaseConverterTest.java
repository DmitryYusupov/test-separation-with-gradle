package ru.yusdm.training.service;

import org.junit.Test;
import ru.ysdm.training.service.IntegrationStringUpperCaseConverter;


import static org.junit.Assert.assertEquals;

public class IntegrationStringUpperCaseConverterTest {

    @Test
    public void testConversion() {
        IntegrationStringUpperCaseConverter converter = new IntegrationStringUpperCaseConverter();
        String conversionResult = converter.convert("test");

        assertEquals("TEST", conversionResult);
    }

}
