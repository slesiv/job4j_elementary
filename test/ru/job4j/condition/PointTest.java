package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33To30Then3() {
        int x1 = 3;
        int x2 = 3;
        int y1 = 3;
        int y2 = 0;
        double expected = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when04To00Then4() {
        int x1 = 0;
        int x2 = 4;
        int y1 = 0;
        int y2 = 0;
        double expected = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}