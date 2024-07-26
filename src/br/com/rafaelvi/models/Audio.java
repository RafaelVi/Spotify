package br.com.rafaelvi.models;

public class Audio {
    private String title;
    private int duration;
    private int releaseYear;
    private int views;
    private int likes;
    private int rate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getViews() {
        return views;
    }


    public int getLikes() {
        return likes;
    }


    public double getRate() {
        return rate;
    }


    public void like(){
        likes++;
    }

    public void play(){
        views++;
    }
}
