package model;

public class MovieCartoon extends Cartoon {

    private double duration; // в минутах

    public MovieCartoon(int id,
                        String name,
                        String studio,
                        double duration) {

        super(id, name, 1, studio); // movie = 1 episode

        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be > 0");
        }

        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be > 0");
        }
        this.duration = duration;
    }

    @Override
    public String toString() {
        return super.toString() + " | duration: " + duration + " min";
    }
}
