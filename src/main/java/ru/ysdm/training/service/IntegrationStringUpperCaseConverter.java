package ru.ysdm.training.service;

public class IntegrationStringUpperCaseConverter implements Converter<String, String> {

    @Override
    public String convert(String src) {
        return src.toUpperCase();
    }

}
