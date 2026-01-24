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
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getEpisodes() {
        return episodes;
    }
    public String getStudio() {
        return studio;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can't' be empty");
        }
        this.name = name;
    }
    public void setEpisodes(int episodes) {
        if (episodes <= 0) {
            throw new IllegalArgumentException("Episodes supposed to be more than 0");
        }
        this.episodes = episodes;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public String toString() {
        return id + " / " + name + " / episodes: " + episodes + " / studio: " + studio;
    }
}