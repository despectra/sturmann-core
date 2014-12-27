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

}