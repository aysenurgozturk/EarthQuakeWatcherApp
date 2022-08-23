package com.example.earthquakewatcherapp.Util;

import java.util.Random;

public class Constants {
    public static final String URL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_week.geojson";
    public static final int LIMIT = 50;
    public static final String YOUR_API_KEY = "AIzaSyA62vVhqtC-bVCyLBe6s-8fQ3TAbQaorBw";

    public static int randomInt(int max, int min) {
        return new Random().nextInt(max - min) + min;

    }
}
