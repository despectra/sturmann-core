package com.despectra.sturmann;

import static java.lang.Math.*;

/**
 * Created by Андрей on 27.12.2014.
 */
public class GeoUtils {

    public static final double EARTH_RADIUS_KM = 6372.795;

    public static double distance(Location from, Location to) {
        return centralAngle(from, to) * EARTH_RADIUS_KM;
    }

    public static double angleBy3Locations(Location before, Location current, Location after) {
        double a = centralAngle(after, before);
        double b = centralAngle(current, after);
        double c = centralAngle(before, current);
        double radians = acos((cos(a) - cos(b) * cos(c)) / (sin(b) * sin(c)));
        return (radians / PI) * 180;
    }

    private static double centralAngle(Location from, Location to) {
        double sinLat1 = sin(from.latitude);
        double sinLat2 = sin(to.latitude);
        double cosLat1 = cos(from.latitude);
        double cosLat2 = cos(to.latitude);
        double sinLongDelta = sin(to.longitude - from.longitude);
        double cosLongDelta = cos(to.longitude - from.longitude);

        double numerator = sqrt(pow(cosLat2 * sinLongDelta, 2) + pow(cosLat1 * sinLat2 - sinLat1 * cosLat2 * cosLongDelta, 2));
        double denominator = sinLat1*sinLat2 + cosLat1*cosLat2*cosLongDelta;
        return atan2(numerator, denominator);
    }
}
