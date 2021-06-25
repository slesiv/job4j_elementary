package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    int in = 560;
    int expectedEuro = 8;
    int expectedDollar = 9;

    @Test
    public void whenConvert560RblThen8Euro() {
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expectedEuro, out);
    }

    @Test
    public void whenConvert560RblThen9Dlr() {
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expectedDollar, out);
    }
}