package org.example.premierefacon;

import static utils.Outils.pause;

public class MonThread extends Thread {

    private String message;
    private boolean fini;


    public MonThread(String message) {
        this.message = message;
        fini = false;
    }

    public void terminer() {
        fini = true;
    }

    public void run() {
        while (!fini) {
            System.out.println(message);
            pause(750);
        }
    }
}
