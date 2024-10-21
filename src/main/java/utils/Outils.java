package utils;

import java.util.concurrent.TimeUnit;

public class Outils {

    public static void pause(long nbMillis) {
        pause(TimeUnit.MILLISECONDS, nbMillis);
    }

    public static void pause(TimeUnit timeUnit, long duration) {
        try {
            timeUnit.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
