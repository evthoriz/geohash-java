package me.evthoriz;

import me.evthoriz.util.GPSHelper;

/**
 * Created by evtHoriz on 15/8/5.
 * Email: evthoriz@gmail.com
 */
public class GPSHelperTest {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 5000000; i++) {
//            GPSHelper.GPS gps = GPSHelper.toGPS("6gkzwgjz");
//            System.out.println("gps:" + gps);
//            String geohash = GPSHelper.toGeoHash(-49.2656135559082, -25.38262367248535, 8);
//            System.out.println("geohash:" + geohash);
            GPSHelper.getRound8("6gkzwgjz");
        }
        System.out.println("Elapsed: " + (System.currentTimeMillis() - startTime));

        System.out.println(GPSHelper.getRound8("6gkzwgjz"));
    }
}
