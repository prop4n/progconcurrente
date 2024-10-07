package org.example.decouvertecollable;

public class UtilisationCallable {

    public static void main(String[] args) {
        System.out.println("Début de UtilisationCallable : " + Thread.currentThread().getName() + " - " + Thread.currentThread().threadId());

        Telechargeur premierTelechargeur = new Telechargeur("https://cdns-images.dzcdn.net/images/cover/802df9bae22d9bb9d14be1b9e7802bda/1900x1900-000000-80-0-0.jpg");
        Telechargeur secondTelechargeur = new Telechargeur("url 2");

        try {
            premierTelechargeur.call();
            secondTelechargeur.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("Fin de UtilisationCallable : " + Thread.currentThread().getName() + " - " + Thread.currentThread().threadId());
    }

}
