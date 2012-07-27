package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 7/26/12
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class libraryBangalore {
    public ArrayList<myBook> booksInLibrary = new ArrayList<myBook>();
    private static final int NO_OF_BOOKS = 11;

    public libraryBangalore() {
        for (int i =0 ; i < NO_OF_BOOKS ; i++){
            booksInLibrary.add(new myBook("book" + i));
        }
    }

    public boolean welcomemsg() {
        System.out.println("welcome to library");
        return true ;
    }

    public boolean showMenuOptions() {
        System.out.println("1: View Books In Library");
        System.out.println("2: Reserve Book in library");
        System.out.println("3: View movies available in library");
        System.out.println("4: check your membership status");
        System.out.println("5: Exit the library");

        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public boolean viewAllBooks() {
        for (int i = 0; i<NO_OF_BOOKS; i++){
            System.out.println(booksInLibrary.get(i).getBookName());

        }

        System.out.println("Do you want to reserve a book?  y/n ");
        Scanner reader = new Scanner(System.in);
        String userWish = reader.nextLine();
        if (userWish.equals("y")){
            takeaction(2);
        }
        else if (userWish.equals("n")){
            goBackToMenu();
        }
        else{
            System.out.println("Invalid choice");
        }

        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public void goBackToMenu() {
        System.out.println("Do you want to go back to menu?  y/n ");
        Scanner reader = new Scanner(System.in);
        String userWish = reader.nextLine();
        if (userWish.equals("y")){
            showMenuOptions();
        }
        else if (userWish.equals("n")){
            takeaction(5);
        }
        else{
            System.out.println("Invalid choice");
        }


    }

    public boolean reserveBook(String bookname) {
        //int userOption = Integer.parseInt(option);
        boolean availability = false;// = booksInLibrary.get(userOption);
        for (int  i = 0 ; i < NO_OF_BOOKS; i++){
            myBook book_temp = booksInLibrary.get(i);
            if(bookname.equals( book_temp.getBookName())){
                availability = true;
                break;
            }
        }
        if(availability){
            System.out.println("Congratulation!! You Have Reserved the Book named -->" + bookname);

        }
        else {
            System.out.println("Sorry!! "+ bookname + " is not currently available");
        }
        goBackToMenu();
        return availability;

    }

    public boolean showLibrariansMessage() {
        System.out.println("Please talk to the Librarian!!");
        return true;
    }



    public int selectChoice() {
        getInput opt  = new getInput();
        String option = opt.selectYourChoice("select menu option");
        return Integer.parseInt(option);
    }

    public boolean takeaction(int choice) {
        switch (choice) {
            case 1:
                viewAllBooks();
                break;
            case 2:
                System.out.println("select your book");
                Scanner reader = new Scanner(System.in);
                String userRequires = reader.nextLine();
                reserveBook(userRequires) ;
                break;
            case 3:
                movieDetails newOption = new movieDetails();
                newOption.viewMovieList();
                break;
            case 4:
                showLibrariansMessage();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("invalid choice");
                return false;

        }
            return true;

        //To change body of created methods use File | Settings | File Templates.

}
}
