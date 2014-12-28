package com.despectra.sturmann;

import junit.framework.TestCase;
import org.junit.Test;

public class GeoUtilsTest extends TestCase {

    @Test
    public void testDistanceFarDeg() throws Exception {
        Location from = Location.byDegrees(56.738178, 60.547328, 0);
        Location to = Location.byDegrees(40.758647, -73.900571, 0);
        double actualDistance = GeoUtils.distance(from, to);
        assertEquals(8364.83, actualDistance, actualDistance / 1000);
    }

    @Test
    public void testDistanceCloseDeg() throws Exception {
        Location from = Location.byDegrees(56.738178, 60.547328, 0);
        Location to = Location.byDegrees(55.184109, 61.386611, 0);
        double actualDistance = GeoUtils.distance(from, to);
        assertEquals(180.52, actualDistance, actualDistance / 1000);
    }

    @Test
     public void testDistanceVeryCloseDeg() throws Exception {
        Location from = Location.byDegrees(56.738178, 60.547328, 0);
        Location to = Location.byDegrees(56.739902, 60.545168, 0);
        double actualDistance = GeoUtils.distance(from, to);
        assertEquals(0.23253, actualDistance, actualDistance / 1000);
    }

    @Test
    public void testDistanceVeryVeryCloseDeg() throws Exception {
        Location from = Location.byDegrees(56.738178, 60.547328, 0);
        Location to = Location.byDegrees(56.738335, 60.547399, 0);
        double actualDistance = GeoUtils.distance(from, to);
        assertEquals(0.01798, actualDistance, actualDistance / 1000);
    }

    @Test
    public void testAngleTooSmall() throws Exception {
        Location before = Location.byDegrees(47.897390, 41.280182, 0);
        Location current = Location.byDegrees(58.236847, 41.455963, 0);
        Location after = Location.byDegrees(47.897159, 41.341547, 0);
        double angle = GeoUtils.angleBy3Locations(before, current, after);
        assertEquals(1, angle, 1);
    }

    @Test
    public void testAngle90Deg() throws Exception {
        Location before = Location.byDegrees(47.897390, 41.280182, 0);
        Location current = Location.byDegrees(58.236847, 41.455963, 0);
        Location after = Location.byDegrees(58.230548, 42.746439, 0);
        double angle = GeoUtils.angleBy3Locations(before, current, after);
        assertEquals(90, angle, 1);
    }

    @Test
    public void testAngleSmallDist() throws Exception {
        Location before = Location.byDegrees(58.217066, 41.647407, 0);
        Location current = Location.byDegrees(58.219077, 41.651784, 0);
        Location after = Location.byDegrees(58.219360, 41.652385, 0);
        double angle = GeoUtils.angleBy3Locations(before, current, after);
        assertEquals(180, angle, 2);
    }

}