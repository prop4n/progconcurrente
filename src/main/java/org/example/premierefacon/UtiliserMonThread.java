package org.example.premierefacon;

import static utils.Outils.pause;

public class UtiliserMonThread {

    public static void main(String[] args) {
        MonThread monThread1 = new MonThread("vert");
        MonThread monThread2 = new MonThread("          rouge");

        // monThread1.run(); // HORREUR
        // monThread2.run();

        monThread1.start();
        pause(500);
        monThread2.start();

        pause(2000);

        monThread1.terminer();
        monThread2.terminer();

        pause(200);

        System.out.println("Fin du programme");

    }

}
