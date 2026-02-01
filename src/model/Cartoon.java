package model;

public class Cartoon {

    private int id;
    private String name;
    private int episodes;
    private String studio;

    public Cartoon() {
    }

    public Cartoon(int id, String name, int episodes, String studio) {
        this.id = id;
        this.name = name;
        this.episodes = episodes;
        this.studio = studio;
    }

    public String getDetails() {
        return "Cartoon: " + name + ", episodes: " + episodes + ", studio: " + studio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String toString() {
        return getDetails();
    }
}