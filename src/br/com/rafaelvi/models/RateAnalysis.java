package br.com.rafaelvi.models;

public class RateAnalysis {
    public void analyze(Audio audio){
        if(audio.getRate() >= 9) {
            System.out.println(audio.getTitle() + " is a hit!");
        } else if (audio.getRate() >= 7){
            System.out.println(audio.getTitle() + " is trending on the moment!");
        } else {
            System.out.println(audio.getTitle() + " has a fair fanbase.");
        }
    }
}
