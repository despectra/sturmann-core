package com.despectra.sturmann;

import static java.lang.Math.*;

/**
 * Created by Андрей on 27.12.2014.
 */
public class GeoUtils {

    public static final double EARTH_RADIUS_KM = 6372.795;

    public static double distance(Location from, Location to) {
        double sinLat1 = sin(from.latitude);
        double sinLat2 = sin(to.latitude);
        double cosLat1 = cos(from.latitude);
        double cosLat2 = cos(to.latitude);
        double sinLongDelta = sin(to.longitude - from.longitude);
        double cosLongDelta = cos(to.longitude - from.longitude);

        double numerator = sqrt(pow(cosLat2 * sinLongDelta, 2) + pow(cosLat1 * sinLat2 - sinLat1 * cosLat2 * cosLongDelta, 2));
        double denominator = sinLat1*sinLat2 + cosLat1*cosLat2*cosLongDelta;
        double d = atan2(numerator, denominator);
        return d * EARTH_RADIUS_KM;
    }
}
