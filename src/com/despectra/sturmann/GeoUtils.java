package com.despectra.sturmann;

/**
 * Created by Андрей on 27.12.2014.
 */
public class GeoUtils {

    public static final double EARTH_RADIUS_KM = 6371;

    public static double distance(Location from, Location to) {
        double d = Math.acos(Math.sin(from.latitude) * Math.sin(to.latitude) + Math.cos(from.latitude) * Math.cos(to.latitude) * Math.cos(from.longitude + to.longitude));
        return d * EARTH_RADIUS_KM;
    }
}
