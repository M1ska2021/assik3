package model;

public class MovieCartoon extends Cartoon {

    private double duration; // в минутах

    public MovieCartoon(int id,
                        String name,
                        String studio,
                        double duration) {

        super(id, name, 1, studio); // movie = 1 episode

        if (duration <= 0) {
            throw new IllegalArgumentException("Duration supposed to be more than 0");
        }

        this.duration = duration;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration have to be more than 0");
        }
        this.duration = duration;
    }
    public String toString() {
        return super.toString() + " / duration: " + duration + " min";
    }
}