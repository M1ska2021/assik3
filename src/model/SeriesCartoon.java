package model;

public class SeriesCartoon extends Cartoon {

    private int seasons;
    public SeriesCartoon(int id,
                         String name,
                         int episodes,
                         String studio,
                         int seasons) {
        super(id, name, episodes, studio);
        this.seasons = seasons;
    }
    public int getSeasons() {
        return seasons;
    }
    public void setSeasons(int seasons) {
        if (seasons <= 0) {
            throw new IllegalArgumentException("Seasons must be greater than 0");
        }
        this.seasons = seasons;
    }
    public String toString() {
        return super.toString() + " / seasons: " + seasons;
    }
    public String getType() {
        return "Series";
    }
    public String getDetails() {
        return "Seasons: " + seasons;
    }
}