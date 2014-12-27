package com.despectra.sturmann;

/**
 * Created by Андрей on 27.12.2014.
 */
public class Location {
    public double latitude;
    public double longitude;
    public double altitude;

    private Location(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public static Location byDegrees(double latitude, double longitude, double altitude) {
        return byRadians(Math.PI * latitude / 180, Math.PI * longitude / 180, altitude);
    }

    public static Location byRadians(double latitude, double longitude, double altitude) {
        return new Location(latitude, longitude, altitude);
    }
}
