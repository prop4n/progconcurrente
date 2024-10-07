package org.example.decouvertecollable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UtilisationCallable {

    public static void main(String[] args) {
        System.out.println("Début de UtilisationCallable : " + Thread.currentThread().getName() + " - " + Thread.currentThread().threadId());

        Telechargeur premierTelechargeur = new Telechargeur("https://cdns-images.dzcdn.net/images/cover/802df9bae22d9bb9d14be1b9e7802bda/1900x1900-000000-80-0-0.jpg");
        Telechargeur secondTelechargeur = new Telechargeur("url 2");

        /*
        try {
            premierTelechargeur.call();
            secondTelechargeur.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        */

        ExecutorService executorService;
        executorService = Executors.newFixedThreadPool(3);

        executorService.submit(premierTelechargeur);
        executorService.submit(secondTelechargeur);

        executorService.shutdown();

        System.out.println("Fin de UtilisationCallable : " + Thread.currentThread().getName() + " - " + Thread.currentThread().threadId());
    }

}
