package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 7/26/12
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class test {

    @Test
    public void canShowWelcomeMessage(){
        //new libraryBangalore();
        libraryBangalore library =   new libraryBangalore();
           assertTrue(library.welcomemsg());
    }
    @Test
    public void canShowMenuOptions(){

        libraryBangalore library =   new libraryBangalore();
        assertTrue(library.showMenuOptions());

    }
    /*@Test
    public void canGetUserInput(){

        libraryBangalore menuOption = new libraryBangalore();

        assertTrue((Boolean) menuOption.selectYourChoice());

    }*/
    @Test
    public void canViewAllBooks(){
        libraryBangalore library =   new libraryBangalore();
        assertTrue(library.viewAllBooks());
    }
    @Test
    public void canReserveSelectedBook(){
        libraryBangalore library =   new libraryBangalore();
        assertTrue(library.reserveBook("book4"));
        library.viewAllBooks();
        assertFalse(library.reserveBook("book12"));
    }

    @Test
    public void canViewLibrariansMessage(){
        libraryBangalore library =   new libraryBangalore();
        assertTrue(library.showLibrariansMessage());

    }

    // come back later
    @Test
    public void presentNewMenuOption(){
        libraryBangalore newOption = new libraryBangalore();
        assertTrue(newOption.takeaction(1));

    }
    @Test
    public void seeIfMovieDetailsAreSet(){
        movieDetails ash = new movieDetails();
        assertFalse(ash.sizeOfMovieList());

    }
    @Test
    public void viewMovieDetails(){
        movieDetails view = new movieDetails();
        assertTrue(view.viewMovieList());
    }




}
