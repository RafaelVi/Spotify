package br.com.rafaelvi.models;

public class Podcast extends Audio {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getRate() {
        if (this.getLikes() > 500) {
            return 10;
        } else {
            return 5;
        }
    }
}
