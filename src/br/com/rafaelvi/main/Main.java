package br.com.rafaelvi.main;

import br.com.rafaelvi.models.Music;
import br.com.rafaelvi.models.Podcast;
import br.com.rafaelvi.models.RateAnalysis;

public class Main {
    public static void main(String[] args) {

        Music music1 = new Music();
        music1.setTitle("We Will Rock You");
        music1.setAlbum("News of the World");
        music1.setArtist("Queen");
        music1.setReleaseYear(1977);
        music1.setGender("Rock");

        for (int i = 0; i < 1000; i++) {
            music1.play();
        }
        for (int i = 0; i < 999; i++) {
            music1.like();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitle("PodPah");
        podcast1.setHost("Igão e Mitico");
        podcast1.setReleaseYear(2020);
        podcast1.setDescription(
                "PodPah is a Brazilian podcast presented by Igor Cavalari (Igão) " +
                "and Thiago Marques (Mítica), " +
                "formed in 2020.[1] It is the biggest podcast in Brazil, " +
                "with more than 8 million subscribers on YouTube");

        for (int i = 0; i < 500; i++) {
            podcast1.play();
        }
        for (int i = 0; i < 60; i++) {
            podcast1.like();
        }

        RateAnalysis rateAnalysis = new RateAnalysis();
        rateAnalysis.analyze(music1);
        rateAnalysis.analyze(podcast1);

    }
}