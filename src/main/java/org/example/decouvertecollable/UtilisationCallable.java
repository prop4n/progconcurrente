package org.example.decouvertecollable;

import java.util.concurrent.*;

import static utils.Outils.pause;

public class UtilisationCallable {

    public static void main(String[] args) {
        System.out.println("Début de UtilisationCallable : " + Thread.currentThread().getName() + " - " + Thread.currentThread().threadId());

        Telechargeur premierTelechargeur = new Telechargeur("https://cdns-images.dzcdn.net/images/cover/802df9bae22d9bb9d14be1b9e7802bda/1900x1900-000000-80-0-0.jpg");
        Telechargeur secondTelechargeur = new Telechargeur("https://people.com/thmb/WXzptbnV1KluL6sXuQ-JgAVPI-g=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():focal(899x0:901x2)/21042210_264995290674140_8840525631411191808_n-530848c0d1134a31bc03861ea9ddd700.jpg");

        ExecutorService executorService;
        executorService = Executors.newFixedThreadPool(3);

        Future<Boolean> premierFutur = executorService.submit(premierTelechargeur);
        Future<Boolean> secondFutur = executorService.submit(secondTelechargeur);
         try {
            System.out.println("Avant le premier get");
            Boolean tesultatPremier = premierFutur.get();
            System.out.println("Après le premier get : " + tesultatPremier);

            System.out.println("Avant le second get");
            Boolean tesultatSecond = secondFutur.get();
            System.out.println("Après le second get : " + tesultatSecond);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        executorService.shutdown();

        System.out.println("Fin de UtilisationCallable : " + Thread.currentThread().getName() + " - " + Thread.currentThread().threadId());
    }

}
