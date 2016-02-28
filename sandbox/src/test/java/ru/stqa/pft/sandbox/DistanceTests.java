package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.homework1.Point;


public class DistanceTests {
    @Test
    public void testDistanceCorrectFirst(){
        Point firstPoint = new Point(3, 5);
        Point secondPoint = new Point(3, 4);
        Assert.assertEquals(firstPoint.distance(secondPoint), 1.0);
    }

    @Test
    public void testDistanceCorrectSecond(){
        Point firstPoint = new Point(8, 21);
        Point secondPoint = new Point(1, -3);
        Assert.assertEquals(firstPoint.distance(secondPoint), 25.0);
    }
}
