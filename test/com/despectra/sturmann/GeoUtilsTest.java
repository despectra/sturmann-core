package com.despectra.sturmann;

import junit.framework.TestCase;
import org.junit.Test;

public class GeoUtilsTest extends TestCase {

    @Test
    public void testDistance() throws Exception {
        Location ny = new Location(0.710163, 1.291063, 0);
        Location tura = new Location(1.121387, 1.748224, 0);
        assertEquals(8334.92, GeoUtils.distance(ny, tura), 0.01);
    }
}