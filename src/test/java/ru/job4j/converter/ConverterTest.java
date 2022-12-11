package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConverte140rubleThen2Euro() {
        float in = 140;
        float expected = 2;
        float eps = 0.0001f;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected,out,eps);
    }

    @Test
    public void whenConverte180rubleThen3Dollar() {
        float in = 180;
        float expected = 3;
        float eps = 0.0001f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected,out,eps);
    }
}