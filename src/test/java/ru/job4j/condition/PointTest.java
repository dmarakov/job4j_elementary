package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double expected = 2;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to20then0() {
        Point point1 = new Point(2, 0);
        Point point2 = new Point(2, 0);
        double expected = 0;
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when246to000then4Dot47() {
        Point point1 = new Point(2, 4, 6);
        Point point2 = new Point(0, 0, 0);
        double expected = 7.48;
        double out = point1.distance3d(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

}