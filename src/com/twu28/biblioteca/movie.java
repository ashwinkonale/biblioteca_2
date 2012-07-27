package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 7/26/12
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class movie {
    String movieName;
    String directorName;
    String rating;
    ///String rating1;

    /*public movie(String s, String sff, double v) {
        this.directorName = sff;
        this.movieName = s;
        this.rating = v;
    }*/

    public movie() {
        //To change body of created methods use File | Settings | File Templates.
    }

    public movie(String s, String sff, String s1) {
        this.directorName = sff;
        this.movieName = s;
        this.rating = s1;
    }

    public void setMovieName(String ash){
        movieName = ash;
    }

    public String getName() {
        return this.movieName;
    }
    public String getDirectorName() {
        return this.directorName;
    }
    public String getRating() {
        return (this.rating);
    }
}
