package org.example.decouvertecollable;

import org.apache.commons.io.FileUtils;

import java.util.Random;
import java.util.concurrent.Callable;

import static utils.Outils.pause;

public class Telechargeur implements Callable<Boolean> {


    private static final Random generateur = new Random();
    private String urlHttp;

    public Telechargeur(String urlHttp) {
        this.urlHttp = urlHttp;
    }

    @Override
    public Boolean call() throws Exception {
        // Télécharger le fichier avec FileUtils
        String extensionfile = urlHttp.substring(urlHttp.lastIndexOf("."));
        String randomName = "fichier" + generateur.nextInt(1000) + extensionfile;
        FileUtils.copyURLToFile(new java.net.URL(urlHttp), new java.io.File(randomName));
        return true;
    }
}
