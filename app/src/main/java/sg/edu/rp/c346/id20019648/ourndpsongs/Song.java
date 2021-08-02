package sg.edu.rp.c346.id20019648.ourndpsongs;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Song implements Serializable {
    private int id;
    private String title;
    private String singers;
    private int year;
    private int stars;

    public Song (String title, String singers, int year, int stars) {
        this.title = title;
        this.singers = singers;
        this.stars = stars;
        this.year = year;
    }

    public Song(int id, String title, String singers, int year, int stars) {
        this.title = title;
        this.singers = singers;
        this.stars = stars;
        this.year = year;
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSingers(String singers) {
        this.singers = singers;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSingers() {
        return singers;
    }

    public int getYear() {
        return year;
    }

    public int getStars() {
        for (int i = 0; i < 6; i++) {
            stars = i;
        }
        return stars;
    }

    @Override
    public String toString() {
        return title + "\n" + year + "\n" + stars + "\n" + singers;
    }
}