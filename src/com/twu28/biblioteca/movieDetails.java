package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 7/26/12
 * Time: 10:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class movieDetails {
   public ArrayList<movie> movieList = new ArrayList<movie>();

    public movieDetails() {
       /* movie movie1 = new movie();
        movie1.setMovieName("ashwin");
        movie movie2 = new movie();
        movie1.setMovieName("ashwi");
        movie movie3 = new movie();
        movie1.setMovieName("ashw"); */


        movie movie1 = new movie("the shawshank's redumption","Frank Darabont","9.2");

        movie movie2 = new movie("The Godfather","Francis Ford Coppola","9.2");

        movie movie3 = new movie("The Godfather: Part II","Francis Ford Coppola","9.1");

        movie movie4 = new movie("Pulp Fiction","Quentin Tarantino","9.0");

        movie movie5 = new movie("The Good, the Bad and the Ugly","Sergio Leone","9.0");

        movie movie6 = new movie("12 Angry Menn","Sidney Lumet","9.0");

        movie movie7 = new movie("Jurassic park","steven Spilberg","7.8");

        movie movie8 = new movie("Schindler's List","Steven Spielberg","8.9");

        movie movie9 = new movie("The Dark Knight","Christopher Nolan","8.9");

        movie movie10 = new movie("The Lord of the Rings: The Return of the King","Peter Jackson","8.9");

        movie movie11 = new movie("Fight Club","David Fincher","8.9");

        movie movie12 = new movie("Inception","Christopher Nolan","8.8");

        movie movie13 = new movie("Goodfellas","Martin Scorsese","N/A");

        movie movie14 = new movie("The Matrix","Andy Wachowski","N/A");

        movie movie15 = new movie("City of God","Fernando Meirelles","N/A");
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
        movieList.add(movie7);
        movieList.add(movie8);
        movieList.add(movie9);
        movieList.add(movie10);
        movieList.add(movie11);
        movieList.add(movie12);
        movieList.add(movie13);
        movieList.add(movie14);
        movieList.add(movie15);
       // System.out.println(movieList.indexOf(movie10));


    }

    public boolean sizeOfMovieList() {
        System.out.println(movieList.size());
        return movieList.isEmpty();
    }

    public boolean viewMovieList() {
    for(int i=0;i< movieList.size();i++){
        System.out.print("  " + movieList.get(i).getName());
        System.out.print("  " + movieList.get(i).getDirectorName());
        System.out.println("  " + movieList.get(i).getRating());
        }
        return true;
    }
}
