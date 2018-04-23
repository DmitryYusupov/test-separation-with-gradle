package ru.ysdm.training.service;


public interface Converter<From, To> {
    To convert(From src);
}
