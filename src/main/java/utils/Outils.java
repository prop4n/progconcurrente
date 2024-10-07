package utils;

public class Outils {

    public static void pause(long nbMillis) {
        try {
            Thread.sleep(nbMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
