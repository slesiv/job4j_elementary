package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void whenConvert560RblThen8Euro() {
        int in = 560;
        int expected = 8;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert560RblThen9Dlr() {
        int in = 560;
        int expected = 9;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}