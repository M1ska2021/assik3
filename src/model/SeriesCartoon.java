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
            throw new IllegalArgumentException("Seasons must be > 0");
        }
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return super.toString() + " | seasons: " + seasons;
    }
}
