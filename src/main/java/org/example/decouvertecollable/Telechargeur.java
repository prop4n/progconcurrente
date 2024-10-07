package org.example.decouvertecollable;

import java.util.concurrent.Callable;

import static utils.Outils.pause;

public class Telechargeur implements Callable<Boolean> {

    private String urlHttp;

    public Telechargeur(String urlHttp) {
        this.urlHttp = urlHttp;
    }

    @Override
    public Boolean call() throws Exception {
        boolean resultat = true;

        System.out.println("\tDébut du téléchargement de " + urlHttp);

        pause(3000);

        System.out.println("\tFin du téléchargement de " + urlHttp);

        return resultat;
    }
}
